import java.util.Scanner;

public class Ejercicio14 {
    public static int ackermann(int m, int n) {
        if (m == 0) {
            return n + 1;
        } else if (m > 0 && n == 0) {
            return ackermann(m - 1, 1);
        } else {
            return ackermann(m - 1, ackermann(m, n - 1));
        }
    }

    public static void ejecutar(Scanner sc) {
        System.out.print("Ingrese el valor de m (>= 0): ");
        int m = sc.nextInt();
        System.out.print("Ingrese el valor de n (>= 0): ");
        int n = sc.nextInt();

        if (m < 0 || n < 0) {
            System.out.println("Los valores m y n deben ser enteros mayores o iguales a 0.");
            return;
        }

        if (m > 3) {
            System.out.println("Advertencia: Para m >= 4 la función de Ackermann crece desmesuradamente y puede causar StackOverflow.");
        }

        int resultado = ackermann(m, n);
        System.out.println("Ackermann(" + m + ", " + n + ") = " + resultado);
    }
}
