/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zakat;

/**
 *
 * @author ichsa
 */
public class main {
     public static void main(String[] args) {
        // Membuat objek Muzakki dengan konstruktor berparameter
       muzakki muzakki1 = new muzakki("MOHAMMAD", "Jl. JUANDA NO 51", 500000.0);
        
        // Menampilkan informasi Muzakki
        System.out.println("Informasi Muzakki:");
        muzakki1.displayInfo();

        // Membuat objek Penerima dengan konstruktor berparameter
        penerima penerima1 = new penerima("ANTON", "Bantuan Uang");
        
        // Menampilkan informasi Penerima
        System.out.println("\nInformasi Penerima:");
        penerima1.displayInfo();
        
     }
}
