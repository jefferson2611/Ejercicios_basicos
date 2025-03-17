
package ejercicios_27;

import java.util.Scanner;

public class Ascensor_1 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
        //Deinir cantidad de pisos
        int pisoMinimo = 1, pisoMaximo = 5;
        System.out.println("Ingrese el piso al que desea ir: ");
        int piso = scanner.nextInt();
        
        if (piso >=pisoMinimo && piso <=pisoMaximo) {
            System.out.println("Moviendoo ascensor al pis deseado "+ piso);
        } else {
            System.out.println("Error piso no existe.");
        }
        scanner.close();
    }

}
