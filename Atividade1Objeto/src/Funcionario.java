public class Funcionario {
    private String nome, sobrenome;
    private double salarioMensal;


    public Funcionario(String nome, String sobrenome, double salarioMensal){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioMensal = salarioMensal;

    }

    public Funcionario(){
        this.nome = " ";
        this.sobrenome = " ";
        this.salarioMensal = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        if(salarioMensal >= 0){
        this.salarioMensal = salarioMensal;}
        else {
            this.salarioMensal = 0;
        }
    }
    public double salarioAnual(){
        double salarioAnual;
        salarioAnual = salarioMensal * 12;
        return salarioAnual;
    }
    public double salarioAnualAumento(){
        double salarioAnualAumento;
        salarioAnualAumento = salarioAnual()* 0.10 + salarioAnual();
        return salarioAnualAumento;
    }
}
