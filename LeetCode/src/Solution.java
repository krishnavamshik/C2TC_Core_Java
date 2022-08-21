import java.util.Arrays;

public class Solution {
	public int searchInsert(int[] nums, int target) {
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==target) {
				System.out.println(i);
			}
			else {
				continue;
			}
		}
		return target;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		int[] nums = {1,3,5,6};
		s.searchInsert(nums, 2);
		
		

	}

}
