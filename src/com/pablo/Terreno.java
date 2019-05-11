package com.pablo;

import javax.swing.*;

public abstract class Terreno extends JButton {

    //SUPER CLASE ABSTRACTA

    public static int numtanque;
    public static int numavion;

    protected static final char CuadroA = '~';
    protected final char CuadroT = (char)178;
    protected final char CuadroM = (char)254;

    protected static final String Agua = "\033[36m";
    protected static final String Tierra = "\033[33m";
    protected static final String Montaña = "\033[32m";

    ImageIcon iconoAgua= new ImageIcon("out/production/Tanques y Aviones V2/com/Imagen/agua.png");
    ImageIcon iconoTierra= new ImageIcon("out/production/Tanques y Aviones V2/com/Imagen/tierra.jpg");
    ImageIcon iconoMontaña= new ImageIcon("out/production/Tanques y Aviones V2/com/Imagen/montaña.png");
    ImageIcon iconoTanque1 = new ImageIcon("out/production/Tanques y Aviones V2/com/Imagen/tanque2.png");
    ImageIcon iconoAvion2 = new ImageIcon("out/production/Tanques y Aviones V2/com/Imagen/avion2.png");


    //this.setBackground(new java.awt.Color(168, 72, 40)); tierra
    // this.setBackground(new java.awt.Color(8, 203, 0));  montaña
    //this.setBackground(new java.awt.Color(39, 198, 203));  agua


    //establecen las dimensiones de los iconos
    int ancho = 70;
    int alto = -1;

    protected Vehículo v1;

    Terreno(){
       JButton Terreno = new JButton("J");
        //this.setText("J");
        //this.setIcon(new ImageIcon(iconoMontaña.getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_DEFAULT)));


        //this.setBackground(new java.awt.Color(39, 198, 203));
        //this.setIcon(new ImageIcon(iconoMontaña.getImage()));

        //this.setIcon();
        v1 = null;
    }

    public boolean isEmpty(){
        if (v1 == null)
            return true;
        return false;
    }

    public void setV1(Vehículo v1) {
       this.v1 = v1;

       if(this.v1 instanceof Tanque)
        this.setIcon(new ImageIcon(iconoTanque1.getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_DEFAULT)));

       if(this.v1 instanceof  Avion)
           this.setIcon(new ImageIcon(iconoAvion2.getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_DEFAULT)));
    }

    public Vehículo getV1() {
        return v1;
    }

    public void inicializarTanque(String nombre){
        v1 = new Tanque();
        v1.setNickname(nombre);
        v1.getVehículo();
    }

    public void inicializarAvion(String nombre){
        v1 = new Tanque();
        v1.setNickname(nombre);
        v1.getVehículo();
    }

    public void inicializarTanque(){
        v1 = new Tanque();
        v1.getVehículo();
        numtanque++;
        System.out.println("\nNickname de tanque "+ numtanque + ": " + v1.datosvehículo());
        v1.getDatosVehìculo();
    }


    public void inicializarAvion(){
        v1 = new Avion();
        v1.getVehículo();
        numavion++;
        System.out.println("\nNickname de avion "+ numavion + ": " + v1.datosvehículo());
        v1.getDatosVehìculo();
    }

    public void inicializarEnemigo(){
        v1 = new Enemigo();
        v1.getVehículo();
    }

    /*String getLine1(){
        if (v1!= null)
            return getCuadroColor()+getCuadroColor()+v1.getVehículo()+getCuadroColor()+getCuadroColor();

        return getCuadroColor()+getCuadroColor()+getCuadroColor()+getCuadroColor()+getCuadroColor();
    }*/

    //abstract String getCuadroColor();
}
