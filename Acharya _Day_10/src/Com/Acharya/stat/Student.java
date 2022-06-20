package Com.Acharya.stat;

class Student {
	int rollno;
	String name;
	static String college = "ITS";
	Student(int r, String n){
		 rollno = r;
		 name = n ;
	}
	void display() {
		System.out.println(rollno+" "+name +" " + college);
	}

	public static void main(String[] args) {
		Student s = new Student(11, " kv");
		s.display();
		
	}

}
