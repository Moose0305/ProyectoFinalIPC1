package com.pablo;

import java.util.Scanner;

/**
 * super clase vehìculo
 */
//CLASE ABSTRACTA QUE HEREDA A TANQUE, AVION Y ENEMIGO
abstract public class Vehículo {

    //ATRIBUTOS DE LA SUPER CLASE
    protected int hp, pp, nivel, contadordisparo;
    protected int experiencia;
    protected String nickname, arma, armabásica;
    protected static final char Tanque = 'T';
    protected static final char Avión = 'A';
    protected final char Enemigo = (char)36;

    protected static final String Blanco = "\033[30m";
    protected static final String Rojo = "\033[31m";

    /**
     * Constructor
     */
    //DEFECTO
    public Vehículo() {
        hp = 50;
        pp = 5;
        nivel = 1;
        experiencia = 0;
        arma = armabásica;
    }

    //PARAMETRO NICKNAME
    public Vehículo(String nickname) {
        this();
        nickname = "default";
        arma = armabásica;
    }

    //METODO PARA SELECCIONAR EL NOMBRE DE UN VEHICULO
   /* public String datosvehículo () {
        Scanner s = new Scanner(System.in);
        System.out.println("\nIngrese el nickname del vehículo ");
        nickname = s.nextLine();
        setNickname(nickname);

        return nickname;
    }*/

    public String datosvehículo () {

        nickname = "v1";
        setNickname(nickname);

        return nickname;
    }

    //GETTERS, PARA ACCEDER
    public int getHp() {
        return hp;
    }

    public int getNivel() {
        return nivel;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public int getPp() {
        return pp;
    }


    public String getNickname() {
        return nickname;
    }

    public int getContadordisparo() {return contadordisparo;}


    //GETTERS ABSTRACTOS, GENERALES
    abstract String getVehículo();
    abstract String getDatosVehìculo();
    abstract String getArma();
    abstract int getAtaque();
    abstract int getDefensa();
    abstract int getPuntería();

    //SETTERS, PARA CAMBIAR VALORES
    abstract public void setHp(int hp, int nivel);
    abstract public void setHp(int hp);
    abstract public void setPp(int pp);
    abstract public void setNivel(int nivel);
    abstract public void setExperiencia(int experiencia);
    abstract public void setAtaque(int ataque, int nivel);
    abstract public void setAtaque(int ataquel);
    abstract public void setDefensa(int defensa);
    abstract public void setDefensa(int defensa, int nivel);
    abstract public void setPuntería(int puntería);
    abstract public void setPuntería(int puntería, int nivel);
    abstract public void setArma(String arma);

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}