package ejercicios_27;

import java.util.Scanner;

public class Registro_parqueadero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de vehículos a registrar: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine();
        
        String[] placas = new String[cantidad];
        String[] horas = new String[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese la placa del vehículo " + (i + 1) + ": ");
            placas[i] = scanner.nextLine();

            System.out.print("Ingrese la hora de ingreso (HH:MM): ");
            horas[i] = scanner.nextLine();
        }

        System.out.println("\nResumen de vehículos registrados:");
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Vehículo " + (i + 1) + " - Placa: " + placas[i] + ", Hora: " + horas[i]);
        }

        scanner.close();
    }
}