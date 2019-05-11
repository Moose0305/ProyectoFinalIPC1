package com.pablo;

public class TerrenoMontaña extends Terreno {

    String árbol;

    int vida = 5;

    /*@Override
    String getCuadroColor() {
        return null;
    }*/

    public TerrenoMontaña() {

        this.setBackground(new java.awt.Color(8, 203, 0));
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
}

