import java.util.*;
public class Curso
{
    // instance variables - replace the example below with your own
    private String nombre;
    private ArrayList<Alumno> curso;
    private Iterator<Alumno> itc;
    /**
     * Constructor for objects of class Curso
     */
    public Curso(String nbr)
    {
        nombre=nbr;
        curso=new ArrayList<Alumno>();
        itc= curso.iterator();
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nbr)
    {
        nombre=nbr;
    }

    public ArrayList<Alumno> getArrayList(){
        return curso;
    }

    public void setArrayList(ArrayList<Alumno> arr){
        curso=arr;
    }

    public void agregarAlumnoALCurso(String nbr,String aplld,String rt,String matr)
    {
        curso.add(new Alumno(nbr,aplld,rt,matr));
    }

    public void eliminarAlumnoALCurso(int pos)
    {
        curso.remove(pos);
    }

    public String toString()
    {
        String elemento = "El curso tiene "+curso.size()+" alumnos y estos son: ";
        while(itc.hasNext()){
            elemento=elemento+"Alumno "+itc.next().getNombre()+" "+itc.next().getApellido()+
            " rut "+itc.next().getRut()+" matricula "+itc.next().getMatricula()+" / ";

        }
        elemento=elemento+"\b";
        return elemento;
    }

    public boolean validarAgregarAlumno(String nbr,String aplld,String rt,String matr)
    {
        boolean b=false;
        while(itc.hasNext()){//revisa el ArrayList mientras hayan elementos u objetos
            if(itc.next().getNombre()==nbr && itc.next().getApellido()==aplld && 
            itc.next().getRut()==rt && itc.next().getMatricula()==matr){
                b=true;//si encuentra la coincidencia el indicador se vuelve verdadero.
            }
        }
        return b;
    }

    public boolean validarEliminarAlumno(String matr)
    {
        boolean b=false;
        while(itc.hasNext()){
            if(itc.next().getMatricula()==matr){
                b= true;  //si se encuentra un alumno con esa matricula, 
                //se indica verdadero
            }
        }
        return b;
    }

    public boolean existeAlumnoRut(String rt)
    {
        boolean b=false;
        while(itc.hasNext()){
            if(itc.next().getRut()==rt){
                b=true;//si encuentra el alumno con ese rut,se asigna verdadero
                //al indicador
            }
        }
        return b;
    }

    public int posicionALAlumno(String nbr,String aplld,String rt,String matr)
    {
        int n=0;
        while(itc.hasNext()){//revisa el ArrayList mientras hayan elementos u objetos
            if(itc.next().getNombre()==nbr && itc.next().getApellido()==aplld && 
            itc.next().getRut()==rt && itc.next().getMatricula()==matr){
                n=curso.indexOf(itc.next());//devuelve posicion
                
            }
        }
        return n;
    }
}
