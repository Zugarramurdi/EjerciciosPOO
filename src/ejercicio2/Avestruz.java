package ejercicio2;

/* Clase Avestruz que hereda de Ave, de esta clase si que se crearan objetos de tipo Avestruz */
//Se declara la clase Avestruz que hereda de la clase Ave
public class Avestruz extends Ave{

    /*Se declaran los atributos de la clase Avestruz, estos son privados para que no puedan ser accedidos desde fuera de la clase
       sin los metodos get y set */
    private boolean salvaje;

    /*Se declara el constructor de la clase Avestruz, el cual recibe dos parametros, uno de tipo String y otro de tipo boolean
      el parametro boolean se asigna al atributo salvaje de la clase y el parametro String
      se asigna al atributo color de la clase Ave, por eso la palabra reservada Super, hacemos referencia al atributo color de la clase Ave */
    public Avestruz(String color, boolean salvaje){
        super.color = color;
        this.salvaje = salvaje;
        super.especie = "Strucioniforme";
        //se asigna la especie concreta de la clase Avestruz haciendo referencia al atributo especie de la clase Ave
    }

    /* Se sobreescribe el metodo caminar de la interfaz Caminar, que ha heredado de Ave,
      en este caso se imprime un mensaje que indica que el avestruz camina */
    @Override
    public void caminar() {
        System.out.println("El avestruz CAMINA");
    }
}
