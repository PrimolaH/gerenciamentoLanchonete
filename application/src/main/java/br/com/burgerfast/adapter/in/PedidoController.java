package br.com.burgerfast.adapter.in;

import br.com.burgerfast.adapter.in.httpModels.PedidoHttpModel;
import br.com.burgerfast.adapter.mapper.PedidoMapper;
import br.com.burgerfast.core.domain.Pedido;
import br.com.burgerfast.core.service.PedidoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/pedido")
@RequiredArgsConstructor
public class PedidoController {

    private final PedidoService pedidoService;
    private final PedidoMapper pedidoMapper;

    @GetMapping
    public ResponseEntity<List<PedidoHttpModel>> listarPedido(){
        List<PedidoHttpModel> listaPedido = pedidoService.listarPedido().stream()
                .map(pedidoMapper::httpModelFrom)
                .collect(Collectors.toList());
        return ResponseEntity.ok(listaPedido);
    }

    @PostMapping
    public ResponseEntity<Void> criarPedido(@RequestBody PedidoHttpModel httpModel){
        Pedido pedido = pedidoService.criarPedido(pedidoMapper.httpModelTo(httpModel));
        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id_pedido}")
                .buildAndExpand(pedido.getId())
                .toUri();
        return ResponseEntity.created(uri).build();
    }
}
