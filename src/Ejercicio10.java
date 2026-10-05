import java.util.Scanner;

public class Ejercicio10 {
    public static int multiplicar(int a, int b) {
        if (b == 0) return 0;
        return a + multiplicar(a, b - 1);
    }

    public static void ejecutar(Scanner sc) {
        System.out.print("Ingrese el primer número: ");
        int a = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int b = sc.nextInt();

        int signo = ((a < 0) ^ (b < 0)) ? -1 : 1;
        int resultado = multiplicar(Math.abs(a), Math.abs(b)) * signo;
        System.out.println("El resultado de " + a + " * " + b + " mediante sumas sucesivas es: " + resultado);
    }
}
