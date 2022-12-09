package Salud;
import java.util.Scanner;

public class Persona
{
    private String tipoDoc,nombre,apellido,sexo;
    private int documento, edad;
    private float peso,estatura;

    public Persona() {}
    
    public Persona(String tipoDoc, String nombre, String apellido, String sexo, int documento, int edad, float peso,
            float estatura) {
        this.tipoDoc = tipoDoc;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.documento = documento;
        this.edad = edad;
        this.peso = peso;
        this.estatura = estatura;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }
    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getDocumento() {
        return documento;
    }
    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getEstatura() {
        return estatura;
    }
    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    Scanner Leer =new Scanner(System.in);

    public void pedirDatos()
    {
        System.out.println("INGRESE LOS DATOS QUE SOLICITAN");
        System.out.println("Ingrese su Tipo de Documento:");
        setTipoDoc(Leer.next());
        System.out.println("Ingrese su Numero de Documento:");
        setDocumento(Leer.nextInt());
        System.out.println("Ingrese su Nombre:");
        setNombre(Leer.next());
        System.out.println("Ingrese su Apellido:");
        setApellido(Leer.next());
        System.out.println("Ingrese su Peso:");
        setPeso(Leer.nextFloat());
        System.out.println("Ingrese su Estatura:");
        setEstatura(Leer.nextFloat());
        System.out.println("Ingrese su Edad:");
        setEdad(Leer.nextInt());
        System.out.println("Ingrese su Sexo:");
        setSexo(Leer.next());
    }

    public void mostrarPersona()
    {
        System.out.println("-----------");
        System.out.println(getTipoDoc());
        System.out.println("-----------");
        System.out.println(getDocumento());
        System.out.println("-----------");
        System.out.println(getNombre());
        System.out.println("-----------");
        System.out.println(getApellido());
        System.out.println("-----------");
        System.out.println(getPeso());
        System.out.println("-----------");
        System.out.println(getEstatura());
        System.out.println("-----------");
        System.out.println(getEdad());
        System.out.println("-----------");
        System.out.println(getSexo());
        System.out.println("-----------");
    }

    public double calcularImc()
    {
        double pesoActual = peso / (Math.pow(estatura,2)); 
        return pesoActual;
    }

    public void mayorEdad()
    {
        if (edad >= 18 ) 
        {
            System.out.println("Usted es mayor de Edad");   
        } 
        else if (edad < 18) 
        {
            System.out.println("Usted es menor de Edad");
        }
    }
}
