package ejercicio7;
// CLASE JUGADOR
// Esta clase representa a los jugadores que participarán en el juego de la ruleta rusa.
public class Jugador {
    // ATRIBUTOS
    private int id;
    private String nombre;
    private boolean vivo;

    // CONSTRUCTOR
    // El nombre del jugador se inicializa con "Jugador" + el id del jugador. (como nos indica el ejercicio)
    public Jugador(int id){
        this.id = id;
        this.nombre = "Jugador " + id;
        this.vivo = true;
    }

    // Aqui tampoco necesitamos Getters y Setters

    // METODOS
    /* Metodo disparar(Revolver r), recive un parametro de tipo Revolver. Devulve un booleano.
       Hace una comprovacion con el metodo de la clase Revolver disparar() para saber si la bala esta en la misma posicion que la posicion del tambor,
       si es asi, se imprime un mensaje diciendo que el jugador ha muerto (nos lo pide el ejercicio) y se cambia el estado del jugador a muerto, devolviendo true para indicar que si ha disparado.
       En caso contrario, se imprime un mensaje diciendo que el jugador ha sobrevivido (nos lo pide el ejercicio) y se llama al metodo de Revolver siguienteBala()
       para pasar al siguiente tambor, devolviendo false para indicar que no ha sido disparado. */
    public boolean disparar(Revolver r){
        if (r.disparar()){
            System.out.println("El jugador " + nombre + " ha muerto");
            vivo = false;
            return true;
        } else {
            System.out.println("El jugador " + nombre + " ha sobrevivido");
            r.siguienteBala();
            return false;
        }
    }

    // Metodo que devulve un booleano para mirar el atributo vivo y saber si el jugador esta vivo o no.
    public boolean estaVivo(){
        return vivo;
    }
}


