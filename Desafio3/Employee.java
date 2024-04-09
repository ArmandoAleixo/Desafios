package Desafio3;

class Employee {
    public String nome;
    public double GrossSalary;

    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getGrossSalary() {
        return GrossSalary;
    }

    public void setGrossSalary(double grossSalary) {
        GrossSalary = grossSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "nome='" + nome + '\'' +
                '}';
    }

}
                
         


