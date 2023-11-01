package br.com.burgerfast.adapter.mapper;

import br.com.burgerfast.adapter.in.httpModels.PedidoHttpModel;
import br.com.burgerfast.adapter.out.entities.PedidoEntity;
import br.com.burgerfast.core.domain.Pedido;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PedidoMapper {
    private final ModelMapper modelMapper;

    public Pedido entityTo(PedidoEntity entity){
        return this.modelMapper.map(entity, Pedido.class);
    }

    public PedidoEntity entityFrom(Pedido domain){
        return this.modelMapper.map(domain, PedidoEntity.class);
    }

    public Pedido httpModelTo(PedidoHttpModel httpModel){
        return this.modelMapper.map(httpModel, Pedido.class);
    }

    public PedidoHttpModel httpModelFrom(Pedido domain){
        return this.modelMapper.map(domain, PedidoHttpModel.class);
    }
}
