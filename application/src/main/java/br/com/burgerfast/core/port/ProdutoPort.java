package br.com.burgerfast.core.port;

import br.com.burgerfast.core.domain.Produto;

public interface ProdutoPort {

    String listaProdutosPorCategoria(String categoria);

    Produto addProduto(Produto produto);

    Produto removerProduto( Produto produto);

    Produto editarProduto( Produto produto);
}
