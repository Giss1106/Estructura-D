/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evaluacion1;
import java.util.Scanner;
public class Evaluacion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int num2 = scanner.nextInt();

        int diferencia = restarUsandoSumaNegativa(num1, num2);

        System.out.println("La diferencia es: " + diferencia);
    }

    // Método para restar dos números sin utilizar la operación de resta
    public static int restarUsandoSumaNegativa(int num1, int num2) {
        return num1 + (-num2);
    }
}
    

