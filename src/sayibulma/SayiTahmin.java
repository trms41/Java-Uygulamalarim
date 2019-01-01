/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sayibulma;

import java.util.Random;
import java.io.*;

/**
 *
 * @author Technopc
 */
public class SayiTahmin {
    int sayi;
    
    public SayiTahmin(){
        Random rnd = new Random();
        sayi = rnd.nextInt(1000);
    }
    
    public void SayiYazdir(){
        System.out.print("İstenen Sayi.... : " + sayi);  
        System.out.println("");
    }
    
    public void YaziYaz(String Ad, int TahminSayisi){
        try {
        File dosya = new File("output.txt");
        FileWriter yazici = new FileWriter(dosya, true);
        BufferedWriter yaz = new BufferedWriter(yazici);
        yaz.write(Ad + " istenen sayıyı " + TahminSayisi + " kerede buldunuz.");
        yaz.close();
        } catch (Exception e) {
            System.out.println("Dosya Yazmada Hata var");
        }    
    }
}
