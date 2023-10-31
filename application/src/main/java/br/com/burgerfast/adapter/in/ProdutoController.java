package br.com.burgerfast.adapter.in;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProdutoController {

    @GetMapping("/{produto}")
    public ResponseEntity<String> listaProdutos(@PathVariable String produto){
        return ResponseEntity.ok("Lista Pedido");
    }

    @PostMapping
    public ResponseEntity<Void> addProduto(){
        return ResponseEntity.status(201).build();
    }
}
