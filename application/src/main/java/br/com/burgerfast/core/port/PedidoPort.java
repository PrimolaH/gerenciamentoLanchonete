package br.com.burgerfast.core.port;

import br.com.burgerfast.core.domain.Pedido;

import java.util.List;

public interface PedidoPort {

    List<Pedido> listarPedido();

    Pedido criarPedido(Pedido domain);
    void enviarPedido(Pedido domain);

    Pedido buscarPedido(Long id);
}
