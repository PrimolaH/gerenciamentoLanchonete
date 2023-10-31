package br.com.burgerfast.adapter.out;

import br.com.burgerfast.core.port.ProdutoPort;
import org.springframework.stereotype.Component;

@Component
public class ProdutoProvider implements ProdutoPort {
    @Override
    public String listaProdutosPorCategoria(String categoria) {
        return null;
    }

    @Override
    public void addProduto() {

    }

    @Override
    public void removerProduto() {

    }

    @Override
    public void editarProduto() {

    }
}
