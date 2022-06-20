class Hello{
	Hello(){
		System.out.println("hello a");
	}
	Hello(int x){
		this();
	}
}
class Main {

	public static void main(String[] args) {
		Hello a = new Hello(4);
	}

}
