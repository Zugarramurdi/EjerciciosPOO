package ejercicio4;

// Clase Operario que hereda (extends) de Empleado
public class Operario extends Empleado {

    /* Constructor de la clase Operario, tiene un parametro de entrada de String nombre
    y llama al constructor de la clase padre (Empleado) con el parametro de entrada nombre
     con la palabra reservada super y entre parentesis el parametro de entrada del constructor */
    public Operario(String nombre) {
        super(nombre);
    }

    /* Sobrescribimos el metodo toString de la clase Empleado para que muestre la
    informacion segun la estructura que nos solicita el enunciado.
    Esta vez para Operario y como no tiene un atributo propio de nombre no podemos referenciar
     a la variable nombre, asi que referenciamos el metodo getNombre() con super para apuntar al padre */
    @Override
    public String toString() {
        return "Empleado " + super.getNombre() + " -> Operario ";
    }
}
