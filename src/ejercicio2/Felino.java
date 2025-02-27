package ejercicio2;

/* Clase Felino, aqui no la hacemos abstracta ya que podriamos considerar un objeto Felino,
    igualmente de esta clase aún se heredaran Atributos y metodos para otra subclase */

  //Se declara la clase Felino que hereda de la clase Mamifero e implementa la interfaz Nadar
public class Felino extends Mamifero implements Nadar {

    /* Se declara el constructor de la clase Felino, el cual recibe un parametro de tipo String
      que se asigna al atributo color de la clase Mamifero, por eso la palabra reservada Super.
       El atributo especie de la clase Mamifero se define como Felino */
    public Felino(String color){
        super.color = color;
        super.especie = "Felino";
    }

    /* Se sobreescribe el metodo caminar de la interfaz Caminar, que ha heredado de Mamifero,
     en este caso se imprime un mensaje que indica que el felino camina */
    @Override
    public void caminar() {
        System.out.println("El felino CAMINA");
    }

    /* Se sobreescribe el metodo nadar de la interfaz Nadar, en este caso se imprime un mensaje
     que indica que el felino nada */
    @Override
    public void nadar() {
        System.out.println("El felino NADA");
    }

}
