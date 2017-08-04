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
public class Balrogs extends Bestias {
    private String latigo;

    public Balrogs() {
        super();
    }

    public Balrogs(String latigo) {
        this.latigo = latigo;
    }

    public String getLatigo() {
        return latigo;
    }

    public void setLatigo(String latigo) {
        this.latigo = latigo;
    }
    

    public Balrogs(String latigo, int Guarras, String veneno, int vida, int curacion, int Ataque) {
        super(Guarras, veneno, vida, curacion, Ataque);
        this.latigo = latigo;
    }

    @Override
    public String toString() {
        return "Balrogs{" + "latigo=" + latigo + '}';
    }
    
}
