package ejercicios_27;

import java.util.Scanner;

import java.util.Random;

public class Adivinanza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
         // Número entre 1 y 100
        int numeroSecreto = random.nextInt(100) + 1;
        int intento;
        
        System.out.println("******Bienvenido al juego de adivinanza*****");
        System.out.println("Adivina el número entre 1 y 100:");

        while (true) {
            System.out.print("Ingresa tu número: ");
            intento = scanner.nextInt();

            if (intento == numeroSecreto) {
                System.out.println("¡Felicidades! Has adivinado el número.");
                break;
            } else if (intento < numeroSecreto) {
                System.out.println("El número es mayor.");
            } else {
                System.out.println("El número es menor.");
            }
        }

        scanner.close();
    }
}
