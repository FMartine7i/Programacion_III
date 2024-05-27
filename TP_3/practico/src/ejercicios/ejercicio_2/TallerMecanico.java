package ejercicios.ejercicio_2;
import ejercicios.BaseInput;
import java.util.List;
import java.util.ArrayList;

public class TallerMecanico extends BaseInput {
    private List<Auto> autos;
    private List<Motor> motores;

    public TallerMecanico() {
        this.autos = new ArrayList<>();
        this.motores = new ArrayList<>();
    }

    public void agregarAuto() {
        System.out.print("Ingresar patente: ");
        String patente = input.nextLine();
        System.out.print("Ingresar marca: ");
        String marca = input.nextLine();
        System.out.print("Ingresar modelo (año): ");
        int modelo = input.nextInt();
        input.nextLine(); // Consumir el salto de línea

        System.out.print("Ingresar número de motor: ");
        int numeroMotor = input.nextInt();
        System.out.print("Ingresar kilometraje: ");
        int kilometraje = input.nextInt();
        input.nextLine();
        System.out.print("Ingresar cilindrada: ");
        int cilindrada = input.nextInt();

        Motor motor = new Motor(numeroMotor, kilometraje, cilindrada);
        Auto auto = new Auto(patente, marca, modelo, motor);

        autos.add(auto);
    }

    public void listarAutos() {
        for (Auto auto : autos) {
            System.out.println(auto.toString() + "\n-----------------------------\n");
        }
    }

    public void agregarMotor() {
        System.out.print("Ingresar número de motor: ");
        int numeroMotor = input.nextInt();
        System.out.print("Ingresar kilometraje: ");
        int kilometraje = input.nextInt();
        input.nextLine();
        System.out.print("Ingresar cilindrada: ");
        int cilindrada = input.nextInt();
        Motor motor = new Motor(numeroMotor, kilometraje, cilindrada);

        motores.add(motor);
    }

    public void listarMotores() {
        for (Motor motor : motores) {
            System.out.println(motor.toString() + "\n-----------------------------\n");
        }
    }

    public void menuTaller() {
        int option;

        do {
            System.out.println("\n----------------------");
            System.out.println("1. Agregar auto.");
            System.out.println("2. Agregar motor.");
            System.out.println("3. Ver autos.");
            System.out.println("4. Ver motores.");
            System.out.println("0. Salir.");
            System.out.println("----------------------\n");
            option = input.nextInt();
            input.nextLine(); // Consumir el salto de línea

            switch (option) {
                case 1:
                    agregarAuto();
                    break;
                case 2:
                    agregarMotor();
                    break;
                case 3:
                    listarAutos();
                    break;
                case 4:
                    listarMotores();
                    break;
                case 0:
                    System.out.println("Saliendo del menú...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione [0-4]");
                    break;
            }
        } while (option != 0);
    }
}
