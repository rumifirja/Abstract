/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menghitungluas;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Value extends persegi{
    Scanner input = new Scanner(System.in);
    
    @Override
    void persegi(){
        //int sisi =4;
        System.out.println("===== PERSEGI =====");
        System.out.print("Masukkan nilai sisi persegi = ");
        int sisi = input.nextInt();
        System.out.println("Keliling persegi = "+sisi*4);
        System.out.println("");
    }
    
    @Override
    void persegipanjang(){
        //int panjang = 5;
        //int lebar = 6;
        System.out.println("===== PERSEGI PANGJANG =====");
        System.out.print("Masukkan nilai panjang persegi panjang = ");
        int panjang = input.nextInt();
        System.out.print("Masukkan nilai lebar persegi panjang = ");
        int lebar = input.nextInt();
        System.out.println("Keliling persegi panjang = "+2*(panjang+lebar));
        System.out.println("");
    }
    
    @Override
    void segitigasamasisi(){
        //int sisi = 7;
        System.out.println("===== SEGITIGA SAMA SISI =====");
        System.out.print("Masukkan nilai sisi segitiga = ");
        int Sisi = input.nextInt();
        System.out.println("Keliling segitiga sama sisi = "+Sisi*3);
    }
}

