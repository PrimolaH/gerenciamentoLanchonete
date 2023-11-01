package br.com.burgerfast.core.service;

import br.com.burgerfast.core.domain.Cliente;
import br.com.burgerfast.core.port.ClientePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClienteService {

    private final ClientePort clientePort;

    public Cliente buscarClienteCpf(String cpf) {

        return clientePort.buscarClienteCpf(cpf) ;
    }

    public Cliente cadastroCliente(Cliente cliente) {
        return clientePort.cadastroCliente(cliente);
    }
}
