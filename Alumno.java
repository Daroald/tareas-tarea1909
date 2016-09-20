import java.util.*;
/**
 * Write a description of class Alumno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alumno
{
    // instance variables - replace the example below with your own
    private String nombre;
    private String apellido;
    private String rut;
    private String matricula;

    public Alumno()
    {
        nombre="";
        apellido="";
        rut="";
        matricula="";
    }

    public Alumno(String nbr,String aplld,String rt,String matr)
    {
        nombre=nbr;
        apellido=aplld;
        rut=rt;
        matricula=matr;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nbr)
    {
        nombre=nbr;
    }

    public String getApellido()
    {
        return apellido;
    }

    public void setApellido(String apll)
    {
        apellido=apll;
    }

    public String getRut()
    {
        return rut;
    }

    public void setRut(String rt)
    {
        rut=rt;
    }

    public String getMatricula()
    {
        return matricula;
    }

    public void setMatricula(String matr)
    {
        matricula=matr;
    }

    public String toString()
    {
        String str="El Alumno se llama "+nombre+" "+apellido+" su rut es "+rut+" y su matricula es "+matricula;
        return str;
    }

}

