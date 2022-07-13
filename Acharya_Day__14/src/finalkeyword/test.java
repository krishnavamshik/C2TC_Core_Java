package finalkeyword;
public class test {
	final int  speed=10;
	void drive()
	{
		speed=20;
	}
		
	public static void main(String[] args) {
		test obj = new test();
		obj.drive();
		System.out.println(speed);
	
	}

}
//stop value change in variable