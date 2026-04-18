// NIM : 13020240103
// Nama : Ariel Satyawan Syarah
// Hari/Tanggal : Jumat, 17 April 2026

import java.util.Scanner;

public class KonversiWaktu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Masukkan total detik: ");
        long totalDetik = input.nextLong();

        // Proses konversi
        long detikSekarang = totalDetik % 60;
        long totalMenit = totalDetik / 60;

        long menitSekarang = totalMenit % 60;
        long totalJam = totalMenit / 60;

        long jamSekarang = totalJam % 24;

        // Output utama
        System.out.println("\n===================");
        System.out.printf("Waktu: %02d:%02d:%02d\n", jamSekarang, menitSekarang, detikSekarang);
        System.out.println("===================");

        // Detail
        System.out.println("\ntotalDetik   : " + totalDetik);
        System.out.println("detikSekarang : " + detikSekarang);
        System.out.println("totalMenit : " + menitSekarang);
        System.out.println("jamSekarang   : " + jamSekarang);

        // Contoh tambahan
        System.out.println("\n--- Contoh lain ---");

        long contoh1 = 3661;
        tampilkanHasil(contoh1);

        long contoh2 = 86400;
        tampilkanHasil(contoh2);

        input.close();
    }

    public static void tampilkanHasil(long totalDetik) {
        long detik = totalDetik % 60;
        long menit = (totalDetik / 60) % 60;
        long jam = (totalDetik / 3600) % 24;

        System.out.println("Input  : " + totalDetik);
        System.out.printf("Output : %02d:%02d:%02d\n", jam, menit, detik);

        if (totalDetik == 86400) {
            System.out.println("(tepat 1 hari)");
        }
        System.out.println();
    }
}