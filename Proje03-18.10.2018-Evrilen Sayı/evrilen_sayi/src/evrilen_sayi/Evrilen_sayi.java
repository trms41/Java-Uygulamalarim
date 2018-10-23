/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evrilen_sayi;

/**
 *
 * @author TM25M
 */
public class Evrilen_sayi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] dizi={1,7,6,4,5};
        int sayac=0;
        
        for(int i=0; i<dizi.length; i++)
        {
            for(int j=i+1; j<dizi.length; j++)
                if(dizi[i]>dizi[j])
                {
                    sayac=sayac+1;
                }
        }
        
        System.out.println("Evrilen Sayı Adedi...: "+sayac);
    }
    
}
