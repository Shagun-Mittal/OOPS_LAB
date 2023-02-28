import java.util.*;
import java.text.*;

class Student 
{
    
    static int regNo;
    static int n=0;
    String fullName;
    GregorianCalendar dateJoined;
    int semester;
    float gpa;
    float cgpa;
    
    Student() 
    {
        regNo = 0;
        fullName = "";
        dateJoined = new GregorianCalendar();
        semester = 0;
        gpa = 0.f;
        cgpa = 0.f;
    }
     Student(int yr,int m,int dt,String nm,int sem, float g, float c) 
    {
        
        dateJoined = new GregorianCalendar(yr,m-1,dt);
        regNo = yr/100*(100+n++);
        fullname=new String(nm);
        semester = new int(sem);
        gpa = new float(g);
        cgpa = new float(c);        
    }
    
    
    void display() 
    {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd, yyyy"); 
        System.out.println("\n\t       Name | " + fullName + 
                           "\n\t     Reg No | " + regNo + 
                           "\n\tDate Joined | " + dateFormat.format(dateJoined.getTime()) +
                           "\n\t   Semester | " + semester + 
                           "\n\t        GPA | " + gpa + 
                           "\n\t       CGPA | " + cgpa + 
                           "\n");
    }
    
    public void input() 
    {
        Scanner sc = new Scanner(System.in);
        Calendar gcal = Calendar.getInstance();
        GregorianCalendar cal = new GregorianCalendar();
        
        
    }
    public void shortenName() 
    {
        for (Student stud: students) 
        {
            String newName = "";
            String lastName = "";
            StringTokenizer st = new StringTokenizer (stud.fullName);
            
            while (st.hasMoreTokens())
            {
                lastName = st.nextToken();
                newName += lastName.charAt(0) + ". ";
            }
            
            newName = newName.substring(0, newName.length() - 3) + lastName;
            stud.fullName = newName;
        }
    }
    public void sort(String wrt) 
    {
        for (int i = 0; i < size - 1; ++i) 
        {
            int min = i;
            for (int j = i + 1; j < size; ++j) 
            {
                if (wrt.equals("semester") && (students[j].semester > students[min].semester))
                {
                    min = j;
                }
                
                if (wrt.equals("cgpa") && (students[j].cgpa > students[min].cgpa))
                {
                    min = j;
                }
                
                if (wrt.equals("fullName") && (students[j].fullName.compareTo(students[min].fullName)) < 0)
                {
                    min = j;
                }
            }
            
            if (min != i) 
            {
                Student temp = students[i];
                students[i] = students[min];
                students[min] = temp;
            }
        }
    }
}


public class StudentTest 
{
    
    public static void main (String args[])
     {  
        Scanner sc = new Scanner(System.in);
        Calendar cal = Calendar.getInstance();
        GregorianCalendar gcal = new GregorianCalendar();
        
        System.out.print("\n\tEnter the number of records: ");
        int size = sc.nextInt();
        
        Student students[] = new Student[size];
        for(int i=0,i<size,i++)
        {
        System.out.print("\n\tEnter Name: ");
        String.fullName = sc.nextLine();
        
        System.out.print("\tEnter Date Joined (yyyy/mm/dd): ");
        int.year =sc.nextInt();
        int.month = sc.nextInt();
        int.date = sc.nextInt();
        
        System.out.print("\tEnter Semester: ");
        int.semester = sc.nextShort();
        
        System.out.print("\tEnter GPA: ");
        float.gpa = sc.nextFloat();
        
        System.out.print("\tEnter CGPA: ");
        float.cgpa = sc.nextFloat();
        students[i] =new Student(fullname,year,month,date,semester,gpa,cgpa);
        }
        
       
        char choice;
        
        do 
        {
            System.out.print("\n\t1. Display Records." + 
							"\n\t2. Sort wrt Name." +
							"\n\t3. Sort wrt Semester (Desceding)." +
							"\n\t4. Sort wrt CGPA (Descending)." +
							"\n\t5. List all Students whose name begins with a character." +
							"\n\t6. List all Students whose name contains a string." +
							"\n\t7. Change the names of all students to shortened form." +
							"\n\t8. exit." +
							"\n\n\t Enter choice: ");
            choice = sc.next().charAt(0);
			sc.nextLine();
            
            switch (choice) 
            {
                case '1': 

                Student.display();
                
                break;
                
                case '2': 

                Student.sort("fullName");
                System.out.println("\nSotred wrt Name.\n");
                Student.display();
                
                break;
                
                case '3': 

                student.sort("semester");
                System.out.println("\nSotred wrt Semester.\n");
                Student.display();
                
                break;
                
                case '4': 

                Student.sort("cgpa");
                System.out.println("\nSotred wrt CGPA.\n");
                Student.display();
                
                break;
                
                case '5': 

                System.out.print("\n\tEnter the character: ");
                char ch = sc.next().charAt(0);
                students.list(ch);
				System.out.println("\n\tAll the student names starting with \' " + ch + "\' : \n");
				Students.displayAll();
                
                break;
                
                case '6': 

                System.out.print("\n\tEnter the string: ");
                String subs = sc.nextLine();
                Student.list(subs);
				System.out.println("\n\tAll the student names containing \' " + subs + "\' : \n");
				students.displayAll();
                
                break;
                
                case '7': 

                Student.shortenName();
                System.out.println("\n\tShortened Name.\n");
                Student.display();
                
                break;

                case '8':
                System.exit(0);
                
                default: 
                
                break;
            }
        }while (true);
    }
}