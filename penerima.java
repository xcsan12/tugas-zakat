/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zakat;

/**
 *
 * @author ichsa
 */
public class penerima {
    // Atribut untuk Penerima
    private String nama;
    private String jenisBantuan;

    // Konstruktor berparameter
    public penerima(String nama, String jenisBantuan) {
        this.nama = nama;
        this.jenisBantuan = jenisBantuan;
    }

    // Getter dan Setter untuk nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter dan Setter untuk jenisBantuan
    public String getJenisBantuan() {
        return jenisBantuan;
    }

    public void setJenisBantuan(String jenisBantuan) {
        this.jenisBantuan = jenisBantuan;
    }

    // Metode untuk menampilkan informasi Penerima
    public void displayInfo() {
        System.out.println("Nama Penerima: " + nama);
        System.out.println("Jenis Bantuan: " + jenisBantuan);
    }

}
