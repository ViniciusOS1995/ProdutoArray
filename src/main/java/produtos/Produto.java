package produtos;

public class Produto {
    String nome;
    double preco;
    double quant;

    public Produto(String nome, double preco, double quant) {
        this.nome = nome;
        this.preco = preco;
        this.quant = quant;
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Nome do Produto: " + nome + '\'' +
                " Preço: " + preco + '\'' +
                " Quantidade: " + quant;
    }
}
