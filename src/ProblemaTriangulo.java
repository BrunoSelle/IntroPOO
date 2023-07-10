import java.util.Scanner;

import entities.Triangle;

public class ProblemaTriangulo {

	public static void main(String[] args) {

		double a1, a2;
		
		Triangle x, y;
// Instanciando o Triangulo
		x = new Triangle();
		y = new Triangle();
		Scanner sc = new Scanner(System.in);

// Lendo as variáveis do triangulo
		System.out.println("Informe os lados do triangulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Informe os lados do triangulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

// Chamando o método de calcular a área (da classe Triangulo)
		a1 = x.area();
		a2 = y.area();
 		
		if (a1 > a2) {
			System.out.printf("Triangle 1 area: %.2f\nTriangle 2 area: %.2f\nLarger area: X", a1, a2);
		}	else {
			System.out.printf("Triangle 1 area: %.2f\nTriangle 2 area: %.2f\nLarger area: Y", a1, a2);
		}
		
		sc.close();

	}

}
