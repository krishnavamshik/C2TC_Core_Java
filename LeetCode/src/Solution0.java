import java.util.Arrays;

public class Solution0 {
	 public void sortColors(int[] nums) {
		 int len = nums.length;
	        int zero=0,one=0,two=0;
	        for(int i=0;i<len;i++){
	            if(nums[i] == 0){
	                zero++;
	            }else if(nums[i]==1){
	                one++;
	            }else{
	                two++;
	            }
	        }
	        for(int i=0;i<zero;i++){
	            nums[i] = 0;
	        }
	        for(int i=zero;i<zero+one;i++){
	            nums[i] = 1;
	        }
	        for(int i=zero+one;i<len;i++){
	            nums[i] = 2;
	            System.out.println(nums[i]);
	        }
	       
	    }

	public static void main(String[] args) {
		Solution0 s0 = new Solution0();
		int[] nums = {2,0,1,1,1,0};
		s0.sortColors(nums);
		
		
		
	}

}
