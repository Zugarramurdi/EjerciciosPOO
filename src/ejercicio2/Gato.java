package ejercicio2;

/* Clase Gato que hereda de Felino, de esta clase si que se crearan objetos de tipo Gato */
public class Gato extends Felino{

    /*Se declaran los atributos de la clase Gato, estos son privados para que no puedan ser accedidos desde fuera de la clase
       sin los metodos get y set */
    private int patas;
    private boolean salvaje;

    /*Se declara el constructor de la clase Gato, el cual recibe tres parametros, uno de tipo String, otro de tipo int y uno de tipo boolean
      el parametro int se asigna al atributo patas, el parametro boolean se asigna al atributo salvaje y el parametro String
      se asigna al atributo color de la clase Felino, por eso la palabra reservada Super y la expresion super(color); es porque ya tenemos un contructor de la clase Felino que recibe un parametro de tipo String */
    public Gato(String color, int patas, boolean salvaje) {
        super(color);
        this.patas = patas;
        this.salvaje = salvaje;
        //no se asigna la especie porque ya esta asignada en la clase Felino
    }


    /* Se sobreescribe el metodo caminar de la interfaz Caminar, que ha heredado de Felino,
      en este caso se imprime un mensaje que indica que el gato camina */
    @Override
    public void caminar() {
        System.out.println("El gato CAMINA");;
    }

    /* Se sobreescribe el metodo nadar de la interfaz Nadar, en este caso se imprime un mensaje
      que indica que el gato nada */
    @Override
    public void nadar() {
        System.out.println("El gato NADA");
    }
}
