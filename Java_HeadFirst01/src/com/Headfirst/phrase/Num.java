package com.Headfirst.phrase;

class A {
	 int rollno;
		String name;

		public int getRollno() {
			return rollno;
		}

		public void setRollno(int r) {
			this.rollno = r;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public class Num {
			public static void main(String[] args) {
				A obj = new A();
				obj.setRollno(2);
				obj.setName("ok");
				System.out.println(obj.getRollno());

			}
		}
	}

