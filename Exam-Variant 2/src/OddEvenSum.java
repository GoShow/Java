import java.util.Scanner;
public class OddEvenSum {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int oddSum = 0;
		int evenSum = 0;
		
		for (int i = 0; i < 2 * n; i++) {
			int number = input.nextInt();
			if (i % 2 == 0) {
				oddSum += number;
			}
			else {
				evenSum += number;
			}
		}
		int biggerSum = Math.max(oddSum, evenSum);
		int smallerSum = Math.min(oddSum, evenSum);
		
		if (biggerSum == smallerSum) {
			System.out.println("Yes, sum=" + biggerSum);
		}
		else {
			System.out.println("No, diff=" + (biggerSum - smallerSum));
		}
	}
}
