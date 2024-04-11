// Ejercicio 10

// Ingresar 10 valores por teclado y determinar cuántas veces el valor ingresado
// es:
// a) Mayor a 0 y menor a 10
// b) Está comprendido entre 10 y 100 ambos inclusive.
// c) Es mayor a 100
// d) Es negativo
// e) Es igual a 0
// Imprimir los resultados.

package ejercicio10.codigo;
import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        
        int contadorValores = 0, valorUsuario = 0;
        int[] contadorCondiciones = new int[5];
        Scanner userInput = new Scanner(System.in);
        while (contadorValores < 5) {
            
            System.out.println("Introduzca Número Entero " + (contadorValores+1) + ": ");

            valorUsuario = userInput.nextInt();

            // se incrementa el contador correspondiente a la condición que se cumpla según valor de valorUsuario

            if (valorUsuario < 0) contadorCondiciones[0]++;
            else if (valorUsuario == 0) contadorCondiciones[1]++;
            else if (valorUsuario > 0 && valorUsuario < 10) contadorCondiciones[2]++;
            else if (valorUsuario >= 10 && valorUsuario <= 100) contadorCondiciones[3]++;
            else contadorCondiciones[4]++;
            contadorValores++;
        }

        /* iteramos sobre array de integers contadorCondiciones para mostrar por pantalla el valor 
        * actual de cada contador según condición cumplida con formato de color adicional
        */

        for (int i = 0; i < contadorCondiciones.length; i++) {
            
            switch (i) {

                case 0 -> System.out.println("\u001B[41m" + "Números Negativos: " + contadorCondiciones[i] + " \u001B[0m");
                case 1 -> System.out.println("\u001B[42m" + "Números Igual a 0: " + contadorCondiciones[i] + " \u001B[0m");
                case 2 -> System.out.println("\u001B[45m" + "Números Mayores a 0 y Menores a 10: " + contadorCondiciones[i] + " \u001B[0m");
                case 3 -> System.out.println("\u001B[44m" + "Números Entre 10 y 100 ambos inclusive: " + contadorCondiciones[i] + " \u001B[0m");
                case 4 -> System.out.println("\u001B[46m" + "Números Mayores a 100: " + contadorCondiciones[i] + " \u001B[0m");
            }
        }
    }
}
