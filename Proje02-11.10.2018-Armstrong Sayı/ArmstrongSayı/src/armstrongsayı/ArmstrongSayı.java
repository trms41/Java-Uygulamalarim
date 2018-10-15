/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armstrongsayı;
import java.math.*;
import java.util.Scanner;
/**
 *
 * @author TR
 */
public class ArmstrongSayı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sayial = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz : ");
        
        int ssayi = sayial.nextInt();
        int ref = ssayi;
        int kalan = 0;
        int sonsayi = 0;
        int length = String.valueOf(ssayi).length();
        
        for(int i=1;i<=length;i++){
            kalan = ssayi%10;
            sonsayi = sonsayi + (int)Math.pow(kalan,length);
            ssayi = ssayi/10;
        }
        
        if(sonsayi == ref){
            System.out.println(ref+" Bir Armstrong Sayıdır");
        }else{
            System.out.println(ref+" Sayısı Bir Armstrong Sayı Degildir");
        }
        
        
    }
    
}
