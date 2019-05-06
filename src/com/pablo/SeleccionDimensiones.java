package com.pablo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SeleccionDimensiones {
    private JCheckBox a4x4CheckBox;
    private JCheckBox a6x4CheckBox;
    private JCheckBox a8x9CheckBox;
    private JPanel Panel1;
    private JPanel Panel2;
    private JButton button1;

    public int contadorBoton, dx, dy;

    //JButton [][] arregloDeBotones;
    //Terreno[][] escenario;

    //JFrame Escenario = new JFrame();

   /* Terreno [][] arregloDeBotones;
    JFrame Escenario = new JFrame();*/

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
                        Juego j = new Juego();
                        j.iniciarTablero(dy,dx);
                    }
                }
        );


        Panel2.add(button1);

        ventana.getContentPane().add(BorderLayout.CENTER, Panel1);
        ventana.getContentPane().add(BorderLayout.SOUTH, Panel2);
        ventana.setVisible(true);
    }

   /* public void iniciarTablero(int dy, int dx) {

        int y, x;

        //establecen las propiedades de la ventana
        //escenario.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //frame.pack();
        Escenario.setSize(800, 700);

        // estableciendo GridLayout en la ventana, permite mostrar los botones en cuadricula
        Escenario.setLayout(new GridLayout(dy, dx));


        //ciclo que recorre la matriz y crea un nuevo boton en cada espacio
        for (int i = 0; i < dy; i++) {

            for (int e = 0; e < dx; e++) {
                //crea botones
                //escenario[i][e] = new JButton(""+ contadorBoton);
                /// arregloDeBotones[i][e] = new JButton(""+ contadorBoton);
                arregloDeBotones[i][e] = new Terreno() {
                    @Override
                    String getCuadroColor() {
                        return null;
                    }
                };

                //añade los botones a la ventana
                 Escenario.add(arregloDeBotones[i][e]);
                ///Escenario.add(escenario[i][e]);
                contadorBoton=contadorBoton+1;
            }
        }

        ImageIcon iconoTanque = new ImageIcon("out/production/Torres y Alfiles./com/pablo/Imagen/obispo (2).png");
        ImageIcon iconoTanque1 = new ImageIcon("out/production/Tanques y Aviones V2/com/Imagen/tanque2.png");

        //establecen las dimensiones de los iconos
        int ancho = 70;
        int alto = -1;

        //se añaden los iconos a los botones torre y alfil
        arregloDeBotones[0][0].setIcon(new ImageIcon(iconoTanque1.getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_DEFAULT)));
        //alfil.setIcon(new ImageIcon(iconoOriginal1.getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_DEFAULT)));


        //permite visualizar la ventana
        Escenario.setVisible(true);
    }*/

   /* public static Terreno[][] getArregloDeBotones() {
        return arregloDeBotones;
    }*/

    public int getDx() {
        return dx;
    }

    public int getDy() {
        return dy;
    }
}
