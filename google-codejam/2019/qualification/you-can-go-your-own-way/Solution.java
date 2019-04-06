import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
	public static String findOwnWay(int N, String path) {
		String ownPath = "";
		for (char c: path.toCharArray()) {
			if (c == 'S') {
				ownPath += 'E';
			} else if (c == 'E') {
				ownPath += 'S';
			}
		}
		return ownPath;
	}
	public static void main(String[] args) {
		int lineNum = 0;
		Scanner input = new Scanner(System. in );
		int N = -1;
		while (input.hasNext()) {
			String line = input.nextLine();
			if ((lineNum & 1) == 1) {
				N = Integer.parseInt(line);
			} else if (lineNum > 0) {
				System.out.print("Case #" + (lineNum >> 1) + ": ");
				System.out.println(findOwnWay(N, line.replaceAll("\\s", "")));
			}
			lineNum++;
		}
	}
}
