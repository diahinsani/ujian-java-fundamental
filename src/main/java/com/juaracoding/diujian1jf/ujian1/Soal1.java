package com.juaracoding.diujian1jf.ujian1;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        // Nama Film = Avengers : Endgame
        // Harga Tiket =50_000
        //Jumlah Tiket = 3
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan Nama Film : ");
        String namaFilm = scanner.nextLine();
        System.out.print("Masukan Harga Tiket : ");
        int hargaTiket = scanner.nextInt();
        System.out.print("Masukan Jumlah Tiket : ");
        int jumlahTiket = scanner.nextInt();
        System.out.println("Nama Film \t\t: " + namaFilm);
        System.out.println("Harga Tiket \t: " + hargaTiket);
        System.out.println("Jumlah Tiket \t: " + jumlahTiket);

    }
}
