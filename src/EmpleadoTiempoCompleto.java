//clase
public class EmpleadoTiempoCompleto extends Empleado 
{
    private double salarioAnual;

//constructor
    public EmpleadoTiempoCompleto(String nombre, String numeroIdentificacion, double salarioAnual)
    {
        super(nombre, numeroIdentificacion);
        this.salarioAnual = salarioAnual;
    }

@Override
public double calcularSalario(){
    return salarioAnual / 12; //Salario mensual
}
}

