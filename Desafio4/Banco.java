package Desafio4;

import javax.swing.JOptionPane;

public class Banco {
    public static void main(String[] args) {
        Conta conta = new Conta();
        ContaService contaService = new ContaService();
    
        contaService.setSenha(1234);
        
        

      
        JOptionPane.showMessageDialog(null, "Bem vindo ao banco");

        String senha = JOptionPane.showInputDialog(null, "Digite o numero da conta: ");
        contaService.setNomeconta(JOptionPane.showInputDialog(null, "Digite o usuario: "));

        int escolha = JOptionPane.showConfirmDialog(null, "Existe um deposito inicial?");

      
            if (escolha == JOptionPane.YES_OPTION) {
                String depositoInicial = JOptionPane.showInputDialog(null, "Digite o valor inicial: ");
                contaService.setPrice(Integer.parseInt(depositoInicial));
            
    
                JOptionPane.showMessageDialog(null, "Dados da conta: " + 
                    contaService.getNomeconta() + "/Numero: " + contaService.getSenha() + 
                    "/Balance: " + contaService.getPrice());        
        
            double quantia = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor do depósito: "));
                conta.Deposito(contaService, quantia);               

                JOptionPane.showMessageDialog(null, "Dados da conta atualizados: " +
                contaService.getNomeconta() + "/Numero: " + contaService.getSenha() +
                "/Balance: " + contaService.getPrice());
            
             quantia = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de saque: "));
                conta.saque(contaService, quantia);              

            JOptionPane.showMessageDialog(null, "Dados da conta atualizados: " +
            contaService.getNomeconta() + "/Numero: " + contaService.getSenha() +
            "/Balance: " + contaService.getPrice()); 
            }
             
            if ( escolha == JOptionPane.NO_OPTION){
            
            JOptionPane.showMessageDialog(null, "Dados da conta: " + 
            contaService.getNomeconta() + "/Numero: " + contaService.getSenha() + 
            "/Balance: " + contaService.getPrice());        

            double quantia = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor do depósito: "));
             conta.Deposito(contaService, quantia);               

            JOptionPane.showMessageDialog(null, "Dados da conta atualizados: " +
            contaService.getNomeconta() + "/Numero: " + contaService.getSenha() +
             "/Balance: " + contaService.getPrice());
    
            quantia = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de saque: "));
            conta.saque(contaService, quantia);              

            JOptionPane.showMessageDialog(null, "Dados da conta atualizados: " +
            contaService.getNomeconta() + "/Numero: " + contaService.getSenha() +
            "/Balance: " + contaService.getPrice());

        }
    }
}
