package ejercicios_27;

import java.util.Scanner;

public class Viaje_coche {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.print("Ingrese la distancia total del viaje (km): ");
            double distancia = scanner.nextDouble();
            System.out.print("Ingrese la velocidad  del coche (km/h): ");
            double velocidad = scanner.nextDouble();

            if (velocidad > 0) {
                double tiempo = distancia / velocidad;
                System.out.printf("El tiempo estimado de viaje es: %.2f horas%n", tiempo);
            } else {
                System.out.println("Error: La velocidad debe ser mayor a 0.");
            }

            System.out.print("¿Desea hacer otro viaje? (s/n): ");
            char respuesta = scanner.next().toLowerCase().charAt(0);
            if (respuesta != 's') {
                continuar = false;
            }
        }

        System.out.println("Fin del programa.");
        scanner.close();
    }
}