/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamenIIParcialCC;

/**
 *
 * @author Carlitos Chávez.
 */
public class PacienteCC extends PersonaCC {
    private Integer NroHistorialCC;
    private String EnfermedadCC;

    public PacienteCC(Integer NroHistorialCC, String EnfermedadCC, String NombreCC, Integer EdadCC, String DireccionCC) {
        super(NombreCC, EdadCC, DireccionCC);
        this.NroHistorialCC = NroHistorialCC;
        this.EnfermedadCC = EnfermedadCC;
    }

    public Integer getNroHistorialCC() {
        return NroHistorialCC;
    }

    public void setNroHistorialCC(Integer NroHistorialCC) {
        this.NroHistorialCC = NroHistorialCC;
    }

    public String getEnfermedadCC() {
        return EnfermedadCC;
    }

    public void setEnfermedadCC(String EnfermedadCC) {
        this.EnfermedadCC = EnfermedadCC;
    }
    
    
}
