package UTS;

import java.util.Scanner;

class BilanganTerbesar17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // membuat objek Scanner

        System.out.println("=== Program Menentukan Bilangan Terbesar dari 3 Angka ===");

        // input tiga angka dari pengguna
        System.out.print("Masukkan angka pertama: ");
        double angka1 = sc.nextDouble(); // menyimpan input pertama

        System.out.print("Masukkan angka kedua: ");
        double angka2 = sc.nextDouble(); // menyimpan input kedua

        System.out.print("Masukkan angka ketiga: ");
        double angka3 = sc.nextDouble(); // menyimpan input ketiga

        double terbesar = angka1;

        // menentukan angka terbesar dengan if dan else if
         if (angka1 > angka2 && angka1 > angka3) {
            System.out.println("\nAngka terbesar adalah: " + angka1);
        } else if (angka2 > angka1 && angka2 > angka3) {
            System.out.println("\nAngka terbesar adalah: " + angka2);
        } else if (angka3 > angka1 && angka3 > angka2) {
            System.out.println("\nAngka terbesar adalah: " + angka3);
        } else {
            System.out.println("\nAda dua atau lebih angka yang sama besar.");
        }
    }
    
}