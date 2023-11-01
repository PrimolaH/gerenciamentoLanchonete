package br.com.burgerfast.adapter.out;

import br.com.burgerfast.adapter.mapper.PedidoMapper;
import br.com.burgerfast.adapter.out.entities.PedidoEntity;
import br.com.burgerfast.adapter.out.repositories.PedidoRepository;
import br.com.burgerfast.core.domain.Pedido;
import br.com.burgerfast.core.port.PedidoPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class PedidoProvider implements PedidoPort {

    private final PedidoRepository pedidoRepository;
    private final PedidoMapper pedidoMapper;

    @Override
    public List<Pedido> listarPedido() {
        List<PedidoEntity> pedidos = pedidoRepository.findAll();
        return pedidos.stream().map(pedidoMapper::entityTo)
                .collect(Collectors.toList());
    }

    @Override
    public Pedido criarPedido(Pedido domain) {
        PedidoEntity pedidoEntity = pedidoRepository.saveAndFlush(pedidoMapper.entityFrom(domain));
        return pedidoMapper.entityTo(pedidoEntity);
    }
}
