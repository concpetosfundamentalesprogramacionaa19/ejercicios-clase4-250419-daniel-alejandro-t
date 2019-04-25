import paquetedos.*;

import java.util.Scanner;


public class SeleccionAnidada {

    public static void main(String [] Args){
        //Declaramos el obj. Scanner para poder recinir la entrada del teclado
        Scanner entrada = new Scanner(System.in);

        //Declaramos variables a utilizar
        float calificacion;

        //Pedimos al user
        System.out.println("Ingrese la calificacion: ");

        //Ingresamos calificacion
        calificacion = entrada.nextFloat();

        //Evaluamos la calificacion
        if(calificacion >= 90){                                 //Excelente
            System.out.printf(Operacion2.msgExcelente + "%f", calificacion);
        }else if (calificacion < 90 && calificacion >=80){      //Muy buena
            System.out.printf(Operacion2.msgMuyBuena + "%f", calificacion);
        }else if (calificacion < 80 && calificacion >=50){      //Regular
            System.out.printf(Operacion2.msgBuena + "%f", calificacion);
        }else{                                                  //Reprobado
            System.out.printf(Operacion2.msgReprobado + "%f", calificacion);
        }
    }
}
