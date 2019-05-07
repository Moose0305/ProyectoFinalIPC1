package com.pablo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class Juego extends JFrame {

    Terreno [][] arregloDeBotones;
    JFrame Escenario = new JFrame();

    public int contadorBoton;
    public int seleccion;

    private JPanel panelInfo;
    private JPanel panelIngreso;

    //paneles de ventana cuadricula
    private JPanel panelSuperior;
    private JPanel panelInferior;

    //private JTextField dimension;

    //campo de información para botones
    private JLabel linfo;

    //botones
    private JButton crear;
    private JButton estadisticas;
    private JButton juego;


    //botones acciones
    private JButton mover;
    private JButton atacar;
    //private JButton juego;

    ImageIcon iconoAgua= new ImageIcon("out/production/Tanques y Aviones V2/com/Imagen/agua.png");

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

   public void iniciarTablero(int dy, int dx) {

        JPanel panelSuperior = new JPanel();
        JPanel panelInferior = new JPanel();

       mover = new JButton("Mover");
       atacar = new JButton("Atacar");

       arregloDeBotones = new Terreno[dy][dx];
        Escenario.setSize(800, 700);

        // estableciendo GridLayout en la ventana, permite mostrar los botones en cuadricula
       //// Escenario.setLayout(new GridLayout(dy, dx));
            panelSuperior.setLayout(new GridLayout(dy, dx));


        //ciclo que recorre la matriz y crea un nuevo boton en cada espacio
        for (int i = 0; i < dy; i++) {

            for (int e = 0; e < dx; e++) {
                //crea botones
                //escenario[i][e] = new JButton(""+ contadorBoton);
                arregloDeBotones[i][e] = new Terreno() {
                    @Override
                    String getCuadroColor() {
                        return null;
                    }
                };

                arregloDeBotones[i][e].setText(""+ contadorBoton);

                //añade los botones a la ventana
                panelSuperior.add(arregloDeBotones[i][e]);
                ///Escenario.add(escenario[i][e]);
                contadorBoton=contadorBoton+1;

                //Evento de botones matriz bi dimensional, reconoce que boton es presionado
                arregloDeBotones[i][e].addActionListener(
                        new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {

                                    //muestra que boton se ha seleccionado en consola
                                    JButton boton = (JButton) e.getSource();
                                    System.out.println("Ha presionado el boton: " + boton.getActionCommand());
                                    int t = Integer.parseInt(boton.getText());
                                    //seleccion = boton.getActionCommand();

                                    //guarda el numero de boton seleccionado para ser comparado despues
                                    seleccion = t;

                                    for (int i = 0; i < dy; i++) {
                                        for (int j = 0; j < dx; j++) {

                                            //convierte el texto de cada boton en entero
                                            int k = Integer.parseInt(arregloDeBotones[i][j].getText());


                                            if (seleccion == k && (arregloDeBotones[i][j].v1 instanceof Tanque || arregloDeBotones[i][j].v1 instanceof Avion )) {

                                                arregloDeBotones[i][j].setBackground(new java.awt.Color(168,72,40));

                                            }
                                        }
                                    }

                                Escenario.setVisible(true);
                            }
                        }
                );
            }
        }

        ImageIcon iconoTanque1 = new ImageIcon("out/production/Tanques y Aviones V2/com/Imagen/tanque2.png");
        ImageIcon iconoAvion2 = new ImageIcon("out/production/Tanques y Aviones V2/com/Imagen/avion2.png");

        //establecen las dimensiones de los iconos
        int ancho = 70;
        int alto = -1;

        //se añaden los iconos a los botones torre y alfil
        ///////arregloDeBotones[0][0].setIcon(new ImageIcon(iconoTanque1.getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_DEFAULT)));

      for(int i=0; i<SeleccionVehiculos.getSelec().length; i++) {
          if (SeleccionVehiculos.getSelec()[i] == 0) {

              arregloDeBotones[0][i+i].inicializarTanque();
              arregloDeBotones[0][i+i].setIcon(new ImageIcon(iconoTanque1.getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_DEFAULT)));

          }

          if (SeleccionVehiculos.getSelec()[i] == 1) {

              arregloDeBotones[0][i+i].inicializarAvion();
              arregloDeBotones[0][i+i].setIcon(new ImageIcon(iconoAvion2.getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_DEFAULT)));

          }
      }

       mover.addActionListener(

               new ActionListener() {
                   @Override
                   public void actionPerformed(ActionEvent e) {


                       int dadoM;
                       Random aleatorio = new Random(System.currentTimeMillis());
                       dadoM = aleatorio.nextInt(6);
                       dadoM = dadoM +1;

                       System.out.println("\nDado tirado");

                       for(int i=1; i<7; i++) {

                           if(i==dadoM){
                               System.out.println(dadoM);
                               System.out.println(i);
                               JOptionPane.showMessageDialog(null, "Dado tirado, Puede moverse un maximo de: "+ dadoM+" casillas. Seleccione el vehiculo a mover");
                           }

                       }
                   }
               }
       );



       panelInferior.add(mover);
       panelInferior.add(atacar);

       Escenario.getContentPane().add(BorderLayout.CENTER, panelSuperior);
       Escenario.getContentPane().add(BorderLayout.SOUTH, panelInferior);
       //permite visualizar la ventana
        Escenario.setVisible(true);
       //mover(dy, dx);



    }

    public void seleccionarAccion(){

        //Estableciendo propiedades de la ventana; titulo, tamaño y los paneles que contendrà
        JFrame accion = new JFrame();
        accion.setDefaultCloseOperation(EXIT_ON_CLOSE);
        accion.setSize(600, 100);

        //panel superior de informacion
        panelInfo = new JPanel();

        //panel inferior en donde se ingresaràn las dimensiones a jugar
        panelIngreso = new JPanel();

        //Estableciendo las propiedades de los campos
        linfo = new JLabel("Seleccione la accion a realizar");
        mover = new JButton("Mover");
        atacar = new JButton("Atacar");
        //juego = new JButton("Juego");


        mover.addActionListener(

                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {


                        int dadoM;
                        Random aleatorio = new Random(System.currentTimeMillis());
                        dadoM = aleatorio.nextInt(6);
                        dadoM = dadoM +1;

                        System.out.println("\nDado tirado");

                        for(int i=1; i<7; i++) {

                            if(i==dadoM){
                                System.out.println(dadoM);
                                System.out.println(i);
                                JOptionPane.showMessageDialog(null, "Dado tirado, Puede moverse un maximo de: "+ dadoM+" casillas");
                            }

                        }
                        accion.setVisible(false);
                        accion.dispose();
                    }
                }
        );

        atacar.addActionListener(

                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        Estadisticas c = new Estadisticas();
                        c.Estadisticas();
                        accion.setVisible(false);
                        accion.dispose();

                    }
                }
        );

        //añadiendo los botones y campos a cada panel
        panelInfo.add(linfo);
        panelIngreso.add(mover);
        panelIngreso.add(atacar);

        //Establece el lugar de posicion de cada panel
        accion.getContentPane().add(BorderLayout.NORTH, panelInfo);
        accion.getContentPane().add(BorderLayout.SOUTH, panelIngreso);

        //permite visualizar la ventana creada
        accion.setVisible(true);


    }


    public void mover(int dy, int dx) {

        for (int i = 0; i < dy; i++) {
            for (int j = 0; j < dx; j++) {

                //convierte el texto de cada boton en entero
                int k = Integer.parseInt(arregloDeBotones[i][j].getText());


                if (seleccion == k) {
                    arregloDeBotones[i][j].setText("CCC");
                }
            }
        }
    }

    public void moverVehículo(Terreno co, Terreno cd){
        cd.setV1(co.getV1());
        co.setV1(null);
    }

}
