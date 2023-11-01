package br.com.burgerfast.adapter.mapper;

import br.com.burgerfast.adapter.in.httpModels.ProdutoHttpModel;
import br.com.burgerfast.adapter.out.entities.ProdutoEntity;
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

    public Produto httpModelTo(ProdutoHttpModel httpModel){
        return this.modelMapper.map(httpModel, Produto.class);
    }

    public ProdutoHttpModel httpModelFrom(Produto domain){
        return this.modelMapper.map(domain, ProdutoHttpModel.class);
    }
}
