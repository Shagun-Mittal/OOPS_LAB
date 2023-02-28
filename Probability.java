import java.util.Scanner;
class Probability
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n,r,c;
    System.out.println("Enter n:");
    n = sc.nextInt();
    System.out.println("Enter r:");
    r = sc.nextInt();
    c = fact(n)/(fact(r)*fact(n-r));
    System.out.println("The probability is:" + c);
    sc.close();
  }
  static int fact(int n)
  {
   int i,fac = 1;
   for(i=1;i<=n;i++)
   {
    fac = fac*i;
   }
   return fac;
   }
}
