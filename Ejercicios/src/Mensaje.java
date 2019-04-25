import paquetedos.Operacion;

import java.util.Scanner;

public class Mensaje {

    public static void main(String[] args) {
        //Declaramos las variables a utilizar
        String mensaje1 = Operacion.mensaje;
        String mensaje2 = Operacion.mensaje2;

        //Creamos un obj. Scanner que pueda recibir la entrada de teclado
        Scanner entrada = new Scanner(System.in);

        //Se declara las variables a utilizar, calificacion y calificacion_2
        double calificacion, calificacion_2;

        //Se le pide al user que ingrese los datos
        System.out.println("Ingrese la calificacion 1:");
        calificacion = entrada.nextDouble();

        System.out.println("Ingrese la calificacion 2:");
        calificacion_2 = entrada.nextDouble();


        if(calificacion >= 85){
            System.out.printf("%s %f\n" , mensaje1, calificacion);
            //Este mesnaje se importa de otro paquete
        }

        if (calificacion_2 >= 85){
            System.out.printf("%s %f\n" , mensaje1, calificacion_2);
        }

    }
}
