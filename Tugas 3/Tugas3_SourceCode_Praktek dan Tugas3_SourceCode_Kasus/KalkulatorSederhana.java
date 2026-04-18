// NIM : 13020240103
// Nama : Ariel Satyawan Syarah
// Hari/Tanggal : Jumat, 17 April 2026

import java.util.Scanner;

class Kalkulator {
    double angka1, angka2;
    char operator;

    Kalkulator(double a1, double a2, char op) {
        angka1 = a1;
        angka2 = a2;
        operator = op;
    }

    double tambah() { return angka1 + angka2; }
    double kurang() { return angka1 - angka2; }
    double kali()   { return angka1 * angka2; }
    double bagi()   { return angka1 / angka2; }
}

public class KalkulatorSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double angka1, angka2, hasil = 0;
        char operator, lagi;

        do {
            System.out.print("Angka 1 : ");
            angka1 = input.nextDouble();

            System.out.print("Angka 2 : ");
            angka2 = input.nextDouble();

            System.out.print("Operator : ");
            operator = input.next().charAt(0);

            Kalkulator k = new Kalkulator(angka1, angka2, operator);

            switch (operator) {
                case '+':
                    hasil = k.tambah();
                    break;
                case '-':
                    hasil = k.kurang();
                    break;
                case '*':
                    hasil = k.kali();
                    break;
                case '/':
                    if (angka2 == 0) {
                        System.out.println("Error: pembagian dengan nol!");
                        hasil = 0;
                    } else {
                        hasil = k.bagi();
                    }
                    break;
                default:
                    System.out.println("Operator tidak dikenal!");
                    hasil = 0;
            }

            System.out.printf("Hasil: %.2f %c %.2f = %.2f\n\n",
                    angka1, operator, angka2, hasil);

            System.out.print("Hitung lagi? (y/n): ");
            lagi = input.next().charAt(0);
            System.out.println(); // biar ada jarak seperti di gambar

        } while (lagi == 'y');

        System.out.println("Program selesai.");
        input.close();
    }
}