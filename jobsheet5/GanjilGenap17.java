package jobsheet5;

import java.util.Scanner;

public class GanjilGenap17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Program cek Ganjil/Genap ---");
        System.out.print("Masukkan angka: ");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("Genap");
        } else {
            System.out.println("Ganjil");
        }
    }
}
