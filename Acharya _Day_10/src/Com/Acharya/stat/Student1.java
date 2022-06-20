package Com.Acharya.stat;
class Student1 {
	int rollno;
	String name;
static	 String college = "ITS";
	Student1(int r, String n){
		 rollno = r;
		 name = n ;
	}
 static void show() {
		 college = "AIT";
	}
	void display() {
		System.out.println(rollno+" "+name +" " + college);
	}

	public static void main(String[] args) {
		Student1 s = new Student1 (1, " kv");
		s.show();
		s.display();
		
	}

}