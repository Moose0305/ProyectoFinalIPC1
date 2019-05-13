package com.pablo;

/**
 * Declaracion de TerrenoTierra que hereda de Terreno
 */
public class TerrenoTierra extends Terreno {

    int tipo = 1;

    /**
     * constructor que establece el color del terreno
     */
    public TerrenoTierra(){

        this.setBackground(new java.awt.Color(168, 72, 40));
    }
}
