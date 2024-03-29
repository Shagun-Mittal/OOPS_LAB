import java.util.*;
class InvalidDateException extends Exception
{
  InvalidDateException()
{

}
public String toString()
{
  return "Invalid Date!!";
}
}
class InvalidMonthException extends Exception
{
  InvalidMonthException()
{

}
public String toString()
{
  return "Invalid Month!!";
}
}
class CurrentDate
{
  int day,month,year;
CurrentDate()
{
  day=month=year=1;
}
CurrentDate(int d,int m,int y)
{
  day=d; 
  month=m; 
  year=y;
}
static CurrentDate createDate()throws InvalidDateException,InvalidMonthException
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter day, month,year");
  int d=sc.nextInt();
  int m=sc.nextInt();
  int y=sc.nextInt();

  int daysnl[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
  int daysl[]={0,31,29,31,30,31,30,31,31,30,31,30,31};
  int days[];
  days=y%100==0?(y%400==0?daysl:daysnl):y%4==0?daysl:daysnl;
  if(m>12||m<1) throw(new InvalidMonthException());
  if(d>days[m]||d<1) throw (new InvalidDateException());
CurrentDate d1=new CurrentDate(d,m,y);
  return d1;
}
void disp()
{
  System.out.println(day+"/"+month+"/"+year);
}
public static void main(String arg[])
{
  CurrentDate d1=null;

try{
  d1=createDate();
}
catch(InvalidMonthException e)
{
  System.out.println(e);
}
catch(InvalidDateException e)
{
  System.out.println(e);
}
if(d1!=null) d1.disp();
}
}