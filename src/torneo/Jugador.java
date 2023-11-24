/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package torneo;

/**
 *
 * @author benja
 */
public class Jugador implements Acciones {
//    En Java, protected es un modificador de acceso que hace que un miembro 
//    (como un atributo o método) sea accesible dentro de su propia clase, 
//            en clases del mismo paquete y en clases hijas (subclases) 
//            incluso si están en paquetes diferentes.
    protected String nombre;
    protected int vida;
    protected int ataque;

    public Jugador(String nombre, int ataque) {
        this.nombre = nombre;
        this.vida = 100;
        this.ataque = ataque;

    }

    public Jugador() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    
    @Override
    public boolean estoyVivo() {
         return vida > 0;
    }

    @Override
    public void aumentarVida(int cantidad) {
        vida += cantidad;
    }

    @Override
    public void disminuirVida(int cantidad) {
        vida -= cantidad;
        if (vida < 0) {
            vida = 0;
        }
    }

    @Override
    public double calcularCritico() {
         return Math.random();
    }
    
    @Override
    public void hablar() {
        System.out.println("Mensaje");
    }
}
