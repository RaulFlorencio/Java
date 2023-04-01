public class Secretarias extends Funcionario{
    private int ramal;

    public Secretarias(String nome, double salario, int ramal) {
        super(nome, salario);
        this.ramal = ramal;
    }

    public int getRamal() {
        return ramal;
    }

    public void setRamal(int ramal) {
        this.ramal = ramal;
    }
}
