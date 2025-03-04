package ejercicio6;

// CLASE RAICES
/* En esta clase haremos los calculos matematicos a traves de funciones segun nos solicita el ejercicio:
    introduciremos 3 parametros de tipo double a, b y c que seran los coeficientes de la ecuacion de segundo grado
    y haremos las operaciones necesarias para obtener la/las raiz/raices de la ecuacion */


public class Raices {
    // Atributos de clase que seran los coeficientes de la ecuacion
    private double a, b, c;

    // Declaramos un constructor que recibe los coeficientes de la ecuacion
    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // En este ejercicio no es necesario tener setters y getters ya que los atributos solo se usan en la clase y no se modificaran


    // METODOS DE LA CLASE RAICES
    /* La mayor parte de las funciones son privadas ya que solo se usaran dentro de la clase para los calculos
       y despues la funcion calcular() se encargara de llamar a las funciones necesarias para obtener la solucion y mostrarla */

    /* Funcion para calcular el discriminante de la ecuacion.
       El discriminante es la parte de la raiz cuadrada de la formula de la ecuacion de segundo grado
       lo que nos indica el calculo del discriminante es si la ecuacion tiene raices o no.
       Su formula es: D = b^2 - 4ac
       Si D > 0 la ecuacion tiene 2 raices
       si D = 0 la ecuacion tiene 1 raiz
       si D < 0 la ecuacion no tiene raices
     */
    private double getDiscriminante() {
        return (b*b) - (4*a*c);
    }

    // Funciones para saber si la ecuacion tiene raices o no
    // estas funciones nos devuelven un valor booleano que nos indica si la ecuacion tiene raices o no
    // despues las usaremos como condicionales para saber que operacion hacer en las funciones obtenerRaices() y obtenerRaiz()
    private boolean tieneRaices(){
        return getDiscriminante() > 0; // Si el discriminante es mayor a 0 la ecuacion tiene 2 raices
    }
    private boolean tieneRaiz(){
        return getDiscriminante() == 0; // Si el discriminante es igual a 0 la ecuacion tiene 1 raiz
    }

    // Funciones para obtener las raices de la ecuacion
    // estas funciones se encargan de hacer las operaciones necesarias para obtener las raices de la ecuacion
    // Formula ecuación 2º grado: (-b ± √(b^2 - 4ac)) / 2a -> (-b ±√ D) / 2a
    private void obtenerRaices(){
        if (tieneRaices()){
            // tambien podriamos haber puesto aqui una variable auxiliar mas calculando ya la raiz cuadrada del valor D, "discriminante = Math.sqrt(getDiscriminante());"
            // seria mas legible y las variables raiz1 y raiz2 serian mas cortas: "(-b + discriminante)/(2*a)" y "(-b - discriminante)/(2*a)" respectivamente
            double raiz1 = (-b + Math.sqrt(getDiscriminante()))/(2*a);
            double raiz2 = (-b - Math.sqrt(getDiscriminante()))/(2*a);
            System.out.println("Las soluciones son: \nRaiz 1: " + raiz1 + "\nRaiz 2: " + raiz2);
        }else{
            System.out.println("No tiene raices");
        }
    }
    private void obtenerRaiz(){ // Si la ecuacion tiene una sola raiz la formula es mas sencilla y solo necesitamos una variable
        if (tieneRaiz()) {
            double raiz = -b / (2 * a);
            System.out.println("La solucion es: " + raiz);
        }else{
            System.out.println("No tiene raiz");
        }
    }

    // Funcion principal que se encarga de llamar a las funciones necesarias para obtener la solucion de la ecuacion
    // Los calculos no se hacen en esta funcion, solo se llaman a las funciones que hacen los calculos necesarios
    // aqui solo verificamos si la ecuacion tiene raices o no y llamamos a las funciones correspondientes
    public void calcular(){
        if (tieneRaices()) {
            obtenerRaices();
        }else if (tieneRaiz()) {
            obtenerRaiz();
        }else {
            System.out.println("No tiene solucion");
        }
    }

}
