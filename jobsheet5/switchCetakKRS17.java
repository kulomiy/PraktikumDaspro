package jobsheet5;

import java.util.Scanner;

public class switchCetakKRS17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Masukkan semester saat ini: ");
        int semester = sc.nextInt();

        switch (semester) {
            case 1:
            System.out.println("KRS Semester 1 ditampilakan");
                break;
            case 2:
                System.out.println("KRS Semester 2 ditampilakan");
                    break;
            case 3:
                System.out.println("KRS Semester 3 ditampilakan");
                    break;
            case 4: 
                System.out.println("KRS Semester 4 ditampilakan");
                    break;
            case 5: 
                System.out.println("KRS Semester 5 ditampilakan");
                    break;
            case 6:
                System.out.println("KRS Semester 6 ditampilakan");
                    break;
            case 7: 
                System.out.println("KRS Semester 7 ditampilakan");
                    break;
            case 8:
                System.out.println("KRS Semester 8 ditampilakan");
                    break;
            default:
                System.out.println("Semester tidak valid");
        }
    }
}
