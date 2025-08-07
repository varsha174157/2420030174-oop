package Skill01;
import java.util.Scanner;
public class studentdashboard {
public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Roll Number :");
		long roll_number = sc.nextLong();
		sc.nextLine();
		
		System.out.print("Name :");
		String Name = sc.nextLine();
		
		System.out.print("Marks :");
		float marks = sc.nextFloat();
		
		System.out.print("Gender :");
		char gender = sc.next().charAt(0);
		
		System.out.print("Has the student passed the test?");
		boolean result = sc.nextBoolean();
		
		System.out.println("Student's Roll Number :"+roll_number);
		System.out.println("Student's Name :"+Name);
		System.out.println("Student's Marks :"+marks);
		System.out.println("Student's Gender :"+gender);
		System.out.println("Student's Result :"+result);
		
		
		
		
		
		
		
				
		
		
		
		
	}
}
