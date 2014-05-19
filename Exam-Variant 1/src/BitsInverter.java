import java.util.Scanner;
public class BitsInverter {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int step = input.nextInt();
		String wholeBinNum = "";
		
		for (int i = 0; i < n; i++) {
			int number = input.nextInt();
			String currentBinNum ="";

			for (int pos = 0; pos < 8; pos++) {
				int lastBit = (number &(1 << pos)) >> pos;
				currentBinNum = lastBit + currentBinNum;
			}
			wholeBinNum += currentBinNum;
		}
		char[] digits = wholeBinNum.toCharArray();
		
		for (int i = 0; i < digits.length; i++) {
			for (int j = 0; j < digits.length; j++) {
				int index = 1 + j * step;
				if (index > digits.length) {
					break;
				}
				
				if(index - 1 == i) {
					if (digits[i] == '1') {
						digits[i] = '0';
					}
					else {
						digits[i] = '1';
					}
				}
			}
		}
		
		String result = "";
		for (int i = 1; i <= digits.length; i++) {
			result += digits[i - 1];
			if (i % 8 == 0) {
				System.out.println(Integer.parseInt(result, 2));
				result = "";
			}
		}
	}
}
