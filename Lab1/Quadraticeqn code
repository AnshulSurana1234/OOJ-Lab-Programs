import java.util.Scanner;
import java.lang.Math;
class quadeqn
{ public static void main(String args[])
 { int a,b,c,d;
   double r1,r2;
   Scanner get=new Scanner(System.in);
   System.out.println("Enter the three coefficients according to decresing power of x:\n");
   a=get.nextInt();
   b=get.nextInt();
   c=get.nextInt();
   System.out.println("a="+a+" b="+b+" c="+c);
   d=b*b-4*a*c;
   if(d>0)
   { System.out.println("Roots are real and unequal");
     r1=(-b+Math.sqrt(d))/(2*a);
	 r2=(-b-Math.sqrt(d))/(2*a);
	 System.out.println("\nr1= "+r1+" r2="+r2);
   }
   else
    if(d==0)
	{System.out.println("Roots are real and equal");
     r1=(-b)/(2*a);
	 System.out.println("\nr= "+r1);
	}
    else
     if(d<0)
   	  System.out.println("Roots are imaginary");
   
 }
}
