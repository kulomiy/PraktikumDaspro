package jobsheet6;

import java.util.Scanner;

public class CM1_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama = "Cindy Canda"; // variabel nama
        String nim = "232343245"; // variabel nim

        System.out.println(" ==== INPUT DATA MAHASISWA ====");
        System.out.println("Nama\t: " + nama);
        System.out.println("NIM\t: " + nim);
        System.out.println();

        // ---------------- Mata Kuliah 1 ----------------
        // input nilai UTS, UAS dan MK1
        System.out.println("--- Mata Kuliah 1: Algoritma Pemrograman ---");
        System.out.print("Nilai UTS\t: ");
        double uts1 = sc.nextDouble();
        System.out.print("Nilai UAS\t: ");
        double uas1 = sc.nextDouble();
        System.out.print("Nilai Tugas\t: ");
        double tugas1 = sc.nextDouble();
        System.out.println();

        // ---------------- Mata Kuliah 2 ----------------
        // input nilai UTS, UAS dan MK2
        System.out.println("--- Mata Kuliah 2: Struktur Data ---");
        System.out.print("Nilai UTS\t: ");
        double uts2 = sc.nextDouble();
        System.out.print("Nilai UAS\t: ");
        double uas2 = sc.nextDouble();
        System.out.print("Nilai Tugas\t: ");
        double tugas2 = sc.nextDouble();
        System.out.println();

        // ---------------- Hitung Nilai Akhir ----------------
        double nilaiAkhir1 = (uts1 + uas1 + tugas1) / 3; // hitung rata-rata MK1
        double nilaiAkhir2 = (uts2 + uas2 + tugas2) / 3; // hitung rata-rata MK2

        // Variabel untuk menyimpan nilai huruf MK1 dan MK2
        String huruf1 = "";
        String huruf2 = "";

        // MK1
        if (nilaiAkhir1 > 80 && nilaiAkhir1 <= 100) {
            huruf1 = "A";
        } else if (nilaiAkhir1 > 73 && nilaiAkhir1 <= 80) {
            huruf1 = "B+";
        } else if (nilaiAkhir1 > 65 && nilaiAkhir1 <= 73) {
            huruf1 = "B";
        } else if (nilaiAkhir1 > 60 && nilaiAkhir1 <= 65) {
            huruf1 = "C+";
        } else if (nilaiAkhir1 > 50 && nilaiAkhir1 <= 60) {
            huruf1 = "C";
        } else {
            huruf1 = "E";
        }

        // MK2
        if (nilaiAkhir2 > 80 && nilaiAkhir2 <= 100) {
            huruf2 = "A";
        } else if (nilaiAkhir2 > 73 && nilaiAkhir2 <= 80) {
            huruf2 = "B+";
        } else if (nilaiAkhir2 > 65 && nilaiAkhir2 <= 73) {
            huruf2 = "B";
        } else if (nilaiAkhir2 > 60 && nilaiAkhir2 <= 65) {
            huruf2 = "C+";
        } else if (nilaiAkhir2 > 50 && nilaiAkhir2 <= 60) {
            huruf2 = "C";
        } else {
            huruf2 = "E";
        }

        // status LULUS/TIDAK
        String status1 = (nilaiAkhir1 >= 60) ? "LULUS" : "TIDAK LULUS";
        String status2 = (nilaiAkhir2 >= 60) ? "LULUS" : "TIDAK LULUS";

        // hitung rata-rata dari dua mata kuliah
        double rataRata = (nilaiAkhir1 + nilaiAkhir2) / 2;

        // tentukan status semester
        String statusSemester = (rataRata >= 70) ? "LULUS" : "TIDAK LULUS (Rata-rata < 70)";

  // ---------------- Output Tabel Sederhana ----------------
        System.out.println();
        System.out.println("========== HASIL PENILAIAN AKADEMIK ==========");
        System.out.println("Nama\t: " + nama);
        System.out.println("NIM\t: " + nim);
        System.out.println("-----------------------------------------------------------");
        System.out.println("Mata Kuliah\t\tUTS\tUAS\tTugas\tAkhir\tHuruf\tStatus");
        System.out.println("-----------------------------------------------------------");
        System.out.println("Algoritma Pemrograman\t" + uts1 + "\t" + uas1 + "\t" + tugas1 + "\t" + 
                           String.format("%.2f", nilaiAkhir1) + "\t" + huruf1 + "\t" + status1);
        System.out.println("Struktur Data\t\t" + uts2 + "\t" + uas2 + "\t" + tugas2 + "\t" + 
                           String.format("%.2f", nilaiAkhir2) + "\t" + huruf2 + "\t" + status2);
        System.out.println("-----------------------------------------------------------");
        System.out.printf("Rata-rata Nilai Akhir : %.2f%n", rataRata);
        System.out.println("Status Semester       : " + statusSemester);
    }
}