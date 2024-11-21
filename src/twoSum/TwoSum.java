package twoSum;
import java.util.Arrays;

class Solution {

	public int[] twoSum(int[] nums, int target) {
		int[] numResult = new int[2];
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					numResult[0] = i;
					numResult[1] = j;
					return numResult;
				}
			}
		}
		return numResult;

	}
}

public class TwoSum {
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] numeros = { 3, 2, 3 };
		int resultado = 6;
		System.out.println(Arrays.toString(solution.twoSum(numeros, resultado)));

	}
}
