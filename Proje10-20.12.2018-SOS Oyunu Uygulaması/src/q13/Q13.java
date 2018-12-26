/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q13;
import java.util.*;
/**
 *
 * @author TR
 */
public class Q13 {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args)
    {
        Oyun sos= new Oyun ();
        int birinci,ikinci,kontrol;
        boolean ssira;
        
        Scanner input = new Scanner (System.in);
        
        kontrol=-1;
        while (kontrol==-1)
        {
            System.out.println("-----------------------");
            sos.tahtaciz();
            System.out.print(sos.oyuncu+ ". oyuncu SÜTUN:");
            birinci=input.nextInt();
            System.out.print("\n"+sos.oyuncu+ ". oyuncu SATIR:");
            ikinci=input.nextInt();
            if (birinci==-1) break;
            if (ikinci==-1) break;
            birinci--; ikinci--;
            ssira= sos.taskoy(birinci, ikinci, sos.tas);
            if (ssira)
            {
                sos.sonraki ();                
            }
            else
            {
                System.out.println("Hatalı koordinat!");
            }
            kontrol= sos.bittimi();
        }
        
        sos.tahtaciz();
        if (kontrol==0)
        {
            System.out.println("Oyun bitti. Kazanan Olmadı!");            
        }
        
        else if (kontrol==1)
        {
            System.out.println("1.Oyuncu kazandı!");
        }
        else if (kontrol==2)
        {
            System.out.println("2.Oyuncu kazandı!");
        }
        


        
        
    }
    
}
