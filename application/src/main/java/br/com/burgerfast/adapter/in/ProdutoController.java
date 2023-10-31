package br.com.burgerfast.adapter.in;

import br.com.burgerfast.core.service.ProdutoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class ProdutoController {

    private final ProdutoService produtoService;

    @GetMapping("/{categoria}")
    public ResponseEntity<String> listaProdutosPorCategoria(@PathVariable String categoria){
        var produto = produtoService.listaProdutosPorCategoria(categoria);
        return ResponseEntity.ok("Lista Produto");
    }

    @PostMapping
    public ResponseEntity<Void> addProduto(){
        produtoService.addProduto();
        return ResponseEntity.status(201).build();
    }

    @DeleteMapping
    public ResponseEntity<Void> removerProduto(){
        produtoService.removerProduto();
        return ResponseEntity.status(204).build();
    }

    @PutMapping
    public ResponseEntity<Void> editarProduto(){
        produtoService.editarProduto();
        return ResponseEntity.status(204).build();
    }
}
