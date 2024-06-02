abstract class Empleado {

    private String nombre;
    private String numeroIdentificacion; 
    private String sexo;
    private String departamento;
    private String correo;

    private int edad;
    private int telefono;

    public Empleado(String nombre, String numeroIdentificacion, String sexo, String departamento, String correo, int edad, int telefono){
        this.nombre = nombre;
        this.numeroIdentificacion = numeroIdentificacion;
        this.sexo = sexo;
        this.departamento = departamento;
        this.correo = correo;
        this.edad = edad;
        this.telefono = telefono;
    }

    public String getNombre(){
        return nombre;
    }

    public String getnumeroIdentificacion(){
        return numeroIdentificacion;
    }

    public String getsexo(){
        return sexo;
    }

    public String getdepartamento(){
        return departamento;
    }

    public String getcorreo(){
        return correo;
    }

    public int getedad(){
        return edad;
    }

    public int gettelefono(){
        return telefono;
    }


    //Método abstracto
    public abstract double calcularSalario();

}
