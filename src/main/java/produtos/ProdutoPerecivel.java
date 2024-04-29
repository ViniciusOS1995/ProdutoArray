package produtos;

public class ProdutoPerecivel extends Produto{
    public ProdutoPerecivel(String nome, double preco, double quant, String dataValidade) {
        super(nome, preco, quant);
        this.dataValidade = dataValidade;
    }
    String dataValidade;

    @Override
    public String toString() {
        return "Nome do Produto: " + nome + '\'' +
                " Preço: " + preco + '\'' +
                " Quantidade: " + quant +'\''+
                " Data de Validade: "+ dataValidade;
    }
}
