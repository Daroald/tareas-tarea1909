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

