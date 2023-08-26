import java.lang.Math;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esada
 */
public class IntegerGCD 
{
     
    public static int gcdBin(int n1, int n2) 
    { 
        n1=Math.abs(n1);
        n2=Math.abs(n2);
        
        if (n1 == 0) 
            return n2; 
        if (n2 == 0) 
            return n1; 
  
        int k=0;
        while (((n1 | n2) & 1) == 0)  
        { 
            n1 >>= 1; 
            n2 >>= 1; 
            k++;
            
        } 
        

       
        while ((n1 & 1) == 0) 
            n1>>= 1; 
        
       
        do { 
            
            while ((n2 & 1) == 0) 
                n2 >>= 1; 
  
            if (n1> n2)  
            { 
  
               
                int temp = n1; 
                n1 = n2; 
                n2= temp; 
            } 
  
            n2 = (n2- n1); 
        } 
        while (n2 != 0); 
  
       
        return n1 << k; 
    } 
    
    public static int gcdExBin(int a,int b)
   {
      
        a=Math.abs(a);
        b=Math.abs(b);
        int ao;
        int bo;
        int sa;
        int sb;
        int ta;
        int tb;
      
        int shift=0;
        if (a == 0){
              sa=0;
              sb=0;
              ta=1;
              tb=1;
              return b; 
        }
        if (b == 0) {
            sa=1;
            sb=1;
            ta=0;
            tb=0;
            return a;
        }
        while(((a | b) & 1) == 0)   
        {
            a>>=1;
            b>>=1;
            shift++;
        }

        ao=a;
        bo=b;

        sa=1;
        sb=0;
        ta=0;
        tb=1;

        while((a&1)==0)
        {
            if(!(((sa | sb) & 1) == 0))
            {
                sa+=bo;
                sb-=ao;
            }
            a>>=1;
            sa>>=1;
            sb>>=1;
        }
        while(b!=0)   
        {
            while((b&1)==0)
            {
                if(!(((ta | tb) & 1) == 0))
                {
                    ta+=bo;
                    tb-=ao;
                }
                b>>=1;
                ta>>=1;
                tb>>=1;
            }
            if(a>b)
            {
                int t=a;
                a=b;
                b=t;

                t=sa;
                sa=ta;
                ta=t;

                t=sb;
                sb=tb;
                tb=t;
            }
            b=b-a;
            ta=ta-sa;
            tb=tb-sb;
        }
        return a<<shift;
  }
  
    
    public static int gcdEuc(int n1, int n2)
    {
        n1=Math.abs(n1);
        n2=Math.abs(n2);
        if(n2==0)
            return n1;
        else
            return gcdEuc(n2,n1%n2);
    }
     
    
    
    public static int gcdExEuc(int n1, int n2, int x, int y) 
    { 
        n1=Math.abs(n1);
        n2=Math.abs(n2);
        
        if (n1 == 0) 
        { 
            x = 0; 
            y = 1; 
            return n2; 
        } 

        int x1=1, y1=1; 
        int gcd = gcdExEuc(n2%n1, n1, x1, y1); 

        x = y1 - (n2/n1) * x1; 
        y = x1; 

        return gcd; 
    } 

   
 
}   
