package com.pablo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Jugador extends JFrame {

    JFrame frame = new JFrame();

    private int contador=1;

    int selec;
    int cont = 0;
    int contadorpos=1;
    int contadorpos2=3;
    int[] selección = new int[3];

    private JPanel panelInfo;
    private JPanel panelIngreso;

    private JTextField dimension;

    private JLabel linfo;
    private JLabel seleccionNo;

    private JButton ok;
    private JButton tanque;
    private JButton avion;

    public void crearJugador() {

        if (contador <= 2) {
            //Estableciendo propiedades de la ventana; titulo, tamaño y los paneles que contendrà
            JFrame ventana = new JFrame("CREANDO NUEVO JUGADOR");
            ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
            ventana.setSize(700, 100);

            //panel superior de informacion
            panelInfo = new JPanel();

            //panel inferior en donde se ingresaràn las dimensiones a jugar
            panelIngreso = new JPanel();

            ok = new JButton("OK");


            if (TipoJ.getTipoJuego() == 1) {

                //Estableciendo las propiedades de los campos
                dimension = new JTextField(10);
                linfo = new JLabel("Ingrese el nombre del nuevo jugador");

                //añadiendo los botones y campos a cada panel
                panelInfo.add(linfo);
                panelIngreso.add(dimension);
                panelIngreso.add(ok);


                //evento de boton, permite leer y crear las dimensiones del tablero a jugar y lo inicializa
                ok.addActionListener(
                        new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                if (dimension.getText() != null) {

                                    System.out.println("Jugador1 creado");

                                    ventana.setVisible(false);
                                    ventana.dispose();

                                    SeleccionVehiculos p = new SeleccionVehiculos();
                                    p.SeleccionVehiculos();
                                    //SeleccionVehículos();
                                    //seleccionarVehiculos();

                                    //r = Integer.parseInt(dimension.getText());
                                    //arregloDeBotones = new JButton[r][r];
                                    // iniciarTablero(r);
                                } //else
                                //inicioJuego();
                            }
                        }
                );
            }

            if (TipoJ.getTipoJuego() == 2) {

                //Estableciendo las propiedades de los campos
                dimension = new JTextField(10);
                linfo = new JLabel("Ingrese el nombre del nuevo jugador " + contador);

                //añadiendo los botones y campos a cada panel
                panelInfo.add(linfo);
                panelIngreso.add(dimension);
                panelIngreso.add(ok);

                //evento de boton, permite leer y crear las dimensiones del tablero a jugar y lo inicializa
                ok.addActionListener(
                        new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                if (dimension.getText() != null) {

                                    //Estableciendo las propiedades de los campos
                               /* dimension = new JTextField(10);
                                linfo = new JLabel("Ingrese el nombre del nuevo jugador " + contador);
                               // ok = new JButton("OK");

                                //añadiendo los botones y campos a cada panel
                                panelInfo.add(linfo);
                                panelIngreso.add(dimension);
                                panelIngreso.add(ok);
*/


                                    contador++;
                                    System.out.println("Jugador2 creado");

                                    ventana.setVisible(false);
                                    ventana.dispose();

                                    crearJugador();
                                }
                            }
                        }
                );
            }

            //Establece el lugar de posicion de cada panel
            ventana.getContentPane().add(BorderLayout.NORTH, panelInfo);
            ventana.getContentPane().add(BorderLayout.CENTER, panelIngreso);

            //permite visualizar la ventana creada
            ventana.setVisible(true);

        } else {

            //SeleccionVehículos();
        }
    }

/*    public void SeleccionVehículos() {

        String nombre;
        int numvehículo = 1, selec;

        System.out.println("Seleccione 3 vehículos\n[0] Tanque \n[1] Avion");

        //for que recorrerá la matriz [3] de seleccion de vehículos
        for (int i = 0; i < 3; i++) {
            System.out.println("\nSeleccione vehículo No. " + numvehículo);
            Scanner p = new Scanner(System.in);
            selec = p.nextInt();
            selección[i] = selec;

            //comparacion para inicializar un tanque
            if (selección[i] == 0) {
                System.out.println("Ha seleccionado Tanque\n");
                numvehículo++;
                //escenario[11][cont].inicializarTanque();
                cont = cont + 5;

            }

            //comparacion para inicializar un avion
            if (selección[i] == 1) {
                System.out.println("Ha seleccionado Avion\n");
                numvehículo++;
                //escenario[11][cont].inicializarAvion();
                cont = cont + 5;
            }
            if (selección[i] != 0 && selección[i] != 1) {
                System.out.println("Caracter incorrecto, intente de nuevo");
                i--;
            }
        }
    }*/



    public void seleccionarVehiculos() {

        JPanel panelSuperior;
        JPanel panelCentro;

        //inicializando los paneles a utilizar
        panelSuperior = new JPanel();
        panelCentro = new JPanel();

        //añaden propiedades a la ventana
        JFrame seleccionPieza = new JFrame("SELECCION DE VEHICULOS");
        seleccionPieza.setSize(400, 200);

        //establece las filas y columnas para los botones
        panelCentro.setLayout(new GridLayout(1, 2));

        //obtienen las direcciones de los iconos torre y alfil
        ImageIcon iconoTanque = new ImageIcon("out/production/Tanques y Aviones V2/com/Imagen/tanque2.png");
        ImageIcon iconoAvion = new ImageIcon("out/production/Tanques y Aviones V2/com/Imagen/avion2.png");

        //establecen las dimensiones de los iconos
        int ancho = 70;
        int alto = -1;

        //inicializan los botones a utilizar
        tanque = new JButton();
        avion = new JButton();

        //inicializando campos de informacion
        seleccionNo = new JLabel("Seleccione vehiculo No. 1");

        //se añaden los iconos a los botones torre y alfil
        tanque.setIcon(new ImageIcon(iconoTanque.getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_DEFAULT)));
        avion.setIcon(new ImageIcon(iconoAvion.getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_DEFAULT)));

        panelSuperior.add(seleccionNo);
        panelCentro.add(tanque);
        panelCentro.add(avion);

        seleccionPieza.getContentPane().add(BorderLayout.CENTER, panelCentro);
        seleccionPieza.getContentPane().add(BorderLayout.NORTH, panelSuperior);

        //permite visualizar la ventana
        seleccionPieza.setVisible(true);

        //evento de boton torre
        tanque.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        //establece parámetro de seleccion de torre y muestra la ventana para seleccionar el boton
                        //donde se creará la nueva pieza
                        selec=1;
                        System.out.println("Ha seleccionado torre");
                        frame.setVisible(true);
                    }
                }
        );

        //evento de boton alfil
        avion.addActionListener(

                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        //establece parámetro de seleccion de alfil y muestra la ventana para seleccionar el boton
                        //donde se creará la nueva pieza
                        selec=2;
                        System.out.println("Ha seleccionado alfil");
                        frame.setVisible(true);
                    }
                }
        );
    }
}
