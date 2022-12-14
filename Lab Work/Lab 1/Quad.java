import java.util.Scanner;
class Quad
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int a, b, c, n=0;
    double d, r1, r2;
    double img, re;
    System.out.println("Enter a,b,c is the form of ax^2+bx+c");
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();
    d= b*b -4*a*c;
    if(d>0)
    {
     n=1;
    }
    else if(d==0)
    {
     n=0;
    }
    else
    {
     n=-1;
    }
    switch(n)
    {
     case 1:System.out.println("Roots are real and unequal "); 
     r1 = (-b + Math.sqrt(d))/(2*a);
     r2 = (-b - Math.sqrt(d))/(2*a);
     System.out.println("Root 1 = " + r1 + "Root2 =" + r2);
     break;
     case 2:System.out.println("Roots are real and equal "); 
     r1 = r2 = (-b)/(2*a);
     System.out.println("Root 1 = " + r1 + "Root2 =" + r2);
     break;
     case -1:System.out.println("Roots are imaginary and unequal "); 
     re = (-b)/(2*a);
     img = Math.sqrt(-d))/(2*a);
     System.out.println("Root 1 = " + re + "+i" + img + "Root2 =" + r2 + "-i" + img);
     break;
     default: System.out.println("Error");
    }
    sc.close();
   }
}
