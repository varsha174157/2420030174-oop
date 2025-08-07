package skill03;
import java.util.*;
public class usernameformatter {
	public class user_Name_Formatter {

		public static void main(String[] args) {
			// TODO Auto-generated method stub\
			System.out.println("Enter :");
			Scanner sc =new Scanner(System.in);
	        String name = sc.next();
	        name.trim();
	        name.toLowerCase();
	        name.replace("a", "@");
	        System.out.println("Formatted Name: " + name);

		}
}
