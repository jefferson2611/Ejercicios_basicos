
package ejercicios_27;

import java.util.Scanner;

public class sensorTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Definir los límites del rango de temperatrura.
        int temperatura_minina = 18;
        int temperatura_maxima = 25;

        // Solicitar al usuario que ingrese la temperatura
        System.out.print("Ingrese la temperatura actual en °C: ");
        int temperatura = scanner.nextInt();

        // Verificar si la temperatura está dentro del rango
        if (temperatura >= temperatura_minina && temperatura <= temperatura_maxima) {
            System.out.println("La temperatura es adecuada.");
        } else {
            System.out.println("La temperatura está fuera del rango deseado.");
        }

        scanner.close();
    }
}