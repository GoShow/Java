import java.util.Scanner;

public class JoroFootballPlayer {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		String year = input.next();
		double p = input.nextDouble();
		double h = input.nextDouble();
		
		double result = h + (52 - h) * 2 / 3 + p * 0.5;

		if (year.equals("t")) {
			result += 3;
		}
		
		System.out.println((int)result);
	}
}
