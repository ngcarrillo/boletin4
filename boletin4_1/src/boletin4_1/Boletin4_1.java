/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4_1;

import javax.swing.JOptionPane;

/**
 *
 * @author ngarciacarrillo
 */
public class Boletin4_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double cantidad;
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce una cantidad"));
        JOptionPane.showMessageDialog(null, "La cantidad introducida es " +num1);
        if (num1< 500){
            cantidad = num1 * 1.5;
            JOptionPane.showMessageDialog(null, "La cantidad total es "+cantidad);
            JOptionPane.showMessageDialog(null, "El incremento es del 50%");
        } else if (num1 > 500 && num1<1000) {
            
            cantidad = num1 * 1.07;
            JOptionPane.showMessageDialog(null, "La cantidad total es "+ cantidad);
            JOptionPane.showMessageDialog(null, "El incremento es del 7%");
            
        } else if (num1 > 1000 && num1 < 5000){
            cantidad = num1 * 1.15;
            JOptionPane.showInputDialog(null, "La cantidad total es "+ cantidad);
            JOptionPane.showMessageDialog(null, "El incremento es del 15%");
        
        }else {
             cantidad = num1 * 0.97;
             JOptionPane.showInputDialog(null, "La cantidad total es "+cantidad);
             JOptionPane.showMessageDialog(null, "El decremento es del 3%");
    }
        }
    }
    

