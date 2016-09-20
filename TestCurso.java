import java.util.*;
/**
 * Write a description of class TestCurso here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestCurso
{
    public static void main(String[] args) {
        // TODO code application logic here
        
        
    }
    
    public static void menu()
    {
        Scanner s=new Scanner(System.in);
        String aux;
        int op;
        do{
            System.out.println("Elija su Opcion: ");
            System.out.println("0-Salir ");
            System.out.println("1-Ingresar Alumno ");
            System.out.println("2-Eliminar Alumno ");
            op=ingresarOpcion();
            switch(op){
                case 1:
                    break;
                case 2:
                    break;
                case 0:
                    break;
                }
        }while(op!=0);
    }
    
    public static int ingresarOpcion()
    {
        Scanner s=new Scanner(System.in);
        String aux;
        int n;
        do{
           aux=s.nextLine();
        }while(!validarOpcion(aux)&& Integer.parseInt(aux)!=0 || Integer.parseInt(aux)!=1 ||
        Integer.parseInt(aux)!=2);
        n=Integer.parseInt(aux);
        return n;
    }
    
    public static boolean validarOpcion(String aux)
    {
        int n;
        try{
            n=Integer.parseInt(aux);
            return true;
        }catch(Exception ex){
            return false;
        }
    }
    
    public static void ingresarAlumno()
    {
        Scanner s=new Scanner(System.in);
        String aux;
        System.out.println("Ingrese los datos del Alumno: ");
        
    }
    
    public static void eliminarAlumno()
    {
        Scanner s=new Scanner(System.in);
        String aux;
        System.out.println("Ingrese la matricula del Alumno ");
    }
}
