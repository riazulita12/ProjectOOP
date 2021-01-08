package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner put = new Scanner(System.in);
        Balok b = new Balok();

        int pil;
        //menu pilihan
        System.out.println("==-Kalkulator Balok-==");
        System.out.println("1. Mencari Luas ");
        System.out.println("2. Mencari Keliling ");
        System.out.print("Masukkan pilihan: "); //memilih jenis bangun datar/ruang
        pil = put.nextInt();
        System.out.println();

        if (pil==1) { //pilihan 1, untuk menghitung Luas Balok
            System.out.print("Masukkan Panjang : ");
            b.p = put.nextInt(); //menginputkan nilai Panjang
            System.out.print("Masukkan Lebar   : ");
            b.l = put.nextInt(); //menginputkan nilai Lebar
            System.out.print("Masukkan Tinggi  : ");
            b.t = put.nextInt(); //menginputkan nilai Tinggi
            System.out.println();
            System.out.println("Luas Balok: " + b.Luas());//menampilkan hasil perhitungan
        }
        else if (pil==2){//pilihan 2, untuk menghitung Keliling Balok
            System.out.print("Masukkan Panjang : ");
            b.p = put.nextInt(); //menginputkan nilai Panjang
            System.out.print("Masukkan Lebar   : ");
            b.l = put.nextInt(); //menginputkan nilai Lebar
            System.out.print("Masukkan Tinggi  : ");
            b.t = put.nextInt(); //menginputkan nilai Tinggi
            System.out.println();
            System.out.println("Keliling Balok: "+b.Keliling());
        }
        else{ //kondisi/pilihan yang lain
                System.out.println("Tidak Ada Pilihan");
            }
    }
}
