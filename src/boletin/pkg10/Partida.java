/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg10;

import javax.swing.JOptionPane;

/**
 *
 * @author slagogonzalez
 */
public class Partida {
    int numAdivinar;
    int numIntentos;
    
    public void setNumAdivinar(){
            
     do {
         numAdivinar = Integer.parseInt(JOptionPane.showInputDialog("Introducir un numero para adivinar entre (1-50)"));

    }while (numAdivinar < 1 | numAdivinar >50);
}

  public void calcNumIntentos(){
      numIntentos = Integer.parseInt(JOptionPane.showInputDialog("Introducir numero de intentos para adivinar"));
  }  

public void EjecutarPartida(){
    boolean perdiste = true;
    boolean noValido = false;

for (int i=0; i < numIntentos; i++){
    do{
        int respuesta = Integer.parseInt(JOptionPane.showInputDialog("Intento: " +(i+1)));
        if (respuesta >= 1 && respuesta <= 50){
           
            if (respuesta < numAdivinar){ 
             JOptionPane.showMessageDialog(null, "Pista: "+(i + 1)+ "el numero que hay que acertar es mayor");
             
            }else if(respuesta > numAdivinar){
               JOptionPane.showMessageDialog(null, "Pista: "+(i + 1)+ "el numero que hay que adivinar es menor");
           
            }else{
                JOptionPane.showMessageDialog(null, "ACERTASTE!!!");
                perdiste = false;
                break;
                
            }
        }else{
            noValido= true;
        }
    }while(noValido);
 }
if (perdiste){
    JOptionPane.showMessageDialog(null,"Has perdido, el numero a adivinar era : "+numAdivinar);
}
}
}




