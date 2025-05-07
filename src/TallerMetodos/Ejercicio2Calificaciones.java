package TallerMetodos;

public class Ejercicio2Calificaciones {

    public static double promedio(double c1, double c2, double c3){
        return (c1 + c2 + c3) / 3;


    }

    public static boolean aprobo(double promedio){
        return promedio >= 60;
    }

    public static void mostrarResultadosPromedio(double promedio, boolean aprobo){
        System.out.println("Su promedio Final es: " + promedio);
        if (aprobo){
            System.out.println("!Felicidades aprobo!");
        } else {
            System.out.println("No aprobo T_T");
        }
    }
}



