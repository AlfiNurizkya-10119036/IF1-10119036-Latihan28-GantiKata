/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alfi Nurizkya
 * Nama  : ALFI NURIZKYA
 * Kelas : IF-1
 * NIM   : 10119036
 * Deskripsi Program : Program Mengganti Kata
 */

import java.util.Scanner;
public class IF110119036Latihan28 {

    /**
     * @param args the command line arguments
     */
   static Scanner scan = new Scanner(System.in);
    String kalimat, gantiKata, menjadiKata;

    private void masukkanKalimat(){
        System.out.print("Masukkan Kalimat : ");
        kalimat = scan.nextLine();
        System.out.print("Ganti Kata : ");
        gantiKata = scan.next();
        System.out.print("Menjadi Kata : ");
        menjadiKata = scan.next();
    }

    private String mengubahKalimat(){
        return kalimat.replaceAll(gantiKata,menjadiKata);
    }

    private void tampilKalimat(String hasil){
        System.out.println("\n===Hasil Formatting===");
        System.out.println("Kalimat Awal : ".concat(kalimat));
        System.out.println("Kalimat Baru : ".concat(hasil));
    }

    public static void main(String[] args) {
        IF110119036Latihan28 data = new IF110119036Latihan28();
        data.masukkanKalimat();
        String hasil = data.mengubahKalimat();
        data.tampilKalimat(hasil);
        System.out.println("Developed by : Alfi Nurizkya");
    }
}
