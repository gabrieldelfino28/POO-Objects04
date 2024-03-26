package view;

import model.Produto;

public class Main {

    public static void main(String[] args) {
        Produto p1, p2;
        p1 = new Produto();
        p1.setNome("Leite");
        p1.setPreco(10.5f);
        p1.setQtdEstoque(14);
        System.out.println("Leite disponível? "+p1.verificaProdutoDisponivel("Leite") + "\nValor total: "+ p1.totalValorEstoque());

        p2 = new Produto();
        p2.setNome("Biscoito");
        p2.setPreco(3f);
        p2.setQtdEstoque(-2);
        System.out.println("Biscoito disponível? "+p2.verificaProdutoDisponivel("Biscoito") + "\nValor total: "+ p2.totalValorEstoque());

    }
}
