package shape;

import java.util.Scanner;

public class GraphicsProgram {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int noShape = scan.nextInt();
		Shape[] shapes = new Shape[noShape];
		for (int i = 0; i < noShape; i++) {
			String s = scan.next();
			if (s.equals("Rectangle")) {
				double x, y, width, height;
				x = scan.nextDouble();
				y = scan.nextDouble();
				width = scan.nextDouble();
				height = scan.nextDouble();
				shapes[i] = new Rectangle(x, y, width, height);
			} else if (s.equals("Circle")) {
				double x, y, radius;
				x = scan.nextDouble();
				y = scan.nextDouble();
				radius = scan.nextDouble();
				shapes[i] = new Circle(x, y, radius);
			}
		}
		// 그 다음엔 면적을 계산한다.
		double sumArea = 0;
		for (Shape shape : shapes) {		//for ( A : B ) B에서 차례대로 객체를 꺼내서 A에 넣겠다.
			sumArea += shape.getArea();
		}
		System.out.printf("%.2f", sumArea);
	}
}
/*
input
2
Rectangle 3 5 10 20
Circle 3 4 10

output
514.00
*/