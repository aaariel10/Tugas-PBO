// NIM : 13020240103
// Nama : Ariel Satyawan Syarah
// Hari/Tanggal : Jumat, 10 April 2026


import java.util.Scanner;

/* contoh baca nilai x */
/* Jumlahkan nilai yang dibaca dengan REPEAT */
public class PrintXRepeat {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Kamus
        int sum;
        int x;
        Scanner masukan = new Scanner(System.in);

        // Program
        System.out.print("Masukkan nilai x (int), akhiri dg 999: ");
        x = masukan.nextInt(); // first element

        if (x == 999) {
            System.out.println("Kasus kosong");
        } else {
            sum = 0; // inisialisasi

            do {
                sum = sum + x; // proses

                System.out.print("Masukkan nilai x (int), akhiri dg 999: ");
                x = masukan.nextInt(); // next element

            } while (x != 999);

            System.out.println("Hasil penjumlahan = " + sum);
        }

        masukan.close();
    }
}