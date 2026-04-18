// NIM : 13020240103
// Nama : Ariel Satyawan Syarah
// Hari/Tanggal : Jumat, 10 April 2026

import java.util.Scanner;

/* contoh baca nilai x */
/* Jumlahkan nilai yang dibaca dengan WHILE */
public class PrintXWhile {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Kamus
        int sum;
        int x;
        Scanner masukan = new Scanner(System.in);

        // Program
        sum = 0; // inisialisasi

        System.out.print("Masukkan nilai x (int), akhiri dg 999: ");
        x = masukan.nextInt(); // first element

        while (x != 999) { // kondisi berhenti
            sum = sum + x; // proses

            System.out.print("Masukkan nilai x (int), akhiri dg 999: ");
            x = masukan.nextInt(); // next element
        }

        System.out.println("Hasil penjumlahan = " + sum);\

        masukan.close();
    }
}