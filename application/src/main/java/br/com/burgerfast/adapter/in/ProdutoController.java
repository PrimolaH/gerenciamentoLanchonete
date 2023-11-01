package br.com.burgerfast.adapter.in;

import br.com.burgerfast.core.service.ProdutoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class ProdutoController {

    private final ProdutoService produtoService;

    @GetMapping("/produto/{categoria}")
    public ResponseEntity<String> listaProdutosPorCategoria(@PathVariable String categoria){
        var produto = produtoService.listaProdutosPorCategoria(categoria);
        return ResponseEntity.ok("Lista Produto");
    }

    @PostMapping("/produto")
    public ResponseEntity<Void> addProduto(){
        produtoService.addProduto();
        return ResponseEntity.status(201).build();
    }

    @DeleteMapping("/produto")
    public ResponseEntity<Void> removerProduto(){
        produtoService.removerProduto();
        return ResponseEntity.status(204).build();
    }

    @PutMapping("/produto")
    public ResponseEntity<Void> editarProduto(){
        produtoService.editarProduto();
        return ResponseEntity.status(204).build();
    }
}
