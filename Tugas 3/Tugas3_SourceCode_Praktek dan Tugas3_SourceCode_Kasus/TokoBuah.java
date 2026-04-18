// NIM : 13020240103
// Nama : Ariel Satyawan Syarah
// Hari/Tanggal : Jumat, 17 April 2026

import java.util.Scanner;

class Buah {
    String nama;
    int harga;
    int stok;

    // Constructor
    Buah(String nama, int harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    // Cek stok cukup atau tidak
    boolean tersedia(int qty) {
        return qty <= stok;
    }

    // Hitung total harga
    int hitungTotal(int qty) {
        return harga * qty;
    }

    // Ambil info buah
    String getInfo() {
        return nama + "   Rp " + harga + " (stok:" + stok + " kg)";
    }
}

public class TokoBuah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inisialisasi katalog
        Buah[] katalog = new Buah[3];
        katalog[0] = new Buah("Apel", 15000, 10);
        katalog[1] = new Buah("Jeruk", 12000, 8);
        katalog[2] = new Buah("Mangga", 20000, 5);

        // Tampilkan katalog
        for (int i = 0; i < katalog.length; i++) {
            System.out.println((i + 1) + ". " + katalog[i].getInfo());
        }

        int pilih, qty;
        double total = 0;

        // Loop pembelian
        do {
            System.out.print("\nPilih (0=stop): ");
            pilih = sc.nextInt();

            if (pilih == 0) break;

            System.out.print("Jumlah(kg): ");
            qty = sc.nextInt();

            if (katalog[pilih - 1].tersedia(qty)) {
                int subTotal = katalog[pilih - 1].hitungTotal(qty);
                total += subTotal;
                System.out.println("OK +Rp" + subTotal);
            } else {
                System.out.println("Stok tidak cukup!");
            }

        } while (pilih != 0);

        System.out.println("\nTotal: Rp" + (int) total);

        sc.close();
    }
}