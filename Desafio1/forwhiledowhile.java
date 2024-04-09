package Desafio1;

import javax.swing.JOptionPane;

public class forwhiledowhile {
    public static void main(String[] args) {
        
        //com for
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "digite um numero: "));

        for (int i = 0; i <= num; i++) {
            JOptionPane.showMessageDialog(null, i);
        }
        // com while

        int x = 0;
        int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "digite outro numero: "));
        while ( x <= num){
            JOptionPane.showMessageDialog(null, x);
            x++;
        }

        // com do while

        int y = 0;
        int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "digite outro numero: "));
        do {
            JOptionPane.showMessageDialog(null, y);
            y++;
        }while ( x <= num2);

            
        
    
    }
}
