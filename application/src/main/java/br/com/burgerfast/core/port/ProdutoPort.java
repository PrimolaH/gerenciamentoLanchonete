package br.com.burgerfast.core.port;

public interface ProdutoPort {

    String listaProdutosPorCategoria(String categoria);

    void addProduto();

    void removerProduto();

    void editarProduto();
}
