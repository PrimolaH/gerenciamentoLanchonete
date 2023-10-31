package br.com.burgerfast.adapter.in;

import br.com.burgerfast.core.service.PedidoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PedidoController {

    private final PedidoService pedidoService;
    @GetMapping("/{pedido}")
    public ResponseEntity<String> listarPedido(@PathVariable String pedido){
        var ListaPedido = pedidoService.listarPedido(pedido);
        return ResponseEntity.ok("Lista Pedido");
    }

    @PostMapping
    public ResponseEntity<Void> criarPedido(){
        pedidoService.criarPedido();
        return ResponseEntity.status(201).build();
    }
}
