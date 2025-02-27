package ejercicio2;

/* Clase Murcielago que hereda de Mamifero, de esta clase si que se crearan objetos de tipo Murcielago */
//Se declara la clase Murcielago que hereda de la clase Mamifero e implementa la interfaz Volar
public class Murcielago extends Mamifero implements Volar{

    /*Se declaran los atributos de la clase Murcielago, estos son privados para que no puedan ser accedidos desde fuera de la clase
       sin los metodos get y set */
    private int patas;
    private boolean salvaje;

    /*Se declara el constructor de la clase Murcielago, el cual recibe tres parametros, uno de tipo String, otro de tipo int y uno de tipo boolean
      el parametro int se asigna al atributo patas, el parametro boolean se asigna al atributo salvaje y el parametro String
      se asigna al atributo color de la clase Mamifero, por eso la palabra reservada Super aqui la expresion es super.color = color; porque no tenemos un contructor de la clase Mamifero
       y hacemos referencia al atributo color de la clase Mamifero */
    public Murcielago (String color, int patas, boolean salvaje){
        super.color = color;
        this.patas = patas;
        this.salvaje = salvaje;
        super.especie = "Chiroptera";
        //se asigna la especie concreta de la clase Murcielago haciendo referencia al atributo especie de la clase Mamifero

    }

    /* Se sobreescribe el metodo caminar de la interfaz Caminar, que ha heredado de Mamifero,
      en este caso se imprime un mensaje que indica que el murcielago camina */
    @Override
    public void caminar() {
        System.out.println("El murcielago CAMINA");
    }

    /* Se sobreescribe el metodo volar que implementa de la interfaz Volar, en este caso se imprime un mensaje
      que indica que el murcielago vuela */
    @Override
    public void volar() {
        System.out.println("El murcielago VUELA");
    }
}
