/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan4;

/**
 *
 * @author zaqiah ahmad
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //objek bangun datar
     BangunDatar bangunDatar = new BangunDatar();
     
     Persegi persegi = new Persegi();
     persegi.sisi = 7;
     
     Lingkaran lingkaran = new Lingkaran();
     lingkaran.r = 22;
     
     PersegiPanjang persegipanjang = new PersegiPanjang();
     persegipanjang.lebar =4;
     persegipanjang.lebar=8;
     
     segitiga segitiga = new segitiga();
     segitiga.alas =12;
     segitiga.tinggi =8;
     
     //menunjukan inheritance
     bangunDatar.luas();
     bangunDatar.keliling();
     
     persegi.luas();
     persegi.keliling();
     
     persegi.luas();
     persegi.keliling();
     
     persegipanjang.luas();
     persegipanjang.keliling();
     
     segitiga.luas();
     segitiga.keliling();
     
     lingkaran.luas();
     lingkaran.keliling();
    }
    
}
