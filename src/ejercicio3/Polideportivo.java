package ejercicio3;

public class Polideportivo implements Edificio, InstalacionDeportiva{
    // ATRIBUTOS
    private String nombre;
    private double superficiePorPlanta;
    private int tipoInstalacion;
    private int plantas;

    //CONSTRUCTOR
    public Polideportivo(String nombre, int tipoInstalacion, double superficiePorPlanta, int plantas) {
        this.nombre = nombre;
        this.tipoInstalacion = tipoInstalacion;
        this.superficiePorPlanta = superficiePorPlanta;
        this.plantas = plantas;
    }

    // GETTERS y SETTERS
    public double getSuperficiePorPlanta() {
        return superficiePorPlanta;
    }

    public void setSuperficiePorPlanta(double superficiePorPlanta) {
        this.superficiePorPlanta = superficiePorPlanta;
    }

    public int getTipoInstalacion() {
        return tipoInstalacion;
    }

    public void setTipoInstalacion(int tipoInstalacion) {
        this.tipoInstalacion = tipoInstalacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPlantas() {
        return plantas;
    }

    public void setPlantas(int plantas) {
        this.plantas = plantas;
    }

    // METODOS
    @Override
    public double getSuperficieEdificio() {
         double resultado = superficiePorPlanta * plantas;
        return resultado;
    }


    @Override
    public int getTipoDeInstalacion() {
        return tipoInstalacion;
    }

    @Override
    public String toString() {
        return "Polideportivo: {" +
                "Nombre= '" + nombre + '\'' +
                ", Superficie por planta= " + superficiePorPlanta +
                ", Tipo de instalacion= " + tipoInstalacion +
                ", Plantas= " + plantas +
                '}';
    }
}
