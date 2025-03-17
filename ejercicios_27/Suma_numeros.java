package ejercicios_27;

import java.util.Scanner;

public class Suma_numeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números a sumar: ");
        int cantidad = scanner.nextInt();
        double suma = 0;

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese un número válido: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Entrada no válida. Ingrese un número:");
                scanner.next();
            }
            suma += scanner.nextDouble();
        }

        System.out.println("La suma total es: " + suma);
        scanner.close();
    }
}