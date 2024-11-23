/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamenIIParcialCC;

/**
 *
 * @author Carlitos Chávez.
 */
public class PersonaCC {
    private String NombreCC;
    private Integer EdadCC;
    private String DireccionCC;

    public PersonaCC(String NombreCC, Integer EdadCC, String DireccionCC) {
        this.NombreCC = NombreCC;
        this.EdadCC = EdadCC;
        this.DireccionCC = DireccionCC;
    }

    public String getNombreCC() {
        return NombreCC;
    }

    public void setNombreCC(String NombreCC) {
        this.NombreCC = NombreCC;
    }

    public Integer getEdadCC() {
        return EdadCC;
    }

    public void setEdadCC(Integer EdadCC) {
        this.EdadCC = EdadCC;
    }

    public String getDireccionCC() {
        return DireccionCC;
    }

    public void setDireccionCC(String DireccionCC) {
        this.DireccionCC = DireccionCC;
    }
    
    public void MostrarInformacionCC (){
        
    } 
}
