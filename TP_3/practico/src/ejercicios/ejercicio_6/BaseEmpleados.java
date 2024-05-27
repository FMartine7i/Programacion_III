package ejercicios.ejercicio_6;
import ejercicios.BaseInput;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BaseEmpleados extends BaseInput {
    private List<Empleado> empleados;
    private int id;

    public BaseEmpleados() {
        this.empleados = new ArrayList<>();
        this.id = 1;
    }

    public void agregarEmpleado() {
        input.nextLine();
        System.out.println("Nombre: ");
        String nombre = input.nextLine();
        System.out.println("Apellido: ");
        String apellido = input.nextLine();
        System.out.println("Edad: ");
        int edad = input.nextInt();
        System.out.print("\nFecha de ingreso [Formato YYYY-MM-dd]: ");
        input.nextLine();
        LocalDate fechaDeIngreso = strToLocal(input.nextLine());
        System.out.println("Sueldo: ");
        double sueldo = Double.parseDouble(input.nextLine());

        String opcion;
        do {
            System.out.println("Seleccione administrativo(A), operario maesranza(O) o vendedor(V)");
            opcion = input.nextLine();

            if (opcion.equalsIgnoreCase("A")) {
                Empleado administrativo = new Administrativo();
                administrativo.setId(id);
                administrativo.setNombre(nombre);
                administrativo.setApellido(apellido);
                administrativo.setEdad(edad);
                administrativo.setFechaIngreso(fechaDeIngreso);
                administrativo.setSueldo(sueldo);
                empleados.add(administrativo);
            }
            else if (opcion.equalsIgnoreCase("O")) {
                Empleado operario = new OperarioMaestranza();
                operario.setId(id);
                operario.setNombre(nombre);
                operario.setApellido(apellido);
                operario.setEdad(edad);
                operario.setFechaIngreso(fechaDeIngreso);
                operario.setSueldo(sueldo);
                empleados.add(operario);
            }
            else if (opcion.equalsIgnoreCase("V")) {
                Empleado vendedor = new Vendedor();
                vendedor.setId(id);
                vendedor.setNombre(nombre);
                vendedor.setApellido(apellido);
                vendedor.setEdad(edad);
                vendedor.setFechaIngreso(fechaDeIngreso);
                vendedor.setSueldo(sueldo);
                empleados.add(vendedor);
            }

        } while (!opcion.equalsIgnoreCase("A") && !opcion.equalsIgnoreCase("O") && !opcion.equalsIgnoreCase("V"));
        this.id++;
    }

    public Empleado buscarEmpleado(int id) {
        Empleado empleadoEncontrado = null;
        for (Empleado empleado : empleados) {
            if (id == empleado.getId()) {
                empleadoEncontrado = empleado;
                break;
            }
        }
        return empleadoEncontrado;
    }

    public void eliminarEmpleado(int id) {
        if (buscarEmpleado(id) != null)
            empleados.remove(buscarEmpleado(id));
        else
            System.out.println("Error: empleado con id "+ id + " no encontrado.");
    }

    public void mostrarEmpleados() {
        for (Empleado empleado : empleados){
            System.out.println("\n------------------------------------\nID: " + empleado.getId() +
                    "\nNombre: " + empleado.getNombre() +
                    "\nApellido: " + empleado.getApellido() +
                    "\nEdad: " + empleado.getEdad() +
                    "\nFecha de ingreso: " + empleado.getFechaIngreso() +
                    "\nSueldo: " + empleado.getSueldo() +
                    "\n-------------------------------------\n");
        }
    }

    public void mostrarEmpleadoPorNombre(String nombre) {
        Empleado empleadoEncontrado = null;
        for (Empleado empleado : empleados) {
            if (empleado.getNombre().equalsIgnoreCase(nombre)) {
                empleadoEncontrado = empleado;
                break;
            }
        }

        if (empleadoEncontrado != null) {
            System.out.println("\n------------------------------------\nNombre: " + empleadoEncontrado.getNombre() +
                    "\nApellido: " + empleadoEncontrado.getApellido() +
                    "\nEdad: " + empleadoEncontrado.getEdad() +
                    "\nFecha de ingreso: " + empleadoEncontrado.getFechaIngreso() +
                    "\nSueldo: " + empleadoEncontrado.getSueldo() +
                    "\n-------------------------------------\n");
        }
        else
            System.out.println("Error: empleado con el nombre "+ nombre + " no encontrado.");
    }

    public void cantidadEmpleados() {
        System.out.println("\nCantidad empleados: " + empleados.size() + "\n");
    }

    public void mostrarEmpleadosPorTipo(String tipo) {
        // System.out.println("Seleccione tipo [Aministrativo(A)-Vendedor(V)-Operario(O)]");
        for (Empleado empleado : empleados) {
            switch (tipo.toUpperCase()) {
                case "A":
                    if (empleado instanceof Administrativo)
                        System.out.println(empleado.getNombre() + " " + empleado.getApellido());
                    break;
                case "O":
                    if (empleado instanceof OperarioMaestranza)
                        System.out.println(empleado.getNombre() + " " + empleado.getApellido());
                    break;
                case "V":
                    if (empleado instanceof Vendedor)
                        System.out.println(empleado.getNombre() + " " + empleado.getApellido());
                    break;
                default:
                    System.out.println("Error: tipo de empleado no reconocido. Por favor, seleccione [A-V-O]");
            }
        }
    }

    // convertir entrada String a LocalDate
    private LocalDate strToLocal(String fechaStr) {
        boolean fechaValida = false;

        while (!fechaValida) {
            try {
                fechaValida = true;
                return LocalDate.parse(fechaStr);
            }
            catch (Exception e) {
                System.out.println("Formato de fecha inválido. Ingrese la fecha en formato YYYY-MM-dd:");
            }
        }
        return null;
    }
}
