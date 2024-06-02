//clase
public class EmpleadoTiempoCompleto extends Empleado 
{
    private double salarioAnual;

//constructor
    public EmpleadoTiempoCompleto(String nombre, String numeroIdentificacion, String sexo, String departamento, String correo, int edad, int telefono, double salarioAnual)
    {
        super(nombre, numeroIdentificacion, sexo, departamento, correo, edad, telefono);
        this.salarioAnual = salarioAnual;
    }

@Override
public double calcularSalario(){
    return salarioAnual / 12; //Salario mensual
}
}

