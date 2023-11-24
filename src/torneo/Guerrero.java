/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package torneo;

/**
 *
 * @author benja
 */
public class Guerrero extends Jugador{

    public Guerrero(String nombre, int vida) {
        super(nombre, vida);
    }

    public Guerrero() {
    }
    
    @Override
    public void hablar() {
        System.out.println("Soy el Guerrero");
    }
}
