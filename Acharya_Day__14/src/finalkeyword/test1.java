package finalkeyword;

public class test1 {
	final void run() {
		System.out.println("running");
	}
class Nano extends test1{
	void run() {
		System.out.println("running safe");
	}
}

	public static void main(String[] args) {
	test1 obj = new test1();
	obj.run();
			
	

	}

}
// cannot change method