package br.com.burgerfast.core.port;

import br.com.burgerfast.core.domain.Pagamento;

public interface PagamentoPort {

    Pagamento efetuarPagamento(Pagamento pagamento);

}
