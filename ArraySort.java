import java.util.Scanner;
class ArraySort
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n,c,temp,d;
    System.out.println("Enter number of integers :");
    n = sc.nextInt();
    int array[] = new int[n];
    int sorted_array[] = new int[n];
    System.out.println("Enter "+ n+ " integers");
    for(c=0;c<n;c++)
    array[c] = sc.nextInt();
     for( c=0; c < n; c++){  
     for( d=1; d < (n-c); d++){  
     if(array[d-1] > array[d]){                                 
     temp = array[d-1];  
     array[d-1] = array[d];  
     array[d] = temp;}}}  
    System.out.println("Sorted array in Ascending order is: " );
    for(c=0;c<n;c++)
    System.out.println(array[c]);
    for( c=0; c < n; c++){  
     for( d=1; d < (n-c); d++){  
     if(array[d-1] < array[d]){                                 
     temp = array[d-1];  
     array[d-1] = array[d];  
     array[d] = temp; }}}
    System.out.println("Sorted array in Decending order is: " );
    for(c=0;c<n;c++)
    System.out.println(array[c]);
    sc.close();
}}





















































