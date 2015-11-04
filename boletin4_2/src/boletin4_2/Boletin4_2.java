/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4_2;

import javax.swing.JOptionPane;

/**
 *
 * @author ngarciacarrillo
 */
public class Boletin4_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float unidades = Float.parseFloat(JOptionPane.showInputDialog("Introduce las unidades"));
        float precioUnitario= Float.parseFloat(JOptionPane.showInputDialog("Introdue el precio Unitario"));
        float desconto, prezo;
        double totalPagar;
     
        
        if (unidades < 100){
            prezo = unidades * precioUnitario;
            JOptionPane.showMessageDialog (null, "el precio Total es "+prezo +" Non se aplica ningun desconto");
            JOptionPane.showMessageDialog (null, "as unidades introducidas son "+unidades +"el prezo unitario é "+precioUnitario);
       
        }else if (unidades>100 && unidades<200){
            prezo = unidades * precioUnitario;
            if (prezo > 4000) {
                totalPagar = prezo * 0.95;
                desconto = 5;
            
            } else {
                totalPagar = prezo * 0.98;
                desconto = 2;
            } 
            JOptionPane.showMessageDialog (null, "el precio Total es "+totalPagar +" El descuento aplicado es "+desconto+"%"  );
            JOptionPane.showMessageDialog (null, "as unidades introducidas son "+unidades +"el prezo unitario é "+precioUnitario);
        } else if (unidades> 200){
            prezo = unidades + precioUnitario;
                if (prezo >4000){
                    totalPagar = prezo * 0.90;
                    desconto = 10;
                } else {
                    totalPagar = prezo * 0.92;
                    desconto = 8;
                }
            JOptionPane.showMessageDialog (null, "el precio Total es "+totalPagar +" El descuento aplicado es "+desconto+"%"  );
            JOptionPane.showMessageDialog (null, "as unidades introducidas son "+unidades +"el prezo unitario é "+precioUnitario);
        }
        
        
    }
    
}
