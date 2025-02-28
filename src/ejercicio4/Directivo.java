package ejercicio4;

/* Clase Directivo que hereda (extends) de Empleado
   heredamos el constructor de la clase Empleado y referenciamos el atributo nombre de la clase
   inmediatamente superior, Empleado en este caso, con la palabra reservada super */
public class Directivo extends Empleado {
    public Directivo(String nombre) {
        super(nombre);
    }

    /* Sobrescribimos el metodo toString de la clase Empleado
       como en Empleado, aqui tambien tiene una estructura especifica para esta clase y tampoco tiene atributo propio
       y vamos referenciando hasta la clase mas alta: Directivo(super)->Empleado */
    @Override
    public String toString() {
        return "Empleado " + super.getNombre() + " -> Directivo";
    }
}
