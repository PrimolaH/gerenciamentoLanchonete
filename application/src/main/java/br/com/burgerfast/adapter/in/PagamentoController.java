package br.com.burgerfast.adapter.in;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("pagamento")
public class PagamentoController {

    @PostMapping
    public ResponseEntity<Void> efetuarPagamento(){
        return  ResponseEntity.status(201).build();
    }
}
