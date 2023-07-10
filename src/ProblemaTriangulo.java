import java.util.Scanner;

public class ProblemaTriangulo {

	public static void main(String[] args) {

		double a1, a2, p1, p2, pt1, pt2, t1, t2, t3, t4, t5, t6;
				
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe os lados do triangulo X: ");
		
		t1 = sc.nextDouble();
		t2 = sc.nextDouble();
		t3 = sc.nextDouble();
		
		System.out.println("Informe os lados do triangulo Y: ");
		t4 = sc.nextDouble();
		t5 = sc.nextDouble();
		t6 = sc.nextDouble();
		
		p1 = (t1+t2+t3)/2;
		pt1 = p1*(p1-t1)*(p1-t2)*(p1-t3);
		a1 = Math.sqrt(pt1);
		
		
		p2 = (t4+t5+t6)/2;
		pt2 = p2*(p2-t4)*(p2-t5)*(p2-t6);
		a2 = Math.sqrt(pt2);
		
		if (a1 > a2) {
			System.out.printf("Triangle 1 area: %.2f\nTriangle 2 area: %.2f\nLarger area: X", a1, a2);
		}	else {
			System.out.printf("Triangle 1 area: %.2f\nTriangle 2 area: %.2f\nLarger area: Y", a1, a2);
		}
		
		sc.close();

	}

}
