import java.util.Scanner;
class add_matrix
{
  public static void main(String args[])
  {
    int m,n,p,q;
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter number of rows:");
    m = sc.nextInt();
    System.out.println("Enter number of columns:");
    n = sc.nextInt();
    System.out.println("Enter number of rows for second matrix:");
    p = sc.nextInt();
    System.out.println("Enter number of columns for second matrix:");
    q = sc.nextInt();
    if(p==m && q==n)
    {
      int a[][] = new int[p][q];
      int b[][] = new int[p][q];
      int c[][] = new int[p][q];
      System.out.println("Enter all elements for first matrix:");
      for(int i = 0;i<p;i++)
      {
        for(int j = 0;j<q;j++){
          a[i][j] =sc.nextInt();
        }
      }
      System.out.println("Enter all elements for second matrix:");
      for(int i = 0;i<p;i++)
      {
        for(int j = 0;j<q;j++){
          b[i][j] =sc.nextInt();
        }
      }
      for(int i = 0;i<p;i++)
      {
        for(int j = 0;j<q;j++)
        {
          for(int k = 0;k<q;k++)
          {
            c[i][j] = a[i][j] + b[i][j];
          }
        }
      }
      System.out.println("Matrix after addition:");
      for(int i = 0;i<p;i++)
      {
        for(int j = 0;j<q;j++){
          System.out.print(c[i][j] + " ");
        }
        System.out.println(" "); 
      }
    }
    else
    {
      System.out.println("Addition Not Possible");
    }
  } 
}     