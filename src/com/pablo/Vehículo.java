package com.pablo;

import java.util.Scanner;

/**
 * super clase vehìculo
 */
//CLASE ABSTRACTA QUE HEREDA A TANQUE, AVION Y ENEMIGO
abstract public class Vehículo {

    //ATRIBUTOS DE LA SUPER CLASE
    protected int pp, nivel, contadordisparo;
    protected double hp;
    protected int experiencia;
    protected String nickname, arma, armabásica;
    protected static final char Tanque = 'T';
    protected static final char Avión = 'A';
    protected final char Enemigo = (char)36;

    protected static final String Blanco = "\033[30m";
    protected static final String Rojo = "\033[31m";

    /**
     * Constructor que inicializa atributos de vehiculo
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
    /**
     * @param nickname nombre de vehiculo
     * Constructor que inicializa atributos de vehiculo
     */
    public Vehículo(String nickname) {
        this();
        nickname = "default";
        arma = armabásica;
    }

    /**
     * setea el nombre de un vehiculo
     * @return
     */
    public String datosvehículo () {

        nickname = "v1";
        setNickname(nickname);

        return nickname;
    }

    //GETTERS, PARA ACCEDER

    /**
     * obtiene vida de v
     * @return vida
     */
    public double getHp() {
        return hp;
    }

    /**
     * obtiene nivel de v
     * @return nivel
     */
    public int getNivel() {
        return nivel;
    }

    /**
     * obtiene Xp de v
     * @return Xp
     */
    public int getExperiencia() {
        return experiencia;
    }

    /**
     * Obtiene pp de v
     * @return Pp
     */
    public int getPp() {
        return pp;
    }

    /**
     * obtiene nombre de v
     * @return nombre
     */
    public String getNickname() {
        return nickname;
    }

    public int getContadordisparo() {return contadordisparo;}


    //GETTERS ABSTRACTOS, GENERALES

    /**
     * obtiene el nombre del v
     * @return nombre
     */
    abstract String getVehículo();

    /**
     * obtiene datos del v
     * @return datos
     */
    abstract String getDatosVehìculo();

    /**
     * obtiene arma de v
     * @return arma
     */
    abstract String getArma();

    /**
     * obtiene ataque de v
     * @return ataque
     */
    abstract int getAtaque();

    /**
     * obtiene defensa de v
     * @return defensa
     */
    abstract int getDefensa();
    abstract int getPuntería();

    //SETTERS, PARA CAMBIAR VALORES

    /**
     * modifica vida de v
     * @param hp vida
     * @param nivel nivel
     */
    abstract public void setHp(double hp, int nivel);

    /**
     * modifica nivel de v
     * @param nivel nivel
     */
    abstract public void setNivel(int nivel);

    /**
     * modifica experiencia de v
     * @param experiencia experiencia
     */
    abstract public void setExperiencia(int experiencia);

    /**
     * modifica nombre  de v
     * @param nickname nombre
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}