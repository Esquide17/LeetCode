package palindrome;

class Solution {
	public boolean isPalindrome(int x) {
		String number = Integer.toString(x);
		String numberReverse = new StringBuilder(number).reverse().toString();

		if (number.equals(numberReverse)) {
			return true;
		}
		return false;

	}
}

public class Palindrome {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int numero = 1000021;
		System.out.println(solution.isPalindrome(numero));

	}

}
