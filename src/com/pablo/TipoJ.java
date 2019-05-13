package com.pablo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Declaracion de clase TIPO DE JUEGO que hereda de JFrame
 */
public class TipoJ extends JFrame {

    public static int tipoJuego;

    private JPanel panelSuperior;
    private JPanel panelInferior;
    
    //campo de información para botones
    private JLabel linfo;

    //botones
    private JButton jugador1;
    private JButton jugador2;

    /**
     * obtiene el tipo de juego
     * @return tipo de juego
     */
    public static int getTipoJuego() {
        return tipoJuego;
    }

    /**
     * metodo que establece el tipo de juego y llama a metodos que inicializan los jugadores
     */
    public void tipoDeJuego() {

        //Estableciendo propiedades de la ventana; titulo, tamaño y los paneles que contendrà
        JFrame ventana = new JFrame("");
        ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ventana.setSize(600, 100);

        //panel superior de informacion
        panelSuperior = new JPanel();

        //panel inferior en donde se ingresaràn las dimensiones a jugar
        panelInferior = new JPanel();

        //Estableciendo las propiedades de los campos
        linfo = new JLabel("Seleccione el tipo de juego");
        jugador1 = new JButton("Jugador VS Jugador");
        jugador2 = new JButton("  Jugador VS PC   ");
        
        jugador1.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        ventana.setVisible(false);
                        ventana.dispose();

                        tipoJuego= 2;
                        Jugador j = new Jugador();
                        j.crearJugador();
                    }
                }
        );

        jugador2.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        ventana.setVisible(false);
                        ventana.dispose();

                        tipoJuego= 1;
                        Jugador j = new Jugador();
                        j.crearJugador();
                    }
                }
        );
        

        //añadiendo los botones y campos a cada panel
        panelSuperior.add(linfo);
        panelInferior.add(jugador1);
        panelInferior.add(jugador2);
        
        //Establece el lugar de posicion de cada panel
        ventana.getContentPane().add(BorderLayout.NORTH, panelSuperior);
        ventana.getContentPane().add(BorderLayout.SOUTH, panelInferior);

        //permite visualizar la ventana creada
        ventana.setVisible(true);



    }
}
