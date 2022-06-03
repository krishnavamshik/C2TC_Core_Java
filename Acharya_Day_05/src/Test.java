
public class Test {
	

	public static void main(String[] args) {
		 Test obj = new Test();
		 obj.sta();
		// TODO Auto-generated method stub

	}
	void sta() {
		String stra = "do";
		String  strb = method(stra);
		System.out.println(": "+stra+"  "+strb);
	}
	String method(String stra) {
		stra = stra + "  good";
		System.out.println(stra);
		return "good";
	}

}
