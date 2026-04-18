// NIM : 13020240103
// Nama : Ariel Satyawan Syarah
// Hari/Tanggal : Jumat, 10 April 2026

import java.util.Scanner;

/* Maksimum dua bilangan yang dibaca */
public class Max2 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Kamus
        int a, b;
        Scanner masukan = new Scanner(System.in);

        // Program
        System.out.println("Maksimum dua bilangan:");
        System.out.println("Ketikkan dua bilangan, pisahkan dengan RETURN:");

        a = masukan.nextInt();
        b = masukan.nextInt();

        System.out.println("Kedua bilangan: a = " + a + " b = " + b);

        if (a >= b) {
            System.out.println("Nilai maksimum adalah a: " + a);
        } else {
            System.out.println("Nilai maksimum adalah b: " + b);
        }

        masukan.close();
    }
}