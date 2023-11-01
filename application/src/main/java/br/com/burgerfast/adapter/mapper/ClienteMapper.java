package br.com.burgerfast.adapter.mapper;

import br.com.burgerfast.adapter.out.entities.ClienteEntity;
import br.com.burgerfast.core.domain.Cliente;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class ClienteMapper {
    private final ModelMapper modelMapper;

    public Cliente entityTo(ClienteEntity entity){
        return this.modelMapper.map(entity, Cliente.class);
    }

    public ClienteEntity entityFrom(Cliente domain){
        return this.modelMapper.map(domain, ClienteEntity.class);
    }
}
