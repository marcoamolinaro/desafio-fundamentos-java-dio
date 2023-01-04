import java.util.Scanner;

public class Problem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, prod;
		
		System.out.println("Entre com o valor de a: ");
		a = sc.nextInt();
		System.out.println(a);
		
		System.out.println("Entre com o valor de b: ");
		b = sc.nextInt();
		System.out.println(b);

		prod = a * b;

		System.out.println("PROD = " + prod);
	}
}