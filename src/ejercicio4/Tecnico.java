package ejercicio4;

/* Clase Tecnico que hereda (extends) de Operario
   heredamos el constructor de la clase Operario y referenciamos el atributo nombre de la clase
   inmediatamente superior, Operario en este caso, con la palabra reservada super.
    A su vez se referenciara nombre de Empleado desde Operario */
public class Tecnico extends Operario{
    public Tecnico(String nombre) {
        super(nombre);
    }

    /* Sobrescribimos el metodo toString de la clase Operario
       como en Operario, aqui tambien tiene una estructura especifica para esta clase y tampoco tiene atributo propio
       y vamos referenciando hasta la clase mas alta: Oficial(super)->Operario(super)->Empleado */
    @Override
    public String toString() {
        return "Empleado " + super.getNombre() + " -> Operario"+ " -> Tecnico";
    }
}
