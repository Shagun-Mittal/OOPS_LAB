import java.util.Scanner;
class Prime
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int num;
    boolean p;
    System.out.println("Enter number:");
    num = sc.nextInt();
    p = isPrime(num);
    if(p)
    {
     System.out.println(num + "Is Prime");
    }
    else 
    {
     System.out.println(num + "Is not Prime");
    }
    sc.close();
  }
  static boolean isPrime(int n)
  {
   int i,ctr = 0;
   if(n == 1 || n==0)
    {
     return false;
    }
   for(i=2;i<n;i++)
   {
    if(n%i==0)
    {
     ctr++;
    }
   }
   if(ctr >0)
   {
    return false;
   }
   else
   {
    return true;
   }
}
}
 
