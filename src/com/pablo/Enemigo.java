package com.pablo;

/**
 * Declaracion de clase enemigo que hereda de Vehiculo
 */
public class Enemigo extends Vehículo{

    //CLASE HIJA DE VEHICULO

    //ATRIBUTOS DE LA CLASE HIJA
    private int ataque, defensa, puntería, s2=1;

    //SOBRE ESCRITURA DE METODOS ABSTRACTOS QUE DEVUELVEN EL COLOR Y SIMBOLO DEL OBJETO

    /**
     * Constructor que inicializa atributos de enemigo
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

    /**
     * obtiene vida de vehiculo
     * @return vida
     */
    public double getHp() {
        return hp;
    }

    /**
     * obtiene ataque de vehiculo
     * @return vehiculo
     */
    public int getAtaque() {
        return ataque;
    }

    /**
     * Obtiene defensa de vehiculo
     * @return defensa
     */
    public int getDefensa() {
        return defensa;
    }

    /**
     * Obtiene nivel de vehiculo
     * @return nivel
     */
    public int getNivel() {return nivel;}

    /**
     * obtiene experiencia de vehiculo
     * @return Xp
     */
    public int getExperiencia() {return experiencia;}

    /**
     * obtiene punteria de vehiculo
     * @return punteria
     */
    public int getPuntería() {
        return puntería;
    }

    /**
     * obtiene arma de vehiculo
     * @return arma
     */
    public String getArma() {return arma;}


    //SETTERS- EN FUNCION DEL NIVEL

    /**
     * modifica vida de v
     * @param hp vida
     * @param nivel nivel
     */
    public void setHp(double hp, int nivel) {
        this.hp = hp + ((nivel-1)*50);
    }

    /**
     * modifica vida de v
     * @param hp vida
     */
    public void setHp(double hp) {
        this.hp = hp + ((nivel-1)*50);
    }

    /**
     * modifica Xp de v
     * @param experiencia Xp
     */
    public void setExperiencia(int experiencia) {this.experiencia = experiencia;}

    /**
     * modifica puntos de poder de v
     * @param pp puntos de poder
     */
    public void setPp(int pp) {this.pp= pp;}

    /**
     * modifica nivel de v
     * @param nivel nivel
     */
    public void setNivel(int nivel) {this.nivel= nivel;}

    /**
     * modifica ataque de v
     * @param ataque ataque
     * @param nivel nivel
     */
    public void setAtaque(int ataque, int nivel) {
        this.ataque = ataque +  2*nivel;
    }

    /**
     * modifica defensa de v
     * @param defensa defensa
     * @param nivel nivel
     */
    public void setDefensa(int defensa, int nivel) {
        this.defensa = defensa + 1*nivel;
    }

    /**
     * modifica ataque de v
     * @param ataque ataque
     */
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    /**
     * modifica defensa de v
     * @param defensa defensa
     */
    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    /**
     * modifica punteria de v
     * @param puntería punteria
     * @param nivel nivel
     */
    public void setPuntería(int puntería, int nivel) {
        this.puntería = puntería + 1*nivel;
    }

    /**
     * modifica punteria de v
     * @param puntería punteria
     */
    public void setPuntería(int puntería) {
        this.puntería = puntería;
    }

    /**
     * modifica arma de v
     * @param arma arma
     */
    public void setArma(String arma) {
        this.arma = arma ;
    }

    /**
     * muestra datos de vehiculo
     * @return datos de vehiculo
     */
    //METODO ABSTRACTO QUE DEVUELVE LOS DATOS DEL VEHICULO
    String getDatosVehìculo() {
        System.out.println("\nDatos enemigo: " + "\nSalud: " + getHp() +"\nNivel:"+ getNivel() + "\nAtaque: " + getAtaque() +
                "\nDefensa: " + getDefensa() + "\nPuntería: " + getPuntería());
        return ("String");
    }
}