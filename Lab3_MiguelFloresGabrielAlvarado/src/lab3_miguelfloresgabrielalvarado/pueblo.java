/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_miguelfloresgabrielalvarado;

import java.util.ArrayList;

/**
 *
 * @author Miguel Flores
 */
public class pueblo {

    ArrayList<Integrantes> ListIntegrantes = new ArrayList();
    private String nombre;

    public pueblo() {
    }

    public pueblo(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integrantes> getListIntegrantes() {
        return ListIntegrantes;
    }

    public void setListIntegrantes(ArrayList<Integrantes> ListIntegrantes) {
        this.ListIntegrantes = ListIntegrantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
