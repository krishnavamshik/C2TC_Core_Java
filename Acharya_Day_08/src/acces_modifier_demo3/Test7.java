package acces_modifier_demo3;

public class Test7 {
	public int i= 10;
	public void show(){
		System.out.println("Hola");
	}

	public static void main(String[] args) {
		Test7 t3 = new Test7();
		t3.show();
		System.out.println(t3.i);
	}

}
