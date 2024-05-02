import clases.*;

public  class Main {

    public static void main(String[] args){
        Persona persona = new Persona("Roberto", "Carlos", 1523458);
        Persona funcionario = new Funcionario("Javier", "Milei", 19688846, Poder.EJECUTIVO);
        Persona legislador = new Legislador("Marcela", "Pagano", 361231, Poder.LEGISLATIVO, "Buenos Aires");
        Persona juez = new Juez("Pepe", "Sánchez", 9486423, Poder.JUDICIAL, "Buenos Aires", Jurisdiccion.NACIONAL);

        System.out.println(persona);
        System.out.println("\n" + funcionario);
        System.out.println("\n" + legislador);
        System.out.println("\n" + juez);
    }
}
