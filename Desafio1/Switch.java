package Desafio1;

import javax.swing.JOptionPane;

public class Switch {
    public static void main(String[] args){
    Dias dias = new Dias();

  
    int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "digite um numero de 1 a 7, correspondentes aos dias da semana: "));
    
    switch (numero) {
        case 1: 
        JOptionPane.showMessageDialog(null,Dias.dia1);
        break;
        case 2:
        JOptionPane.showMessageDialog(null,Dias.dia2);
        break;
        case 3:
        JOptionPane.showMessageDialog(null,Dias.dia3);
        break;
        case 4:
        JOptionPane.showMessageDialog(null,Dias.dia4);
        break;
        case 5:
        JOptionPane.showMessageDialog(null,Dias.dia5);
        break;
        case 6:
        JOptionPane.showMessageDialog(null,Dias.dia6);
        break;
        case 7:
        JOptionPane.showMessageDialog(null,Dias.dia7);
        
    }
}
}
