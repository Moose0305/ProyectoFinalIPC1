package com.pablo;

public class Avion extends Vehículo {

    //CLASE HIJA DE VEHICULO, HEREDA SUS ATRIBUTOS, METODOS

    //ATRIBUTOS CLASE HIJA
    private int ataque, defensa, movespecial, puntería, s2=1;
    public int alerones=2;

    //SOBRE ESCRITURA DE METODOS ABSTRACTOS QUE DEVUELVEN EL COLOR Y SIMBOLO DEL OBJETO
    @Override
    String getVehículo() {
        return Blanco + Avión;
    }

    //SOBRE CARGA DE CONSTRUCTORES SIN PARAMETRO Y CON PARAMETRO NOMBRE

    /**
     * Constructor
     */
    public Avion() {
        nivel = s2;
        hp = 50 + ((nivel-1)*50);
        pp = 5;
        experiencia = 0;
        arma = "Basica Avion";
        //ataque = 7 + ((nivel-1)*2);
        ataque = 40 + ((nivel-1)*2);
        defensa = 3 + ((nivel-1)*1);
        puntería = 70 + ((nivel-1)*1);
    }

    /**
     * Constructor nickname
     */
    public Avion(String nickname) {
        super(nickname);
        hp = 50;
        pp = 5;
        nivel = 1;
        experiencia = 0;
        arma = "Basica Avion";

        ataque = 10;
        defensa = 6;
        puntería = 60;
    }



    //GETTERS - ACCEDER
    public String getNickname() {return nickname; }

    public int getAtaque() {
        return ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public int  getHp () { return  hp;}

    public int  getNivel () { return  nivel;}

    public int getExperiencia() {return experiencia;}

    public int getMovespecial() {
        return movespecial;
    }

    public int getS2() {
        return s2;
    }

    public int getPuntería() {
        return puntería;
    }

    public String getArma() {return arma;}


    //SETTERS - MODIFICAR- EN FUNCION DEL NIVEL
    public void setHp(int hp, int nivel) {
        this.hp = hp + ((nivel-1)*50);
    }

    public void setHp(int hp) {
        this.hp = hp;
    }


    public void setPp(int pp) {this.pp= pp;}

    public void setNivel(int nivel) {this.nivel= nivel;}


    public void setNickname(String nickname) {this.nickname = nickname; }

    public void setExperiencia(int experiencia) {this.experiencia = experiencia;}


    public void setAtaque(int ataque, int nivel) {
        this.ataque = ataque +  2*nivel;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void setDefensa(int defensa, int nivel) {
        this.defensa = defensa + 1*nivel;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }


    public void setMovespecial(int movespecial) {
        this.movespecial = movespecial;
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

    //METODO ABSTRACTO QUE DEVUELVE DATOS DEL VEHICULO
    String getDatosVehìculo() {
        System.out.println("\nDatos del vehículo: " + "\nNickname: " + getNickname() +  "\nSalud: " + getHp() +"\nNivel: "+ getNivel() +"\nPuntos de poder: " +  getPp()+
                "\nExperiencia: " + getExperiencia() + "\nArma: " + getArma() + "   Ataque: " + getAtaque() + "   Defensa: " +
                getDefensa() + "   Puntería: " + getPuntería());
        return ("String");
    }
}