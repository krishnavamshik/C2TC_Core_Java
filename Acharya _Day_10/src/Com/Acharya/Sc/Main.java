package Com.Acharya.Sc;
import java.util.Scanner;
public class Main {
	

	public static void main(String[] args) {
		
	
		Scanner s = new Scanner(System.in);
		System.out.println("name:");
		String name = s.nextLine();
		int usn = s.nextInt();
		char gender = s.next().charAt(0);
		long mobile = s.nextLong();
		double sgpa = s.nextDouble();
		System.out.println("name:"+ name);
		System.out.println("usn:"+ usn);
		System.out.println("gender:"+ gender);
		System.out.println(" mobile:"+ mobile);
		System.out.println("sgpa:"+ sgpa);
		
		
	}
}	