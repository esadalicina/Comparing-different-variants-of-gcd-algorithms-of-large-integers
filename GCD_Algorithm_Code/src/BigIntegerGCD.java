
import java.math.*;
import java.math.BigInteger;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esada Licina
 */
public class BigIntegerGCD
{
    
   

   
    
    public static BigInteger gcdEucBig(BigInteger a, BigInteger b)
    {
       a=a.abs();
       b=b.abs();
       if(b.equals(BigInteger.ZERO)) 
       {
           return a;
       }
       else {
           return gcdEucBig(b,a.mod(b));
       }
       
    }
    
    public static BigInteger gcdExEucBig(BigInteger n1, BigInteger n2, BigInteger x, BigInteger y) 
    { 
        n1=n1.abs();
        n2=n2.abs();
       
        if (n1.equals(BigInteger.ZERO)) 
        { 
            x =BigInteger.ZERO; 
            y = BigInteger.ONE; 
            return n2; 
        } 

        BigInteger x1=BigInteger.ONE;
        BigInteger y1=BigInteger.ONE; 
        BigInteger gcd = gcdExEucBig(n2.mod(n1), n1, x1, y1); 

       
                
        x = y1.subtract((n2.divide(n1)).multiply(x1)); 
        y = x1; 

        return gcd; 
    } 
    
    public static BigInteger gcdBinBig(BigInteger a, BigInteger b) 
    { 
        a=a.abs();
        b=b.abs();
       
        if (a.equals(BigInteger.ZERO)) 
            return b; 
        if (b.equals(BigInteger.ZERO)) 
            return a; 
        
        int k=0;
        while((!(a.testBit(0))) && (!(b.testBit(0))))
        { 
            a=a.shiftRight(1); 
            b=b.shiftRight(1);
            
            k++;
        }
        
        while (!(a.testBit(0)))
        {   
        a=a.shiftRight(1); 
        }
        
        do {
            
            while (!(b.testBit(0)))
            {    
                b=b.shiftRight(1); 
            }
           
            if (a.compareTo(b)>0)  
            { 
                BigInteger swap = a; 
                a = b; 
                b= swap; 
            } 
  
            b = b.subtract(a); 
        }
        while (!b.equals(BigInteger.ZERO)); 
        return  a.shiftLeft(k); 
    } 
    
    
   
   public static BigInteger gcdExBinBig(BigInteger a,BigInteger b)
   {
      a=a.abs();
      b=b.abs();
      BigInteger ao;
      BigInteger bo;
      
      BigInteger sa;
      BigInteger sb;
      BigInteger ta;
      BigInteger tb;
      
      int shift=0;
      if (a.equals(BigInteger.ZERO)){
            sa=BigInteger.ZERO;
            sb=BigInteger.ZERO;
            ta=BigInteger.ONE;
            tb=BigInteger.ONE;
            return b; 
      }
      if (b.equals(BigInteger.ZERO)) {
          sa=BigInteger.ONE;
          sb=BigInteger.ONE;
          ta=BigInteger.ZERO;
          tb=BigInteger.ZERO;
          return a;
      }
      while((!(a.testBit(0))) && (!(b.testBit(0))))
      {
          a=a.shiftRight(1);
          b=b.shiftRight(1);
          shift++;    
      }
      
      ao=a;
      bo=b;
      
      sa=BigInteger.ONE;
      sb=BigInteger.ZERO;
      ta=BigInteger.ZERO;
      tb=BigInteger.ONE;
      
      while(!(a.testBit(0)))
      {
          if((!(sa.testBit(0))) && (!(sb.testBit(0))))
          {
              sa=sa.add(bo);
              sb=sb.subtract(ao);
          }
          a=a.shiftRight(1);
          sa=sa.shiftRight(1);
          sb=sb.shiftRight(1);
      }
      while(!b.equals(BigInteger.ZERO))   
      {
          while(!(b.testBit(0)))
          {
              if((!(ta.testBit(0))) && (!(tb.testBit(0))))
              {
                  ta=ta.add(bo);
                  tb=tb.subtract(ao);
              }
              b=b.shiftRight(1);
              ta=ta.shiftRight(1);
              tb=tb.shiftRight(1);
          }
          if(a.compareTo(b)>0 )
          {
              BigInteger t=a;
              a=b;
              b=t;
              
              t=sa;
              sa=ta;
              ta=t;
              
              t=sb;
              sb=tb;
              tb=t;
          }
          b=b.subtract(a);
          ta=ta.subtract(sa);
          tb=tb.subtract(sb);
      }
      return a.shiftLeft(shift);
   }
   
   public static BigInteger gcdBigInt(BigInteger a,BigInteger b)
   {
       a=a.abs();
       b=b.abs();
       return a.gcd(b);
   }

    
}
