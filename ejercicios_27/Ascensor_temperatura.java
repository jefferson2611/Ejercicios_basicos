package ejercicios_27;

import java.util.Scanner;

public class Ascensor_temperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definir los límites del rango aceptable de temperatura
        int temperatura_minina = 18;
        int temperatura_maxima= 25;

        // Solicitar al usuario que ingrese la temperatura actual
        System.out.print("Ingrese la temperatura actual en °C: ");
        int temperatura = scanner.nextInt();

        // Verificar si la temperatura está dentro del rango aceptable
        if (temperatura >= temperatura_minina && temperatura <= temperatura_maxima) {
            System.out.print("Ingrese el número del piso al que desea ir: ");
            int piso = scanner.nextInt();
            System.out.println("Moviendo el ascensor al piso " + piso + "...");
        } else {
            System.out.println("La temperatura no es adecuada. El ascensor no se moverá.");
        }

        scanner.close();
    }
}