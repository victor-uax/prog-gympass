public class Main {
    public static void main(String[] args) {

        Socio socio1 = new Socio(1,"Antony");
        Socio socio2 = new Socio(2,"Mortadelo");

        Sala sala1 = new Sala(1,"Aquí es donde los astronautas van a la luna");
        Sala sala2 = new Sala(2,"Sala solo accesible para ganadores de un hackaton");

        System.out.println(socio1.toString());
        System.out.println(socio2.toString());

        System.out.println(sala1.toString());
        System.out.println(sala2.toString());
    }
}