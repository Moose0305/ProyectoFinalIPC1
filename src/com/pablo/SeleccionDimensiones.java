package com.pablo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Declaracion de clase dimensiones
 */
public class SeleccionDimensiones {
    private JCheckBox a4x4CheckBox;
    private JCheckBox a6x4CheckBox;
    private JCheckBox a8x9CheckBox;
    private JPanel Panel1;
    private JPanel Panel2;
    private JButton button1;

    public int contadorBoton, dx, dy;

    /**
     * Metodo que permite seleccionar las dimensiones del escenario a jugar
     */
    public void SeleccionDimensiones(){

        //escenario = new Terreno[12][12];
        //arregloDeBotones = new Terreno[12][12];

        JFrame ventana = new JFrame();
        ventana.setSize(300, 150);
        Panel2 = new JPanel();
        button1 = new JButton("OK");

        button1.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        JOptionPane.showMessageDialog(null, "Escenario guardado");

                        if(a4x4CheckBox.isSelected()) {
                            ///arregloDeBotones = new JButton[4][4];
                           //// arregloDeBotones = new Terreno[4][4];
                           // escenario = new Terreno[4][4];
                           // arregloDeBotones = new Terreno[4][4];
                            dx=4;
                            dy=4;

                        }

                        if(a6x4CheckBox.isSelected()) {
                            ///arregloDeBotones = new JButton[4][6];
                          ////  arregloDeBotones = new Terreno[4][6];
                            dx=6;
                            dy=4;

                        }

                        if(a8x9CheckBox.isSelected()) {
                           ///arregloDeBotones = new JButton[9][8];
                           ////arregloDeBotones = new Terreno[9][8];

                            dy=9;
                            dx=8;

                        }

                        //iniciarTablero(dy,dx);
                        ventana.setVisible(false);
                        ventana.dispose();
                        Juego j = new Juego();
                        j.iniciarTablero(dy,dx);
                       // j.seleccionarAccion();
                    }
                }
        );


        Panel2.add(button1);

        ventana.getContentPane().add(BorderLayout.CENTER, Panel1);
        ventana.getContentPane().add(BorderLayout.SOUTH, Panel2);
        ventana.setVisible(true);
    }
}
