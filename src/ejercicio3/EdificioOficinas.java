package ejercicio3;

public class EdificioOficinas implements Edificio {
    // ATRIBUTOS
    private String nombre;
    private double superficiePorPlanta;
    private int plantas;
    private int numeroOficinas;

    //CONSTRUCTOR
    public EdificioOficinas(String nombre, double superficiePorPlanta, int plantas, int numeroOficinas) {
        this.nombre = nombre;
        this.superficiePorPlanta = superficiePorPlanta;
        this.plantas = plantas;
        this.numeroOficinas = numeroOficinas;
    }

    // GETTERS y SETTERS
    public double getSuperficiePorPlanta() {
        return superficiePorPlanta;
    }

    public void setSuperficiePorPlanta(double superficiePorPlanta) {
        this.superficiePorPlanta = superficiePorPlanta;
    }

    public int getPlantas() {
        return plantas;
    }

    public void setPlantas(int plantas) {
        this.plantas = plantas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroOficinas() {
        return numeroOficinas;
    }

    public void setNumeroOficinas(int numeroOficinas) {
        this.numeroOficinas = numeroOficinas;
    }

    // METODOS
    @Override
    public double getSuperficieEdificio() {
        double resultado = superficiePorPlanta * plantas;
        return resultado;
    }

    @Override
    public String toString() {
        return "EdificioOficinas: {" +
                "Nombre= '" + nombre + '\'' +
                ", Superficie por planta= " + superficiePorPlanta +
                ", Plantas= " + plantas +
                ", Numero de oficinas= " + numeroOficinas +
                '}';
    }
}
