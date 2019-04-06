import java.util. * ;
import java.lang. * ;
import java.io. * ;

class Solution {
	static double power(double d, int n) {
		double p = 1;
		for (int i = 0; i < n; i++)
		p = p * d;
		return p;
	}

	public static boolean hasFourDigit(int value) {
		String str = String.valueOf(value);

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '4') {
				return true;
			}
		}
		return false;
	}

	public static int[] foregoneSolution(int N) {
		int num1 = (int) Math.floor((double) N / 2);
		int num2 = (int) Math.ceil((double) N / 2);
		while (hasFourDigit(num1) || hasFourDigit(num2)) {

			String str1 = String.valueOf(num1);
			String str2 = String.valueOf(num2);
			for (int i = 0; i < str1.length(); i++) {
				if (str1.charAt(i) == '4') {
					int offset = (int) power(10, str1.length() - 1 - i);
					num1 += offset;
					num2 -= offset;
				}
			}
			for (int i = 0; i < str2.length(); i++) {
				if (str2.charAt(i) == '4') {
					int offset = (int) power(10, str2.length() - 1 - i);
					num1 += offset;
					num2 -= offset;
				}
			}
		}
		return new int[] {num1, num2};
	}
	public static void main(String[] args) {
		int lineNum = 0;
		Scanner input = new Scanner(System. in );

		while (input.hasNext()) {
			String line = input.nextLine();
			if (lineNum > 0) {
				System.out.print("Case #" + lineNum + ": ");
				int[] result = foregoneSolution(Integer.parseInt(line));
				System.out.println(result[0] + " " + result[1]);

			}
			lineNum++;
		}

	}
}
