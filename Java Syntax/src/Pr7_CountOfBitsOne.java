import java.util.Scanner;
public class Pr7_CountOfBitsOne {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		System.out.println(Integer.bitCount(a));
	}

}
