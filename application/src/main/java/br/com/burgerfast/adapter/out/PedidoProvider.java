package br.com.burgerfast.adapter.out;

import br.com.burgerfast.core.port.PedidoPort;
import org.springframework.stereotype.Component;

@Component
public class PedidoProvider implements PedidoPort {
    @Override
    public String listarPedido(String pedido) {
        return null;
    }

    @Override
    public void criarPedido() {

    }
}
