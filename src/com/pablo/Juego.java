package com.pablo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Juego extends JFrame {

    Terreno [][] arregloDeBotones;
    JFrame Escenario = new JFrame();

    public int contadorBoton;

    private JPanel panelInfo;
    private JPanel panelIngreso;

    //private JTextField dimension;

    //campo de información para botones
    private JLabel linfo;

    //botones
    private JButton crear;
    private JButton estadisticas;
    private JButton juego;

    public void inicioJuego() {

    //Estableciendo propiedades de la ventana; titulo, tamaño y los paneles que contendrà
    JFrame ventana = new JFrame("BIENVENIDO A JUEGO DE TANQUES Y AVIONES");
    ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
    ventana.setSize(600, 100);

    //panel superior de informacion
    panelInfo = new JPanel();

    //panel inferior en donde se ingresaràn las dimensiones a jugar
    panelIngreso = new JPanel();

    //Estableciendo las propiedades de los campos
    linfo = new JLabel("Seleccione la accion a realizar");
    crear = new JButton("Crear");
    estadisticas = new JButton("Estadisticas");
    juego = new JButton("Juego");


    crear.addActionListener(

            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    Crear c = new Crear();
                    c.Crear();
                    ventana.setVisible(false);
                    ventana.dispose();
                }
            }
    );

    estadisticas.addActionListener(

            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    Estadisticas c = new Estadisticas();
                    c.Estadisticas();
                    ventana.setVisible(false);
                    ventana.dispose();

                }
            }
    );

    juego.addActionListener(

            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    Partida c = new Partida();
                    c.Partida();
                    ventana.setVisible(false);
                    ventana.dispose();
                }
            }
    );



    //añadiendo los botones y campos a cada panel
    panelInfo.add(linfo);
    panelIngreso.add(crear);
    panelIngreso.add(estadisticas);
    panelIngreso.add(juego);

    //Establece el lugar de posicion de cada panel
    ventana.getContentPane().add(BorderLayout.NORTH, panelInfo);
    ventana.getContentPane().add(BorderLayout.SOUTH, panelIngreso);

    //permite visualizar la ventana creada
    ventana.setVisible(true);
  }

    public void inicioTablero(){

        System.out.println("Cacas");
        if(SeleccionVehiculos.isSel1()==true) {

            //SeleccionDimensiones.getArregloDeBotones()[1][1].inicializarTanque();
        }
    }


   public void iniciarTablero(int dy, int dx) {

       arregloDeBotones = new Terreno[dy][dx];
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

        ImageIcon iconoTanque1 = new ImageIcon("out/production/Tanques y Aviones V2/com/Imagen/tanque2.png");
        ImageIcon iconoAvion2 = new ImageIcon("out/production/Tanques y Aviones V2/com/Imagen/avion2.png");

        //establecen las dimensiones de los iconos
        int ancho = 70;
        int alto = -1;

        //se añaden los iconos a los botones torre y alfil
        arregloDeBotones[0][0].setIcon(new ImageIcon(iconoTanque1.getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_DEFAULT)));
        //alfil.setIcon(new ImageIcon(iconoOriginal1.getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_DEFAULT)));


       if(SeleccionVehiculos.isSel1()==true) {

           arregloDeBotones[1][1].inicializarTanque();
           arregloDeBotones[1][1].setIcon(new ImageIcon(iconoTanque1.getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_DEFAULT)));
       }
       else {
           arregloDeBotones[1][1].inicializarAvion();
           arregloDeBotones[1][1].setIcon(new ImageIcon(iconoAvion2.getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_DEFAULT)));
       }

       if(SeleccionVehiculos.isSel2()==true) {

           arregloDeBotones[1][2].inicializarTanque();
           arregloDeBotones[1][2].setIcon(new ImageIcon(iconoTanque1.getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_DEFAULT)));
       }
       else {
           arregloDeBotones[1][2].inicializarAvion();
           arregloDeBotones[1][2].setIcon(new ImageIcon(iconoAvion2.getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_DEFAULT)));
       }

       if(SeleccionVehiculos.isSel3()==true) {

           arregloDeBotones[1][3].inicializarTanque();
           arregloDeBotones[1][3].setIcon(new ImageIcon(iconoTanque1.getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_DEFAULT)));
       }
       else {
           arregloDeBotones[1][3].inicializarAvion();
           arregloDeBotones[1][3].setIcon(new ImageIcon(iconoAvion2.getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_DEFAULT)));
       }


        //permite visualizar la ventana
        Escenario.setVisible(true);
    }



}
