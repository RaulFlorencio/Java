public class Item {
    int codigo;
    int quantidade;
    double preco;
    String descricao;

    public Item (int codigo, int quantidade, double preco, String descricao){
        this.codigo = codigo;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;

    }

    public Item(){
        this.codigo = 0;
        this.descricao = " ";
        this.quantidade = 0;
        this.preco = 0;

    }
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade>=0)
        this.quantidade = quantidade;
        else {
            quantidade = 0;
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getTotal(){
        double getTotal;
        getTotal = preco * quantidade;
        return getTotal;
    }


}
