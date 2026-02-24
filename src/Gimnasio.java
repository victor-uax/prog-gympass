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
     * Este
     * @param s
     * @return
     */
    private boolean registrarSocio(Socio s){
        int posicionLibre;

        posicionLibre = devolverPosicionLibreSocios();

        if(posicionLibre != -1){
            listaSocios[posicionLibre] = s;
        }
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
    private boolean comprobarDuplicidadSocio(Socio s){
        boolean seguirBuscando = true;
        boolean socioDuplicado = false;

        for (int i = 0; i < CANT_SOCIOS && seguirBuscando; i++) {
            if( listaSocios[i].getNumSocio()equals  == null){}
        }
    }

}
