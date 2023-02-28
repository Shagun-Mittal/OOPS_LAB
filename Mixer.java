import java.util.Scanner;
import java.io.*;

class Mixer
{
	Scanner sc = new Scanner(System.in);
	
	int n;
	
	int arr[] = new int[100];
	
	void accept()
	{
		System.out.println("Enter Number of Elements : ");
		n = sc.nextInt();
		
		System.out.println("Enter Array Elements in Ascending Order without any Repetiion in the Elements : ");
		
		for(int i = 0 ; i < n ; i++)
		{
			arr[i] = sc.nextInt();
		}
	}
	
	Mixer mix(Mixer B)
	{
		Mixer ob = new Mixer();
		ob.n = this.n + B.n;
		int x = 0;
		for(int i = 0 ; i < ob.n ; i++)
		{
			if(i < this.n)
			{
				ob.arr[i] = this.arr[i];
			}
			
			else
			{
				ob.arr[i] = B.arr[x];
				x++;
			}
		}
		
		
		
		return ob;
	}
	
	void display()
	{
		for(int i = 0 ; i < this.n ; i++)
		{
			System.out.print(this.arr[i]+" ");
		}
	
		System.out.println();
	}
}

public class MixerDemo
{
	public static void main(String args[])
	{
		Mixer A = new Mixer();
		Mixer B = new Mixer();
		Mixer ob = new Mixer();
		
		A.accept();
		B.accept();
		
		ob = A.mix(B);
		ob.display();
	}
}