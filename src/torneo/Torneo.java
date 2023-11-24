/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package torneo;

import java.util.ArrayList;

/**
 *
 * @author benja
 */
public class Torneo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        // Jugador[] jugadores = new Jugador[3];
        
        
        ArrayList<Jugador> jugadores = new ArrayList<>();
        
        jugadores.add(new Mago("Mario", 100));
        jugadores.add(new Guerrero("Benjamin", 150));
        jugadores.add(new Mago("Elias", 200));
        
        
        for (Jugador jugador : jugadores) {
            System.out.println("----------");
            jugador.hablar();
            System.out.println(jugador.nombre);
            
            if (jugador instanceof Acciones) {
               System.out.println("Tengo acciones");
            }
               
            if (jugador instanceof Jugador) {
               System.out.println("Es un jugador");
            }
             
            if (jugador instanceof Mago) {
                System.out.println("Es un mago");
            }
            
            if (jugador instanceof Guerrero) {
               System.out.println("Es un Guerrero");
            }
            System.out.println("----------");
            System.out.println("");
        }
        
        
        Ventana1 ventana = new Ventana1();
        ventana.jugadores = jugadores;
        ventana.setVisible(true);
        
        
//        System.exit(0);
    }
    
}
