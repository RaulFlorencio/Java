public class Gerentes extends Funcionario{
    private String nomeDeUsuario;
    private String senha;

    public Gerentes(String nome){
        super(nome);
    }
    public String getNomeDeUsuario() {
        return nomeDeUsuario;
    }

    public void setNomeDeUsuario(String nomeDeUsuario) {
        this.nomeDeUsuario = nomeDeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
