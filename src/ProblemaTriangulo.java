import java.util.Scanner;

import entities.Triangle;

public class ProblemaTriangulo {

	public static void main(String[] args) {

		double a1, a2, p;
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe os lados do triangulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Informe os lados do triangulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		p = (x.a+x.b+x.c)/2;
		a1 = Math.sqrt(p*(p-x.a)*(p-x.b)*(p-x.c));
		
		
		p = (y.a+y.b+y.c)/2;
		a2 = Math.sqrt(p*(p-y.a)*(p-y.b)*(p-y.c));
		
		if (a1 > a2) {
			System.out.printf("Triangle 1 area: %.2f\nTriangle 2 area: %.2f\nLarger area: X", a1, a2);
		}	else {
			System.out.printf("Triangle 1 area: %.2f\nTriangle 2 area: %.2f\nLarger area: Y", a1, a2);
		}
		
		sc.close();

	}

}
