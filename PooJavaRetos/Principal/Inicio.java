package Principal;
import java.util.Scanner;
import Salud.Persona;
import Salud.empleado;

public class Inicio 
{
    public static void main(String[] args) 
    {
        int eleccion1 = 0;
        int eleccion2 = 0;
        double respuesta = 0;
        
        Scanner lector = new Scanner(System.in);
        Persona mPersona = new Persona();
        empleado mEmpleado= new empleado();
            
        mPersona.pedirDatos();
        mEmpleado.datosHonorario();
        do
        {
            System.out.println("Digite el numero segun la opcion: \n1) Mostrar Datos \n2) Calacular IMC \n3) Verificacion de Mayoria de edad " + 
                "\n4) Calcular el Honorario del empleado \n5)Para mostrar Datos del empleado");
                eleccion1 = lector.nextInt();

            switch (eleccion1) 
            {
                case 1:
                    mPersona.mostrarPersona();
                    break;
                case 2:
                    respuesta = mPersona.calcularImc();

                    if (respuesta < 20) 
                    {
                        System.out.println("el peso está por debajo de lo ideal");
                    }
                    else if(respuesta == 20 )
                    {
                        System.out.println("el peso es ideal");
                    } 

                    else if (respuesta <=25)
                    {
                        System.out.println("el peso es ideal");
                    }
                    
                    if (respuesta > 25) 
                    {
                        System.out.println("Tiene sobrepeso");
                    }

                    System.out.println(respuesta);
                    break;
                case 3: 
                    mPersona.mayorEdad();
                    break;
                case 4:
                    mEmpleado.calcularHonorarios(mEmpleado.getValorHora(),mEmpleado.getHorasTrabajadas());
                    break;
                case 5:
                    mEmpleado.mostrarEmpleado(mEmpleado.getCargo(),mEmpleado.getValorHora(),mEmpleado.getHorasTrabajadas(),mEmpleado.getDepartamento());
                    break;
            }
            System.out.println("digite 5 para seguir de lo contrario digite cualquier otro numero");
            eleccion2 = lector.nextInt();

        } while (eleccion2==5);
         System.out.println("usted ha salido del sistema");
lector.close();
   }
}
