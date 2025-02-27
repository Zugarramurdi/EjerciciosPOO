package ejercicio1;

public class Main {
    public static void main(String[] args) {

    Libro libro1 = new Libro("La Maquina del tiempo", "H.G. Wells", "9788466784801", 176);
    Libro libro2 = new Libro("1984", "George Orwell", "9788445010273", 400);
    System.out.println(libro1 + "\n" + libro2);
    System.out.println(Libro.compararLibros(libro1, libro2));

    System.out.println("\nProporciona un libro y te digo si tiene mas paginas que el libro " + libro2.getTitulo());
    Libro libro3 = new Libro();
    System.out.println(libro3);
    System.out.println(Libro.compararLibros(libro3, libro2));
    }
}