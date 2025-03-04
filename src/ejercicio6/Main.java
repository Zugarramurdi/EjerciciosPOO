package ejercicio6;
/* aqui en el main creamos 5 objetos de la clase Raices con diferentes coeficientes
   y llamamos al metodo calcular() de cada objeto para que nos muestre las raices de la ecuacion
   hay un objeto con 1 raiz, varios con 2 raices y uno que no tiene solucion (para verificar que el prigrama funcione en los correspondientes casos) */

public class Main {
    public static void main(String[] args) {
        Raices r1 = new Raices(1, 2, 1);
        Raices r2 = new Raices(2, 3, 1);
        Raices r3 = new Raices(3, 4, 1);
        Raices r4 = new Raices(4, -5, 1);
        Raices r5 = new Raices(1, 1, 1);

        r1.calcular();
        System.out.println("____________________");
        r2.calcular();
        System.out.println("____________________");
        r3.calcular();
        System.out.println("____________________");
        r4.calcular();
        System.out.println("____________________");
        r5.calcular();

    }
}
