import java.util.Scanner;
public class ComplexTest
{
   public static void main(String[] args)
   {
     Scanner co = new Scanner (System.in);
     System.out.println ("First Complex number");
     System.out.println ("Enter real part of First number");
     Double a = co.nextDouble();
     System.out.println ("Enter imaginary part of First number");
     Double b = co.nextDouble();
     System.out.println ("First Complex number is a+bi \n"+ a +" + "+ b +"i");
     System.out.println ("\nSecond Complex number");
     System.out.println ("Enter real part of Second number");
     Double c = co.nextDouble();
     System.out.println ("Enter imaginary part of Second number");
     Double d = co.nextDouble();
     System.out.println ("Second Complex number is c+di\n"+ c +" + "+ d +"i");
     Complex ob=new Complex(a,b,c,d);
     System.out.println ("\nMENU\n1)Addition\n2)Substraction\n3)Multiplication\n4)Division");
     int n;
     do
     {
        System.out.println ("Enter your choice:= ");
        int choice = co.nextInt();
        switch(choice)
        {
           case 1:ob.addition();
           break;
           case 2:ob.substraction();
           break;
           case 3:ob.multiplication();
           break;
           case 4:ob.division();
           break;
           default: System.out.println("Enter a proper code");
        }
        System.out.println ("Do you want to perform any calulations? (1-yes||0-no)");
        n = co.nextInt();
     }
     while(n==1);
   }
}
class Complex
{
   double realfirst;
   double imaginaryfirst;
   double realsecond;
   double imaginarysecond;

   Complex(double p, double q,double r,double s)
   {
     realfirst=p;
     imaginaryfirst=q;
     realsecond=r;
     imaginarysecond=s;
   }

   void addition()
   {
     double x = realfirst + realsecond;
     double y = imaginaryfirst + imaginarysecond;
     System.out.println("The addition of the two complex numbers is\n= " + x + " + " + y + "i\n");
   }

   void substraction()
   {
     double x = realfirst - realsecond;
     double y = imaginaryfirst - imaginarysecond;
     System.out.println("The Substraction of the two complex numbers is\n= " + x + " + " + y + "i\n");
   }

   void multiplication()
   {
     double x = (realfirst * realsecond) - (imaginaryfirst * imaginarysecond);
     double y = (realfirst * imaginarysecond) + (realsecond * imaginaryfirst);
     System.out.println("The Multipliaction of the two complex numbers is\n= " + x + " + " + y + "i\n");
   }

   void division()
   {
     double x = ((realfirst * realsecond) - (imaginaryfirst * imaginarysecond))/
     (realsecond*realsecond + imaginarysecond*imaginarysecond);
     double y = ((realfirst * imaginarysecond) + (realsecond * imaginaryfirst))/
     (realsecond*realsecond + imaginarysecond*imaginarysecond);
     System.out.println("The Division of the two complex numbers is\n= " + x + " + " + y + "i\n");
   }
   
}
