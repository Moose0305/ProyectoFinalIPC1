package com.pablo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

   static boolean sel1;
   static boolean sel2;
   static boolean sel3;

    public void SeleccionVehiculos() {

        JFrame ventana = new JFrame();
        ventana.add(Panel1);
        ventana.setSize(600, 180);
        ventana.setVisible(true);


        OKButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        mostrarVehiculos();
                    }
                }
        );
    }

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
        }
        if(avionCheckBox.isSelected()){

            v1.setText("Vehiculo 1: Avion"+"   Nombre: "+ textField1.getText());
            System.out.println("Vehiculo 1: Avion"+"   Nombre: "+ textField1.getText());
        }

        if(tanqueCheckBox1.isSelected()) {
            v2.setText("Vehiculo 2: Tanque"+ "   Nombre: "+textField2.getText());
            System.out.println("Vehiculo 2: Tanque");
            sel2=true;
        }
        if(avionCheckBox1.isSelected()) {
            v2.setText("Vehiculo 2: Avion"+"   Nombre: "+ textField2.getText());
            System.out.println("Vehiculo 2: Avion");
        }

        if(tanqueCheckBox2.isSelected()) {
            v3.setText("Vehiculo 3: Tanque"+ "   Nombre: "+ textField3.getText());
            System.out.println("Vehiculo 3: Tanque"+ "   Nombre: "+ textField3.getText());
            sel3=true;
        }
        if(avionCheckBox2.isSelected()) {
            v3.setText("Vehiculo 3: Avion" + "   Nombre: "+ textField3.getText());
            System.out.println("Vehiculo 3: Avion");
        }


        ok.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        JOptionPane.showMessageDialog(null, "Vehiculos guardados");
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


    public static boolean isSel1() {
        return sel1;
    }

    public static boolean isSel2() {
        return sel2;
    }

    public static boolean isSel3() {
        return sel3;
    }

}
