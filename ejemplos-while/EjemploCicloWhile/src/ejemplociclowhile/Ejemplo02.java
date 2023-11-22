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
public class Ejemplo02 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);//Se declara escanner 
                                           // para obtener datos por teclado
        entrada.useLocale(Locale.US);//Se usa el metodo Locale.US para 
                                           //limitar el uso del punto exclusivamente 
                                           //para los decimales 
        int limite;
        int contador = 1;
        //
        System.out.println("Ingrese el límite");
        limite = entrada.nextInt();
        while (contador<=limite){
            if (contador%2!=0){
            System.out.printf("Contador %d\n", contador);
            }
              contador = contador + 1;
            
        }
        
    }
}
