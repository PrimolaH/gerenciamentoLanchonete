package br.com.burgerfast.adapter.mapper;

import br.com.burgerfast.adapter.out.entities.PedidoEntity;
import br.com.burgerfast.adapter.out.entities.ProdutoEntity;
import br.com.burgerfast.core.domain.Pedido;
import br.com.burgerfast.core.domain.Produto;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ProdutoMapper {
    private final ModelMapper modelMapper;

    public Produto entityTo(ProdutoEntity entity){
        return this.modelMapper.map(entity, Produto.class);
    }

    public ProdutoEntity entityFrom(Produto domain){
        return this.modelMapper.map(domain, ProdutoEntity.class);
    }
}
