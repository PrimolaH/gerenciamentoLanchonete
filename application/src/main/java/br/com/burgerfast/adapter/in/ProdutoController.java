package br.com.burgerfast.adapter.in;

import br.com.burgerfast.adapter.in.httpModels.ProdutoHttpModel;
import br.com.burgerfast.adapter.mapper.ProdutoMapper;
import br.com.burgerfast.core.domain.Produto;
import br.com.burgerfast.core.service.ProdutoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class ProdutoController {

    private final ProdutoService produtoService;
    private final ProdutoMapper produtoMapper;

    @GetMapping("/produto/{categoria}")
    public ResponseEntity<List<ProdutoHttpModel>> listaProdutosPorCategoria(@PathVariable String categoria){
        List<ProdutoHttpModel> produtoHttpModelList = produtoService.listaProdutosPorCategoria(categoria).stream()
                .map(produtoMapper::httpModelFrom)
                .collect(Collectors.toList());
        return ResponseEntity.ok(produtoHttpModelList);
    }

    @PostMapping("/produto")
    public ResponseEntity<Void> addProduto(@RequestBody ProdutoHttpModel httpModel){
        Produto produto = produtoMapper.httpModelTo(httpModel);
        ProdutoHttpModel produtoHttpModel = produtoMapper.httpModelFrom(produtoService.addProduto(produto));
        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id_produto}")
                .buildAndExpand(produtoHttpModel.getId())
                .toUri();
        return ResponseEntity.created(uri).build();
    }

    @DeleteMapping("/produto/{id_produto}")
    public ResponseEntity<Void> removerProduto(@PathVariable Long idProduto){
        produtoService.removerProduto(idProduto);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/produto")
    public ResponseEntity<Void> editarProduto(@RequestBody ProdutoHttpModel httpModel){
        produtoService.editarProduto(produtoMapper.httpModelTo(httpModel));
        return ResponseEntity.noContent().build();
    }
}
