package Desafio3;

public class EmployeeService {

    public void obterSalarioLiquido(Employee employee){
        int descontoInss = 200;
        double salarioLiquido = employee.getSalarioBruto() - descontoInss;
        System.out.println(employee.getNome() + " seu salario liquido eh: " + salarioLiquido);
    }

    public void aumentoSalario(Employee employee){
        double aumento = employee.getSalarioBruto() * employee.getTaxa();
        double novoSalarioBruto = aumento;

        employee.setSalarioBruto(novoSalarioBruto);

        System.out.println(employee.getNome() + " seu salario agora eh: " + novoSalarioBruto);
    }
}