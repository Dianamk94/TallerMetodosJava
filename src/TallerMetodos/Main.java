package TallerMetodos;


import static TallerMetodos.Ejercicio1Conversion.metrosaACentimetros;
import static TallerMetodos.Ejercicio1Conversion.mostrarResultados;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       //Ejercicio 1-------------------------------->

       // Ingresar datos
//        System.out.println("Ingrese los metros: ");
//        double metros = scanner.nextDouble();
//
//        System.out.println("Ingrese los Kilogramos: ");
//        double kilogramos = scanner.nextDouble();
//
//        System.out.println("Ingrese los Celcius: ");
//        double celcius = scanner.nextDouble();
//
//
//
//        // Relizar conversión
//       double centimetros = Ejercicio1Conversion.metrosaACentimetros(metros);
//       double libras = Ejercicio1Conversion.kilogramosALibras(kilogramos);
//       double fahrenheit = Ejercicio1Conversion.celsiusAFahrenheit(celcius);
//
//       //Resultado
//        Ejercicio1Conversion.mostrarResultados(centimetros, libras, fahrenheit);
//
//        scanner.close();




        //Ejercicio 2-------------------------------->

        // Ingresar Calificaciones
        System.out.println("Ingrese la primera calificación");
        double nota1 = scanner.nextDouble();

        System.out.println("Ingrese la segunda calificación");
        double nota2 = scanner.nextDouble();

        System.out.println("Ingrese la tercera calificación");
        double nota3 = scanner.nextDouble();

        // Operación
        double promedio = Ejercicio2Calificaciones.promedio(nota1, nota2, nota3);
        boolean estaAprobado = Ejercicio2Calificaciones.aprobo(promedio);

        // Mostrar resultado

        Ejercicio2Calificaciones.mostrarResultadosPromedio(promedio, estaAprobado);

        scanner.close();




    }
}