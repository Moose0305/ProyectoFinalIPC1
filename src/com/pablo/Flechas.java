package com.pablo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Declaracion de ventana Flechas que permiten visualizar direcciones de accion
 */
public class Flechas {
    private JPanel panel1;
    private JButton button1;
    private JButton abajoButton;
    private JButton izquierdaButton;
    private JButton arribaButton;

    public static int direccion;

    /**
     * Ventana en la que se añaden paneles y botones de movimiento y ataque
     */
    public void Flechas() {
        JFrame ventana = new JFrame();
        ventana.setSize(160, 180);

        ImageIcon iconoArriba = new ImageIcon("out/production/Tanques y Aviones V2/com/Imagen/arriba.jpg");
        ImageIcon iconoAbajo = new ImageIcon("out/production/Tanques y Aviones V2/com/Imagen/abajo.jpg");
        ImageIcon iconoDerecha = new ImageIcon("out/production/Tanques y Aviones V2/com/Imagen/derecha.jpg");
        ImageIcon iconoIzquierda = new ImageIcon("out/production/Tanques y Aviones V2/com/Imagen/izquierda.jpg");

        //establecen las dimensiones de los iconos
        int ancho = 45;
        int alto = -1;

        button1.setIcon(new ImageIcon(iconoDerecha.getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_DEFAULT)));
        izquierdaButton.setIcon(new ImageIcon(iconoIzquierda.getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_DEFAULT)));

        arribaButton.setIcon(new ImageIcon(iconoArriba.getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_DEFAULT)));
        abajoButton.setIcon(new ImageIcon(iconoAbajo.getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_DEFAULT)));


        //Derecha = 1, Izquierda = 2, Arriba = 3, Abajo = 4;
        button1.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        direccion=1;
                        System.out.println("Boton "+ direccion);
                        ventana.setVisible(false);
                        ventana.dispose();

                    }
                }
        );

        izquierdaButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        direccion = 2;
                        ventana.setVisible(false);
                        ventana.dispose();
                    }
                }
        );

        arribaButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        direccion = 3;
                        ventana.setVisible(false);
                        ventana.dispose();
                    }
                }
        );

        abajoButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        direccion = 4;
                        ventana.setVisible(false);
                        ventana.dispose();
                    }
                }
        );

        ventana.add(panel1);
        ventana.setVisible(true);

    }

    /**
     * obtiene la direccion de accion
     * @return
     */
    public static int getDireccion() {
        return direccion;
    }
}