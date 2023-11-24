/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package torneo;

/**
 *
 * @author benja
 */
public interface Acciones {
    boolean estoyVivo();
    void aumentarVida(int cantidad);
    void disminuirVida(int cantidad);
    double calcularCritico();
    void hablar();
}
