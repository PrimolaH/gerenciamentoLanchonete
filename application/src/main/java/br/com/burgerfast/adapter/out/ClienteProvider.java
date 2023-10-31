package br.com.burgerfast.adapter.out;

import br.com.burgerfast.core.port.ClientePort;
import org.hibernate.annotations.Comment;
import org.springframework.stereotype.Component;

@Component
public class ClienteProvider implements ClientePort {
    @Override
    public String buscarClienteCpf(String cpf) {
        return null;
    }

    @Override
    public void cadastroCliente() {

    }
}
