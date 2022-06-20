
class Student {
	int rollno;
	String name;
	float fee;
	Student(int rollno, String name, float fee){
		this.rollno = rollno;
		this.name= name;
		this.fee =fee;
		
	}
	void show() {
		System.out.println(rollno + " "+name+" "+fee);
	}
	

	public static void main(String[] args) {
		Student s1 = new Student(1,"jk",100.2f);
		s1.show();

	}

}
