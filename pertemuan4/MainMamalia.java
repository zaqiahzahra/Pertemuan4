/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan4;

/**
 *
 * @author zaqiah ahmad
 */
public class MainMamalia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Mamalia mamalia = new Mamalia();
      Monyet kera = new Monyet();
      Paus ikan = new Paus();
      
      System.out.println("Paus berjenis tulang :" +ikan.tulang);
      
      System.out.println("Monyet Bernafas Dengan :" +kera.nafas);
      
      kera.habitat();
      ikan.habitat();
    }
    
}
