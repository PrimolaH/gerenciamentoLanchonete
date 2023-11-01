package br.com.burgerfast.adapter.out;

import br.com.burgerfast.adapter.mapper.ProdutoMapper;
import br.com.burgerfast.adapter.out.entities.ProdutoEntity;
import br.com.burgerfast.adapter.out.repositories.ProdutoRepository;
import br.com.burgerfast.core.domain.Produto;
import br.com.burgerfast.core.port.ProdutoPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ProdutoProvider implements ProdutoPort {

    private final ProdutoRepository produtoRepository;
    private final ProdutoMapper produtoMapper;
    @Override
    public String listaProdutosPorCategoria(String categoria) {
        return null;
    }

    @Override
    public Produto addProduto( Produto produto) {
        ProdutoEntity produtoEntity = produtoRepository.save(produtoMapper.entityFrom(produto));
        return  produtoMapper.entityTo(produtoEntity);
    }

    @Override
    public Produto removerProduto( Produto produto) {
        ProdutoEntity produtoEntity = produtoRepository.save(produtoMapper.entityFrom(produto));
        return  produtoMapper.entityTo(produtoEntity);
    }

    @Override
    public Produto editarProduto( Produto produto) {
        ProdutoEntity produtoEntity = produtoRepository.save(produtoMapper.entityFrom(produto));
        return  produtoMapper.entityTo(produtoEntity);
    }

}
