package br.com.burgerfast.adapter.in;

import br.com.burgerfast.adapter.in.httpModels.PagamentoHttpModel;
import br.com.burgerfast.adapter.mapper.PagamentoMapper;
import br.com.burgerfast.core.domain.Pagamento;
import br.com.burgerfast.core.service.PagamentoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/pagamento")
@RequiredArgsConstructor
public class PagamentoController {

    private final PagamentoService pagamentoService;
    private final PagamentoMapper pagamentoMapper;

    @PostMapping
    public ResponseEntity<Void> efetuarPagamento(@RequestBody PagamentoHttpModel httpModel){
        Pagamento pagamento = pagamentoService.efetuarPagamento(pagamentoMapper.httpModelTo(httpModel));
        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id_pagamento}")
                .buildAndExpand(pagamento.getId())
                .toUri();
        return  ResponseEntity.created(uri).build();
    }
}
