package ejercicio4;
// Clase Empleado que va a ser el padre de resto de subclases


public class Empleado {
    //Atributo nombre, como indica el esquema UML del ejercicio y solo lo implementaremos en esta clase
    private String nombre;

    //Contructor de Empleado, lo vamos a necesitar para que las subclases puedan acceder a el
    public Empleado(String nombre){
        this.nombre = nombre;
    }

    //Getters y Setters que pide el enunciado.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Sobrescribimos el metodo toScring de la clase Object para que muestre la informacion segun la estructura que nos solicita el enunciado
    @Override
    public String toString() {
        return "Empleado " + nombre + " -> Empleado ";
    }
}
