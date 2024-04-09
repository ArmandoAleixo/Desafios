package Desafio1;

import javax.swing.JOptionPane;

public class ifs {
    public static void main(String[] args){
    String numero;
         numero = JOptionPane.showInputDialog(null, "digite um numero: ");
         int num = Integer.parseInt(numero);
        
        if (num > 0){
            JOptionPane.showMessageDialog(null,"Numero positivo");
        }
        else if(num < 0){
            JOptionPane.showMessageDialog(null,"Numero negativo");
        }
        else {
            JOptionPane.showMessageDialog(null,"Numero neutro");

        }

     

    }
    
}
