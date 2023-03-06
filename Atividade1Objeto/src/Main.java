public class Main {
    public static void main(String[] args) {


        Funcionario empregado1 = new Funcionario("Cleber", "Pinto", 800);
        Funcionario empregado2 = new Funcionario("Ademir", "da Guia", 2000);

        System.out.println("Salario mensal do " + empregado1.getNome() + " " + empregado1.getSobrenome()+ " é " + empregado1.getSalarioMensal()
                + " e o salario anual é " + empregado1.salarioAnual());
        System.out.println("O salario do " + empregado1.getNome() + " é " + empregado1.salarioAnualAumento() + " com aumento de 10%");
        System.out.println("Salario mensal do " + empregado2.getNome() + " " + empregado2.getSobrenome()+ " é " + empregado2.getSalarioMensal()
                + " e o salario anual é " + empregado2.salarioAnual());
        System.out.println("O salario do " + empregado2.getNome() + " é " + empregado2.salarioAnualAumento() + " com aumento de 10%");




    }
}