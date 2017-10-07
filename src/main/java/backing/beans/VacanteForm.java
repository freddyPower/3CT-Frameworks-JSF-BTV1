
package backing.beans;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import modelo.beans.Candidato;

/**
 *
 * @author lsanchez
 */
@ManagedBean
@RequestScoped
public class VacanteForm {

    @ManagedProperty(value="#{candidato}")
    private Candidato candidato;

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }
    
    public String enviar(){
        
        System.out.println("enviar() Nombre: "  + this.candidato.getNombre());
        System.out.println("Apellido Paterno: " + this.candidato.getApellidoPaterno());
        System.out.println("Apellido Materno: " + this.candidato.getApellidoMaterno());
        System.out.println("Sueldo deseado: " + this.candidato.getSueldoDeseado());
        
        if( this.candidato.getNombre().equals("Fred") ) {
            return "exito";
        }else{
            return "fallo";
        }
    }
    
    public VacanteForm() {
    }
    
}
