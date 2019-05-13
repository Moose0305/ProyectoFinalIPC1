package com.pablo;

/**
 * Declaracion de clase Tanque que hereda de vehiculo
 */
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
     * Constructor que inicializa atributos de tanque
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
     * Constructor que inicializa atributos de tanque con el parametro nombre
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

    /**
     * obtiene el nombre de v
     * @return nombre
     */
    public String getNickname() {return  nickname;}

    /**
     * obtiene ataque de v
     * @return ataque
     */
    public int getAtaque() {
        return ataque;
    }

    /**
     * obtiene defensa de v
     * @return defensa
     */
    public int getDefensa() {
        return defensa;
    }

    /**
     * obtiene Xp de v
     * @return Xp
     */
    public int getExperiencia() {
        return experiencia;
    }

    /**
     * obtiene vida de v
     * @return vida
     */
    public double  getHp () { return  hp;}

    /**
     * obitiene nivel de v
     * @return nivel
     */
    public int  getNivel () { return  nivel;}

    /**
     * obtiene arma de v
     * @return arma
     */
    public String getArma() {return arma;}

    /**
     * obtiene punteria de v
     * @return punteria
     */
    public int getPuntería() {
        return puntería;
    }


    //SETTERS - MODIFICAR- EN FUNCION DEL NIVEL

    /**
     * modifica nombre de v
     * @param nickname nombre
     */
    public void setNickname(String nickname) { this.nickname = nickname;}

    /**
     * modifica Puntos de poder de v
     * @param pp puntos de poder
     */
    public void setPp(int pp) {this.pp = pp;}

    /**
     * modifica nivel de v
     * @param nivel nivel
     */
    public void setNivel(int nivel) {this.nivel = nivel;}

    /**
     * modifica Xp de v
     * @param experiencia Xp
     */
    public void setExperiencia(int experiencia) {this.experiencia = experiencia;}

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
        this.hp = hp;
    }

    /**
     * modifica ataque de v
     * @param ataque ataque
     * @param nivel nivel
     */
    public void setAtaque(int ataque, int nivel) {
        this.ataque = ataque + ((nivel-1)*2);
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
     * @param nivel nivelf
     */
    public void setDefensa(int defensa, int nivel) {
        this.defensa = + ((nivel-1)*1);
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
        this.puntería = puntería + 1*nivel;
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
    //METODO QUE DEVUELVE LOS DATOS DEL VEHICULO
    public String getDatosVehìculo() {
        System.out.println("\nDatos del vehículo :" + "\nNickname: " + getNickname() + "\nSalud: " + getHp() +"\nNivel: "+ getNivel() +"\nPuntos de poder: " +  getPp()+
                "\nExperiencia: " + getExperiencia() + "\nArma: " + getArma() + "   Ataque: " + getAtaque() + "   Defensa: " +
                getDefensa() + "   Puntería: " + getPuntería());
        return ("\nDatos del vehículo :" + "\nNickname: " + getNickname() + "\nSalud: " + getHp() +"\nNivel: "+ getNivel() +"\nPuntos de poder: " +  getPp()+
                "\nExperiencia: " + getExperiencia() + "\nArma: " + getArma() + "   Ataque: " + getAtaque() + "   Defensa: " +
                getDefensa() + "   Puntería: " + getPuntería());
    }


}
