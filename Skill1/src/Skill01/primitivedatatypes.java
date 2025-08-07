package Skill01;
import java.util.Scanner;
public class primitivedatatypes {
public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);

		
		 byte age;
	        System.out.println("Enter your Age : ");
			age = sc.nextByte();
			
			short year;
	        System.out.println("Enter Year : ");
			year = sc.nextShort();
			
			
			int population;
	        System.out.println("Enter Population : ");
			population = sc.nextInt();
			
			long distance;
	        System.out.println("Enter Distance from Earth to the Moon : ");
			distance = sc.nextLong();
			
			float val_pi;
	        System.out.println("Enter the value of PI : ");
			val_pi = sc.nextFloat();
			
			char grade;
	        System.out.println("Enter your Grade : ");
			grade = sc.next().charAt(0);
			
			boolean fun;
	        System.out.println("Enter True if Java is fun to learn : ");
			fun = sc.nextBoolean();
			
			System.out.println("Your Age is : "+age);
			System.out.println("Year : "+year);
			System.out.println("Population : "+population);
			System.out.println("The distance from Earth to Moon is : "+distance);
			System.out.println("The value of PI is : "+val_pi);
			System.out.println("Your grade is : "+grade);
			System.out.println("Java is : "+fun);
			
			
			
			
			
			
			
			
	}
}
