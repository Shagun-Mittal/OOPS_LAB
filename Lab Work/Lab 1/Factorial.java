import java.util.Scanner;
class Factorial
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int num,f;
    System.out.println("Enter number:");
    num = sc.nextInt();
    f = fact(num);
    System.out.println("Factorial of number is:" + f);
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
