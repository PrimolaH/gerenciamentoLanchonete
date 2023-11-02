package br.com.burgerfast.adapter.in;

import br.com.burgerfast.adapter.in.httpModels.CadastroProdutoHttpModel;
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
@RequestMapping("/produto")
@RequiredArgsConstructor
public class ProdutoController {

    private final ProdutoService produtoService;
    private final ProdutoMapper produtoMapper;

    @GetMapping("/{categoria}")
    public ResponseEntity<List<ProdutoHttpModel>> listaProdutosPorCategoria(@PathVariable String categoria){
        List<ProdutoHttpModel> produtoHttpModelList = produtoService.listaProdutosPorCategoria(categoria).stream()
                .map(produtoMapper::httpModelFrom)
                .collect(Collectors.toList());
        return ResponseEntity.ok(produtoHttpModelList);
    }

    @PostMapping
    public ResponseEntity<Void> addProduto(@RequestBody CadastroProdutoHttpModel httpModel){
        Produto produto = produtoService.addProduto(produtoMapper.httpModelTo(httpModel));
        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{categoria}")
                .buildAndExpand(produto.getCategoria())
                .toUri();
        return ResponseEntity.created(uri).build();
    }

    @DeleteMapping("/{id_produto}")
    public ResponseEntity<Void> removerProduto(@PathVariable(name="id_produto") Long idProduto){
        produtoService.removerProduto(idProduto);
        return ResponseEntity.noContent().build();
    }

    @PutMapping
    public ResponseEntity<Void> editarProduto(@RequestBody ProdutoHttpModel httpModel){
        produtoService.editarProduto(produtoMapper.httpModelTo(httpModel));
        return ResponseEntity.noContent().build();
    }
}
