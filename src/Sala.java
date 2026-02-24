public class Sala {

    private int codigoSala;
    private String descripcion;

    /**
     * Constructor de la clase Sala donde se definen los valores de int codigoSala
     * y String descripcion
     * @param codigoSala
     * @param descripcion
     */
    public Sala(int codigoSala, String descripcion) {
        this.codigoSala = codigoSala;
        this.descripcion = descripcion;
    }
    /**
     * Metodo el cual devuelve el código de la sala
     * @return codigoSala
     */
    public int getCodigoSala() {
        return codigoSala;
    }
    /**
     * Metodo el cual devuelve en forma de String la descripción de la sala
     * @return descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }
    /**
     * Metodo para hacer un String juntando la descripcion con el codigo de la sala
     * @return String
     */
    public String toString() {
        return "Sala{ " + "codigoSala=" + codigoSala + ", descripcion=" + descripcion + '}';
    }
}
