package com.pablo;

public class Enemigo extends Vehículo{

    //CLASE HIJA DE VEHICULO

    //ATRIBUTOS DE LA CLASE HIJA
    private int ataque, defensa, puntería, s2=1;

    //SOBRE ESCRITURA DE METODOS ABSTRACTOS QUE DEVUELVEN EL COLOR Y SIMBOLO DEL OBJETO
    @Override
    String getVehículo() {
        return Rojo + Enemigo;
    }

    /**
     * Constructor
     */
    public Enemigo() {
        nivel = s2;
        hp = 38+ 2*nivel;
        arma = armabásica;
        ataque = 7 + 1*nivel;
        defensa = 6;
        puntería = 60 + ((nivel-1)*1);
    }

    //GETTERS - ACCEDER
    public int getHp() {
        return hp;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public int getNivel() {return nivel;}

    public int getExperiencia() {return experiencia;}

    public int getS2() {
        return s2;
    }

    public int getPuntería() {
        return puntería;
    }

    public String getArma() {return arma;}


    //SETTERS- EN FUNCION DEL NIVEL
    public void setHp(int hp, int nivel) {
        this.hp = hp + ((nivel-1)*50);
    }

    public void setHp(int hp) {
        this.hp = hp + ((nivel-1)*50);
    }

    public void setExperiencia(int experiencia) {this.experiencia = experiencia;}

    public void setPp(int pp) {this.pp= pp;}

    public void setNivel(int nivel) {this.nivel= nivel;}

    public void setAtaque(int ataque, int nivel) {
        this.ataque = ataque +  2*nivel;
    }

    public void setDefensa(int defensa, int nivel) {
        this.defensa = defensa + 1*nivel;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public void setS2(int s2) {
        this.s2 = s2;
    }

    public void setPuntería(int puntería, int nivel) {
        this.puntería = puntería + 1*nivel;
    }

    public void setPuntería(int puntería) {
        this.puntería = puntería;
    }

    public void setArma(String arma) {
        this.arma = arma ;
    }

    //METODO ABSTRACTO QUE DEVUELVE LOS DATOS DEL VEHICULO
    String getDatosVehìculo() {
        System.out.println("\nDatos enemigo: " + "\nSalud: " + getHp() +"\nNivel:"+ getNivel() + "\nAtaque: " + getAtaque() +
                "\nDefensa: " + getDefensa() + "\nPuntería: " + getPuntería());
        return ("String");
    }
}