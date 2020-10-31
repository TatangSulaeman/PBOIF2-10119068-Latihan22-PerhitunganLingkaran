/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119068.latihan22.perhitunganlingkaran;

import java.util.Scanner;
/**
 *
 * @author 
 * NAMA     : TATANG SULAEMAN
 * KELAS    : PBOIF2
 * NIM      : 10119068
 * Deskripsi program    : Menampilkan perhitungan lingkaran
 */
public class PBOIF210119068Latihan22PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static double hitungJariLingkaran(double diameter){
        double nJariLingkaran = diameter/2;
        return nJariLingkaran;
    }
    
    public static double hitungLuasLingkaran(double diameter){
        double nJariLingkaran = hitungJariLingkaran(diameter);
        double nLuasLingkaran = 3.14 * nJariLingkaran * nJariLingkaran;
        return nLuasLingkaran;
    }
    
    public static double hitungKelilingLingkaran(double diameter){
        double nJariLingkaran = hitungJariLingkaran(diameter);
        double nKelilingLingkaran = 2 * 3.14 * nJariLingkaran;
        return nKelilingLingkaran ;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        String filterAngka;
        double diameter = 0 ;
        boolean kondisi = true;
        
        System.out.println("----------Perhitungan Lingkaran----------");
        do {
            System.out.print("Masukan nilai diameter lingkaran : ");
            filterAngka = keyboard.nextLine();
            if(filterAngka.matches("[0-9]*")){
                diameter = Integer.parseInt(filterAngka);
                kondisi = true;
            } else {
                System.out.println("Nilai Diameter Tidak Sesuai!!!");
                System.out.println("");
                kondisi = false ;
            }
        }while (!kondisi);
        System.out.println();
        
        String outputText = "\n----------Hasil Perhitungan Lingkaran----------\n" + 
            "Jari-Jari Lingkaran\t= " + hitungJariLingkaran(diameter) + "cm" + "\n" +
            "Luas Lingkaran\t\t= " + hitungLuasLingkaran(diameter) + "cm" + "\n" +
            "Keliling Lingkaran\t= " + hitungKelilingLingkaran(diameter) + "cm" +"\n" +
            "DIBUAT OLEH TATANG SULAEMAN";

        System.out.println(outputText);
    }
    
}
