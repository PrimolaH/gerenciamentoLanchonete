package br.com.burgerfast.core.port;

public interface ClientePort {

    String buscarClienteCpf(String cpf);

    void cadastroCliente();

}
