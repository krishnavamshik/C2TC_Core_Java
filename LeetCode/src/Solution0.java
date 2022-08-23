import java.util.Arrays;

public class Solution0 {
	 public void sortColors(int[] nums) {
		 if(nums.length==0||nums.length==1)return;

			int start = 0;
			int end = nums.length-1;
			int index = 0;
			while (index <= end && start < end) {
				if (nums[index] == 0) {
					nums[start] = nums[index];
					nums[start] = 0;
					start++;
					index++;
				} else if (nums[index] == 2) {
					nums[index] = nums[end];
					nums[end] = 2;
					end--;
				} else {
					index++;
				}
			}
		 }

		public static void main(String[] args) {
		Solution0 s0 = new Solution0();
		int[] nums = {2,0,1,1,1,0};
		s0.sortColors(nums);
		
		
		
		
	}

}
