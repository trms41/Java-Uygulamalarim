/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package find.max;
import java.util.*;
/**
 *
 * @author TR
 */
public class FindMAX {

    /**
     * @param veriler
     * @return 
     */
    
    public static double findmax(double[][] veriler)
    {
        double buyuk=veriler[0][0];
        for(int i=0; i<veriler.length; i++)
        {
            for(int j=0; j<veriler[0].length; j++)
            {
                if(buyuk<veriler[i][j])
                {
                    buyuk=veriler[i][j];
                }
            }
        }
        return buyuk;
    }
    
    public static void main(String[] args) 
    {
        double[][] veriler={{5,8,13},{7,6,1},{0,56,3}};
        System.out.println(findmax(veriler));
                
    }
    
}
