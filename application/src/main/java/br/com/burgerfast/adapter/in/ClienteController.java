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
@RequiredArgsConstructor
public class ClienteController {

    private final ClienteService clienteService;
    private final ClienteMapper clienteMapper;

    @GetMapping("/cliente/{cpf}")
    public ResponseEntity<ClienteHttpModel> buscarClienteCpf(@PathVariable String cpf){
        ClienteHttpModel clienteHttpModel = clienteMapper.httpModelFrom(clienteService.buscarClienteCpf(cpf));
        return ResponseEntity.ok(clienteHttpModel);
    }

    @PostMapping("/cliente")
    public ResponseEntity<Void> cadastroCliente(@RequestBody ClienteHttpModel httpModel){
        Cliente cliente = clienteMapper.httpModelTo(httpModel);
        ClienteHttpModel clienteHttpModel = clienteMapper.httpModelFrom(clienteService.cadastroCliente(cliente));
        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{cpf}")
                .buildAndExpand(clienteHttpModel.getCpf())
                .toUri();
        return ResponseEntity.created(uri).build();
    }
}
