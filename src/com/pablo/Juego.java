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
    public int dadoM;
    public int dadoA;
    public int direccion;
    public int contadorCasillas;
    public int a,b ;
    public boolean booleana1;
    public boolean booleana2;

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

    //establecen las dimensiones de los iconos
    int ancho = 70;
    int alto = -1;

    ImageIcon iconoTanque1 = new ImageIcon("out/production/Tanques y Aviones V2/com/Imagen/tanque2.png");
    ImageIcon iconoAvion2 = new ImageIcon("out/production/Tanques y Aviones V2/com/Imagen/avion2.png");
    ImageIcon iconoEnemigo = new ImageIcon("out/production/Tanques y Aviones V2/com/Imagen/enemigo.png");
    ImageIcon iconoAgua= new ImageIcon("out/production/Tanques y Aviones V2/com/Imagen/agua.png");

    //panel flechas
    JPanel panel1 = new JPanel();
    JButton button1 = new JButton();
    JButton abajoButton = new JButton();
    JButton izquierdaButton = new JButton();
    JButton arribaButton = new JButton();

    //panel Mostrar Vehiculo
    JPanel panelS = new JPanel();
    JPanel panelI = new JPanel();
    JLabel nomV = new JLabel();
    JLabel salV = new JLabel();
    JLabel nivV = new JLabel();
    JLabel ppV = new JLabel();
    JLabel xpV = new JLabel();
    JLabel armaV = new JLabel();
    JLabel ataqueV = new JLabel();
    JLabel defV = new JLabel();
    JLabel puntV = new JLabel();


    public void escenario11(int dy, int dx) {
       /* for(int j=0; j<dx; j++) {
            arregloDeBotones[0][j] = new TerrenoTierra();
        }*/

        //////////////////////////////PRUEBA
        //arregloDeBotones[0][0] = new TerrenoTierra();

        arregloDeBotones[1][0] = new TerrenoMontaña();
        //arregloDeBotones[1][1] = new TerrenoTierra();
        arregloDeBotones[1][2] = new TerrenoAgua();
        arregloDeBotones[1][3] = new TerrenoAgua();
        arregloDeBotones[2][0] = new TerrenoMontaña();

       /*for(int i=2; i<dy; i++) {
           for(int j=1; j<dx; j++) {

               arregloDeBotones[i][j] = new TerrenoTierra();
           }
       }*/
        //arregloDeBotones[3][0] = new TerrenoTierra();
    }

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

                    Flechas f = new Flechas();
                    f.Flechas();
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
                   /* @Override

                    String getCuadroColor() {
                        return null;
                    }*/
                };

