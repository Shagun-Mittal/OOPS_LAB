import java.util.*;

class NumberFormat
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		String num = String.format("%,03d",n);
                        
		System.out.println(num);
	}
}