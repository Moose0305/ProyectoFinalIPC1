package com.pablo;

/**
 * Declaracion de clase TerrenoMontaña que hereda de terreno
 */
public class TerrenoMontaña extends Terreno {

    String árbol;

    int vida = 5;

    /**
     * constructor que establece el color del terreno
     */
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

