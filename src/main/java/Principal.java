import produtos.Produto;
import produtos.ProdutoPerecivel;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        var fosforo = new Produto("Fosforo", 2.9, 12);
        var forma = new Produto("Forma", 28.77, 1);
        var detergente = new Produto("Detergente", 1.55, 4);

        var listaProduto = new ArrayList<Produto>();
        listaProduto.add(forma);
        listaProduto.add(fosforo);
        listaProduto.add(detergente);

        System.out.println("Tamanho da lista: ");
        System.out.println(listaProduto.size());

        System.out.println("Produto na posição 0");
        System.out.println(listaProduto.get(0));

        System.out.println("Produtos em Ordem: ");
        for (Produto produto : listaProduto){
            System.out.println(produto);
        }

        var queijo = new ProdutoPerecivel("Queijo", 40.66,3, "10/10/2024");

        System.out.println("Produto Perecivel: ");
        System.out.println(queijo.toString());

        listaProduto.add(queijo);
        double mediaPreco = 0;
        for (Produto pr : listaProduto){
            if (pr instanceof ProdutoPerecivel){
                System.out.println(pr.getNome()+" É um produto perecivel");
            }
            mediaPreco += pr.getPreco();
        }
        mediaPreco = mediaPreco/listaProduto.size();

        System.out.println("Media de preço dos produtos: "+mediaPreco);



    }
}
