package com.pablo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Declaracion de clase Crear que hereda de JFrame
 */
public class Crear extends JFrame {


    private JPanel panelSuperior;
    private JPanel panelInferior;

    //private JTextField dimension;

    //campo de información para botones
    private JLabel linfo;

    //botones
    private JButton jugadores;
    private JButton vehiculos;
    private JButton armas;

    /**
     * Ventana que permite crear objetos
     */
        public void Crear() {

        //Estableciendo propiedades de la ventana; titulo, tamaño y los paneles que contendrà
        JFrame ventana = new JFrame("");
        ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ventana.setSize(600, 100);

        //panel superior de informacion
        panelSuperior = new JPanel();

        //panel inferior en donde se ingresaràn las dimensiones a jugar
        panelInferior = new JPanel();

        //Estableciendo las propiedades de los campos
        linfo = new JLabel("Seleccione el objeto a crear");
        jugadores = new JButton("Jugadores");
        vehiculos = new JButton("Vehiculos");
        armas = new JButton("Armas");

        jugadores.addActionListener(

                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        ventana.setVisible(false);
                        ventana.dispose();

                        Jugador j = new Jugador();
                        j.crearJugador();
                    }
                }
        );

        vehiculos.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        ventana.setVisible(false);
                        ventana.dispose();
                    }
                }
        );

        armas.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        ventana.setVisible(false);
                        ventana.dispose();
                    }
                }
        );





        //añadiendo los botones y campos a cada panel
        panelSuperior.add(linfo);
        panelInferior.add(jugadores);
        panelInferior.add(vehiculos);
        panelInferior.add(armas);

        //Establece el lugar de posicion de cada panel
        ventana.getContentPane().add(BorderLayout.NORTH, panelSuperior);
        ventana.getContentPane().add(BorderLayout.SOUTH, panelInferior);

        //permite visualizar la ventana creada
        ventana.setVisible(true);
    }
}
