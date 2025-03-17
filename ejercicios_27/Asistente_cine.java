package ejercicios_27;

import java.util.Scanner;

public class Asistente_cine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la edad del usuario
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        String recomendacion;

        // Determinar tipo de la película
        if (edad < 7) {
            recomendacion = "Películas animadas y educativas aptas para todas las edades.";
        } else if (edad <= 17) {
            recomendacion = "Películas familiares, animaciones, aventuras y comedias.";
        } else if (edad <= 30) {
            recomendacion = "Géneros variados: acción, drama, comedia y ciencia ficción.";
        } else {
            recomendacion = "Películas clásicas y dramas de interés para personas mayores.";
        }

        // Mostrar la recomendación
        System.out.println("Recomendación de película: " + recomendacion);

        scanner.close();
    }
}