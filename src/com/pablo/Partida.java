package com.pablo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Declaracion de ventana Partida que hereda de JFrame
 */
public class Partida extends JFrame {

    private JPanel panelSuperior;
    private JPanel panelInferior;

    //private JTextField dimension;

    //campo de información para botones
    private JLabel linfo;

    //botones
    private JButton nuevo;
    private JButton guardar;
    private JButton cargar;

    /**
     * Ventana que permite seleccionar entre juego nuevo/ cargar/ guardar juego
     */
    public void Partida() {

        //Estableciendo propiedades de la ventana; titulo, tamaño y los paneles que contendrà
        JFrame ventana = new JFrame("");
        ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ventana.setSize(600, 100);

        //panel superior de informacion
        panelSuperior = new JPanel();

        //panel inferior en donde se ingresaràn las dimensiones a jugar
        panelInferior = new JPanel();

        //Estableciendo las propiedades de los campos
        linfo = new JLabel("Seleccione la accion a ejecutar");
        nuevo = new JButton("Juego nuevo");
        guardar = new JButton("Guardar");
        cargar = new JButton("Cargar");

        nuevo.addActionListener(

                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        ventana.setVisible(false);
                        ventana.dispose();

                        TipoJ j = new TipoJ();
                        j.tipoDeJuego();
                    }
                }
        );

        guardar.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        ventana.setVisible(false);
                        ventana.dispose();
                    }
                }
        );

        cargar.addActionListener(
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
        panelInferior.add(nuevo);
        panelInferior.add(guardar);
        panelInferior.add(cargar);

        //Establece el lugar de posicion de cada panel
        ventana.getContentPane().add(BorderLayout.NORTH, panelSuperior);
        ventana.getContentPane().add(BorderLayout.SOUTH, panelInferior);

        //permite visualizar la ventana creada
        ventana.setVisible(true);
    }
}
