/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist_kesisim_kumesi;

import java.util.ArrayList;

/**
 *
 * @author TR
 */
public class ArrayList_Kesisim_Kumesi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                ArrayList<Integer> d1 = new ArrayList<Integer>();
        ArrayList<Integer> d2 = new ArrayList<Integer>();
        ArrayList<Integer> d3 = new ArrayList<Integer>();
        
        d1.add(6);d1.add(8);d1.add(9);d1.add(0);d1.add(4);
        d2.add(1);d2.add(3);d2.add(8);d2.add(0);d2.add(6);
        
        for(int i=0; i<d1.size();i++){
            for(int j=0; j<d2.size(); j++){
                if(d1.get(i)==d2.get(j)){
                    d3.add(d1.get(i));
                }
            }
        }
        System.out.println(d3.toString());
    }
    
}
