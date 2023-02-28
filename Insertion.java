import java.util.Scanner;
class Insertion
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n,i,pos,c,ele,choice;
    System.out.println("Enter number of integers :");
    n = sc.nextInt();
    int array[] = new int[n];
    int new_array[] = new int[n+1];
    int new_array2[] = new int[n-1];
    System.out.println("Enter "+ n+ " integers");
    for(c=0;c<n;c++)
    array[c] = sc.nextInt();
    System.out.println("Enter choice 1)Insertion 2)Deletion :");
    choice = sc.nextInt();
    switch(choice)   
    {
    case 1:System.out.println("Enter element to be added :");
    ele = sc.nextInt();
    System.out.println("Enter position where element is to be inserted :");
    pos = sc.nextInt();
    for (i = 0; i < n + 1; i++) {
    if (i < pos - 1)
    new_array[i] = array[i];
    else if (i == pos - 1)
    new_array[i] = ele;
    else
    new_array[i] = array[i - 1];
    }
    System.out.println("Array with inserted element is:");    
    for(c=0;c<n+1;c++){
    System.out.println(new_array[c]);}
    break;
    case 2:System.out.println("Enter position from where element is to be deleted :");
    pos = sc.nextInt();
    for (i = 0; i < n ; i++) {
    if (i < pos - 1)
    new_array2[i] = array[i];
    else if (i == pos - 1)
    continue;
    else
    new_array2[i-1] = array[i];
    }
    System.out.println("Array with deleted element is:");    
    for(c=0;c<n-1;c++){
    System.out.println(new_array2[c]);}
    

    sc.close();
}}}
    

    
     
    
