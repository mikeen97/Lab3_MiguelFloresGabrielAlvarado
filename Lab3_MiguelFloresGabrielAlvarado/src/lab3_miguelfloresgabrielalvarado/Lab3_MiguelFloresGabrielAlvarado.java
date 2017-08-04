/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_miguelfloresgabrielalvarado;

import java.util.ArrayList;
import java.util.Date;
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
        while (!opcion.equalsIgnoreCase("f")) {
            opcion = JOptionPane.showInputDialog("Menu\n"
                    + "a- Agregar Pueblo\n"
                    + "b- Eliminar Pueblo\n"
                    + "c- Listar Pueblos\n"
                    + "d- Modificar Pueblo\n"
                    + "e- entrar a Pueblo Especifico\n"
                    + "f- Salir \n");
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
            if (opcion.equals("e")) {
                String p1 = "";
                for (pueblo t1 : ListPueblos) {
                    if (t1 instanceof pueblo) {
                        p1 += ListPueblos.indexOf(t1) + " " + ((pueblo) t1) + "\n";
                    }
                }
                JOptionPane.showMessageDialog(null, p1);
                String puebloActual = JOptionPane.showInputDialog("Ingrese la posicion del pueblo que desea ingresar");
                String opcion2 = "";
                while (!opcion2.equalsIgnoreCase("e")) {
                    opcion2 = JOptionPane.showInputDialog("Menu\n"
                            + "a- Agregar Integrante\n"
                            + "b- Eliminar Integrante\n"
                            + "c- Listar Integrante\n"
                            + "d- Modificar Integrante\n"
                            + "e- Salir \n");
                    if (opcion2.equals("a")) {
                        String nombre = "", apellido = "", raza = "", acompanante = "", poderAtaque = "", defensa = "", curacion = "";
                        double altura = 0;
                        Date fecha;
                        nombre = JOptionPane.showInputDialog("Ingrese nombre del integrante");
                        raza = JOptionPane.showInputDialog("Ingrese posicion la raza que desea para el integrante\n"
                                + "1) Aguilas\n"
                                + "2) Arañas\n"
                                + "3) Balrogs\n"
                                + "4) Bestias Aladas\n"
                                + "5) Dragones\n"
                                + "");
                        apellido = JOptionPane.showInputDialog("Ingrese apellido del integrante");
                        acompanante = JOptionPane.showInputDialog("Ingrese posicion del acompañante que desea para el integrante\n"
                                + "1) Aguilas\n"
                                + "2) Arañas\n"
                                + "3) Balrogs\n"
                                + "4) Bestias Aladas\n"
                                + "5) Dragones\n"
                                + "");
                        altura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura de el integrante"));
                        if (acompanante.equalsIgnoreCase("1")) {

                        }
                        if (acompanante.equalsIgnoreCase("2")) {

                        }
                        if (acompanante.equalsIgnoreCase("3")) {

                        }
                        if (acompanante.equalsIgnoreCase("4")) {

                        }
                        if (acompanante.equalsIgnoreCase("5")) {

                        }
                        if (acompanante.equalsIgnoreCase("6")) {

                        }
                        if (acompanante.equalsIgnoreCase("7")) {

                        }
                        if (acompanante.equalsIgnoreCase("8")) {

                        }
                    }
                }
            }
        }
    }
}
