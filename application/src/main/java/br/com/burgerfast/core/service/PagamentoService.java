package br.com.burgerfast.core.service;

import br.com.burgerfast.core.domain.Pagamento;
import br.com.burgerfast.core.port.PagamentoPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PagamentoService {

    private final PagamentoPort pagamentoPort;

    public Pagamento efetuarPagamento(Pagamento pagamento) {
        return pagamentoPort.efetuarPagamento(pagamento);
    }
}
