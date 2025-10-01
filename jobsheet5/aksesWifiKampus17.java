package jobsheet5;

import java.util.Scanner;

public class aksesWifiKampus17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Pengguna (Dosen/Mahasiswa): ");
        String pengguna = sc.nextLine();

        if (pengguna.equalsIgnoreCase("Dosen")) {
            System.out.println("Akses Wifi diberikan (Dosen)");
        } else if (pengguna.equalsIgnoreCase("Mahasiswa")) {
            System.out.print("Jumlah SKS yang diambil: ");
            int jumlahSks = sc.nextInt();

            if (jumlahSks >= 12) {
                System.out.println("Akses Wifi diberikan (Mahasiswa aktif)");
            } else if (jumlahSks >= 0 && jumlahSks < 12) {
                System.out.println("Akses ditolak, SKS kurang dari 12");
            } else {
                System.out.println("Akses ditolak (Input SKS tidak valid)");
            }

        } else {
            System.out.println("Akses ditolak (Pengguna tidak dikenal)");
        }
    }
}
