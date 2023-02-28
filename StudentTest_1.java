import java.util.Scanner;

class SeatsFilledException extends Exception {
	SeatsFilledException (String errorMessage) {
		super(errorMessage);
	}
	public SeatsFilledException () {
		System.err.println("All seats have been filled!!\n");
	}
}

class Student {
	
	String name;
	int yearJoined;
	int regNo;

	static int seatNo = 1;

	public Student () {
		name = "";
		yearJoined = 0;
		regNo = 0;
	}
	
	public void input () throws SeatsFilledException {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name: \n");
		name = sc.nextLine();
		System.out.print("Enter year of joining: \n");
		yearJoined = sc.nextInt();
		if (seatNo > 25)
			throw new SeatsFilledException();
		else
			regNo = (yearJoined % 100) * 100 + seatNo;
		seatNo++;
	}

	public void display () {
		System.out.println("Name : " + name);
		System.out.println("Year of Joining : " + yearJoined);
		System.out.println("Registration Number : " + regNo);
	}
	
}

public class StudentTest {
	
	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		Student studs[] = new Student[30];
		
		for (int i = 0; i < 30; ++i) {
			System.out.println("Enter details of student " + (i+1) + ": ");
			studs[i] = new Student();
			try {
				studs[i].input();
			}
			catch (SeatsFilledException e) {
				System.err.println("Error: " + e);
				studs[i] = null;
				break;
			}
			System.out.print("Continue (y/n):\n");
			char ch = sc.next().charAt(0);
			if (ch != 'y')
				break;
		}
		
		for (Student stud: studs)
			if (stud != null)
				stud.display();
		
	}
}