
public class Kata {
	static int ms=1000;
	  public static int Past(int h, int m ,int s)
	  {
	    int x= ((s*ms)+(m*s*60*ms)+(h*s*m*60*ms));
	    System.out.println(x);
		return x;
	}

	public static void main(String[] args) {
		Kata obj = new Kata();
		obj.Past(0,1,1);
		
		
	}

}
