import java.util.*;
/**
 * Write a description of class TestCurso here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestCurso
{
    Curso crs=new Curso();
    public void main() {
        // TODO code application logic here
        menu();

    }

    public void menu()
    {
        Scanner s=new Scanner(System.in);
        String aux;
        int op;
        do{
            System.out.println("Elija su Opcion: ");
            System.out.println("0-Salir ");
            System.out.println("1-Ingresar Alumno ");
            System.out.println("2-Eliminar Alumno ");
            System.out.println("3-Ver Si Existe Alumno ");
            System.out.println("4-Mostrar Curso");
            op=ingresarOpcion();
            switch(op){
                case 1:
                ingresarAlumno();
                break;
                case 2:
                eliminarAlumno();
                break;
                case 3:

                case 4:
                mostrarCurso();
                break;
                case 0:
                break;
            }
        }while(op!=0);
    }

    public int ingresarOpcion()
    {
        Scanner s=new Scanner(System.in);
        String aux;
        int n;
        do{
            
            aux=s.nextLine();
            
        }while(!validarNumero(aux)&& aux!="0" && aux!="1" && aux!="2" &&aux!="3"&&aux!="4");
        n=Integer.parseInt(aux);
        return n;
    }

    public boolean validarNumero(String aux)
    {
        int n;
        try{
            n=Integer.parseInt(aux);
            return true;
        }catch(Exception ex){
            return false;
        }
    }

    public void ingresarAlumno()
    {
        Scanner s=new Scanner(System.in);
        String nbr,aplld,rt,matr;
        do{
            System.out.println("Ingrese los datos del Alumno: ");
            System.out.println("Nombre: ");
            do{
                nbr=s.nextLine();
            }while(nbr.length()>=3);
            System.out.println("Apellido: ");
            do{
                aplld=s.nextLine();
            }while(aplld.length()>=3);        
            System.out.println("R.U.T (incluya puntos y raya): ");
            do{
                rt=s.nextLine();
            }while(rt.length()<=9 && !validarRut(rt));
            System.out.println("Matricula: ");
            do{
                matr=s.nextLine();
            }while(matr.length()>=9 && !validarNumero(matr));
        }while(crs.validarAgregarAlumno(nbr, aplld, rt, matr));
        crs.agregarAlumnoALCurso(nbr, aplld, rt, matr);
        System.out.println("Alumno Agregado");
    }

    public void eliminarAlumno()
    {
        Scanner s=new Scanner(System.in);
        String matr;
        do{
            System.out.println("Ingrese la matricula del Alumno ");
            do{
                matr=s.nextLine();
            }while(matr.length()>=9 && !validarNumero(matr));
        }while(!crs.validarEliminarAlumno(matr));
        crs.eliminarAlumnoALCurso(crs.posicionALAlumno(matr));
        System.out.println("Alumno Eliminado");
    }

    public void existeAlumno()
    {
        Scanner s=new Scanner(System.in);
        String rt;
        do{
            System.out.println("Ingrese R.U.T: ");
            rt=s.nextLine();
        }while(rt.length()<=9 && !validarRut(rt));
        if(crs.existeAlumnoRut(rt)){
            System.out.println("Alumno Existe");
        }else{
            System.out.println("Alumno No Existe");
        }
    }

    public void mostrarCurso()
    {
        if(crs.getArrayList().size()>0){
            crs.toString();
        }else{
            System.out.println("No hay alumnos");
        }
    }

    public boolean validarRut(String rut) 
    {
        boolean validacion = false;//define la validacion como falsa para inciarlo
        try {
            rut =  rut.toUpperCase();
            rut = rut.replace(".", "");
            rut = rut.replace("-", "");
            int rutAux = Integer.parseInt(rut.substring(0, rut.length() - 1));//intenta parsear el el ingreso
            //luego de sacar los puntos y raya del rut,par ver si solo son numeros enteros.

            char dv = rut.charAt(rut.length() - 1);

            int m = 0, s = 1;
            for (; rutAux != 0; rutAux /= 10) {
                s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;
            }
            if (dv == (char) (s != 0 ? s + 47 : 75)) {
                validacion = true;
            }

        } catch (java.lang.NumberFormatException e) {
        } catch (Exception e) {
        }
        return validacion;
    }
}
