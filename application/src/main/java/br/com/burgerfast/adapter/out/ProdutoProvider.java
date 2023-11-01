package br.com.burgerfast.adapter.out;

import br.com.burgerfast.adapter.mapper.ProdutoMapper;
import br.com.burgerfast.adapter.out.entities.PedidoEntity;
import br.com.burgerfast.adapter.out.entities.ProdutoEntity;
import br.com.burgerfast.adapter.out.repositories.ProdutoRepository;
import br.com.burgerfast.core.domain.Produto;
import br.com.burgerfast.core.port.ProdutoPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class ProdutoProvider implements ProdutoPort {

    private final ProdutoRepository produtoRepository;
    private final ProdutoMapper produtoMapper;
    @Override
    public List<Produto> listaProdutosPorCategoria(Integer categoria) {
        List<ProdutoEntity> produtos = produtoRepository.findByCategoria(categoria);
        return produtos.stream().map(produtoMapper::entityTo)
                .collect(Collectors.toList());
    }

    @Override
    public Produto addProduto( Produto produto) {
        ProdutoEntity produtoEntity = produtoRepository.saveAndFlush(produtoMapper.entityFrom(produto));
        return  produtoMapper.entityTo(produtoEntity);
    }

    @Override
    public void removerProduto( Produto produto) {
        produtoRepository.delete(produtoMapper.entityFrom(produto));
    }

    @Override
    public Produto editarProduto( Produto produto) {
        ProdutoEntity produtoEntity = produtoRepository.save(produtoMapper.entityFrom(produto));
        return  produtoMapper.entityTo(produtoEntity);
    }

}
