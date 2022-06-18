package access_modifiers_demo;


class Test2 {
	 int i = 10;
	void show() {
		System.out.println("Hello world");
	}

	public static void main(String[] args) {
		Test2 t1 = new Test2();
		t1.show();
		System.out.println(t1.i);
		
		

	}

}