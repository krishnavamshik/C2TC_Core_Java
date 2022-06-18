package access_modifier_demo;

public class Test1 {
private int i =10;
private	void show() {
		System.out.println("Hello world");
	}
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		t1.show();
		System.out.println(t1.i);

	}

}
