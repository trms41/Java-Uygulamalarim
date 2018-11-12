/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kume_karsilastirma;
import java.util.*;
/**
 *
 * @author TR
 */
public class Kume {
   ArrayList<Integer> elemanlar;

    public Kume() {
        elemanlar = new ArrayList<Integer>();
    }

    public Kume(int[] a) {
        elemanlar = new ArrayList<Integer>();
        for (int i = 0; i < a.length; i++) {
            elemanlar.add(a[i]);            
        }
    }

    public Kume(Kume k) {
        for (int i = 0; i < elemanlar.size(); i++) {
            k.elemanlar.add(this.elemanlar.get(i));
        }
    }

    public void Ekle(int e) {
        this.elemanlar.add(e);
    }

    public void Yazdir() {
        for (int i = 0; i < elemanlar.size(); i++) {
            System.out.print(elemanlar.get(i) + " - ");
        }
        System.out.println("");
    }

    public void Denk(Kume k) {
        if (this.elemanlar.size() == k.elemanlar.size()) {
            System.out.println("Kümeler denktir.");
        } else {
            System.out.println("Kümeler Denk değildir.");
        }
    }

    public void Esit(Kume k) {
        boolean kontrol = false;
        if (this.elemanlar.size() != k.elemanlar.size()) {
            System.out.println("Kümeler eşit değil");
        } else {
            for (int i = 0; i < elemanlar.size(); i++) {
                kontrol = false;
                for (int j = 0; j < k.elemanlar.size(); j++) {
                    if (this.elemanlar.get(i) == k.elemanlar.get(j)) {
                        kontrol = true;
                    }
                }
                if (kontrol == false) {
                    break;
                }
            }
            if (kontrol == true) {
                System.out.println("Kümeler Eşit");
            } else {
                System.out.println("Kümeler Eşit Değil");
            }
        }
    }
    
    
    public void Birlesim(Kume k){
        boolean kontrol = false;
        int hucre = 0;
        System.out.println("Birleşim Kümesi : ");
        for (int i = 0; i < this.elemanlar.size(); i++) {
            System.out.print(this.elemanlar.get(i) +  " - ");            
        }
        for (int i = 0; i < k.elemanlar.size(); i++) {
            kontrol = false;
            for (int j = 0; j < this.elemanlar.size(); j++) {
                if(k.elemanlar.get(i) == this.elemanlar.get(j)){                    
                    kontrol = true;
                    break;
                }                    
            }
            if(kontrol == false)
                System.out.println(k.elemanlar.get(i) + " - ");
        }
    }
  
}
