/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_miguelfloresgabrielalvarado;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel Flores
 */
public class Lab3_MiguelFloresGabrielAlvarado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<pueblo> ListPueblos = new ArrayList();
        String opcion = "";
        while (!opcion.equalsIgnoreCase("e")) {
            opcion = JOptionPane.showInputDialog("Menu\n"
                    + "a- Agregar Pueblo\n"
                    + "b- Eliminar Pueblo\n"
                    + "c- Listar Pueblos\n"
                    + "d- Modificar Pueblo\n"
                    + "e- Salir \n");
            if (opcion.equals("a")) {
                String name_pueblo = JOptionPane.showInputDialog("Ingrese el nombre del pueblo");
                ListPueblos.add(new pueblo(name_pueblo));
            }
            if (opcion.equals("b")) {
                int p = Integer.parseInt(
                        JOptionPane.showInputDialog("Posicion de Pueblo a Eliminar"));
                ListPueblos.remove(p);
            }
            if (opcion.equals("c")) {
                String p1 = "";
                for (pueblo t1 : ListPueblos) {
                    if (t1 instanceof pueblo) {
                        p1 += ListPueblos.indexOf(t1) + " " + ((pueblo) t1) + "\n";
                    }
                }
                JOptionPane.showMessageDialog(null, p1);
            }
            if (opcion.equals("d")) {
                int pos = Integer.parseInt(
                        JOptionPane.showInputDialog("Ingrese la Posicion del Soldado a modificar: "));
                String name_pueblo = JOptionPane.showInputDialog("Ingrese nombre del pueblo");
                int contador = 0;
                for (pueblo t1 : ListPueblos) {
                    if (contador == pos) {
                        t1.setNombre(name_pueblo);
                    }
                    contador++;
                }
            }
        }
    }
}
