public class EmpleadoMedioTiempo extends Empleado {

    private double salarioPorHora;
    private int horasTrabajadasPorSemana;

    public EmpleadoMedioTiempo(String nombre, String numeroIdentificacion, String sexo, String departamento, String correo, int edad, int telefono, double salarioPorHora, int horasTrabajadasPorSemana){
        super(nombre, numeroIdentificacion, sexo, departamento, correo, edad, telefono);
        this.salarioPorHora = salarioPorHora;
        this.horasTrabajadasPorSemana = horasTrabajadasPorSemana;
    }

    @Override
    public double calcularSalario(){
        return salarioPorHora * horasTrabajadasPorSemana * 4;//Salario Mensual
    }
}
