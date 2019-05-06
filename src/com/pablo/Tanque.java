package com.pablo;

public class Tanque extends Vehículo {

    //CLASE HIJA DE VEHICULO, HEREDA

    //ATRIBUTOS DE CLASE HIJA
    private int ataque, defensa, movespecial, puntería,s2=1;
    public int llantas=6;

    //SOBRE ESCRITURA DE METODOS ABSTRACTOS QUE DEVUELVEN EL COLOR Y SIMBOLO DEL OBJETO
    @Override
    String getVehículo() {
        return Blanco + Tanque;
    }

    //SOBRE CARGA DE CONSTRUCTORES SIN PARAMETRO Y PARAMETRO NOMBRE
    /**
     * Constructor
     */
    public Tanque() {
        nivel = 1;
        hp = 50 + ((nivel-1)*50);
        pp = 5;
        experiencia = 0;
        arma = "Basica Tanque";
        //ataque = 10 + ((nivel-1)*2);
        ataque = 40 + ((nivel-1)*2);
        defensa = 6 + ((nivel-1)*1);
        puntería = 60 + ((nivel-1)*1);
    }
    /**
     * Constructor nickname
     */
    public Tanque(String nickname) {
        super(nickname);
        hp = 50;
        pp = 5;
        nivel = 1;
        experiencia = 0;
        arma = "Basica Tanque";

        ataque = 10;
        defensa = 6;
        puntería = 60;
    }

    //GETTERS ACCEDER
    public String getNickname() {return  nickname;}

    public int getAtaque() {
        return ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public int  getHp () { return  hp;}

    public int  getNivel () { return  nivel;}

    public String getArma() {return arma;}

    public int getMovespecial() {
        return movespecial;
    }

    public int getS2() {
        return s2;
    }

    public int getPuntería() {
        return puntería;
    }


    //SETTERS - MODIFICAR- EN FUNCION DEL NIVEL


    public void setNickname(String nickname) { this.nickname = nickname;}


    public void setPp(int pp) {this.pp = pp;}

    public void setNivel(int nivel) {this.nivel = nivel;}


    public void setExperiencia(int experiencia) {this.experiencia = experiencia;}

    public void setHp(int hp, int nivel) {
        this.hp = hp + ((nivel-1)*50);
    }

    public void setHp(int hp) {
        this.hp = hp;
    }


    public void setAtaque(int ataque, int nivel) {
        this.ataque = ataque + ((nivel-1)*2);
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void setDefensa(int defensa, int nivel) {
        this.defensa = + ((nivel-1)*1);
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

   /* public void setDefensa(int defensa) {
        this.defensa = + ((nivel-1)*1);
    }*/




    public void setPuntería(int puntería, int nivel) {
        this.puntería = puntería + 1*nivel;
    }

    public void setPuntería(int puntería) {
        this.puntería = puntería + 1*nivel;
    }

    public void setArma(String arma) {
        this.arma = arma ;
    }

    public void setMovespecial(int movespecial) {
        this.movespecial = movespecial;
    }

    public void setS2(int s2) {
        this.s2 = s2;
    }



    //METODO QUE DEVUELVE LOS DATOS DEL VEHICULO
    public String getDatosVehìculo() {
        System.out.println("\nDatos del vehículo :" + "\nNickname: " + getNickname() + "\nSalud: " + getHp() +"\nNivel: "+ getNivel() +"\nPuntos de poder: " +  getPp()+
                "\nExperiencia: " + getExperiencia() + "\nArma: " + getArma() + "   Ataque: " + getAtaque() + "   Defensa: " +
                getDefensa() + "   Puntería: " + getPuntería());
        return ("String");
    }


}
