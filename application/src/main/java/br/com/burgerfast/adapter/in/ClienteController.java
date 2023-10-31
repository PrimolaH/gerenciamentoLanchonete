package br.com.burgerfast.adapter.in;

import br.com.burgerfast.core.service.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("cliente")
@RequiredArgsConstructor
public class ClienteController {

    private final ClienteService clienteService;

    @GetMapping("/{cpf}")
    public ResponseEntity<String> buscarClienteCpf(@PathVariable String cpf){
        var cliente = clienteService.buscarClienteCpf(cpf);
        return ResponseEntity.ok("Valor CPF");
    }

    @PostMapping
    public ResponseEntity<Void> cadastroCliente(){
        clienteService.cadastroCliente();
        return  ResponseEntity.status(201).build();
    }
}
