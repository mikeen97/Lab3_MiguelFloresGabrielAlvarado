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
        while (!opcion.equalsIgnoreCase("g")) {
            opcion = JOptionPane.showInputDialog("Menu\n"
                    + "a- Agregar Pueblo\n"
                    + "b- Eliminar Pueblo\n"
                    + "c- Listar Pueblos\n"
                    + "d- Modificar Pueblo\n"
                    + "e- entrar a Pueblo Especifico\n"
                    + "f- Creacion de un lugar\n"
                    + "g- Salir \n");
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
                        JOptionPane.showInputDialog("Ingrese la Posicion del lugar a modificar: "));
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

                    }
                }
            }
            if (opcion.equals("f")) {
                String opcion3 = "";
                ArrayList<Lugares> ListLugares = new ArrayList();
                while (!opcion3.equalsIgnoreCase("e")) {
                    opcion3 = JOptionPane.showInputDialog("Menu\n"
                            + "a- Agregar Lugares\n"
                            + "b- Eliminar Lugares\n"
                            + "c- Listar Lugares\n"
                            + "d- Modificar Lugares\n"
                            + "e- Salir \n");
                    if (opcion3.equals("a")) {
                        String nombre = JOptionPane.showInputDialog("Ingrese el lugar");
                        String extension = JOptionPane.showInputDialog("Ingrese la extencion");
                        int integrantes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de integrantes"));
                        ListLugares.add(new Lugares(nombre, extension, integrantes));

                    }
                    if (opcion3.equals("b")) {
                        int pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el lugar a eliminar"));
                        ListLugares.remove(pos);

                    }
                    if (opcion3.equals("c")) {
                        String p1 = "";
                        for (Lugares t1 : ListLugares) {
                            if (t1 instanceof Lugares) {
                                p1 += ListPueblos.indexOf(t1) + " " + ((Lugares) t1) + "\n";
                            }
                        }
                        JOptionPane.showMessageDialog(null, p1);
                    }
                    if (opcion.equals("d")) {
                        int pos = Integer.parseInt(
                                JOptionPane.showInputDialog("Ingrese la Posicion del lugar a modificar: "));
                           String nombre2 = JOptionPane.showInputDialog("Ingrese el lugar");
                        String extension2 = JOptionPane.showInputDialog("Ingrese la extencion");
                        int integrantes2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de integrantes"));
                        int contador = 0;
                        for (Lugares t1 : ListLugares) {
                            if (contador == pos) {
                                t1.setNombre(nombre2);
                                t1.setExtencion(extension2);
                                t1.setIntegrantes(pos);
                            }
                            contador++;
                        }
                    }
                }
            }
        }

    }
}
