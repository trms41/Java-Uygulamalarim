/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en.uzun.artis;
import java.util.*;

/**
 *
 * @author TR
 */
public class EnUzunArtis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int[] dizi={1,2,8,7,6,3,0,2,0,0,4,5,6,7,8,10,2,8};
        int[][] ilerleme=new int[10][2];
        int sayac=0;
        int sira=0;
        int kontrol=0;
        for(int i=0,j=1; i<dizi.length-1;i++,j++)
        {
            if (dizi[i]<dizi[j])
            {
                if (kontrol==0)
                    sira=i;
                kontrol++;
            }
            else
            {
            ilerleme[sayac][0]=kontrol+1;
            ilerleme[sayac][1]=sira;
            sayac++;
            kontrol=0;
            }
        }
            int buyuk=ilerleme[0][0];
            for(int j=0; j<ilerleme.length; j++)
            {
                if(buyuk<ilerleme[j][0])
                {
                    buyuk=ilerleme[j][0];
                    sira=ilerleme[j][1];
                }
            }
            System.out.println("Artış (Adım) Sayısı = "+buyuk);
            for(int i=0; i<buyuk; i++)
            {
                System.out.println(dizi[sira+i]);
            }
                    
        }
        
    }
