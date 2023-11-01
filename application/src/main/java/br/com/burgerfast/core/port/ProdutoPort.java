package br.com.burgerfast.core.port;

import br.com.burgerfast.core.domain.Produto;

import java.util.List;

public interface ProdutoPort {

    List<Produto> listaProdutosPorCategoria(Integer categoria);

    Produto addProduto(Produto produto);

    void removerProduto( Produto produto);

    Produto editarProduto( Produto produto);
}
