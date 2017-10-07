package modelo.beans;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;

@RequestScoped
@ManagedBean
public class Candidato {

    //Atributos
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int sueldoDeseado;

    public Candidato() {
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public int getSueldoDeseado() {
        return sueldoDeseado;
    }

    public void setSueldoDeseado(int sueldoDeseado) {
        this.sueldoDeseado = sueldoDeseado;
    }

    @Override
    public String toString() {
        return "Candidato{" + "nombre=" + nombre + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno + ", sueldoDeseado=" + sueldoDeseado + '}';
    }
    

           
}
