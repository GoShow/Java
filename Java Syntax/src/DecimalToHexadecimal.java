import java.util.Scanner;

public class DecimalToHexadecimal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int decimalNum = input.nextInt();
		String hexNum = Integer.toHexString(decimalNum).toUpperCase();
		
		System.out.println(hexNum);
	}
}
