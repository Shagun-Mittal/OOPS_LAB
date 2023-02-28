import java.util.Scanner;

class Time
{
	int hr;
	int min;
	int sec;

	void input(int hr,int min, int sec)
	{
		this.hr = hr;
		this.min = min;
		this.sec = sec;
	}

	Time add(Time obj2)
	{
		
		Time ob = new Time();
		
		ob.hr = this.hr+obj2.hr;
		ob.min = this.min+obj2.min;
		ob.sec = this.sec+obj2.sec;
		
		if(ob.sec>=60)
		{
			ob.min = ob.min+1;
			ob.sec = ob.sec-60;
		}
		
		if(ob.min>=60)
		{
			ob.hr = ob.hr+1;
			ob.min = ob.min-60;
		}
		
		if(ob.hr>=24)
		{
			ob.hr = ob.hr-24;
		}
		
		return(ob);
	}
	
	Time subtract(Time obj2) 
	{
		Time ob = new Time();
		
		ob.hr = (int) Math.abs(this.hr-obj2.hr);
		ob.min = (int) Math.abs(this.min-obj2.min);
		ob.sec = (int) Math.abs(this.sec-obj2.sec);
		return(ob);
	}
	Time compare(Time obj2)
	{
		if (this.hr > obj2.hr)
		{
			return this;
		}
		else if (this.hr == obj2.hr && this.min > obj2.min)
		{
			return this;

		}
		else if (this.hr == obj2.hr && this.min == obj2.min && this.sec > obj2.sec)
		{
			return this;
		}
		else
		{
			return obj2;
		}
	}
	
	void display()
	{
		System.out.println("Time : " + hr+":"+min+":"+sec);
	}
}

public class TimeDemo
{
	public static void main(String[] args)
	{
	    Scanner sc =new Scanner(System.in); 
    	int h1,h2,m1,m2,s1,s2;
    	System.out.println("Enter the hours for time 1:");
    	h1= sc.nextInt();
    	System.out.println("Enter the minutes for time 1:");
    	m1= sc.nextInt();
    	System.out.println("Enter the seconds for time 1:");
    	s1= sc.nextInt();
    	System.out.println("Enter the hours for time 2:");
    	h2= sc.nextInt();
    	System.out.println("Enter the minutes for time 2:");
    	m2= sc.nextInt();
    	System.out.println("Enter the seconds for time 2:");
    	s2= sc.nextInt();
		Time obj1 = new Time();
		obj1.input(h1,m1,s1);
		obj1.display();
		Time obj2 = new Time();
		obj2.input(h2,m2,s2);
		obj2.display();
		Time ob = new Time();
		
		Time a=obj1.add(obj2);
		Time b=obj1.subtract(obj2); 
		System.out.println("Addition: " + a.hr + ":" + a.min + ":" + a.sec);
        System.out.println("Subtraction: " + b.hr + ":" + b.min + ":" + b.sec);
        Time c=obj1.compare(obj2);
        System.out.println("Larger Time is: " + c.hr + ":" + c.min + ":" + c.sec);
	}
}