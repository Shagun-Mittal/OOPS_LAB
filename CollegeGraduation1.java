import java.util.Scanner;
class Person
{
private String name;
private String bday;
public String aname(String name)
{
return name;
}
public String abday(String bday)
{
return bday;
}
}
class CollegeGraduation extends Person
{
private double gpa;
private String yog;
public CollegeGraduation()
{
gpa = 0.0;
yog = null;
}
public double agpa(double gpa)
{
return gpa;
}
public String ayog(String yog)
{
return yog;
}
}
class CollegeGraduation1
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);

System.out.println("Enter Name : ");
String name1 = sc.next();
System.out.println("Enter Birthday (DD/MM/YYYY) : ");
String bday1 = sc.next();
System.out.println("Enter GPA : ");
double gpa1 = sc.nextDouble();
System.out.println("Enter Year of Graduation (YYYY) : ");
String yog1 = sc.next();
CollegeGraduation cg = new CollegeGraduation();
System.out.println("Name = "+cg.aname(name1));
System.out.println("Birthday = "+cg.abday(bday1));
System.out.println("GPA = "+cg.agpa(gpa1));
System.out.println("Year of Graduation = "+cg.ayog(yog1));

}
}