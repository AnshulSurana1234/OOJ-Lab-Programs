import java.util.Scanner;
class Student
{
   private String usn;
   private String name;
   private int credits[];
   private int marks[];
   private double sgpa;
   
   void getDetails(int n)
   {
	 System.out.println("Enter Students details:\n");
     Scanner get=new Scanner(System.in);
	 System.out.println("USN:");
	 usn=get.next();
	 System.out.println("Name:");
	 name=get.next();
	 marks=new int[n];
	 credits=new int[n];
	 System.out.println("Enter marks and credits respectively:");
	 for( int i=0;i<n;i++)
	 { System.out.println("\nSubject "+(i+1));
	   marks[i]=s1.nextInt();
	   credits[i]=s1.nextInt();
	   } 
   }
   
   void calcsgpa(int n)
   { double sum=0,sgpa,sumc=0;
     
     for(int i=0;i<n;i++)
	 {sum=(marks[i]/10+1)*credits[i]+sum; 
      sumc=credits[i]+sumc;
	 }
     sgpa=sum/sumc;
	 System.out.println("SGPA :"+sgpa);
   }
   
   void printDetails(int n)
   {
   System.out.println("\nUSN:"+ usn);
   System.out.println("NAME:"+name);   
   System.out.println("MARKS\tCREDIT");
   
   for(int i=0;i<n;i++)
    System.out.println(marks[i]+"\t"+credits[i]);
   calcsgpa(n);
   } 
}

class StudentMain
{
    public static void main(String ss[])
	{  int n;
	   System.out.println("Enetr the no of subjects:");
	   Scanner get=new Scanner(System.in);
	   n=get.nextInt();
	   Student s1= new Student(); 
	   s1.getDetails(n);
	   
	   s1.printDetails(n);
	   
	   
	}
}
