package ejercicios_27;

import java.util.Scanner;

public class Calcular_IMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar peso y altura al usuario
        System.out.print("Ingrese su peso en kg: ");
        double peso = scanner.nextDouble();

        System.out.print("Ingrese su altura en metros: ");
        double altura = scanner.nextDouble();

        if (peso <= 0 || altura <= 0) {
            System.out.println("Peso y altura deben ser valores positivos.");
        } else {
            // Calcular IMC
            double imc = peso / (altura * altura);
            System.out.printf("Su IMC es: %.2f\n", imc);

            // Determinar categoría según el IMC
            String categoria;
            if (imc < 18.5) {
                categoria = "Bajo peso";
            } else if (imc < 24.9) {
                categoria = "Peso normal";
            } else if (imc < 29.9) {
                categoria = "Sobrepeso";
            } else {
                categoria = "Obesidad";
            }

            // Mostrar resultado
            System.out.println("Categoría de IMC: " + categoria);
        }

        scanner.close();
    }
}