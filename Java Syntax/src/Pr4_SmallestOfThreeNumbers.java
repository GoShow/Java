import java.util.Scanner;
public class Pr4_SmallestOfThreeNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double firstNum = input.nextDouble();
		double secondNum = input.nextDouble();
		double thirdNum = input.nextDouble();
		
		double smallestNum = Math.min(Math.min(firstNum, secondNum), thirdNum);
		
		System.out.println((int)smallestNum);
	}

}
