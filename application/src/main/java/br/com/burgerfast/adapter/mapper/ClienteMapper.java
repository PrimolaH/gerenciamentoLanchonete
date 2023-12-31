package br.com.burgerfast.adapter.mapper;

import br.com.burgerfast.adapter.in.httpModels.CadastroClienteHttpModel;
import br.com.burgerfast.adapter.in.httpModels.ClienteHttpModel;
import br.com.burgerfast.adapter.out.entities.ClienteEntity;
import br.com.burgerfast.core.domain.Cliente;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

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

    public Cliente httpModelTo(ClienteHttpModel httpModel){
        return this.modelMapper.map(httpModel, Cliente.class);
    }

    public Cliente httpModelTo(CadastroClienteHttpModel httpModel){
        return this.modelMapper.map(httpModel, Cliente.class);
    }

    public ClienteHttpModel httpModelFrom(Cliente domain){
        return this.modelMapper.map(domain, ClienteHttpModel.class);
    }
}
