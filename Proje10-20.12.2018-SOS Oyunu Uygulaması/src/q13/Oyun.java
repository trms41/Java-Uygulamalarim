/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q13;

/**
 *
 * @author TR
 */
public class Oyun
{
    private char[][] tahta= new char [3][3];
    public int oyuncu;
    public char tas;
    
    public Oyun ()
    {
        for (int x=0; x<3; x++)
            for (int y=0; y<3; y++) tahta[x][y]='*';
        oyuncu= 1;
        tas='S';
    }
    
    public void tahtaciz ()
    {
        int eksen;
                
        System.out.println("  1 2 3");
        eksen=1;
        for (int y=0;y<3;y++)
        {
            System.out.print(eksen++ +" ");
            for (int x=0;x<3;x++)
            {
                System.out.print(tahta[x][y]+" ");                                
            }
            System.out.println("");
        }
    }

    public void sonraki ()
    {
        if (oyuncu==1) 
        {
            oyuncu=2;
            tas='O';
        }
        else
        {
            oyuncu=1;
            tas='S';            
        }
    }
    
    public int bittimi()
    {
        char tas_x;
        int a;
        
        
        for (int y=0; y<3; y++)
        {
            tas_x=tahta[0][y];
            a=1;
            if (tas_x=='*') continue;
            for (int x=0; x<3; x++)
            {
                if (tahta[x][y]!=tas_x) a=0;
            }
            if (a==1) 
            {
                if (tas_x=='S') return 1; else return 2;
            }
        }

        
        a=1;
        for (int x=0; x<3; x++)
        {
            a=1;
            tas_x=tahta[x][0];
            if (tas_x=='*') continue;
            for (int y=0; y<3; y++)
            {
                if (tahta[x][y]!=tas_x) a=0;
            }
            if (a==1) 
            {
                if (tas_x=='S') return 1; else return 2;
            }
        }


        
        a=1;        
        tas_x=tahta[0][0];       
        if (tas_x!='*')
        {
            int y=0;
            for (int x=0; x<3; x++,y++)
            {            
                if (tahta[x][y]!=tas_x) a=0;
            }
            if (a==1) 
            {
                if (tas_x=='S') return 1; else return 2;
            }        
        }

        
        a=1;        
        tas_x=tahta[2][0];       
        if (tas_x!='*')
        {
            int y=0;
            for (int x=2; x>=0; x--,y++)
            {            
                if (tahta[x][y]!=tas_x) a=0;
            }
            if (a==1) 
            {
                if (tas_x=='S') return 1; else return 2;
            }        
        }

       
        a=1;
        for (int x=0; x<3; x++)
        {
            for (int y=0; y<3; y++)
            {
                if (tahta[x][y]=='*') a=0;
            }
        }
        if (a==1) 
        {
            return 0;
        }

        return -1;
    }
    
    public boolean taskoy (int x, int y, char c)
    { 
        if (tahta[x][y]=='*')
        {
            tahta [x][y]= c;
            return true;
        }
        else return false;
    }
    
    
}
