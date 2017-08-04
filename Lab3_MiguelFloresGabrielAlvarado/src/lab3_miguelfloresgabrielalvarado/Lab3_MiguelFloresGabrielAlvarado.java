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
                int puebloActual = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion del pueblo que desea ingresar"));
                String opcion2 = "";
                while (!opcion2.equalsIgnoreCase("e")) {
                    opcion2 = JOptionPane.showInputDialog("Menu\n"
                            + "a- Agregar Integrante\n"
                            + "b- Eliminar Integrante\n"
                            + "c- Listar Integrante\n"
                            + "d- Modificar Integrante\n"
                            + "e- Salir \n");
                    if (opcion2.equals("a")) {
                        String nombre = "", apellido = "", raza = "", acompanante = "";
                        int poderAtaque = 0, defensa = 0, curacion = 0;
                        double altura = 0;
                        Date fecha = null;
                        nombre = JOptionPane.showInputDialog("Ingrese nombre del integrante");
                        raza = JOptionPane.showInputDialog("Ingrese posicion la raza que desea para el integrante\n"
                                + "1) elfos\n"
                                + "2) Enanos\n"
                                + "3) Hobbits\n"
                                + "4) Hombres\n"
                                + "5) Maimar\n"
                                + "");
                        apellido = JOptionPane.showInputDialog("Ingrese apellido del integrante");
                        acompanante = JOptionPane.showInputDialog("Ingrese posicion del acompañante que desea para el integrante\n"
                                + "1) Aguilas\n"
                                + "2) Arañas\n"
                                + "3) Balrogs\n"
                                + "4) Bestias Aladas\n"
                                + "5) Dragones\n"
                                + "");
                        altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura de el integrante"));
                        if (raza.equalsIgnoreCase("1")) {
                            raza = "elfos";
                            poderAtaque = 443;
                            defensa = 150;
                            curacion = 335;
                            String arma = JOptionPane.showInputDialog("Ingrese arma del Elfo si/no (Ingrese si o no)");
                            if (acompanante.equalsIgnoreCase("1")) {
                                acompanante = "Aguilas";
                                int contador = 0;
                                for (pueblo t1 : ListPueblos) {
                                    if (puebloActual == contador) {
                                        elfos m = new elfos(arma, raza, nombre, apellido, altura, fecha, acompanante, poderAtaque, defensa, curacion);
                                        t1.setListIntegrantes((Integrantes) m);
                                    }
                                    contador++;
                                }
                            }
                            if (acompanante.equalsIgnoreCase("2")) {
                                acompanante = "Aranas";
                                int contador = 0;
                                for (pueblo t1 : ListPueblos) {
                                    if (puebloActual == contador) {
                                        elfos m = new elfos(arma, raza, nombre, apellido, altura, fecha, acompanante, poderAtaque, defensa, curacion);
                                        t1.setListIntegrantes((Integrantes) m);
                                    }
                                    contador++;
                                }
                            }
                            if (acompanante.equalsIgnoreCase("3")) {
                                acompanante = "Balrogs";
                                int contador = 0;
                                for (pueblo t1 : ListPueblos) {
                                    if (puebloActual == contador) {
                                        elfos m = new elfos(arma, raza, nombre, apellido, altura, fecha, acompanante, poderAtaque, defensa, curacion);
                                        t1.setListIntegrantes((Integrantes) m);
                                    }
                                    contador++;
                                }
                            }
                            if (acompanante.equalsIgnoreCase("4")) {
                                acompanante = "Bestias Aladas";
                                int contador = 0;
                                for (pueblo t1 : ListPueblos) {
                                    if (puebloActual == contador) {
                                        elfos m = new elfos(arma, raza, nombre, apellido, altura, fecha, acompanante, poderAtaque, defensa, curacion);
                                        t1.setListIntegrantes((Integrantes) m);
                                    }
                                    contador++;
                                }
                            }
                            if (acompanante.equalsIgnoreCase("5")) {
                                acompanante = "Dragones";
                                int contador = 0;
                                for (pueblo t1 : ListPueblos) {
                                    if (puebloActual == contador) {
                                        elfos m = new elfos(arma, raza, nombre, apellido, altura, fecha, acompanante, poderAtaque, defensa, curacion);
                                        t1.setListIntegrantes((Integrantes) m);
                                    }
                                    contador++;
                                }
                            }
                        }

                        if (raza.equalsIgnoreCase("2")) {
                            raza = "enanos";
                            poderAtaque = 300;
                            defensa = 200;
                            curacion = 50;
                            String barba = "No tiene ", hacha = "No tiene";
                            String pruba_barba = JOptionPane.showInputDialog("Si el enano tiene barba ingrese 1");
                            String pruba_hacha = JOptionPane.showInputDialog("Si el enano tiene hacha ingrese 1");
                            if (pruba_barba.equalsIgnoreCase("1")) {
                                barba = "SitieneBarba";
                                poderAtaque += 50;
                            }
                            if (pruba_hacha.equalsIgnoreCase("1")) {
                                hacha = "SitieneHacha";
                                poderAtaque += 50;
                            }
                            if (acompanante.equalsIgnoreCase("1")) {
                                acompanante = "Aguilas";
                                int contador = 0;
                                for (pueblo t1 : ListPueblos) {
                                    if (puebloActual == contador) {
                                        enanos m = new enanos("SiTieneHermano", barba, hacha, raza, nombre, apellido, altura, fecha, acompanante, poderAtaque, defensa, curacion);
                                        t1.setListIntegrantes((Integrantes) m);
                                    }
                                    contador++;
                                }
                            }
                            if (acompanante.equalsIgnoreCase("2")) {
                                acompanante = "Aguilas";
                                int contador = 0;
                                for (pueblo t1 : ListPueblos) {
                                    if (puebloActual == contador) {
                                        enanos m = new enanos("SiTieneHermano", barba, hacha, raza, nombre, apellido, altura, fecha, acompanante, poderAtaque, defensa, curacion);
                                        t1.setListIntegrantes((Integrantes) m);
                                    }
                                    contador++;
                                }
                            }
                            if (acompanante.equalsIgnoreCase("3")) {
                                acompanante = "Aguilas";
                                int contador = 0;
                                for (pueblo t1 : ListPueblos) {
                                    if (puebloActual == contador) {
                                        enanos m = new enanos("SiTieneHermano", barba, hacha, raza, nombre, apellido, altura, fecha, acompanante, poderAtaque, defensa, curacion);
                                        t1.setListIntegrantes((Integrantes) m);
                                    }
                                    contador++;
                                }
                            }
                            if (acompanante.equalsIgnoreCase("4")) {
                                acompanante = "Aguilas";
                                int contador = 0;
                                for (pueblo t1 : ListPueblos) {
                                    if (puebloActual == contador) {
                                        enanos m = new enanos("SiTieneHermano", barba, hacha, raza, nombre, apellido, altura, fecha, acompanante, poderAtaque, defensa, curacion);
                                        t1.setListIntegrantes((Integrantes) m);
                                    }
                                    contador++;
                                }
                            }
                            if (acompanante.equalsIgnoreCase("5")) {
                                acompanante = "Aguilas";
                                int contador = 0;
                                for (pueblo t1 : ListPueblos) {
                                    if (puebloActual == contador) {
                                        enanos m = new enanos("SiTieneHermano", barba, hacha, raza, nombre, apellido, altura, fecha, acompanante, poderAtaque, defensa, curacion);
                                        t1.setListIntegrantes((Integrantes) m);
                                    }
                                    contador++;
                                }
                            }
                        }

                        if (raza.equalsIgnoreCase("3")) {
                            poderAtaque = 300;
                            defensa = 200;
                            curacion = 50;
                            raza = "Hobbits";
                            String anillos = JOptionPane.showInputDialog("Cuantos anillos tiene el Hobbits");
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
                        }

                        if (raza.equalsIgnoreCase("4")) {
                            if (acompanante.equalsIgnoreCase("1")) {
                                raza = "Hombres";
                            }
                        }

                        if (raza.equalsIgnoreCase("5")) {
                            if (acompanante.equalsIgnoreCase("1")) {
                                raza = "Maiar";
                            }
                        }
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
                        String lugar = JOptionPane.showInputDialog("Ingrese el lugar");

                    }
                    if (opcion3.equals("b")) {
                        int pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el lugar"));

                    }
                    if (opcion3.equals("c")) {
                        String p10 = "";
                        for (Lugares t1 : ListLugares) {
                            if (t1 instanceof Lugares) {
                                p10 += ListPueblos.indexOf(t1) + " " + ((Lugares) t1) + "\n";
                            }
                        }
                        JOptionPane.showMessageDialog(null, p10);
                    }
                    if (opcion.equals("d")) {
                        int pos = Integer.parseInt(
                                JOptionPane.showInputDialog("Ingrese la Posicion del lugar a modificar: "));
                        String Extencion_lugar = JOptionPane.showInputDialog("Ingrese nombre del Lugar");
                        int contador = 0;
                        for (Lugares t1 : ListLugares) {
                            if (contador == pos) {
                                t1.setExtencion(Extencion_lugar);
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
