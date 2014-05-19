import java.util.Scanner;
public class HalfSum {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int firstHalfResult = 0;
		int secondHalfResult = 0;
		
		for (int i = 0; i < n; i++) {		
		   
			int number = scanner.nextInt();
			firstHalfResult += number;
		}
		
		for (int i = 0; i < n; i++) {		   
			int number = scanner.nextInt();
			secondHalfResult += number;
		}
		
		int bigger = Math.max(firstHalfResult, secondHalfResult);
		int smaller = Math.min(firstHalfResult, secondHalfResult);

		if (bigger == smaller) {
			System.out.println("Yes, sum=" + bigger);
		}
		else {
			System.out.println("No, diff=" + (bigger - smaller));
		}
	}
}
