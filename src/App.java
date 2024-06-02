public class App {
    public static void main(String[] args) throws Exception {
        Empleado[] empleados = new Empleado[2];

        empleados[0] = new EmpleadoTiempoCompleto("Juan Perez", "123", 48000.0);
        empleados[1] = new EmpleadoMedioTiempo("Maria López", "456", 15.0,20);

        for (Empleado empleado : empleados){
            System.out.println("Empleado: " + empleado.getNombre() + ", Salario mensual: " + empleado.calcularSalario());
        }
    }
}
