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
//        System.out.println("Ingrese la primera calificación");
//        double nota1 = scanner.nextDouble();
//
//        System.out.println("Ingrese la segunda calificación");
//        double nota2 = scanner.nextDouble();
//
//        System.out.println("Ingrese la tercera calificación");
//        double nota3 = scanner.nextDouble();
//
//        // Operación
//        double promedio = Ejercicio2Calificaciones.promedio(nota1, nota2, nota3);
//        boolean estaAprobado = Ejercicio2Calificaciones.aprobo(promedio);
//
//        // Mostrar resultado
//
//        Ejercicio2Calificaciones.mostrarResultadosPromedio(promedio, estaAprobado);
//
//        scanner.close();

        //Ejercicio 2-------------------------------->

        int opcion;
        double num1, num2;

        do {
            Ejercicio3Calculadora.mostrarMenu();

            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 5) { //Para poder solicitar los datos cuando indiquen la operación
                // Solicitar números
                System.out.print("Ingrese el primer número: ");
                num1 = scanner.nextDouble();

                System.out.print("Ingrese el segundo número: ");
                num2 = scanner.nextDouble();

                // Realizar operación según la opción elegida
                switch (opcion) {
                    case 1:
                        System.out.println("Resultado: " + Ejercicio3Calculadora.sumar(num1, num2));
                        break;
                    case 2:
                        System.out.println("Resultado: " + Ejercicio3Calculadora.restar(num1, num2));
                        break;
                    case 3:
                        System.out.println("Resultado: " + Ejercicio3Calculadora.multiplicar(num1, num2));
                        break;
                    case 4:
                        System.out.println("Resultado: " + Ejercicio3Calculadora.dividir(num1, num2));
                        break;
                    case 5:
                        System.out.println("Resultado: " + Ejercicio3Calculadora.potencia(num1, num2));
                        break;

                }
            } else if (opcion == 6) {
                System.out.println("Saliendo de la calculadora... n_n/");
            } else {
                System.out.println("Opción inválida, intente nuevamente.");
            }
        } while (opcion != 6);

        scanner.close();
    }
}