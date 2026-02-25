public class Gimnasio {

    private String codigo;
    private String nombre;
    private Socio[] listaSocios;
    private Sala[] listaSalas;
    private int responsableId;

    private final int CANT_SOCIOS;
    private final int CANT_SALAS;

    /**
     * Metodo constructor de la clase Gimnasio
     * @param codigo
     * @param nombre
     * @param cantSocios
     * @param cantSalas
     */
    public Gimnasio(String codigo, String nombre, int cantSocios, int cantSalas) {
        this.codigo = codigo;
        this.nombre = nombre;

        this.CANT_SOCIOS = cantSocios;
        this.CANT_SALAS = cantSalas;

        this.responsableId = -1;
    }

    /**
     * Introduce al Socio s en el array listaSocios
     * @param s
     * @return true si ha podido ser registrado, false si no ha podido ser registrado
     */
    private boolean registrarSocio(Socio s){
        int posicionLibre;
        boolean socioRegistrado = false;

        posicionLibre = devolverPosicionLibreSocios();

        if(posicionLibre != -1 && !comprobarDuplicidadSocio(s)){
            listaSocios[posicionLibre] = s;
            socioRegistrado = true;
        }
        return socioRegistrado;
    }

    /**
     * Este metodo recorre el array de listaSocios buscando el primer hueco libre y si lo encuentra devuelve la posición
     * libre y si no un -1
     * @return int posicionLibre
     */
    private int devolverPosicionLibreSocios(){
        boolean seguirBuscando = true;
        int posicionVacia = -1;

        for (int i = 0; i < CANT_SOCIOS && seguirBuscando; i++) {
            if( listaSocios[i] == null){
                posicionVacia = i;
                seguirBuscando = false;
            }
        }
        return posicionVacia;
    }

    /**
     * Comprueba que el código del Socio s no esté duplicado en el array listaSocios
     * @param s
     * @return true si está duplicado, false si no está duplicado
     */
    private boolean comprobarDuplicidadSocio(Socio s){
        boolean seguirBuscando = true;
        boolean socioDuplicado = true;

        for (int i = 0; i < CANT_SOCIOS && seguirBuscando; i++) {
            if( !(listaSocios[i].getNumSocio() == (s.getNumSocio()))){
                seguirBuscando = false;
                socioDuplicado = false;
            }
        }
        return socioDuplicado;
    }

}
