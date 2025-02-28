package ejercicio5;
//CLASE VIDEOJUEGO

public class VideoJuego implements Entregable{
    private String titulo;
    private int horasEstimadas;
    private boolean entregado;
    private String genero;
    private String compania;

    //SOBRECARGA DE CONSTRUCTORES tal como pide el enunciado, necesitamos tres tipos de constructores
    //Constructor por defecto
    public VideoJuego(){
        this.titulo = "";
        this.horasEstimadas = 10;
        this.entregado = false;
        this.genero = "";
        this.compania = "";
    }
    //Constructor con titulo y horas estimadas
    public VideoJuego(String titulo, int horasEstimadas){
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.entregado = false;
        this.genero = "";
        this.compania = "";
    }
    //Constructor con todos los parametros menos entregado
    public VideoJuego(String titulo, int horasEstimadas, String genero, String compania){
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.entregado = false;
        this.genero = genero;
        this.compania = compania;
    }

    //Getters y Setters menos de entregado, como pide el ejercicio

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    //Sobrescribimos metodo toString()
    @Override
    public String toString() {
        return "VideoJuego {" +
                "titulo= '" + titulo + '\'' +
                ", horasEstimadas= " + horasEstimadas +
                ", entregado= " + entregado +
                ", genero= '" + genero + '\'' +
                ", compania= '" + compania + '\'' +
                '}';
    }

    /* Metodo entregar() y devolver() de la interfaz Entregable,
    hacemos una pequeña comprobacion del estado de entregado y dependiendo de eso, entregamos o no / devolvemos o no */
    @Override
    public void entregar() {
        if (!entregado){
            entregado = true;
        }else{
            System.out.println("El videojuego ya ha sido entregado");
        }
    }

    @Override
    public void devolver() {
        if (!entregado){
            System.out.println("El videojuego no se puede devolver, ya que no ha sido entregado");
        }else{
            entregado = false;
        }

    }

    // Sencillo metodo de la interfaz Entregable que devuelve el estado de entregado en boolean
    @Override
    public boolean isEntregado() {
        return entregado;
    }

    //Metodo compareTo() de la interfaz Entregable, comparamos dos objetos de tipo VideoJuego y mostramos el que tenga mas horas estimadas
    // Este metodo no lo llegamos a usar en el ejercicio por alguna razon
    @Override
    public void compareTo(Object a) {
        if (a instanceof VideoJuego) {
            VideoJuego juego = (VideoJuego) a;
            if (horasEstimadas > juego.horasEstimadas) {
                System.out.println("El juego con mas horas es: " + titulo);
            } else {
                System.out.println("El juego con mas horas es: " + juego.titulo);
            }
        }else{
            System.out.println("El objeto a comparar no es un videojuego");
        }

    }

    // Metodo que devuelve el videojuego con mas horas estimadas, como nos pide el ejercicio
    /* Este metodo recorre el Array con un bucle for each y compara las horas estimadas de cada videojuego
       nos ayudamos de una variable auxiliar para guardar el videojuego con mas horas y otra llamada titulo
       para guardar el titulo del videojuego con mas horas
        le ponemos el identificador static para poder llamarlo desde la clase Main sin necesidad de instanciar un objeto de tipo VideoJuego */
    public static String juegoMaxHoras(VideoJuego[] videoJuegos){
        int maxHoras = 0;
        String titulo = "";
        for (VideoJuego videoJuego : videoJuegos) {
            if (videoJuego.horasEstimadas > maxHoras){
                maxHoras = videoJuego.horasEstimadas;
                titulo = videoJuego.toString();
            }
        }
        return ("El videojuego con mas horas es: \n" + titulo);
    }
}
