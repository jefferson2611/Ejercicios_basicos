package ejercicios_27;

import java.util.Scanner;

public class Cuenta_regresiva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número entero positivo: ");
        int numero = scanner.nextInt();

        while (numero >= 0) {
            System.out.println(numero);
            numero--;
        }

        System.out.println("¡Tiempo cumplido!");
        scanner.close();
    }
}