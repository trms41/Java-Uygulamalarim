/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kume_karsilastirma;

/**
 *
 * @author TR
 */
public class Kume_karsilastirma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] a1 = {5,7,9,0,2,8};
        int [] b1 = {7,9,4,0,5,2};
        Kume kumme1=new Kume(a1);
        
        Kume kumme2 = new Kume(b1);
       
        kumme1.Denk(kumme2);
        kumme1.Esit(kumme2);
        kumme1.Birlesim(kumme2);
    }
    
}
