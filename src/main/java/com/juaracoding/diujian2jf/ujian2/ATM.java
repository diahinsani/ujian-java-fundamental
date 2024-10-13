package com.juaracoding.diujian2jf.ujian2;

public class ATM {
    private double saldo;

    public ATM(double saldoAwal){
        this.saldo = saldoAwal;
    }

    public double lihatSaldo(){
        return saldo;
    }

    public void setorUang(double jumlah){
        if (jumlah > 0){
            saldo += jumlah;
        }else {
            throw new IllegalArgumentException("Jumlah Harus Lebih Besar Dari 0");
        }
    }
    public void tarikUang(double jumlah){
        if (jumlah > 0 && jumlah <= saldo){
            saldo -= jumlah;
        }else if (jumlah > saldo){
            throw new IllegalArgumentException("Saldo Tidak Mencukupi");
        }else {
            throw new IllegalArgumentException("Jumlah Harus Lebih Besar Dari 0");
        }
    }

    public static void main(String[] args) {
        // Inisialisasi saldo awal
        ATM atm = new ATM(1000);
        // Melihat saldo awal
        System.out.println("Saldo Awal: " + atm.lihatSaldo());

        //Setor Uang
        atm.setorUang(500);
        System.out.println("Saldo Setelah Setor Uang: " + atm.lihatSaldo());

        //Tarik Uang
        atm.tarikUang(300);
        System.out.println("Saldo Seteleh Penarikan: " + atm.lihatSaldo());
    }
}
