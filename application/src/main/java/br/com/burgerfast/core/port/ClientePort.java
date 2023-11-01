package br.com.burgerfast.core.port;

import br.com.burgerfast.core.domain.Cliente;

public interface ClientePort {

    String buscarClienteCpf(String cpf);

    Cliente cadastroCliente(Cliente cliente);

}
