package Desafio4;

public class Conta {
    
    
        public void saque(ContaService contaservice, double quantia){
            
            double saldoAtual = contaservice.getPrice();
            saldoAtual -= quantia + 5;
            contaservice.setPrice(saldoAtual);
        }
    
        public void Deposito(ContaService contaservice, double quantia){
            
            double saldoAtual = contaservice.getPrice();
            saldoAtual += quantia;
            contaservice.setPrice(saldoAtual);
            
            
            
    
    
    
        }
    
    
    }
    

