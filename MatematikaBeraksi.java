/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematika;

/**
 *
 * @author My PC
 */
public class MatematikaBeraksi {
 public static void main(String[] args){ 
        Matematika hasil  = new Matematika ();
        hasil.setPertambahan(8, 2);
        System.out.println("Hasil dari Pertambahan = " + hasil.getPertambahan());
        hasil.setPengurangan(22, 12);
        System.out.println("Hasil dari Pengurangan = " + hasil.getPengurangan());
        hasil.setPerkalian(8, 4);
        System.out.println("Hasil dari Perkalian   = " + hasil.getPerkalian());
        hasil.setPembagian(21, 3);
        System.out.println("Hasil dari Pembagian   = " + hasil.getPembagian());
    }
}