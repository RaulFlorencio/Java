public class Telefonistas extends Funcionario{
    private int codEstacao;

    public Telefonistas(String nome, double salario, int codEstacao) {
        super(nome, salario);
        this.codEstacao = codEstacao;
    }

    public int getcodEstacao() {
        return codEstacao;
    }

    public void setcodEstacao(int codEstacao) {
        this.codEstacao = codEstacao;
    }
}
