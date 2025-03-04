package ejercicio7;
import java.util.Random;
// CLASE REVOLVER
/* Esta clase representa el revolver que se usará en el juego de la ruleta rusa.
   Importamos la clase Random para generar números aleatorios (asi simulamos el factor de azar en el juego)

 */

public class Revolver {
    // ATRIBUTOS
    private int posicionActual, posicionBala;

    // CONSTRUCTOR
    /* Este constructor en un poco "especial" ya que se encarga de inicializar el revolver con una posición aleatoria
       para la bala y la posición actual del tambor.
       Se instancia un objeto de la clase Random para generar números aleatorios.
       Indicamos a los atributos posicionActual y posicionBala que se les asignará un valor aleatorio entre 0 y 5. (6 posiciones en total, como el tambor de un revolver) */
    public Revolver(){
        Random rand = new Random();
        this.posicionActual = rand.nextInt(6);
        this.posicionBala = rand.nextInt(6);
    }

    // No necesitamos Setters y Getters ya que no se modificarán los valores de los atributos.

    // METODOS
    /* Este se encarga de verificar si la posición actual del tambor es igual a la posición de la bala.
       Si es asi, el jugador muere y el juego termina.
       Si no, el jugador sobrevive y se pasa al siguiente tambor.
       Devuelve un booleano que indica si el jugador ha muerto o no. */
    public boolean disparar(){
        return posicionActual == posicionBala;
    }
    public void siguienteBala(){
        posicionActual = (posicionActual + 1) % 6;
        /* La operación (posicionActual + 1) % 6 nos asegura que la posición actual del tambor no sobrepase el límite de 6 posiciones.
           El calcuro seria algo asi:
           El revolver tiene 6 posiciones {0,1,2,3,4,5}
           posicion                 posicion despues de siguienteBala()
              0                        (0+1) % 6 = 1
              1                        (1+1) % 6 = 2
              2                        (2+1) % 6 = 3
              3                        (3+1) % 6 = 4
              4                        (4+1) % 6 = 5
              5                        (5+1) % 6 = 0 vuelve a empezar */
    }

    // Sobrescribimos el metodo toString para mostrar la info de donde esta la posicion y la bala como pide el ejercicio.
    @Override
    public String toString() {
        return "Revolver {" +
                "posicionActual= " + posicionActual +
                ", posicionBala= " + posicionBala +
                '}';
    }
}
