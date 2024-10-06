package com.juaracoding.diujian1jf.ujian1;

import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        Integer [] arrayPrice = new Integer[5];

        Scanner scanner = new Scanner(System.in);
        int count = 1;
        for (int i = 0; i <= arrayPrice.length; i++){
            if (i < arrayPrice.length){
                System.out.print("Harga Tiket Film " + count + " : ");
                Integer priceFilm = scanner.nextInt();
                arrayPrice[i]= priceFilm;
                count++;
            }
        }

        int count2 = 1;
        int sum = 0;
        for (Integer value : arrayPrice){
            System.out.println(count2 + " Harga Tiket Film " + count2 + " : " + value);
            sum += value;
            count2++;
        }
        System.out.println("Total Harga Tiket : " + sum);


    }
}
