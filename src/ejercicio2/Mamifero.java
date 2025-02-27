package ejercicio2;
/* Clase abstracta Mamifero de ella van a venir varias subclases y no necesito crear un objeto de ella
    por eso la hacemos abstracta */

    //Se declara la clase abstracta Mamifero que implementa la interfaz Caminar
public abstract class Mamifero implements Caminar {

    //Se declaran los atributos de clase Mamifero, que a su vez se heredaran en las subclases
        //Estos atributos tienen el identificador de acceso protected para que puedan ser accedidos por las subclases
    protected String especie;
    protected String color;

    /*Al implementarse la interfaz Caminar, se debe sobreescribir el metodo caminar
      de momento no hace nada, pero su implementacion se hara en las subclases */
    @Override
    public void caminar() {

    }

}




