package finalkeyword;

public final class Test2 {
	final void run() {
		System.out.println("running");
	}
class Plato extends Test2 {
	void run() {
		System.out.println("running safe");
	}
}

	public static void main(String[] args) {
		Test2 obj = new Test2();
		obj.run();
				

	}

}
// cannot change class