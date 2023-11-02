package br.com.burgerfast.adapter.out.producer;

import br.com.burgerfast.adapter.mapper.PedidoMapper;
import br.com.burgerfast.adapter.out.entities.FilaPedidoEntity;
import br.com.burgerfast.adapter.out.entities.PedidoEntity;
import br.com.burgerfast.adapter.out.repositories.FilaPedidoRepository;
import br.com.burgerfast.adapter.out.repositories.PedidoRepository;
import br.com.burgerfast.core.domain.Pedido;
import br.com.burgerfast.core.port.PedidoPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class PedidoProducer {

    private final FilaPedidoRepository filaPedidoRepository;
    private final PedidoMapper pedidoMapper;

    public void producer(Pedido pedido) {
        filaPedidoRepository.save(FilaPedidoEntity.builder()
                        .mensagem(pedido.toString())
                .build());
    }
}
