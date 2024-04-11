// Ejercicio 9

// Ingresar valores por teclado y acumularlos en una variable, detener el proceso
// cuando la suma supere los 78500, imprimir el resultado en cada suma.

package ejercicio9.codigo;
import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        
        int valorMaximo = 78500, sumaTotal = 0, valorUsuario = 0, contadorSumasParciales = 0;
        Scanner userInput = new Scanner(System.in);

        //  mientras que sumaTotal sea menor o igual a valorMaximo continuaré solicitando valores al usuario.

        while (sumaTotal <= valorMaximo) {
            
            // Proceso petición por pantalla valor al usuario.

            System.out.print("Introduzca Valor a Sumar: ");

            valorUsuario = userInput.nextInt();

            // se suma valorUsuario a sumaTotal e incrementamos contadorSumasParciales en 1

            sumaTotal += valorUsuario;
            contadorSumasParciales++;

            // se muestra por pantalla sumaTotal

            System.out.println("El valor de su suma Parcial " + contadorSumasParciales + " es: " + sumaTotal);

        }

        //  mostramos información de aviso por haber sobrepasado el valor máximo de 78500
        
        System.out.print("\u001B[41m" + "Has sobrepasado el valor Maximo: " + sumaTotal + " es mayor que : " + valorMaximo + "\u001B[0m");
    }
}
