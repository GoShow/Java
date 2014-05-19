import java.util.Scanner;
public class Volleyball {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		String year = input.nextLine();
		double p = input.nextDouble();
		double h = input.nextDouble();
		
		double totalPlays = h + (48 - h) * 3 / 4 + p * 2 / 3; 
		if (year.equals("leap")) {
			totalPlays += totalPlays * 15 / 100;
		}
		System.out.println((int)totalPlays);
		
		}
		
}
