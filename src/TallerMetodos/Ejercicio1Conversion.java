package TallerMetodos;

public class Ejercicio1Conversion {

    public static double metrosaACentimetros(double metros){
        return metros * 100;
    }

    public static double kilogramosALibras(double kilogramos){
        return kilogramos * 2.20462;
    }

   public static double  celsiusAFahrenheit(double celsius){
      return (celsius * 9 / 5) + 32;
    }



    public static void mostrarResultados(double centimetros, double libras, double fahrenheit) {

        System.out.println("=== Resultados de Conversión ===");
        System.out.println("• El resultado de metros a Centimetros es: " + centimetros);
        System.out.println("• El resultado de Kilogramos a Libras es: " + libras);
        System.out.println("• El resultado de Celsius a  Fahrenheit es: " + fahrenheit);

    }

}
