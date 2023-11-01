package br.com.burgerfast.adapter.mapper;

import br.com.burgerfast.adapter.out.entities.PagamentoEntity;
import br.com.burgerfast.core.domain.Pagamento;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PagamentoMapper {
    private final ModelMapper modelMapper;

    public Pagamento entityTo(PagamentoEntity entity){
        TypeMap<PagamentoEntity, Pagamento> properTypeMap = this.modelMapper.createTypeMap(PagamentoEntity.class, Pagamento.class);
        properTypeMap.addMappings(
                mapper -> mapper.map(src -> src.getClienteEntity().getId(), Pagamento::setIdCliente)
        );
        return this.modelMapper.map(entity, Pagamento.class);
    }

    public PagamentoEntity entityFrom(Pagamento domain){
        return this.modelMapper.map(domain, PagamentoEntity.class);
    }
}
