// NIM : 13020240103
// Nama : Ariel Satyawan Syarah
// Hari/Tanggal : Jumat, 10 April 2026

import java.util.Scanner;
public class If1 {
/**
* @param args
*/
public static void main(String[] args) {
// TODO Auto-generated method stub
/* Kamus */
Scanner masukan=new Scanner(System.in);
int a;
/* Program */
System.out.print ("Contoh IF satu kasus \n");
System.out.print ("Ketikkan suatu nilai integer : ");
a = masukan.nextInt();
if (a >= 0)
System.out.print ("\nNilai a positif "+ a);
}
}