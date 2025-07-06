package java_fundamentals;

public class Question30 {
	public static int[] evenOdd(int[] nums) {
	    int[] result = new int[nums.length];
	    int evenIndex = 0;
	    int oddIndex = nums.length - 1;
	    
	    for (int num : nums) {
	        if (num % 2 == 0) {
	            result[evenIndex++] = num;
	        } else {
	            result[oddIndex--] = num;
	        }
	    }

	    // Fix order of odd numbers
	    int start = evenIndex;
	    int end = nums.length - 1;
	    while (start < end) {
	        int temp = result[start];
	        result[start] = result[end];
	        result[end] = temp;
	        start++;
	        end--;
	    }
	    return result;
	}

}
