package br.com.burgerfast.core.service;

import br.com.burgerfast.core.domain.Pedido;
import br.com.burgerfast.core.port.PedidoPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PedidoService {

    private final PedidoPort pedidoPort;

    public List<Pedido> listarPedido() {
        return pedidoPort.listarPedido();
    }

    public Pedido criarPedido(Pedido pedido) {
        return pedidoPort.criarPedido(pedido);
    }
}
