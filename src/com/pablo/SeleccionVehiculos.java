package com.pablo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;

/**
 * Declaracion de ventana seleccion de vehiculos
 */
public class SeleccionVehiculos {
    private JCheckBox tanqueCheckBox;
    private JCheckBox avionCheckBox;
    private JCheckBox tanqueCheckBox1;
    private JCheckBox avionCheckBox1;
    private JCheckBox tanqueCheckBox2;
    private JCheckBox avionCheckBox2;
    private JPanel Panel2;
    private JPanel Panel1;
    private JButton OKButton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;

    //campos de ventana mostrar vehiculos seleccionados
    private JLabel v1;
    private JLabel v2;
    private JLabel v3;

    private JButton ok;

    private JPanel p1;
    private JPanel p2;

    static int[] selec = new int[3];
    static String[] nomb = new String[3];

   static boolean sel1;
   static boolean sel2;
   static boolean sel3;

    /**
     * permite seleccionar los vehiculos a crear por el jugador
     */
    public void SeleccionVehiculos() {

        JFrame ventana = new JFrame();
        ventana.add(Panel1);
        ventana.setSize(600, 180);
        ventana.setVisible(true);


        OKButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        ventana.setVisible(false);
                        ventana.dispose();
                        mostrarVehiculos();
                    }
                }
        );
    }

    /**
     * muestra los vehiculos seleccionados por el jugador
     */
    public void mostrarVehiculos() {

        p1 = new JPanel();
        p2 = new JPanel();
        p1.setLayout(new BoxLayout(p1,BoxLayout.Y_AXIS));

        v1 = new JLabel("");
        v2 = new JLabel("");
        v3 = new JLabel("");

        ok = new JButton("OK");

        JFrame vehiculos = new JFrame("VEHICULOS SELECCIONADOS");
        vehiculos.setSize(300, 120);

        if(tanqueCheckBox.isSelected()) {

            v1.setText("Vehiculo 1: Tanque"+"   Nombre: " + textField1.getText());
            System.out.println("Vehiculo 1: Tanque"+"   Nombre: " + textField1.getText());
            sel1=true;
            selec[0] = 0;
            nomb[0] = textField1.getText();
        }
        if(avionCheckBox.isSelected()){

            v1.setText("Vehiculo 1: Avion"+"   Nombre: "+ textField1.getText());
            System.out.println("Vehiculo 1: Avion"+"   Nombre: "+ textField1.getText());
            selec[0] = 1;
            nomb[0] = textField1.getText();
        }

        if(tanqueCheckBox1.isSelected()) {
            v2.setText("Vehiculo 2: Tanque"+ "   Nombre: "+textField2.getText());
            System.out.println("Vehiculo 2: Tanque");
            selec[1] = 0;
            nomb[1] = textField2.getText();
        }
        if(avionCheckBox1.isSelected()) {
            v2.setText("Vehiculo 2: Avion"+"   Nombre: "+ textField2.getText());
            System.out.println("Vehiculo 2: Avion");
            selec[1] = 1;
            nomb[1] = textField2.getText();
        }

        if(tanqueCheckBox2.isSelected()) {
            v3.setText("Vehiculo 3: Tanque"+ "   Nombre: "+ textField3.getText());
            System.out.println("Vehiculo 3: Tanque"+ "   Nombre: "+ textField3.getText());
            selec[2] = 0;
            nomb[2] = textField3.getText();
        }
        if(avionCheckBox2.isSelected()) {
            v3.setText("Vehiculo 3: Avion" + "   Nombre: "+ textField3.getText());
            System.out.println("Vehiculo 3: Avion");
            selec[2] = 1;
            nomb[2] = textField3.getText();
        }


        ok.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        JOptionPane.showMessageDialog(null, "Vehiculos guardados");
                        vehiculos.setVisible(false);
                        vehiculos.dispose();
                        SeleccionDimensiones l = new SeleccionDimensiones();
                        l.SeleccionDimensiones();
                    }
                }
        );


        p1.add(v1);
        p1.add(v2);
        p1.add(v3);

        p2.add(ok);

       // vehiculos.add(p1);
       // vehiculos.add(p2);
        vehiculos.getContentPane().add(BorderLayout.NORTH, p1);
        vehiculos.getContentPane().add(BorderLayout.SOUTH, p2);

        v1.setAlignmentX( Component.CENTER_ALIGNMENT );
        v2.setAlignmentX( Component.CENTER_ALIGNMENT );
        v3.setAlignmentX( Component.CENTER_ALIGNMENT );

        vehiculos.setVisible(true);
    }

    /**
     * obtiene arreglo de selecciones
     * @return seleccion
     */
    public static int[] getSelec() {
        return selec;
    }

    /**
     * obtiene arreglo de nombres de los vehiculos
     * @return nombres
     */
    public static String[] getNomb() {
        return nomb;
    }
}
