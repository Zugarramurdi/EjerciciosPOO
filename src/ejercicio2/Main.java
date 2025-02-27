package ejercicio2;

public class Main {
    public static void main(String[] args) {
        //Creamos los objetos de cada clase
        Gato gato = new Gato("Negro", 4, false);
        Tigre tigre = new Tigre("Naranja y negro", 4, true);
        Murcielago murcielago = new Murcielago("Negro", 2, true);
        Loro loro = new Loro("Azul y amarillo", false);
        Avestruz avestruz = new Avestruz("Gris",true);

        //Llamamos a los metodos vacios heredados/implementados en cada clase
        gato.caminar();
        gato.nadar();
        System.out.println();
        tigre.caminar();
        tigre.nadar();
        System.out.println();
        murcielago.caminar();
        murcielago.volar();
        System.out.println();
        loro.caminar();
        loro.volar();
        System.out.println();
        avestruz.caminar();


    }
}
