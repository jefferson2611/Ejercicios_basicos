package ejercicios_27;

import java.util.Scanner;

public class Cajero_automatico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         // Saldo inicial.
        double saldo = 500000;

        while (true) {
            System.out.println("Saldo disponible: $" + saldo);
            System.out.print("Ingrese el monto a retirar (o 0 para salir): ");
            double retiro = scanner.nextDouble();

            if (retiro == 0) {
                break;
            } else if (retiro > saldo) {
                System.out.println("Error: Fondos insuficientes.");
            } else {
                saldo -= retiro;
                System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo);
            }
        }

        System.out.println("Gracias por usar nuestro cajero.");
        scanner.close();
    }
}