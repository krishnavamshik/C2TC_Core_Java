import java.util.Scanner;

public class Solution1 {
	int p;
	int n;

	public void power(int p, int n) {
		while (n != 0) {
			p *= p;
			n--;
			System.out.println(p);
			break;
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Solution1 s1 = new Solution1();
		System.out.println("enter");
		s1.power(sc.nextInt(), sc.nextInt());
	}

}
