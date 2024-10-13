package com.juaracoding.diujian2jf.ujian2;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ATMTest {
    private ATM atm;

    @BeforeMethod
    public void setUp(){
        // inisialisasi objek ATM dengan saldo 1000 sebelum setiap pengujuan
        atm = new ATM(1000);
    }

    @Test
    public void testLihatSaldo(){
        // Menguji apakah method lihatSaldo() mengembalikan saldo yang benar
        double saldo = atm.lihatSaldo();
        Assert.assertEquals(saldo, 1000.0, "Saldo Awal Harusnya 1000");
    }

    @Test
    public void testSetorUang(){
        // Menguji apakah method setorUang() berfungsi dengan benar untuk jumlah valid
        atm.setorUang(500);
        double saldo = atm.lihatSaldo();
        Assert.assertEquals(saldo, 1500.0, "Saldo setelah Setor 500 Seharusnya 1500");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testSetorUangNegatif(){
        //Menguji apakah pengecualian dilempar ketika jumlah negatif disetor
        atm.setorUang(-200);
    }

    @Test
    public void testTarikUang(){
        // Menguji apakah method tarikUang() berfungsi dengan benar untuk jumlah valid
        atm.tarikUang(200);
        double saldo = atm.lihatSaldo();
        Assert.assertEquals(saldo, 800.0, "Saldo setelah ditarik 200 harusnya 800");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testTarikUangLebihBesarDariSaldo(){
        //Menguji apakah method tarikUang() pengecualian dilempar ketika tarik uang lebih dari saldo
        atm.tarikUang(2000);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testTarikUangNegatif(){
        //Menguji apakah pengecualian dilempar jika jumlah negatif ditarik
        atm.tarikUang(-100);
    }


}
