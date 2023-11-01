package br.com.burgerfast.adapter.out;

import br.com.burgerfast.adapter.mapper.PagamentoMapper;
import br.com.burgerfast.adapter.out.entities.PagamentoEntity;
import br.com.burgerfast.adapter.out.repositories.PagamentoRepository;
import br.com.burgerfast.core.domain.Pagamento;
import br.com.burgerfast.core.port.PagamentoPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PagamentoProvider implements PagamentoPort {


    private final PagamentoRepository pagamentoRepository;
    private final PagamentoMapper pagamentoMapper;
    @Override
    public Pagamento efetuarPagamento( Pagamento pagamento) {
        PagamentoEntity pagamentoEntity = pagamentoRepository.save(pagamentoMapper.entityFrom(pagamento));
        return  pagamentoMapper.entityTo(pagamentoEntity);
    }

}
