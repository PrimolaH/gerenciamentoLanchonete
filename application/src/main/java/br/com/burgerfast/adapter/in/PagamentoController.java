package br.com.burgerfast.adapter.in;

import br.com.burgerfast.core.service.PagamentoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("pagamento")
@RequiredArgsConstructor
public class PagamentoController {

    private final PagamentoService pagamentoService
    @PostMapping
    public ResponseEntity<Void> efetuarPagamento(){
        pagamentoService.efetuarPagamento();
        return  ResponseEntity.status(201).build();
    }
}
