package TallerMetodos;

import java.util.Scanner;

public class Ejercicio3Calculadora {

    //Operaciones
    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Error: No se puede dividir por cero. O_o");
            return Double.NaN; // Not a Number
        }
        return a / b;
    }

    public static double potencia(double base, double exponente) {
        return Math.pow(base, exponente); //Math.pow se usa para calcular potencias de números utilizando una base y un exponente
    }

    // ------MENU

    public static void mostrarMenu() {

        System.out.println("\n-=== Calculadora en Java ===-");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Potencia");
        System.out.println("6. Salir");
        System.out.print("Selecciona una opción: ");


    }
}
