/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sayibulma;
import java.util.*;
/**
 *
 * @author TR
 */
public class SayiBulma {

 
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner giris =new Scanner(System.in);
        SayiTahmin st=new SayiTahmin();
        st.SayiYazdir();
        System.out.print("Adinizi Giriniz....... : ");
        String adi = giris.nextLine();
        int tahmin = 0;
        int a = 1;
        int sayac = 0;
        while(a != -1){
            sayac++;
            System.out.print("Sayi Tahmininizi Giriniz........: ");
            tahmin = giris.nextInt();
            if(st.sayi < tahmin){
                System.out.println("Tahmini Küçültünüz");
            }
            else if(st.sayi > tahmin){
                System.out.println("Tahmini Büyütünüz");
            }
            else{
                System.out.println("TEBRİKLER Sayiyi Buldunuz");
                st.YaziYaz(adi, sayac);
                a=-1;                
             }        
        }
        
    }
    
}
