package ejercicio5;
// Clase Main

public class Main {
    public static void main(String[] args) {
        int contador = 0;

        // Creamos los Arrays que pide con los parametros que se me pasaron por la cabeza
        Serie[] series = new Serie[]{new Serie("Juego de Tronos", "George R. R. Martin"),
                new Serie("Breaking Bad", "Vince Gilligan", 5, "Drama"),
                new Serie("The Walking Dead", "Frank Darabont", 10, "Terror"),
                new Serie("The Big Bang Theory", "Chuck Lorre", 12, "Comedia"),
                new Serie("Friends", "David Crane")};

        VideoJuego[] videoJuegos = new VideoJuego[]{new VideoJuego("The Legend of Zelda", 50),
                new VideoJuego("Super Mario Bros", 10, "Plataformas", "Nintendo"),
                new VideoJuego("Call of Duty", 100, "Shooter", "Activision"),
                new VideoJuego("Metal Gear Solid", 30, "Acción", "Konami"),
                new VideoJuego("Final Fantasy X", 80)};

        /* Realizamos las acciones que pide el ejercicio a través de los métodos de las clases
        y un par de metodos estaticos que he implemetado en la clase Main para solucionar un punto del ejercicio */
        series[1].entregar();
        series[3].entregar();
        videoJuegos[0].entregar();
        videoJuegos[2].entregar();

        seriesEntregadas(series);
        videjuegosEntregados(videoJuegos);
        System.out.println();
        System.out.println(VideoJuego.juegoMaxHoras(videoJuegos)+"\n");
        System.out.println(Serie.serieMaxTemporadas(series));


    }

    // METODOS ESTATICOS DE MAIN
    // Son estaticos porque los llamamos desde la clase Main sin necesidad de instanciar un objeto de la clase Main
    /* Este metodo recorre el Array de series y muestra las series que estan entregadas, gracias a la variable auxiliar contador,
       cada vez que hay una iteracion se suma 1 a contador y asi podemos tambien imprimir el total de series entregadas */
    public static void seriesEntregadas(Serie[] series){
        int contador = 0;
        for (Serie serie : series) {
            if (serie.isEntregado()) {
                System.out.println(serie); // aqui mostramos toda la informacion de la serie como si llamaramos a serie.toString(), pero no es necesario ya que el metodo println() llama a toString() implicitamente
                contador++;
            }
        }
        System.out.println("Hay un total de " + contador + " series entregadas \n");
    }

    /* Mismo metodo que el anterior pero con videojuegos */
    public static void videjuegosEntregados(VideoJuego[] videoJuegos){
        int contador = 0;
        for (VideoJuego videojuego : videoJuegos) {
            if (videojuego.isEntregado()) {
                System.out.println(videojuego); // lo mismo que es serie ocurre aqui, en realidad con cualquier, objeto instanciado de una clase imprimira toString() tal y como lo has sobrescrito en la clase
                contador++;
            }
        }
        System.out.println("Hay un total de " + contador + " videojuegos entregados");
    }

}
