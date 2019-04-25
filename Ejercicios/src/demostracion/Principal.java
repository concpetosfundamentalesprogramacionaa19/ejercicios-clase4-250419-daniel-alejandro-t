/*
Empresa de telefonía cobra a sus clientes una tarifa básica de $3 por mes por enviar mensajes de texto.

Existe tarifas adicionales que se describen a continuación:

• Si son 40 mensajes por mes, se incluyen en la tarifa básica.
• Si se pasa de 40 mensaje, se cobran cinco centavos adicionales por cada mensaje de texto después del número 40 hasta el mensaje número 200.
• Se cobran 10 centavos adicionales por cada mensaje de texto después del mensaje 200 .

Para calcular el valor final mensual a pagar, tomar en consideración que hay que considerar un adicional del iva de 12%.
 */

package demostracion;

import java.util.Scanner;

public class Principal {
   public static void main (String []args){
       //Creamos un obj. de Scanner para ingresar datos
       Scanner entrada = new Scanner(System.in);

       // Declaramos las constantes: tarifaBasica, precioSmsHasta200, precioSmsMayor200:
       final float tarifaBasica = 3f;
       final float precioSmsHasta200 = 0.05f;
       final float precioSmsMayor200 = 0.10f;

       //Declaramos las variables a utilizar: subtotal, valorFinal, iva, numMensajes;
        float subtotal, valorFinal, iva;
        int numMensajes;

       //A subtotal le agregamos el valor de la tarifa basica
       subtotal = tarifaBasica;

       //Pedimos al user el numero de mensajes enviados
       System.out.println("Ingres el numero de SMSs enviados: ");
       numMensajes = entrada.nextInt();


       //Evaluamos de menor a mayor
       if (numMensajes > 40){     //Si envio mas de 40 SMSs y hasta 200
           //Se cobrara los sms enviados desde el 41 multiplicando precioSmsHasta200*numSMSEnviados-40
            subtotal += precioSmsHasta200 * (numMensajes - 40);     //Cobra el exceso de SMSs desde 40 (la tarifa basica)

       }else if (numMensajes >200){                     //Si envio mas de 200 SMSs
           //Se cobrara los sms enviados desde el 200 multiplicando precioSmsHasta200*numSMSEnviados-200
            subtotal = precioSmsMayor200 * (numMensajes - 200);     //Cobra el exceso de SMS desde 200
       }

       //Calulamos el IVA a partir del subtotal
        iva = subtotal /100 * 12;

       //Valor final seria igual a subtotal + iva
       valorFinal = subtotal + iva;

       //Devolvemos el valor a pagar
       System.out.println("El valor a pagar es de " + valorFinal + "por haber enviado " + numMensajes + " SMSs.");
   }

}
