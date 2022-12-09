package Salud;

public class empleado extends Persona 
{
    private String cargo;
    private double valorHora;
    private int horasTrabajadas;
    private String departamento;

    public empleado() {}

    public empleado(String tipoDoc, String nombre, String apellido, String sexo, int documento, int edad, Float peso, 
    float estatura, String cargo, double valorHora, int horasTrabajadas, String departamento) 
    {
        super(tipoDoc, nombre, apellido, sexo, documento, edad, peso, estatura);
        this.cargo = cargo;
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
        this.departamento = departamento;
    }

    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getValorHora() {
        return valorHora;
    }
    public void setValorHora(int valorHora) {
        this.valorHora = valorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }
    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    public void datosHonorario()
    {
        System.out.println("Ingrese el cargo del empleado");
        setCargo((Leer.nextLine()));
        System.out.println("Ingrese el valor por hora:");
        setValorHora(Leer.nextInt());
        System.out.println("Ingrese las horas trabajadas:");
        setHorasTrabajadas(Leer.nextInt());
        System.out.println("Ingrese el departamento al que pertenece el empleado:");
        setDepartamento(Leer.next());
    }
    
    public void calcularHonorarios(double horasTrabajadas, int valorHora) 
    {
        double valorTotal;
        valorTotal= (getValorHora() * getHorasTrabajadas())-0.966;
        System.out.println("El honorario es:" + valorTotal);
        System.out.println("-----------");   
    }

    public void mostrarEmpleado(String cargo, double valorHora, int horasTrabajadas, String departamento) 
    {
        System.out.println("el tipo del documento del empleado es:" + getTipoDoc());
        System.out.println("-----------");
        System.out.println("el documento del empleado es:" + getDocumento());
        System.out.println("-----------");
        System.out.println("el nombre del empleado es:" + getNombre());
        System.out.println("-----------");
        System.out.println("el apellido del empleado es:" + getApellido());
        System.out.println("-----------");
        
        System.out.println("el cargo del empleado es:" + getCargo());
        System.out.println("-----------");
        System.out.println("el valor por hora del empleado es:" + getValorHora());
        System.out.println("-----------");
        System.out.println("Las horas trabajadas del empleado son: " + getHorasTrabajadas());
        System.out.println("-----------");
        System.out.println("El departamento al que pertenece el empleado es: " + getDepartamento());
        System.out.println("-----------");
    }
}
