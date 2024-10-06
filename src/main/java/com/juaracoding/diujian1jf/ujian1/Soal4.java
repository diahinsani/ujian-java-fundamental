package com.juaracoding.diujian1jf.ujian1;

import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        String [] arrayFilm = new String[5];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <= arrayFilm.length; i++){
            if (i < arrayFilm.length ){
                System.out.print("Masukan Nama Film : ");
                String namaFilm = scanner.nextLine();
                arrayFilm[i]= namaFilm;
            }
        }

        int count = 1;
        for (String  value : arrayFilm){
            System.out.println(count + " " + value);
            count++;
        }

    }
}
