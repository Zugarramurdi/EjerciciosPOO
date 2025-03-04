package ejercicio7;
import java.util.List;
import java.util.ArrayList;
// CLASE JUEGORULETA
/* Esta clase representa el propio juego de la ruleta rusa.
   asi nos lo indica el ejercicio y aqui se desarrolla la logica del juego.
   Es necesario importar los Utiles: List y ArrayList para desarrollarlo como nos piden. */

public class JuegoRuleta {
    // ATRIBUTOS
    /* Aqui los atributos no son variables primitivas, sino objetos de las clases Revolver y Jugador.
       Se instancia un objeto de la clase Revolver y una lista de objetos de la clase Jugador.
       Segun la descripcion del ejercicio, tienen que haber varios jugadores por cada vez que se juegue, por eso se usa una lista de jugadores. */
    private Revolver revolver;
    private List<Jugador> jugadores;

    // CONSTRUCTOR
    /* Este constructor tambien es un poco peculiar, el ejercicio nos pide que la partida tiene que haber de entre 1 a 6 jugadores
       si no se cumple el rango, por defecto seran 6 jugadores.
       Asi que el constructor necesita un parametro con el numero de jugadores que se quieren.
       Y como nos piden, comprobamos si ese parametro esta dentro del rango y si no, se asigna el valor por defecto.
     */
    public JuegoRuleta(int numJugadores) {
        if (numJugadores < 1 || numJugadores > 6) {
            numJugadores = 6;
        }
        this.jugadores = new ArrayList<>(); // Se instancia una lista de jugadores
        for (int i = 0; i < numJugadores; i++) { // bucle for para recorrer la lista de jugadores, el tamaño dependera del parametro que se le pase
            jugadores.add(new Jugador(i+1)); // se añade un nuevo jugador a la lista, .add añade a la lista y se especifica que es objeto Jugador con el parametro de id (como requiere su constructor)
        }                                       // el id se incrementa en 1 para que empiece en 1 y no en 0 como los arrays
        this.revolver = new Revolver(); // se crea un objeto de la clase Revolver.

    }

    // Pues tampoco necesitaremos Getters y Setters en esta clase.

    // METODOS
    /* finJuego() devuelve un booleano para saber si el juego ha terminado o no.
       El ejercicio dice que en el momento que un jugador este muerto termina la partida.
       Asi que recorreremos la lista en busca de un jugador que su estado sea vivo = false.
       Usaremos un bucle for each esta vez.
     */
    public boolean finJuego(){
        for (Jugador jugador : jugadores) {
            if (!jugador.estaVivo()) {
                return true;
            }
        }
        return false;
    }

    /* ronda() es un metodo que no devuelve nada
       lo que hara es imprimir un mensaje cada vez que empiece una nueva ronda
       y recorriendo la lista de jugadores comprobara si alguno esta vivo y se dispara para imprimir un mensaje de que el juego ha terminado. */
    public void ronda(){
        System.out.println(" \n\t *** Nueva Ronda ***");
        for (Jugador jugador : jugadores) {
            if (jugador.estaVivo() && jugador.disparar(revolver)) {
                System.out.println("El juego ha terminado");
                return;
            }
        }
    }

    /* jugar() es un metodo que no devuelve nada
       su funcion es mantener el juego en marcha hasta que el booleano de la funcion finJuego() sea true.
       mientras no sea asi, llamara a la funcion ronda() para que se ejecute una nueva ronda.
     */
    public void jugar(){
        while (!finJuego()) {
            ronda();
        }
    }

}
