import java.util.Scanner;
class large
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int a, b, c, max;
    System.out.println("Enter 3 numbers :");
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();
    max = largest(a,b,c);
    System.out.println("The largest number is " + max);
    sc.close();
  }
    static int largest(int n1,int n2,int n3)
    {
    int max;
    if(n1>n2 && n1>n3)
     {
      max = n1;
     }
    else if(n2>n1 && n2>n3)
     {
      max = n2;
     }
    else
     {
      max = n3;
     }
    return max;
    }
}
