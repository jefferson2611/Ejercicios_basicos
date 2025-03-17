package ejercicios_27;

import java.util.Scanner;

public class sensor_temperatura1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temperatura;

        do {
            System.out.print("Ingrese la temperatura actual (°C): ");
            temperatura = scanner.nextDouble();

            if (temperatura < 18 || temperatura > 25) {
                System.out.println("Alerta la temperatura fuera del rango aceptable (18°C - 25°C). Inténtelo nuevamente.");
            }

        } while (temperatura < 18 || temperatura > 25);

        System.out.println("Temperatura dentro del rango aceptable.");
        scanner.close();
    }
}