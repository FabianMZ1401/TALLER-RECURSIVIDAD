import java.util.Scanner;

public class Ejercicio12 {
    public static int sumarMatriz(int[][] matriz, int i, int j) {
        if (i >= matriz.length) return 0;
        if (j >= matriz[i].length) return sumarMatriz(matriz, i + 1, 0);
        return matriz[i][j] + sumarMatriz(matriz, i, j + 1);
    }

    public static void ejecutar(Scanner sc) {
        System.out.print("Ingrese el número de filas (m): ");
        int m = sc.nextInt();
        System.out.print("Ingrese el número de columnas (n): ");
        int n = sc.nextInt();

        if (m <= 0 || n <= 0) {
            System.out.println("Las dimensiones de la matriz deben ser mayores a 0.");
            return;
        }

        int[][] matriz = new int[m][n];
        System.out.println("Ingrese los elementos de la matriz (" + m + "x" + n + "):");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nMatriz ingresada:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        int suma = sumarMatriz(matriz, 0, 0);
        System.out.println("\nLa suma de todos los elementos de la matriz es: " + suma);
    }
}