/////////////////////////////////////////////////////
                   //
                arregloDeBotones[i][e] = new TerrenoMontaña();
                //arregloDeBotones[1][1] = new TerrenoAgua();

                arregloDeBotones[i][e].setText(""+ contadorBoton);

                //añade los botones a la ventana
                panelSuperior.add(arregloDeBotones[i][e]);
                contadorBoton=contadorBoton+1;

                //escenario11(dy, dx);


                //Evento de botones matriz bi dimensional, reconoce que boton es presionado
                arregloDeBotones[i][e].addActionListener(
                        new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {

                                //Flechas.setDireccion(0);

                                //booleana que identifica si previamente se ha presionado el boton mover
                                if(booleana1==true) {

                                    booleana1=false;

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

                                            //si el boton presionado es igual a el boton en el arreglo recorrido y si hay un tanque o un avion en ese boton
                                            if (seleccion == k && (arregloDeBotones[i][j].v1 instanceof Tanque || arregloDeBotones[i][j].v1 instanceof Avion)) {

                                                //si el boton seleccionado es un vehiculo, booleana permite desplegar ventana de flechas
                                                //booleana2=true;

                                                //arregloDeBotones[i][j].setIcon(null);

                                                    System.out.println("Flechas" + Flechas.getDireccion());

                                                    //MOVER DERECHA
                                                if (direccion == 1) {

                                                    for(int o=j+1; o< dx; o++){

                                                        contadorCasillas= contadorCasillas +1;
                                                    }

                                                    System.out.println("Casillas disponibles " + contadorCasillas);
                                                    System.out.println("DADO: " + dadoM);
                                                    if(contadorCasillas>= dadoM) {
                                                        if(!(arregloDeBotones[(i)][(j + dadoM)].v1 instanceof Tanque || arregloDeBotones[(i)][(j + dadoM)].v1 instanceof Avion)) {
                                                            moverVehículo(arregloDeBotones[i][j], arregloDeBotones[(i)][(j + dadoM)]);
                                                            //arregloDeBotones[i][j].getCuadroColor();
                                                            arregloDeBotones[i][j].setIcon(null);
                                                        }

                                                    }

                                                    if(contadorCasillas <= dadoM && contadorCasillas!=0) {
                                                        if(!(arregloDeBotones[(i)][(j + contadorCasillas)].v1 instanceof Tanque || arregloDeBotones[(i)][(j + contadorCasillas)].v1 instanceof Avion)) {
                                                            moverVehículo(arregloDeBotones[i][j], arregloDeBotones[(i)][(j + contadorCasillas)]);
                                                            //arregloDeBotones[i][j].getCuadroColor();
                                                            arregloDeBotones[i][j].setIcon(null);
                                                        }

                                                        ////////////////////////////////////////    MENSAJE NO PUEDE MOVER VEHICULO SOBRE OTRO
                                                       /* else {
                                                            JOptionPane.showMessageDialog(null, "No puede poner un vehiculo sobre otro");
                                                        }*/
                                                    }

                                                    if(contadorCasillas==0) {
                                                        JOptionPane.showMessageDialog(null, "Limite de escenario");
                                                    }
                                                }

                                                //MOVER IZQUIERDA
                                                if (direccion == 2) {

                                                    for(int o=j-1; o> -1; o--){

                                                        contadorCasillas= contadorCasillas +1;
                                                    }

                                                    System.out.println("Casillas disponibles " + contadorCasillas);
                                                    System.out.println("DADO: " + dadoM);

                                                    if(contadorCasillas>= dadoM) {
                                                      ///  if((arregloDeBotones[i][j].v1 instanceof Tanque && arregloDeBotones[(i)][(j - dadoM)] instanceof ))

                                                        if(!(arregloDeBotones[(i)][(j - dadoM)].v1 instanceof Tanque || arregloDeBotones[(i)][(j - dadoM)].v1 instanceof Avion)) {
                                                            moverVehículo(arregloDeBotones[i][j], arregloDeBotones[(i)][(j - dadoM)]);
                                                            //arregloDeBotones[i][j].getCuadroColor();
                                                            arregloDeBotones[i][j].setIcon(null);
                                                        }
                                                    }

                                                    if(contadorCasillas <= dadoM && contadorCasillas!=0) {
                                                        if (!(arregloDeBotones[(i)][(j - contadorCasillas)].v1 instanceof Tanque || arregloDeBotones[(i)][(j - contadorCasillas)].v1 instanceof Avion)) {
                                                            moverVehículo(arregloDeBotones[i][j], arregloDeBotones[(i)][(j - contadorCasillas)]);
                                                            //arregloDeBotones[i][j].getCuadroColor();
                                                            arregloDeBotones[i][j].setIcon(null);
                                                        }
                                                    }

                                                    if(contadorCasillas==0) {
                                                        JOptionPane.showMessageDialog(null, "Limite de escenario");

                                                    }
                                                    //Flechas.setDireccion(0);
                                                }

                                                //MOVER ARRIBA
                                                if (direccion == 3) {

                                                    for(int o=i-1; o >-1; o--){

                                                        contadorCasillas= contadorCasillas +1;
                                                    }

                                                    if(contadorCasillas>= dadoM) {
                                                        if(!(arregloDeBotones[(i - dadoM)][(j)].v1 instanceof Tanque || arregloDeBotones[(i - dadoM)][(j)].v1 instanceof Avion)) {
                                                            moverVehículo(arregloDeBotones[i][j], arregloDeBotones[(i - dadoM)][(j)]);
                                                            //arregloDeBotones[i][j].getCuadroColor();
                                                            arregloDeBotones[i][j].setIcon(null);
                                                        }
                                                    }

                                                    if(contadorCasillas <= dadoM && contadorCasillas!=0) {
                                                        if (!(arregloDeBotones[(i-contadorCasillas)][(j)].v1 instanceof Tanque || arregloDeBotones[(i-contadorCasillas)][(j)].v1 instanceof Avion)) {
                                                            moverVehículo(arregloDeBotones[i][j], arregloDeBotones[(i - contadorCasillas)][(j)]);
                                                           // arregloDeBotones[i][j].getCuadroColor();
                                                            arregloDeBotones[i][j].setIcon(null);
                                                        }
                                                    }

                                                    if(contadorCasillas==0) {
                                                        JOptionPane.showMessageDialog(null, "Limite de escenario");

                                                    }
                                                    //Flechas.setDireccion(0);
                                                }


                                                //MOVER ABAJO
                                                if (direccion == 4) {

                                                    for(int o=i+1; o< dy; o++){

                                                        contadorCasillas= contadorCasillas +1;
                                                    }

                                                    if(contadorCasillas>= dadoM) {
                                                        if(!(arregloDeBotones[(i + dadoM)][(j)].v1 instanceof Tanque || arregloDeBotones[(i + dadoM)][(j)].v1 instanceof Avion)) {
                                                            moverVehículo(arregloDeBotones[i][j], arregloDeBotones[(i + dadoM)][(j)]);
                                                            //arregloDeBotones[i][j].getCuadroColor();
                                                            arregloDeBotones[i][j].setIcon(null);
                                                        }
                                                    }

                                                    if(contadorCasillas <= dadoM && contadorCasillas!=0) {
                                                        if (!(arregloDeBotones[(i+contadorCasillas)][(j)].v1 instanceof Tanque || arregloDeBotones[(i+contadorCasillas)][(j)].v1 instanceof Avion)) {
                                                            moverVehículo(arregloDeBotones[i][j], arregloDeBotones[(i + contadorCasillas)][(j)]);
                                                           // arregloDeBotones[i][j].getCuadroColor();
                                                            arregloDeBotones[i][j].setIcon(null);
                                                        }
                                                    }

                                                    if(contadorCasillas==0) {
                                                        JOptionPane.showMessageDialog(null, "Limite de escenario");

                                                    }
                                                    //Flechas.setDireccion(0);
                                                }

                                                contadorCasillas=0;

                                                //arregloDeBotones[i][j].setBackground(new java.awt.Color(168,72,40));
                                            }
                                        }
                                    }

                                    //escenario11(dy, dx);
                                    Escenario.setVisible(true);

                                }
                                direccion=0;
                            }
                        }
                        );

            }
        }

        /*if(booleana2==false) {
           escenario11(dy, dx);
           booleana2=true;
       }*/

      for(int i=0; i<SeleccionVehiculos.getSelec().length; i++) {
          if (SeleccionVehiculos.getSelec()[i] == 0) {

              arregloDeBotones[0][i+1].inicializarTanque();
              //arregloDeBotones[0][i+i].inicializarTanque();
              arregloDeBotones[0][i+1].setIcon(new ImageIcon(iconoTanque1.getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_DEFAULT)));

          }

          if (SeleccionVehiculos.getSelec()[i] == 1) {

              arregloDeBotones[0][i+1].inicializarAvion();
              arregloDeBotones[0][i+1].setIcon(new ImageIcon(iconoAvion2.getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_DEFAULT)));
          }
      }

      arregloDeBotones[3][3].inicializarEnemigo();
      arregloDeBotones[3][3].setIcon(new ImageIcon((iconoEnemigo.getImage().getScaledInstance(ancho,alto, Image.SCALE_DEFAULT))));

       //escenario11(dy, dx);
      /* for (int i = 0; i < dy; i++) {
           for (int e = 0; e < dx; e++) {

               arregloDeBotones[i][e].setText(""+ contadorBoton);
               contadorBoton=contadorBoton+1;
           }
       }*/

       mover.addActionListener(

               new ActionListener() {
                   @Override
                   public void actionPerformed(ActionEvent e) {


                       booleana1 = true;

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

                       flechas();
                       System.out.println("DESPUES DE FLECHAS: " + Flechas.getDireccion());
                   }
               }
       );

       atacar.addActionListener(
               new ActionListener() {
                   @Override
                   public void actionPerformed(ActionEvent e) {

                       Random aleatorio = new Random(System.currentTimeMillis());
                       dadoA = aleatorio.nextInt(100);
                       dadoA = dadoA +1;

                       System.out.println("\nDado tirado");

                       for(int i=1; i<101; i++) {

                           if(i==dadoA){
                               System.out.println(dadoM);
                               System.out.println(i);
                               JOptionPane.showMessageDialog(null, "Disparo a realizar con: "+ dadoA+"% de potencia. Seleccione el vehiculo a mover");
                           }

                       }

                       flechas();
                       atacar(dy, dx);
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


    public void mover() {

      /*  for(int i=0; i<dy; i++) {
            for(int j=0; j<dx; j++) {

                //convierte el texto de cada boton en entero
                int k = Integer.parseInt(arregloDeBotones[i][j].getText());

                if(k == seleccion){

                    arregloDeBotones[i][j].setIcon(null);

                }
            }
        }*/


        //seleccion
    }

    public void moverVehículo(Terreno co, Terreno cd){
        cd.setV1(co.getV1());
        co.setV1(null);
    }

    public void flechas() {


        JFrame ventana = new JFrame();
        ventana.getContentPane().setLayout(new BorderLayout());
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


        ventana.getContentPane().add(arribaButton,BorderLayout.NORTH);
        ventana.getContentPane().add(abajoButton,BorderLayout.SOUTH);
        ventana.getContentPane().add(button1,BorderLayout.EAST);
        ventana.getContentPane().add(izquierdaButton,BorderLayout.WEST);
        ventana.setVisible(true);

    }

    public void mostrarVehiculo(){

       /* JFrame ventana = new JFrame();
        ventana.getContentPane().setLayout(new BorderLayout());
        ventana.setSize(160, 180);

        infoV.setText(getNickname());*/

    }

    public void atacar(int dy, int dx) {

        JOptionPane.showMessageDialog(null, ("Seleccione la direccion del ataque y luego el vehiculo que realizara el ataque"));

        for(a=0; a<dy; a++) {
            for(b=0; b<dx; b++) {

                arregloDeBotones[a][b].addActionListener(
                        new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {

                                //muestra que boton se ha seleccionado en consola
                                JButton boton = (JButton) e.getSource();
                                System.out.println("Ha presionado el boton: " + boton.getActionCommand());
                                int t = Integer.parseInt(boton.getText());

                                //guarda el numero de boton seleccionado para ser comparado despues
                                seleccion = t;

                                for (int i = 0; i < dy; i++) {
                                    for (int j = 0; j < dx; j++) {

                                        //convierte el texto de cada boton en entero
                                        int k = Integer.parseInt(arregloDeBotones[i][j].getText());

                                        if (seleccion == k && (arregloDeBotones[i][j].v1 instanceof Tanque || arregloDeBotones[i][j].v1 instanceof Avion)) {

                                            //JOptionPane.showMessageDialog(null, ("Ha seleccionado para realizar el ataque:"));

                                            JFrame ventana1 = new JFrame("HA SELECCIONADO PARA REALIZAR EL ATAQUE:");
                                            panelS.setLayout(new BoxLayout(panelS,BoxLayout.Y_AXIS));
                                            ventana1.setSize(450, 150);

                                            nomV.setText(" Nombre: "+ arregloDeBotones[i][j].v1.getNickname());
                                            salV.setText(" Vida: "+arregloDeBotones[i][j].v1.getHp());
                                            nivV.setText(" Nivel: "+ arregloDeBotones[i][j].v1.getNivel());
                                            ppV.setText(" Puntos de poder: "+ arregloDeBotones[i][j].v1.getPp());
                                            xpV.setText(" Experiencia: "+ arregloDeBotones[i][j].v1.getExperiencia());
                                            armaV.setText(" Arma: "+ arregloDeBotones[i][j].v1.getArma());
                                            ataqueV.setText(" Ataque: " +arregloDeBotones[i][j].v1.getAtaque());
                                            defV.setText(" Defensa: " + arregloDeBotones[i][j].v1.getDefensa());
                                            puntV.setText(" Punteria" + arregloDeBotones[i][j].v1.getPuntería());
                                            panelS.add(nomV);
                                            panelS.add(salV);
                                            panelS.add(nivV);
                                            panelS.add(ppV);
                                            panelS.add(xpV);
                                            panelS.add(armaV);
                                            panelS.add(ataqueV);
                                            panelS.add(defV);
                                            panelS.add(puntV);

                                            ventana1.add(panelS);
                                            ventana1.setVisible(true);

                                            if (direccion == 1) {

                                                for(int o=j+1; o< dx; o++){

                                                    contadorCasillas= contadorCasillas +1;
                                                }

                                                System.out.println("Casillas disponibles " + contadorCasillas);
                                                System.out.println("DADO: " + dadoM);
                                                if(contadorCasillas>= dadoM) {
                                                    if(!(arregloDeBotones[(i)][(j + dadoM)].v1 instanceof Tanque || arregloDeBotones[(i)][(j + dadoM)].v1 instanceof Avion)) {
                                                        moverVehículo(arregloDeBotones[i][j], arregloDeBotones[(i)][(j + dadoM)]);
                                                        //arregloDeBotones[i][j].getCuadroColor();
                                                        arregloDeBotones[i][j].setIcon(null);
                                                    }

                                                }

                                                if(contadorCasillas <= dadoM && contadorCasillas!=0) {
                                                    if(!(arregloDeBotones[(i)][(j + contadorCasillas)].v1 instanceof Tanque || arregloDeBotones[(i)][(j + contadorCasillas)].v1 instanceof Avion)) {
                                                        moverVehículo(arregloDeBotones[i][j], arregloDeBotones[(i)][(j + contadorCasillas)]);
                                                        //arregloDeBotones[i][j].getCuadroColor();
                                                        arregloDeBotones[i][j].setIcon(null);
                                                    }

                                                    ////////////////////////////////////////    MENSAJE NO PUEDE MOVER VEHICULO SOBRE OTRO
                                                       /* else {
                                                            JOptionPane.showMessageDialog(null, "No puede poner un vehiculo sobre otro");
                                                        }*/
                                                }

                                                if(contadorCasillas==0) {
                                                    JOptionPane.showMessageDialog(null, "Limite de escenario");
                                                }
                                            }


                                            //ATACAR ABAJO
                                            if (direccion == 4) {

                                                //for (int o = a+1; o < dy; o++) {
                                                for (int o = i+1; o< dy; o++) {

                                                    if (arregloDeBotones[o][j].v1 instanceof Enemigo) {
                                                        System.out.println("Hay un enemigo");
                                                    }
                                                }
                                            }











                                               /* for(int o=i+1; o< dy; o++){

                                                    contadorCasillas= contadorCasillas +1;
                                                }

                                                if(contadorCasillas>= dadoM) {
                                                    if(!(arregloDeBotones[(i + dadoM)][(j)].v1 instanceof Tanque || arregloDeBotones[(i + dadoM)][(j)].v1 instanceof Avion)) {
                                                        moverVehículo(arregloDeBotones[i][j], arregloDeBotones[(i + dadoM)][(j)]);
                                                        //arregloDeBotones[i][j].getCuadroColor();
                                                        arregloDeBotones[i][j].setIcon(null);
                                                    }
                                                }

                                                if(contadorCasillas <= dadoM && contadorCasillas!=0) {
                                                    if (!(arregloDeBotones[(i+contadorCasillas)][(j)].v1 instanceof Tanque || arregloDeBotones[(i+contadorCasillas)][(j)].v1 instanceof Avion)) {
                                                        moverVehículo(arregloDeBotones[i][j], arregloDeBotones[(i + contadorCasillas)][(j)]);
                                                        // arregloDeBotones[i][j].getCuadroColor();
                                                        arregloDeBotones[i][j].setIcon(null);
                                                    }
                                                }

                                                if(contadorCasillas==0) {
                                                    JOptionPane.showMessageDialog(null, "Limite de escenario");

                                                }*/
                                                //Flechas.setDireccion(0);
                                            //}






                                }
                                    }
                                }


                            }
                        }
                );
            }
        }
    }


}
