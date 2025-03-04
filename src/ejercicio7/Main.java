package ejercicio7;
import java.util.Scanner;
// CLASE MAIN
/* pues aqui ejecutaremos el juego de la ruleta rusa.
   Se importa el util Scanner para poder pedir al usuario que introduzca el numero de jugadores que quiere.
   He puesto pequeño control de excepciones para que el usuario no pueda introducir datos incorrectos y se cierre el programa de manera inesperada.
 */

public class Main {
    public static void main(String[] args) {
        int numJugadores = 0;

        Scanner sc = new Scanner(System.in);

       while(numJugadores < 1 || numJugadores > 6) { // bucle para que el solicitar constantemente el numero de jugadores si el rango no es correcto
           // control de excepciones
           try { // con el bloque try intentaremos coger el numero de jugadores que introduzca el usuario
               System.out.println("Ingrese el número de jugadores (1-6): ");
               numJugadores = sc.nextInt();
           } catch (Exception e) { // con el bloque catch (Exception e) capturamos si hay una excepcion, en este caso podriamos esperar un MissmatchException
               System.out.println("Ingrese un número válido"); // imprimimos mensaje si hay excepcion
                sc.next(); // limpiamos el buffer del scanner
           }
       }

        /* creamos un objeto de la clase JuegoRuleta que recibira el numero de jugadores que ha introducido el usuario como parametro.
           cerramos el scanner (Perdon a veces me acuerdo a veces no xD)
           desde el objeto juego llamamos al metodo jugar() para que empiece la partida. */
        JuegoRuleta juego = new JuegoRuleta(numJugadores);
        sc.close();
        juego.jugar();



    }
}
