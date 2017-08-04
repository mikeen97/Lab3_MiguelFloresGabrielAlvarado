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
    private String nombre;
    private String Extencion;
    private int integrantes;
    
    public Lugares(){
        
    }

    public Lugares(String nombre, String Extencion, int integrantes) {
        this.nombre = nombre;
        this.Extencion = Extencion;
        this.integrantes = integrantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        return "Lugares{" + "nombre=" + nombre + ", Extencion=" + Extencion + ", integrantes=" + integrantes + '}';
    }
    

    
    
}
