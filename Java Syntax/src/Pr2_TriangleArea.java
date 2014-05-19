import java.util.Scanner;
public class Pr2_TriangleArea {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double ax = input.nextDouble();
		double ay = input.nextDouble();
		double bx = input.nextDouble();
		double by = input.nextDouble();
		double cx = input.nextDouble();
		double cy = input.nextDouble();
		double area = (ax * (by - cy ) + bx * (cy - ay) + cx * (ay - by)) / 2;
		
		System.out.println((int)Math.abs(area));
	}

}
