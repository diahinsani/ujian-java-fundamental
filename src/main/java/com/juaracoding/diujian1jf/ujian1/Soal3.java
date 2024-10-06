package com.juaracoding.diujian1jf.ujian1;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        int totalPrice = 0;
        double diskon = 0.1;
        int priceWeekDay = 35000;
        int priceWeekEnd = 45000;

        Scanner scanner = new Scanner(System.in);

        //System.out.println("Harga Weekday : 35000");
        System.out.println("Harga Weekend : 45000");

        System.out.print("Masukan Jumlah Tiket : ");
        int jumlahTiket = scanner.nextInt();


        System.out.println("Jumlah Tiket : " + jumlahTiket);

        if (jumlahTiket > 5){

            totalPrice = priceWeekEnd * jumlahTiket;
            System.out.println("Discount = "+diskon*100);
            System.out.println("Total Harga (dengan diskon) = Rp. "+(totalPrice-totalPrice*diskon));
        }



    }
}
