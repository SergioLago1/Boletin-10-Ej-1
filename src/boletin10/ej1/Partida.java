/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin10.ej1;

import javax.swing.JOptionPane;

/**
 *
 * @author slagogonzalez
 */
public class Partida {

    int numAdivinar;
    int numIntentos;

    public void setNumAdivinar() {

        do {
            numAdivinar = Integer.parseInt(JOptionPane.showInputDialog("Introducir un numero para adivinar del (1-50)"));
        } while (numAdivinar < 1 | numAdivinar > 50);
    }

    public void setNumIntentos() {
        numIntentos = Integer.parseInt(JOptionPane.showInputDialog("Introducir numero de intentos para adivinar"));
    }

    public void EjecutarPartida() {
        boolean perdiste = true;
        boolean NoValido = false;

        for (int i = 0; i < numIntentos; i++) {
            do {
                int respuesta = Integer.parseInt(JOptionPane.showInputDialog("Intento:  " + (i + 1)));
                if (respuesta >= 1 && respuesta <= 50) {

                    if (respuesta < numAdivinar) {

                        JOptionPane.showMessageDialog(null, "Pista " + (i + 1) + " : el número es menor al número que hay que acertar.");

                    } else if (respuesta > numAdivinar) {
                        JOptionPane.showMessageDialog(null, "Pista " + (i + 1) + " : el número es mayor al número que hay que acertar.");

                    } else {

                        JOptionPane.showMessageDialog(null, "Acertaste!!!.");
                        perdiste = false;
                        break;

                    }

                } else {
                    NoValido = true;
                }
            } while (NoValido);
        }
        if (perdiste) {
            JOptionPane.showMessageDialog(null, "Has perdido, el número a adivinar era " + numAdivinar);
        }

    }
}
