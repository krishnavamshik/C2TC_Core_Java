package Com.Acharya.stat;



	class Student3 {
		int rollno;
		String name;
	static	 String college;
	static {
		college = "VIT";
	}
		Student3(int r, String n){
			 rollno = r;
			 name = n ;
		}
	 static void show() {
			  college= "VIT";
		}
		void display() {
			System.out.println(rollno+" "+name +" " + college);
		}

		public static void main(String[] args) {
			Student3 s = new Student3 (1, " kv");
			s.show();
			s.display();
			
		}

	}

