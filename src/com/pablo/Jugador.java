package com.pablo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

/**
 * Declaracion de ventana jugador que hereda de JFrame
 */
public class Jugador extends JFrame {

    JFrame frame = new JFrame();

    private int contador=1;

    int selec;
    int cont = 0;
    int contadorpos=1;
    int contadorpos2=3;
    int[] selección = new int[3];

    private JPanel panelInfo;
    private JPanel panelIngreso;

    private JTextField dimension;

    private JLabel linfo;
    private JLabel seleccionNo;

    private JButton ok;
    private JButton tanque;
    private JButton avion;

    /**
     * crea un nuevo jugador o 2 jugadores dependiendo del tipo de juego a desarrollar
     */
    public void crearJugador() {

        if (contador <= 2) {
            //Estableciendo propiedades de la ventana; titulo, tamaño y los paneles que contendrà
            JFrame ventana = new JFrame("CREANDO NUEVO JUGADOR");
            ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
            ventana.setSize(700, 100);

            //panel superior de informacion
            panelInfo = new JPanel();

            //panel inferior en donde se ingresaràn las dimensiones a jugar
            panelIngreso = new JPanel();

            ok = new JButton("OK");


            if (TipoJ.getTipoJuego() == 1) {

                //Estableciendo las propiedades de los campos
                dimension = new JTextField(10);
                linfo = new JLabel("Ingrese el nombre del nuevo jugador");

                //añadiendo los botones y campos a cada panel
                panelInfo.add(linfo);
                panelIngreso.add(dimension);
                panelIngreso.add(ok);


                //evento de boton, permite leer y crear las dimensiones del tablero a jugar y lo inicializa
                ok.addActionListener(
                        new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                if (dimension.getText() != null) {

                                    System.out.println("Jugador1 creado");

                                    ventana.setVisible(false);
                                    ventana.dispose();

                                    SeleccionVehiculos p = new SeleccionVehiculos();
                                    p.SeleccionVehiculos();
                                    //SeleccionVehículos();
                                    //seleccionarVehiculos();

                                    //r = Integer.parseInt(dimension.getText());
                                    //arregloDeBotones = new JButton[r][r];
                                    // iniciarTablero(r);
                                } //else
                                //inicioJuego();
                            }
                        }
                );
            }

            if (TipoJ.getTipoJuego() == 2) {

                //Estableciendo las propiedades de los campos
                dimension = new JTextField(10);
                linfo = new JLabel("Ingrese el nombre del nuevo jugador " + contador);

                //añadiendo los botones y campos a cada panel
                panelInfo.add(linfo);
                panelIngreso.add(dimension);
                panelIngreso.add(ok);

                //evento de boton, permite leer y crear las dimensiones del tablero a jugar y lo inicializa
                ok.addActionListener(
                        new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                if (dimension.getText() != null) {

                                    //Estableciendo las propiedades de los campos
                               /* dimension = new JTextField(10);
                                linfo = new JLabel("Ingrese el nombre del nuevo jugador " + contador);
                               // ok = new JButton("OK");

                                //añadiendo los botones y campos a cada panel
                                panelInfo.add(linfo);
                                panelIngreso.add(dimension);
                                panelIngreso.add(ok);
*/


                                    contador++;
                                    System.out.println("Jugador2 creado");

                                    ventana.setVisible(false);
                                    ventana.dispose();

                                    crearJugador();
                                }
                            }
                        }
                );
            }

            //Establece el lugar de posicion de cada panel
            ventana.getContentPane().add(BorderLayout.NORTH, panelInfo);
            ventana.getContentPane().add(BorderLayout.CENTER, panelIngreso);

            //permite visualizar la ventana creada
            ventana.setVisible(true);

        } else {

            //SeleccionVehículos();
        }
    }
}
