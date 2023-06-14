import java.util.Scanner;

public class Cuadrado {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int lado;
		//int area;
		
		
		Scanner scanner = new Scanner(System.in);

	      System.out.println("Ingrese el lado del cuadrado: ");
	      int lado = (int) scanner.nextInt();

	      int area = calcularAreaCuadrado(lado);

	      System.out.println("El área del cuadrado es: " + area);
	}

	private static int calcularAreaCuadrado(int lado) {
		// TODO Auto-generated method stub
		
		return lado*lado;
	
	
}}
