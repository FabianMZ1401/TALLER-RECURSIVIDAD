import java.util.Scanner;

public class Ejercicio11 {
    public static int sumarVector(int[] vector, int indice) {
        if (indice == vector.length) return 0;
        return vector[indice] + sumarVector(vector, indice + 1);
    }

    public static void ejecutar(Scanner sc) {
        System.out.print("Ingrese el número de elementos del arreglo (n): ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("El tamaño del arreglo debe ser mayor a 0.");
            return;
        }

        int[] vector = new int[n];
        System.out.println("Ingrese los " + n + " elementos:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento [" + i + "]: ");
            vector[i] = sc.nextInt();
        }

        int suma = sumarVector(vector, 0);
        System.out.println("La suma de los elementos del vector es: " + suma);
    }
}
