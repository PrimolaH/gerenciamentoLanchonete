package br.com.burgerfast.core.service;

import br.com.burgerfast.core.domain.Produto;
import br.com.burgerfast.core.port.ProdutoPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProdutoService{

    private final ProdutoPort produtoPort;

    public String listaProdutosPorCategoria(String categoria) {
        return null;
    }

    public Produto addProduto(Produto produto) {
        return produtoPort.addProduto(produto);
    }

    public void removerProduto(Long idProduto) {
        produtoPort.removerProduto(Produto.builder().id(idProduto).build());
    }

    public void editarProduto(Produto produto) {
        produtoPort.editarProduto(produto);
    }
}
