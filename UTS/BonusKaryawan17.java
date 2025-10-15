package UTS;

import java.util.Scanner;

public class BonusKaryawan17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Program Perhitungan Bonus Karyawan ===");

        // input data dari pengguna
        System.out.print("Masukkan nilai kinerja (1-100)\t\t: ");
        double kinerja = sc.nextDouble();

        System.out.print("Masukkan lama berkerja (dalam tahun)\t: ");
        double lamaKerja = sc.nextDouble();

        System.out.print("Masukkan gaji pokok\t\t\t: Rp ");
        double gajiPokok = sc.nextDouble();
        System.out.println();
        System.out.print("Angka memiliki sertifikasi profesional? (ya/tidak): ");
        String sertifikasi = sc.next();

        double bonus = 0;

         if (kinerja < 70) {
            bonus = 0;
            System.out.println("\nNilai kinerja di bawah 70, tidak mendapatkan bonus.");
        } 
        else if (kinerja >= 70 && kinerja < 90) {
            // bonus untuk kinerja antara 70 dan 89
            if (lamaKerja < 2) {
                bonus = 0.01 * gajiPokok;
            } else if (lamaKerja >= 2 && lamaKerja < 5) {
                bonus = 0.03 * gajiPokok;
            } else if (lamaKerja >= 5) {
                bonus = 0.05 * gajiPokok;
            }
        } 
        else if (kinerja >= 90) {
            // bonus untuk kinerja 90 ke atas (lebih besar)
            if (lamaKerja < 2) {
                bonus = 0.02 * gajiPokok;
            } else if (lamaKerja >= 2 && lamaKerja < 5) {
                bonus = 0.04 * gajiPokok;
            } else if (lamaKerja >= 5) {
                bonus = 0.07 * gajiPokok;
            }
        }

        // bonus tambahan jika punya sertifikasi (dan memenuhi syarat bonus)
        if (kinerja >= 70 && sertifikasi.equalsIgnoreCase("ya")) {
            bonus += 500000; // tambahan Rp 500.000
        }

        // tampilkan hasil akhir
        System.out.println("\n=== HASIL PERHITUNGAN BONUS ===");
        System.out.println("Nilai Kinerja\t: " + kinerja);
        System.out.println("Lama Bekerja\t: " + lamaKerja + " tahun");
        System.out.println("Gaji Pokok\t: Rp " + gajiPokok);
        System.out.printf("Total Bonus\t: Rp %.0f\n", bonus);
    }
}
