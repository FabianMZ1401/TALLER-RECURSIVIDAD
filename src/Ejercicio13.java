import java.util.Scanner;

public class Ejercicio13 {
    public static long fibonacci(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void imprimirSerieHasta(int pos, long limite) {
        long valor = fibonacci(pos);
        if (valor > limite) return;
        System.out.print(valor + " ");
        imprimirSerieHasta(pos + 1, limite);
    }

    public static void ejecutar(Scanner sc) {
        System.out.print("Ingrese el valor límite para la serie de Fibonacci: ");
        long limite = sc.nextLong();

        if (limite < 0) {
            System.out.println("El valor límite debe ser mayor o igual a 0.");
            return;
        }

        System.out.println("Serie de Fibonacci hasta el valor " + limite + ":");
        imprimirSerieHasta(0, limite);
        System.out.println();
    }
}
