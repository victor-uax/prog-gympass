public class Gimnasio {

    private String codigo;
    private String nombre;
    private Socio[] listaSocios;
    private Sala[] listaSalas;
    private int responsableId;
    private int contadorSocios;

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

        if(posicionLibre != -1 && comprobarDuplicidadSocio(s) != -1){
            listaSocios[posicionLibre] = s;
            socioRegistrado = true;
        }
        return socioRegistrado;
    }
+

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

    /*
    private int buscarSocio(int numeroSocio){
         boolean seguirBuscando = true;
         int posicionSocioEncontrado = -1;
         //int numeroDeSocio;

        for (int i = 0; i < CANT_SOCIOS && seguirBuscando; i++) {
            if(numeroSocio == listaSocios[i].getNumSocio()){
                posicionSocioEncontrado = i;
                seguirBuscando = false;
            }
        }
        return posicionSocioEncontrado;
    }
    */

    /**
     * Comprueba que el código del Socio s no esté duplicado en el array listaSocios
     * @param
     * @return true si está duplicado, false si no está duplicado
     */
    private int comprobarDuplicidadSocio(Socio s){
        boolean seguirBuscando = true;
        int posicionSocioDuplicado = -1;

        for (int i = 0; i < CANT_SOCIOS && seguirBuscando; i++) {
            if( !(listaSocios[i].getNumSocio() == (s.getNumSocio()))){
                seguirBuscando = false;
                posicionSocioDuplicado = i;
            }
        }
        return  posicionSocioDuplicado;
    }

    private int buscarSocioPorNumero(int numeroSocio){
        boolean seguirBuscando = true;
        int posicionSocioDuplicado = -1;

        for (int i = 0; i < CANT_SOCIOS && seguirBuscando; i++) {
            if( !(listaSocios[i].getNumSocio() == numeroSocio){
                seguirBuscando = false;
                posicionSocioDuplicado = i;
            }
        }
        return  posicionSocioDuplicado;
    }


    private Socio expulsarSocio(int numeroSocio){
        Socio socioExpulsado = null;

        for (int i; i < CANT_SOCIOS; i++) {
            if (buscarSocioPorNumero(numeroSocio) == -1) {

            }
        }

    }
}
