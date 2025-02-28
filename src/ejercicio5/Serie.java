package ejercicio5;
//CLASE SERIE


public class Serie implements Entregable {
    private String titulo;
    private int numTemporadas;
    private boolean entregado;
    private String genero;
    private String creador;

    //SOBRECARGA DE CONSTRUCTORES tal como pide el enunciado, necesitamos tres tipos de constructores
    //Constructor por defecto
    public Serie(){
        this.titulo = "";
        this.numTemporadas = 3;
        this.entregado = false;
        this.genero = "";
        this.creador = "";
    }
    //Constructor con parametro de titulo y creador
    public Serie(String titulo, String creador){
        this.titulo = titulo;
        this.creador = creador;
        this.numTemporadas = 3;
        this.entregado = false;
        this.genero = "";
    }
    //Constructor con todos los parametros menos entregado
    public Serie(String titulo, String creador, int numTemporadas, String genero){
        this.titulo = titulo;
        this.creador = creador;
        this.numTemporadas = numTemporadas;
        this.entregado = false;
        this.genero = genero;
    }

    //Getters y Setters menos de entregado, como pide el ejercicio

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumTemporadas() {
        return numTemporadas;
    }

    public void setNumTemporadas(int numTemporadas) {
        this.numTemporadas = numTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    //Sobrescribimos el metodo toString
    @Override
    public String toString() {
        return "Serie {" +
                "titulo= '" + titulo + '\'' +
                ", numTemporadas= " + numTemporadas +
                ", entregado= " + entregado +
                ", genero= '" + genero + '\'' +
                ", creador= '" + creador + '\'' +
                '}';
    }

    /* Metodo entregar() y devolver() de la interfaz Entregable,
    hacemos una pequeña comprobacion del estado de entregado y dependiendo de eso, entregamos o no / devolvemos o no */
    @Override
    public void entregar() {
        if (!entregado){
            entregado = true;
        }else{
            System.out.println("La serie ya ha sido entregada");
        }
    }

    @Override
    public void devolver() {
        if (!entregado){
            System.out.println("La serie no se puede devolver, ya que no ha sido entregada");
        }else{
            entregado = false;
        }

    }

    // Sencillo metodo de la interfaz Entregable que devuelve si esta entregado o no
    @Override
    public boolean isEntregado() {
        return entregado;
    }

    //Metodo compareTo de la interfaz Entregable, comparamos el numero de temporadas de dos series
    // este metodo tampoco nos lo pide usar en la Clase Serie
    @Override
    public void compareTo(Object a) {
        Serie serie = (Serie) a;
        if (numTemporadas > serie.numTemporadas){
            System.out.println("La serie con mas temporadas es: " + titulo);
            System.out.println(toString());
        }else{
            System.out.println("La serie con mas temporadas es: " + serie.titulo);
            System.out.println(serie.toString());
        }

    }

    //Metodo que devuelve la serie con mas temporadas, como nos pide el ejercicio
    /* Al igual que en la clase VideoJuego, usamos un par de variables auxiliares para almacenar el maximo de temporadas y el titulo de la serie
       y despues mostramos el titulo con mas temporadas
       le ponemos el modificador static para poder llamarlo desde la clase Main sin necesidad de instanciar un objeto de la clase Serie */
    public static String serieMaxTemporadas(Serie[] series){
        int maxTemporadas = 0;
        String titulo = "";
        for (Serie serie : series){
            if (serie.numTemporadas > maxTemporadas){
                maxTemporadas = serie.numTemporadas;
                titulo = serie.toString();
            }
        }
        return "La serie con mas temporadas es: \n" + titulo;
    }
}
