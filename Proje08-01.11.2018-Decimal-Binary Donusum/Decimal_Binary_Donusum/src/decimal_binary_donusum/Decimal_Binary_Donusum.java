/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decimal_binary_donusum;

import java.util.Scanner;

/**
 *
 * @author TR
 */
public class Decimal_Binary_Donusum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner giris= new Scanner(System.in);
        System.out.println("sayı giriniz");
        int sayi= giris.nextInt();
        int sayiyazdir=sayi;
         String taban = "";
         int kalan;
            while (sayi != 0)
            {
                kalan = sayi % 2;
                sayi /= 2;
                taban =taban + String.valueOf(kalan);
            }
            
            int x=taban.length();
            
            String ters="";
            for (int d=x-1; d>=0; d--)
            {
                ters=ters+(taban.charAt(d));
            } 
            System.out.println("Ondalık " + sayiyazdir + " Sayısının Binary Karşılığı....: " + ters);
    }
    
}
