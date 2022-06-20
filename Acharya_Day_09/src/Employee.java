class Employee {
	int id;
	String name;
	float salary;
	Employee(int id, String name, float salary){
		this.id = id;
		this.name= name;
		this.salary= salary;
		
	}
	void display() {
		System.out.println(id+"  "+name +" "+ salary);
		
	}



	public static void main(String[] args) {
		Employee z1 = new Employee(1, "kk", 100.2f);
		z1.display();
		

	
	}
}
