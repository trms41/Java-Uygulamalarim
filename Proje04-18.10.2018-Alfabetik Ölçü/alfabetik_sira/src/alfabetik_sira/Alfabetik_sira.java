/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfabetik_sira;
import java.util.Scanner;

/**
 *
 * @author TM25M
 */
public class Alfabetik_sira {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner al=new Scanner(System.in);
        System.out.println("Harf Grubunu Giriniz : ");
        String grup=al.next();
        int s=0;
        int sayac=0;
        for (int i=0;i<grup.length();i++)
        {
            s=grup.charAt(i);
            if(s>'d') sayac++;
        }
        System.out.println(sayac);
    }
    
}
