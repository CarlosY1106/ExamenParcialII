/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamenIIParcialCC;

/**
 *
 * @author Carlitos Chávez.
 */
public class MedicoCC extends PersonaCC {
    private String EspecialidadCC;
    private Integer AniosExperienciaCC;

    public MedicoCC(String EspecialidadCC, Integer AniosExperienciaCC, String NombreCC, Integer EdadCC, String DireccionCC) {
        super(NombreCC, EdadCC, DireccionCC);
        this.EspecialidadCC = EspecialidadCC;
        this.AniosExperienciaCC = AniosExperienciaCC;
    }

    public String getEspecialidadCC() {
        return EspecialidadCC;
    }

    public void setEspecialidadCC(String EspecialidadCC) {
        this.EspecialidadCC = EspecialidadCC;
    }

    public Integer getAniosExperienciaCC() {
        return AniosExperienciaCC;
    }

    public void setAniosExperienciaCC(Integer AniosExperienciaCC) {
        this.AniosExperienciaCC = AniosExperienciaCC;
    }
    
     public void MostrarDatosCC (){
        
    } 
}
