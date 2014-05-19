import java.util.Scanner;
public class Pr8_CountOfEqualBitPairs {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		String binNumber = Integer.toBinaryString(number);
		int counter = 0;
		for (int i = 0; i < binNumber.length() - 1; i++) {
			
			if (binNumber.charAt(i) == binNumber.charAt(i + 1)) {
				counter++;
			}
		}
		System.out.println(counter);
	}

}
