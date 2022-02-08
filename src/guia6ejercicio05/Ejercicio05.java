package guia6ejercicio05;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] args) {
        /*
5. Escribir un programa en Java que juegue con el usuario a adivinar un número. La
computadora debe generar un número aleatorio entre 1 y 500, y el usuario tiene que
intentar adivinarlo. Para ello, cada vez que el usuario introduce un valor, la computadora
debe decirle al usuario si el número que tiene que adivinar es mayor o menor que el que
ha introducido el usuario. Cuando consiga adivinarlo, debe indicárselo e imprimir en
pantalla el número de veces que el usuario ha intentado adivinar el número. Si el usuario
introduce algo que no es un número, se debe controlar esa excepción e indicarlo por
pantalla. En este último caso también se debe contar el carácter fallido como un intento.
         */
        Random aleatorio = new Random();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int num, contador = 0, aux2 = 0;
        String aux;
        boolean conf;
        do {
            num = aleatorio.nextInt(501);
        } while (num == 0);
        System.out.println("Adivine el número entre 1 y 500");
        do {
            System.out.println("Ingrese un número: ");
            aux = leer.next();
            try {
                aux2 = Integer.parseInt(aux);
                conf = true;
            } catch (NumberFormatException b) {
                System.out.println("La cadena no puede convertirse a entero");
                contador++;
                conf = false;
            }
            if (conf == true) {
                if (aux2 > num) {
                    System.out.println("Incorrecto, el número es menor. ");
                    contador++;
                } else if (aux2 < num) {
                    System.out.println("Incorrecto, el número es mayor. ");
                    contador++;
                } else {
                    System.out.println("Correcto! adivino el número! Usted tuvo " + contador + " errores.");
                }
            }
        } while (num != aux2);

    }

}
