import java.util.Scanner;
class NPrime
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int num,i,ctr=0;
    boolean p;
    System.out.println("Enter a number:");
    num = sc.nextInt();
    System.out.println("N Prime numbers:");
    for(i=1;ctr<num;i++)
    {
     p = isPrime(i);
     if(p)
     {
      System.out.println(i + " ");
      ctr++;
     }
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
 
