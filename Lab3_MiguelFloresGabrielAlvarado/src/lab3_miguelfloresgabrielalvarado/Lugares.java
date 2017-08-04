/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_miguelfloresgabrielalvarado;

/**
 *
 * @author Gabriel Alvarado
 */
public class Lugares {
    private String Extencion;
    private int integrantes;
    
    public Lugares(){
        
    }

    public Lugares(String Extencion, int integrantes) {
        this.Extencion = Extencion;
        this.integrantes = integrantes;
    }

    public String getExtencion() {
        return Extencion;
    }

    public void setExtencion(String Extencion) {
        this.Extencion = Extencion;
    }

    public int getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(int integrantes) {
        this.integrantes = integrantes;
    }

    @Override
    public String toString() {
        return "Lugares{" + "Extencion=" + Extencion + ", integrantes=" + integrantes + '}';
    }
    
    
}
