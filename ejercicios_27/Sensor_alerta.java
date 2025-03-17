package ejercicios_27;

import java.util.Scanner;

public class Sensor_alerta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definir el umbral de alerta
        int Umbral_alerta = 30;

        // Solicitar al usuario que ingrese la temperatura actual
        System.out.print("Ingrese la temperatura actual en °C: ");
        int temperatura = scanner.nextInt();

        // Verificar si la temperatura está por encima del umbral de alerta
        if (temperatura > Umbral_alerta) {
            System.out.println("¡Alerta! La temperatura está por encima del umbral.");
        } else {
            System.out.println("La temperatura es normal.");
        }

        scanner.close();
    }
}