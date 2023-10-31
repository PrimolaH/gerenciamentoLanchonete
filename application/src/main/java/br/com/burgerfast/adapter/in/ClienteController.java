package br.com.burgerfast.adapter.in;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("cliente")
public class ClienteController {

    @GetMapping("/{cpf}")
    public ResponseEntity<String> buscarClienteCpf(@PathVariable String cpf){
        return ResponseEntity.ok("Valor CPF");
    }

    @PostMapping
    public ResponseEntity<Void> cadastroCliente(){
        return  ResponseEntity.status(201).build();
    }
}
