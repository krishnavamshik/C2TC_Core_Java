package acces_modifier_demo1;

public class Test4 {
	protected int i = 10;
	protected void show() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		Test4 t1 = new Test4();
		t1.show();
		System.out.println(t1.i); 

	}

}
