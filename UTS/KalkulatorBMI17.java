package UTS;

import java.util.Scanner;

public class KalkulatorBMI17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Kalkulator BMI (Body Mass Index) ===");

        // input berat badan dan tinggi badan
        System.out.print("Masukkan berat badan (kg): ");
        double berat = sc.nextDouble();

        System.out.print("Masukkan tinggi badan (meter): ");
        double tinggi = sc.nextDouble();

        // menghitung BMI dengan rumus
        double bmi = berat / (tinggi * tinggi);

        // menampilkan hasil BMI
        System.out.printf("\nNilai BMI Anda: %.2f\n", bmi);

        // menentukan kategori dan risiko kesehatan
        if (bmi < 18.5) {
            System.out.println("Kategori: Kurang berat badan (Underweight)");
            System.out.println("Risiko kesehatan: Kekurangan gizi, osteoporosis, penurunan sistem kekebalan tubuh.");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Kategori: Berat badan normal (Normal weight)");
            System.out.println("Risiko kesehatan: Relatif rendah.");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("Kategori: Kelebihan berat badan (Overweight)");
            System.out.println("Risiko kesehatan: Meningkatnya risiko penyakit jantung, diabetes, dan tekanan darah tinggi.");
        } else {
            System.out.println("Kategori: Obesitas (Obese)");
            System.out.println("Risiko kesehatan: Risiko tinggi penyakit jantung, diabetes, tekanan darah tinggi, dan beberapa jenis kanker.");
        }

    }
    
}
