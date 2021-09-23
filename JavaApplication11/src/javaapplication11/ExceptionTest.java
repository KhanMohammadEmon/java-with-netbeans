
package javaapplication11;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ExceptionTest {
 
   public static void a(int n) 
 {
     b(n);
 }
 
   public static void b(int n) 
 {
       try {
           c(n);
       } catch (CoustomException ex) {
           Logger.getLogger(ExceptionTest.class.getName()).log(Level.SEVERE, null, ex);
       }
 }
 
   public static void c(int n) throws CoustomException 
 {
    if(n<0)
           throw new CoustomException("I am Throwimg");
       else
           System.out.println("I am Fine"); 
 }
   
    public static void main(String[] args) {
        a(-10);
    }

}


class  CoustomException extends Exception
{
   public CoustomException(String str)
{
    System.out.println("Hey You Are Control By Emon! Thank You For Try It...");
}
}