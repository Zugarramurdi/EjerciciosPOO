package ejercicio3;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        // Creamos un ArraList de tipo Edificio que se llama edificios
        /* Considero crear un ArrayList de tipo Edificio para poder almacenar tanto Polideportivos como Edificios de Oficinas
           ya que tienen una interfaz en comun que es edificio, y asi poder almacenarlos en un mismo ArrayList
           Esto nos evitaria tener que crear una clase padre para ambas y tambien el crear un ArrayList de tipo
           Object y usar instanceof para saber de que tipo es cada objeto.
         */
        // En Java no existe la herencia multiple de clases, pero si se puede implementar varias interfaces, es lo mas parecido a la herencia multiple.
    ArrayList<Edificio> edificios = new ArrayList<>();
    edificios.add(new Polideportivo("Arrosadia", 1, 1134,1));
    edificios.add(new EdificioOficinas("Mutilva", 100, 3, 10));
    edificios.add(new Polideportivo("Azpilagaña", 2, 900, 2));
    edificios.add(new EdificioOficinas("Burlada", 200, 5, 20));
    edificios.add(new Polideportivo("Buztintxuri", 3, 1500,1));
    edificios.add(new EdificioOficinas("Villava", 250, 5, 25));

    // Recorremos el ArrayList de edificios con un bucle for each y mostramos la informacion de cada edificio y superficie total
    for (Edificio edificio : edificios){
        System.out.println(edificio);
        System.out.println("Superficie: " + edificio.getSuperficieEdificio() + "\n");

    }

    }
}
