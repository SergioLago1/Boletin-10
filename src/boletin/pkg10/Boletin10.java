/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg10;

/**
 *
 * @author slagogonzalez
 */
public class Boletin10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Partida juego = new Partida();
        juego.setNumAdivinar();
        juego.calcNumIntentos();
        juego.EjecutarPartida();
    }
    
}
