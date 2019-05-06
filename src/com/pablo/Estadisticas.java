package com.pablo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Estadisticas extends JFrame {

    private JPanel panelSuperior;
    private JPanel panelInferior;

    //private JTextField dimension;

    //campo de información para botones
    private JLabel linfo;

    //botones
    private JButton listadov;
    private JButton batallas;
    private JButton mejor;
    private JButton peor;

    public void Estadisticas() {

        //Estableciendo propiedades de la ventana; titulo, tamaño y los paneles que contendrà
        JFrame ventana = new JFrame("");
        ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ventana.setSize(600, 100);

        //panel superior de informacion
        panelSuperior = new JPanel();

        //panel inferior en donde se ingresaràn las dimensiones a jugar
        panelInferior = new JPanel();

        //Estableciendo las propiedades de los campos
        linfo = new JLabel("Seleccione el Reporte a visualizar");
        listadov = new JButton("Lista Vehiculos");
        batallas = new JButton("Batallas");
        mejor = new JButton("Mejor Vehiculo");
        peor = new JButton("Peor Vehiculo");


        listadov.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        ventana.setVisible(false);
                        ventana.dispose();
                    }
                }
        );

        batallas.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        ventana.setVisible(false);
                        ventana.dispose();
                    }
                }
        );

        mejor.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        ventana.setVisible(false);
                        ventana.dispose();
                    }
                }
        );

        peor.addActionListener(
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
        panelInferior.add(listadov);
        panelInferior.add(batallas);
        panelInferior.add(mejor);
        panelInferior.add(peor);

        //Establece el lugar de posicion de cada panel
        ventana.getContentPane().add(BorderLayout.NORTH, panelSuperior);
        ventana.getContentPane().add(BorderLayout.SOUTH, panelInferior);

        //permite visualizar la ventana creada
        ventana.setVisible(true);
    }
}
