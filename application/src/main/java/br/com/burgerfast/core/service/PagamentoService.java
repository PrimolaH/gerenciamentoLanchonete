package br.com.burgerfast.core.service;

import br.com.burgerfast.core.domain.Pagamento;
import br.com.burgerfast.core.domain.Pedido;
import br.com.burgerfast.core.port.PagamentoPort;
import br.com.burgerfast.core.port.PedidoPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PagamentoService {

    private final PagamentoPort pagamentoPort;
    private final PedidoPort pedidoPort;

    public Pagamento efetuarPagamento(Pagamento pagamento) {
        pagamento = pagamentoPort.efetuarPagamento(pagamento);
        Pedido pedido = pedidoPort.buscarPedido(pagamento.getPedido().getId());
        pedidoPort.enviarPedido(pedido);
        return pagamento;
    }
}
