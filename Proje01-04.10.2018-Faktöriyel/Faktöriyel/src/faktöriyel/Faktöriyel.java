/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faktöriyel;
import java.util.Scanner;
/**
 *
 * @author TR
 */
public class Faktöriyel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner sayial=new Scanner(System.in);
        System.out.println("Birinci Sayıyı Giriniz");
        int say1=sayial.nextInt();
        System.out.println("Birinci Sayıyı Giriniz");
        int say2=sayial.nextInt();
        
        int toplam=say1+say2;
        System.out.println("Sayıların Toplamı = "+toplam);
        
        int faktoriyel=1;
        for(int i=1; i<=toplam ; i++)
        {
            faktoriyel *=i;
        }
        System.out.println(toplam+" Faktoriyel = "+faktoriyel);
        
        
    }
    
}
