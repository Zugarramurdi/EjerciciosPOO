package ejercicio2;

/* Clase Loro que hereda de Ave, de esta clase si que se crearan objetos de tipo Loro */
//Se declara la clase Loro que hereda de la clase Ave e implementa la interfaz Volar
public class Loro extends Ave implements Volar {

    /*Se declaran los atributos de la clase Loro, estos son privados para que no puedan ser accedidos desde fuera de la clase
       sin los metodos get y set */
    private boolean salvaje;

    /*Se declara el constructor de la clase Loro, el cual recibe dos parametros, uno de tipo String y otro de tipo boolean
      el parametro boolean se asigna al atributo salvaje de la clase y el parametro String
      se asigna al atributo color de la clase Ave, por eso la palabra reservada Super, hacemos referencia al atributo color de la clase Ave */
    public Loro(String color, boolean salvaje){
        super.color = color;
        this.salvaje = salvaje;
        super.especie = "Psitaciforme";
        //se asigna la especie concreta de la clase Loro haciendo referencia al atributo especie de la clase Ave
    }

    /* Se sobreescribe el metodo volar que implementa de la interfaz Volar, en este caso se imprime un mensaje
      que indica que el loro vuela */
    @Override
    public void volar() {
        System.out.println("El loro VUELA");
    }

    /* Se sobreescribe el metodo caminar de la interfaz Caminar, que ha heredado de Ave,
      en este caso se imprime un mensaje que indica que el loro camina */
    @Override
    public void caminar() {
        System.out.println("El loro CAMINA");
    }
}
