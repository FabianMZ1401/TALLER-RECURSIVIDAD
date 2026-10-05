import java.util.Scanner;

public class Ejercicio04 {
    public static int sumarDigitos(int n) {
        if (n == 0) return 0;
        return (n % 10) + sumarDigitos(n / 10);
    }

    public static void ejecutar(Scanner sc) {
        System.out.print("Ingrese un número entero: ");
        int n = sc.nextInt();
        System.out.println("La suma de sus dígitos es: " + sumarDigitos(Math.abs(n)));
    }
}