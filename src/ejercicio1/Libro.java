/**
 * CLASE LIBRO
 * @Author Juanma Segura
 * @Version 1.0
 */
package ejercicio1;

import java.util.Scanner;

//Clase publica Libro
public class Libro {
    //Atributos de la clase
    //Privados para encapsulamiento y un final (constante) para el tamaño del ISBN
    private static final int TAMANIOISBN = 13;
    private String titulo, autor, isbn;
    private int numPaginas;

    //Constructores
    //Constructor con paramentros titulo, autor, isbn y numPaginas para los dos libros que solicita el ejercicio
    public Libro(String titulo, String autor, String isbn, int numPaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = formatoIsbn(isbn);
        this.numPaginas = numPaginas;
    }
    //Contructor vacio que se usara para el libro que se le solicita al usuario
    //Se referencian a los atributos con los valores de los metodos pedirLibro(), pedirAutor(), pedirIsbn() y pedirNumPaginas()
    public Libro(){
        this.titulo = pedirLibro();
        this.autor = pedirAutor();
        this.isbn = pedirIsbn();
        this.numPaginas = pedirNumPaginas();
    }

    //Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    //METODOS

    //Metodo toString que hereda de la clase Object, se sobreescribe para mostrar los datos del libro
    @Override
    public String toString() {
        return "El libro con isbn "+isbn+", creado por el autor "+autor+", tiene un total de "+numPaginas+" paginas";
    }

    //Metodo pedirLibro() que solicita al usuario el nombre del libro
    public String pedirLibro(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Ingrese el nombre del libro: ");
        titulo = scn.nextLine();
        return titulo;
    }

    //Metodo pedirAutor() que solicita al usuario el nombre del autor
    public String pedirAutor(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Ingrese el nombre del autor: ");
        autor = scn.nextLine();
        return autor;
    }

    /*Metodo pedirIsbn() que solicita al usuario el ISBN del libro
     *Se utiliza el metodo replaceAll() de la clase String para eliminar caracteres que no sean numeros o la letra Xx
     *En el flujo de control se valida que el isbn tenga la longitud correcta con el metodo validarIsbn()
     *Si el isbn no es valido se muestra un mensaje y se vuelve a llama al metodo pedirIsbn()
     */
    public String pedirIsbn(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Ingrese el isbn del libro, (No es necesario los guiones): ");
        isbn = scn.nextLine().replaceAll("[^0-9Xx]","");
        if (validarIsbn()){
            isbn = formatoIsbn(isbn);
            return isbn;
        }else{
            System.out.println("ISBN no valido, debe tener " + TAMANIOISBN + " digitos");
            return pedirIsbn();
        }
    }

    /*Metodo pedirNumPaginas() que solicita al usuario el numero de paginas del libro
     *Se utiliza un bloque try-catch para capturar la excepcion NumberFormatException con un mensaje de error
     *En el flujo de control se valida que el numero de paginas sea un numero entero
     */
    public int pedirNumPaginas(){
        Scanner scn = new Scanner(System.in);
        while(true){
        System.out.println("Ingrese el numero de paginas del libro: ");
            try{
                numPaginas = Integer.parseInt(scn.nextLine());
                return numPaginas;
            }catch (NumberFormatException e){
                System.out.println("Ingrese cantidad en numeros");

            }
        }
    }

    /*Metodo formatoIsbn() que recibe un String isbn y lo formatea con guiones
     *Se utiliza el metodo format() de la clase String para dar formato al isbn
     *Se retorna el isbn formateado con guiones y con estructura de isbn
     */
    public String formatoIsbn(String isbn){
        return String.format("%s-%s-%s-%s-%s",
                isbn.substring(0,3),
                isbn.substring(3,4),
                isbn.substring(4,6),
                isbn.substring(6,12),
                isbn.substring(12));
    }

    /*Metodo compararLibros() que recibe dos objetos de la clase Libro y compara el numero de paginas
     *Se utiliza el metodo compare() de la clase Integer para comparar el numero de paginas de los dos libros, devolviendo un entero (1, -1 o 0) guardandola en una variable auxiliar (resultado)
     *Se utiliza la expresion switch con resultado como condicion para retornar un mensaje dependiendo del resultado de la comparacion
     */
    public static String compararLibros(Libro ejemplar1, Libro ejemplar2){
        int resultado = Integer.compare(ejemplar1.getNumPaginas(), ejemplar2.getNumPaginas());
       return switch (resultado) {
            case 1 -> "El libro "+ejemplar1.getTitulo()+" tiene mas paginas que el libro "+ejemplar2.getTitulo();
            case -1 -> "El libro "+ejemplar2.getTitulo()+" tiene mas paginas que el libro "+ejemplar1.getTitulo();
            default -> "Ambos libros tienen la misma cantidad de paginas";
        };
    }

    //Metodo validarIsbn() que valida que el isbn tenga la longitud correcta de 13 digitos
    public boolean validarIsbn(){
        return isbn.length() == TAMANIOISBN;
    }
}
