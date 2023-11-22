/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplociclowhile;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
               // TODO code application logic here
        Scanner entrada = new Scanner(System.in);//Se declara escanner 
                                           // para obtener datos por teclado
        entrada.useLocale(Locale.US);//Se usa el metodo Locale.US para 
                                           //limitar el uso del punto exclusivamente 
                                           //para los decimales 
        int limite = 5;
        int contador = 1;
        int suma = 0;
        int valor_ingresado;
        //ingresamos un a un ciclo repetitivo y perdimos valores luego los sumamos
        //y los vamos guardando,utilisando un contador limitamos los ingresos 
        while (contador <= limite) { 
            System.out.println("Ingrese el valor a sumar");
            valor_ingresado = entrada.nextInt();
            suma = suma + valor_ingresado;
            System.out.printf("Valor ingresado %d\n", valor_ingresado);
            contador = contador + 1;
        }

        System.out.printf("La suma final es %d\n", suma);

    }
}
