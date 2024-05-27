package ejercicios.ejercicio_1;
import ejercicios.BaseInput;
import java.util.ArrayList;
import java.util.List;

public class Habitacion extends BaseInput {     // extiende clase que contiene el input instanciado
    private int cantidadCamas;
    private boolean completa;
    private List<Paciente> pacientes = new ArrayList<>();

    public void setCantidadCamas(int cantidadCamas) {
        this.cantidadCamas = cantidadCamas;
    }

    public boolean isCompleta() {
        return pacientes.size() >= cantidadCamas;// devuelve "false" si no hay más pacientes de los establecidos
    }

    public void internarPaciente() {
        if (isCompleta()) {
            System.out.println("Error: no se puede ingresar al paciente. La habitación está completa.");
            return;
        }

        Paciente nuevoPaciente = new Paciente();
        input.nextLine();   // consume salto de línea
        System.out.print("Nombre: ");
        String nombre = input.nextLine();
        System.out.print("Apellido: ");
        String apellido = input.nextLine();
        System.out.print("DNI: ");
        long dni = input.nextLong();
        input.nextLine();
        System.out.println("¿Necesita internación? [s/n]");
        String necesitaInternacionStr = input.nextLine();
        boolean necesitaInternacion = necesitaInternacionStr.equalsIgnoreCase("s");  // si es igual a "s" devuelve true, caso contrario devuelve false

        nuevoPaciente.setNombre(nombre);
        nuevoPaciente.setApellido(apellido);
        nuevoPaciente.setDni(dni);
        nuevoPaciente.setInternado(necesitaInternacion);
        pacientes.add(nuevoPaciente);
        System.out.println("Paciente agregado con éxito.");

        if (isCompleta()) {
            System.out.println("La habitación ahora está completa.");
            completa = true;
        }
    }

    public void darAltaPaciente() {
        System.out.println("Ingrese DNI correspondiente para eliminar paciente: ");
        long dni = input.nextLong();
        Paciente pacienteAEliminar = null;

        for(Paciente paciente : pacientes) {
            if (paciente.getDni() == dni) {
                pacienteAEliminar = paciente;
                break;
            }
        }

        if (pacienteAEliminar != null) {
            pacientes.remove(pacienteAEliminar);
            System.out.println("Paciente eliminado con éxito.");
            completa = false;
        }
        else
            System.out.println("Error: no se a encontrado al paciente con el DNI: " + dni);
    }

    public void listaPacientes(){
        System.out.println("Lista de pacientes:");
        for (Paciente paciente : pacientes) {
            System.out.println(paciente.toString());
        }
    }

    public void menuHabitacion() {
        int option;
        System.out.println("Ingresar cantidad de camas para la nueva habitación.");
        cantidadCamas = input.nextInt();
        setCantidadCamas(cantidadCamas);

        do {
            System.out.println("\n----------------------");
            System.out.println("1. Agregar paciente.");
            System.out.println("2. Eliminar paciente.");
            System.out.println("3. Ver pacientes.");
            System.out.println("0. Salir.");
            System.out.println("----------------------\n");
            option = input.nextInt();

            if (option == 1) {
                internarPaciente();
            }
            else if (option == 2)
                darAltaPaciente();
            else if (option == 3)
                listaPacientes();
            else if (option == 0)
                System.out.println("Saliendo del menú...");
            else
                System.out.println("Opción no válida. Por favor, seleccione [0-3]");
        } while (option != 0);
    }
}
