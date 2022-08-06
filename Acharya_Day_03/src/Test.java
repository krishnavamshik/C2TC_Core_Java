class A{
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int i) {
		id = i;
	}
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name = n;
	}
	
}
public class Test {

	public static void main(String[] args) {
		A obj =new A();
		obj.setId(1);
		System.out.println(obj.getId());
		System.out.println(obj.getName());
		
	}

}
