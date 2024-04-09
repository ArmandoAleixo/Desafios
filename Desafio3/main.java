package Desafio3;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
    Scanner sc =  new Scanner (System.in);
    Employee employee = new Employee();
    double salario;
    double taxa;
    double taxa2;
    Employee employee2 = new Employee();

    System.out.println("Digite o nome do funcionario :");
    employee.setNome(sc.nextLine());

    System.out.println("Digite o salario :");
    employee.setGrossSalary(sc.nextDouble());

    System.out.println("informe a taxa :");
    taxa = sc.nextDouble();

    double salarioL = (taxa / 100) * employee.getGrossSalary() + employee.getGrossSalary();
    sc.nextLine();

    System.out.println("Digite o nome do outro funcionario :");
    employee2.setNome(sc.nextLine());

    System.out.println("Digite o salario :");
    employee2.setGrossSalary(sc.nextDouble());

    System.out.println("informe a taxa :");
     taxa2 = sc.nextDouble();

    double salarioL2 = (taxa2 / 100) * employee2.getGrossSalary() + employee2.getGrossSalary();

    System.out.println("Dados do funcionario 1: " + employee.getNome() +"/ Salario :" + employee.getGrossSalary() + "/ Salario Liquido :" + salarioL);

    System.out.println("Dados do funcionario 2: " + employee2.getNome() +"/ Salario :" + employee2.getGrossSalary() + "/ Salario Liquido :" + salarioL2);
    
    }
}
       
      
        
           
    
    


    