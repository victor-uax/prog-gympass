public class Socio {

    private final int numSocio;
    private final String nombre;

    /**
     * Constructor de la clase Socio donde se definen los valores de numeroSocio
     * y String nombre
     * @param numeroSocio
     * @param nombre
     */
    public Socio(int numeroSocio, String nombre) {
        this.numSocio = numeroSocio;
        this.nombre = nombre;
    }

    /**
     * Metodo el cual devuelve el número del socio
     * @return numSocio
     */
    public int getNumSocio() {
        return numSocio;
    }
    /**
     * Metodo el cual devuelve en forma de String el nombre del socio
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo para hacer un
     * @return
     */
    public String toString() {
        return "Socio{ numSocio = " + numSocio + ", nombre = " + nombre + "}";
    }
}
