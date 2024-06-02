public class App {
    public static void main(String[] args) throws Exception {
        Empleado[] empleados = new Empleado[2];

        empleados[0] = new EmpleadoTiempoCompleto("Juan Perez", "123", "Masculino", "Granada", "123@gmail.com", 34, 56328475, 48000.0);
        empleados[1] = new EmpleadoMedioTiempo("Maria López", "456", "Femenino", "Masaya", "456@gmail.com", 28, 32856941, 15.0, 20);

        for (Empleado empleado : empleados){
            System.out.println("Empleado: " + empleado.getNombre() + ", Identificacion: " + empleado.getnumeroIdentificacion() + ", Sexo: " + empleado.getsexo() + ", Departamento: " + empleado.getdepartamento() + ", Correo: " + empleado.getcorreo() + ", Edad: " + empleado.getedad() + ", Telefono: " + empleado.gettelefono() + ", Salario mensual: " + empleado.calcularSalario());
        }
    }
}
