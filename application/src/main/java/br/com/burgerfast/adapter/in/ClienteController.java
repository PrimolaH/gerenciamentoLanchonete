package br.com.burgerfast.adapter.in;

import br.com.burgerfast.adapter.in.httpModels.ClienteHttpModel;
import br.com.burgerfast.adapter.mapper.ClienteMapper;
import br.com.burgerfast.core.domain.Cliente;
import br.com.burgerfast.core.service.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/cliente")
@RequiredArgsConstructor
public class ClienteController {

    private final ClienteService clienteService;
    private final ClienteMapper clienteMapper;

    @GetMapping("/{cpf}")
    public ResponseEntity<ClienteHttpModel> buscarClienteCpf(@PathVariable String cpf){
        ClienteHttpModel clienteHttpModel = clienteMapper.httpModelFrom(clienteService.buscarClienteCpf(cpf));
        return ResponseEntity.ok(clienteHttpModel);
    }

    @PostMapping
    public ResponseEntity<Void> cadastroCliente(@RequestBody ClienteHttpModel httpModel){
        Cliente cliente = clienteService.cadastroCliente(clienteMapper.httpModelTo(httpModel));
        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{cpf}")
                .buildAndExpand(cliente.getCpf())
                .toUri();
        return ResponseEntity.created(uri).build();
    }
}
