package br.com.burgerfast.adapter.out;

import br.com.burgerfast.adapter.mapper.ClienteMapper;
import br.com.burgerfast.adapter.out.entities.ClienteEntity;
import br.com.burgerfast.adapter.out.repositories.ClienteRepository;
import br.com.burgerfast.core.domain.Cliente;
import br.com.burgerfast.core.port.ClientePort;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ClienteProvider implements ClientePort {

    private final ClienteRepository clienteRepository;
    private final ClienteMapper clienteMapper;

    @Override
    public Cliente buscarClienteCpf(String cpf) {
        return clienteMapper.entityTo(clienteRepository.findByCpf(cpf));
    }

    @Override
    public Cliente cadastroCliente(Cliente cliente) {
        ClienteEntity clienteEntity = clienteRepository.saveAndFlush(clienteMapper.entityFrom(cliente));
        return clienteMapper.entityTo(clienteEntity);
    }
}
