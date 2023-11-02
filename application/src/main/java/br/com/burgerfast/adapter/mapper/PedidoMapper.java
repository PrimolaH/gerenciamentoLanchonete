package br.com.burgerfast.adapter.mapper;

import br.com.burgerfast.adapter.in.httpModels.CadastroPedidoHttpModel;
import br.com.burgerfast.adapter.in.httpModels.PedidoHttpModel;
import br.com.burgerfast.adapter.in.httpModels.ProdutoHttpModel;
import br.com.burgerfast.adapter.out.entities.PedidoEntity;
import br.com.burgerfast.adapter.out.entities.ProdutoEntity;
import br.com.burgerfast.core.domain.Pedido;
import br.com.burgerfast.core.domain.Produto;
import br.com.burgerfast.core.domain.enums.CategoriaEnum;
import lombok.RequiredArgsConstructor;
import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PedidoMapper {

    @Autowired
    private ProdutoMapper produtoMapper;

    private ModelMapper modelMapper = new ModelMapper();
    private TypeMap<PedidoEntity, Pedido> propMapEntityTo = modelMapper.createTypeMap(PedidoEntity.class, Pedido.class);

    public Pedido entityTo(PedidoEntity entity){
        Converter<List<ProdutoEntity>, List<Produto>> converterProdutos =
                ctx -> ctx.getSource() == null ? null : ctx.getSource().stream().map(produtoMapper::entityTo).collect(Collectors.toList());
        propMapEntityTo.addMappings(
                mapper -> mapper.using(converterProdutos).map(PedidoEntity::getProdutos, Pedido::setProdutos)
        );
        return this.modelMapper.map(entity, Pedido.class);
    }

    public PedidoEntity entityFrom(Pedido domain){
        return this.modelMapper.map(domain, PedidoEntity.class);
    }

    public Pedido httpModelTo(PedidoHttpModel httpModel){
        return this.modelMapper.map(httpModel, Pedido.class);
    }
    public Pedido httpModelTo(CadastroPedidoHttpModel httpModel){
        return this.modelMapper.map(httpModel, Pedido.class);
    }

    public PedidoHttpModel httpModelFrom(Pedido domain){
        return this.modelMapper.map(domain, PedidoHttpModel.class);
    }
}
