public class Socio {

    private final int numSocio;
    private final String nombre;

    public Socio(int numeroSocio, String nombre) {
        this.numSocio = numeroSocio;
        this.nombre = nombre;
    }

    public int getNumSocio() {
        return numSocio;
    }

    public String getNombre() {
        return nombre;
    }

    public String toString() {
        return "Socio{ numSocio = " + numSocio + ", nombre = " + nombre + "}";
    }
}
