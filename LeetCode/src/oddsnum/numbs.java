package oddsnum;
class Solution {
	public static int countOds(int low, int high) {
		int count =0;
		for (int i = low; i <= high; i++) 
			if (i % 2 != 0) count++;
		return count;
	}
public class numbs {

}
}
