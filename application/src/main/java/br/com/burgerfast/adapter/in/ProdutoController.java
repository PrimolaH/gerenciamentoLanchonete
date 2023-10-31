package br.com.burgerfast.adapter.in;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProdutoController {

    @GetMapping("/{categoria}")
    public ResponseEntity<String> listaProdutosPorCategoria(@PathVariable String categoria){
        return ResponseEntity.ok("Lista Produto");
    }

    @PostMapping
    public ResponseEntity<Void> addProduto(){
        return ResponseEntity.status(201).build();
    }

    @DeleteMapping
    public ResponseEntity<Void> removerProduto(){
        return ResponseEntity.status(204).build();
    }

    @PutMapping
    public ResponseEntity<Void> editarProduto(){
        return ResponseEntity.status(204).build();
    }
}
