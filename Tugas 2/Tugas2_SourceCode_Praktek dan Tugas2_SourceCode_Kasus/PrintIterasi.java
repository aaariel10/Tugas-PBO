// NIM : 13020240103
// Nama : Ariel Satyawan Syarah
// Hari/Tanggal : Jumat, 10 April 2026

import java.util.Scanner;
/* Baca N */
/* Print i = 1 s/d N dengan ITERATE */
public class PrintIterasi {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Kamus
        int N;
        int i;
        Scanner masukan = new Scanner(System.in);

        // Program
        System.out.print("Nilai N > 0 = ");
        N = masukan.nextInt();

        i = 1; // First element

        System.out.println("Print i dengan ITERATE:");

        for (;;) {
            System.out.println(i); // Proses

            if (i == N) {
                break; // kondisi berhenti
            } else {
                i++; // next element
            }
        }
        masukan.close();
    }
}