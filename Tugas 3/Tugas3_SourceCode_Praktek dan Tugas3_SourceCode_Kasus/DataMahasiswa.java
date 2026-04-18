// NIM : 13020240103
// Nama : Ariel Satyawan Syarah
// Hari/Tanggal : Jumat, 17 April 2026

import java.util.Scanner;

class Mahasiswa {
    String nama, nim;
    int jumlahMK;
    int[] nilai;

    // Constructor
    Mahasiswa(String nama, String nim, int jumlahMK) {
        this.nama = nama;
        this.nim = nim;
        this.jumlahMK = jumlahMK;
        this.nilai = new int[jumlahMK];
    }

    // Input nilai
    void inputNilai(Scanner sc) {
        for (int i = 0; i < jumlahMK; i++) {
            System.out.print("Nilai MK-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
        }
    }

    // Hitung rata-rata
    double hitungRataRata() {
        int total = 0;
        for (int i = 0; i < jumlahMK; i++) {
            total += nilai[i];
        }
        return (double) total / jumlahMK;
    }

    // Tentukan grade
    String tentukanGrade() {
        double rata = hitungRataRata();
        if (rata >= 85) return "A";
        else if (rata >= 75) return "B";
        else if (rata >= 60) return "C";
        else return "D";
    }

    // Lulus atau tidak
    boolean lulus() {
        return hitungRataRata() >= 60.0;
    }

    // Tampilkan rapor
    void tampilRapor() {
        System.out.println("\n=== RAPOR ===");
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);
        System.out.println("Nilai:");
        for (int i = 0; i < jumlahMK; i++) {
            System.out.println("MK-" + (i + 1) + " : " + nilai[i]);
        }
        System.out.printf("Rata  : %.2f\n", hitungRataRata());
        System.out.println("Grade : " + tentukanGrade());
        System.out.println("Lulus : " + lulus());
    }
}

public class DataMahasiswa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nama : ");
        String nama = sc.nextLine();

        System.out.print("NIM : ");
        String nim = sc.nextLine();

        System.out.print("Jml MK: ");
        int jumlahMK = sc.nextInt();

        Mahasiswa mhs = new Mahasiswa(nama, nim, jumlahMK);

        // Input nilai
        mhs.inputNilai(sc);

        // Output rapor
        mhs.tampilRapor();

        sc.close();
    }
}