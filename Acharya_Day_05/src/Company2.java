
public class Company2 {
	String name;
 
	public static void main(String[] args) {
		Company2 c1 = new Company2();
		c1.name = "C2TC";
		Company2 c2 = c1;
		System.out.println(c1.name);
		c2.name = "NULL";
		System.out.println(c2.name);
		
		// TODO Auto-generated method stub

	}

}
