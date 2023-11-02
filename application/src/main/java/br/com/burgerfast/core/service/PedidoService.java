package br.com.burgerfast.core.service;

import br.com.burgerfast.core.domain.Pedido;
import br.com.burgerfast.core.domain.Produto;
import br.com.burgerfast.core.port.PedidoPort;
import br.com.burgerfast.core.port.ProdutoPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PedidoService {

    private final PedidoPort pedidoPort;
    private final ProdutoPort produtoPort;

    public List<Pedido> listarPedido() {
        return pedidoPort.listarPedido();
    }

    public Pedido criarPedido(Pedido pedido) {
        List<Produto> produtoList = pedido.getProdutos().stream()
                .map(produto -> produtoPort.buscarPorId(produto.getId()))
                .collect(Collectors.toList());

        pedido.setTotal(produtoList.stream()
                .map(Produto::getPreco)
                .reduce(BigDecimal.ZERO, BigDecimal::add));

        return pedidoPort.criarPedido(pedido);
    }
}
