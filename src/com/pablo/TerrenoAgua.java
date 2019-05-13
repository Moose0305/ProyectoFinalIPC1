package com.pablo;

import java.awt.*;

/**
 * Declaracion de clase TerrenoAgua que hereda de terreno
 */
public class TerrenoAgua extends Terreno {


    int vida = 5;

    /*@Override
    String getCuadroColor() {
        return null;
    }*/

    /**
     * constructor que establece el color del terreno
     */
    public TerrenoAgua() {

        this.setBackground(new java.awt.Color(39, 198, 203));
       }
}