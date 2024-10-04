import java.util.Scanner;

public class Arreglos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[20];

        System.out.println("Ingrese 20 números enteros:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }

        System.out.println("\nNúmero\tCuadrado\tCubo");
        for (int numero : numeros) {
            System.out.println(numero + "\t" + (numero * numero) + "\t" + (numero * numero * numero));
        }
    }
}