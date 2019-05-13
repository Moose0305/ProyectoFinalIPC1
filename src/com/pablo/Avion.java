package com.pablo;


/** declaracion de la clase Avion que hereda de Vehiculo
 *
 */
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

    /** Inicializa los atributos de un avion
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
     * Inicializa los atributos de un avion con parametro nombre
     * constructor
     * @param nickname nombre del vehiculo
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


    /**
     * Accede a nombre de vehiculo
     * @return nombre
     */
    //GETTERS - ACCEDER
    public String getNickname() {return nickname; }

    /**
     * Accede a ataque de vehiculo
     * @return ataque
     */
    public int getAtaque() {
        return ataque;
    }

    /**
     * Accede a defensa de vehiculo
     * @return defensa
     */
    public int getDefensa() {
        return defensa;
    }

    /**
     * Accede a vida de vehiculo
     * @return vida
     */
    public double  getHp () { return  hp;}

    /**
     * Accede a nivel de vehiculo
     * @return nivel
     */
    public int  getNivel () { return  nivel;}

    /**
     * Accede a experiencia de vehiculo
     * @return experiencia
     */
    public int getExperiencia() {return experiencia;}

    /**
     * Accede a punteria de vehiculo
     * @return punteria
     */
    public int getPuntería() {
        return puntería;
    }

    /**
     * Accede a arma de vehiculo
     * @return arma
     */
    public String getArma() {return arma;}


    //SETTERS - MODIFICAR- EN FUNCION DEL NIVEL

    /**
     * Modifica vida de vehiculo
     * @param hp vida
     * @param nivel nivel
     */
    public void setHp(double hp, int nivel) {
        this.hp = hp + ((nivel-1)*50);
    }

    /**
     * Modifica vida de vehiculo
     * @param hp vida
     */
    public void setHp(double hp) {
        this.hp = hp;
    }

    /**
     * Modifica PP de vehiculo
     * @param pp Puntos de poder
     */
    public void setPp(int pp) {this.pp= pp;}

    /**
     * Modifica nivel de vehiculo
     * @param nivel nivel
     */
    public void setNivel(int nivel) {this.nivel= nivel;}


    /**
     * Modifica nombre de vehiculo
     * @param nickname nombre
     */
    public void setNickname(String nickname) {this.nickname = nickname; }

    /**
     * Modifica Xp de vehiculo
     * @param experiencia Xp de vehiculo
     */
    public void setExperiencia(int experiencia) {this.experiencia = experiencia;}


    /**
     * Modifica ataque de vehiculo
     * @param ataque ataque
     * @param nivel nivel
     */
    public void setAtaque(int ataque, int nivel) {
        this.ataque = ataque +  2*nivel;
    }

    /**
     * Modifica ataque de vehiculo
     * @param ataque ataque
     */
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    /**
     * Modifica defensa de vehiculo
     * @param defensa defensa
     * @param nivel nivel
     */
    public void setDefensa(int defensa, int nivel) {
        this.defensa = defensa + 1*nivel;
    }

    /**
     * Modifica defensa de vehiculo
     * @param defensa defensa
     */
    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    /**
     * Modifica punteria de vehiculo
     * @param puntería punteria
     * @param nivel nivel
     */
    public void setPuntería(int puntería, int nivel) {
        this.puntería = puntería + 1*nivel;
    }

    /**
     * Modifica punteria de vehiculo
     * @param puntería punteria
     */
    public void setPuntería(int puntería) {
        this.puntería = puntería;
    }

    /**
     * Modifica arma de vehiculo
     * @param arma arma
     */
    public void setArma(String arma) {
        this.arma = arma ;
    }

    /**
     * Muestra datos de vehiculo
     * @return datos vehiculo
     */
    //METODO ABSTRACTO QUE DEVUELVE DATOS DEL VEHICULO
    String getDatosVehìculo() {
        System.out.println("\nDatos del vehículo: " + "\nNickname: " + getNickname() +  "\nSalud: " + getHp() +"\nNivel: "+ getNivel() +"\nPuntos de poder: " +  getPp()+
                "\nExperiencia: " + getExperiencia() + "\nArma: " + getArma() + "   Ataque: " + getAtaque() + "   Defensa: " +
                getDefensa() + "   Puntería: " + getPuntería());
        return ("String");
    }
}