package br.com.burgerfast.adapter.in.httpModels;

import br.com.burgerfast.adapter.out.entities.enuns.CategoriaEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoHttpModel {

    private Long id;
    private String nome;
    private CategoriaEnum categoria;
    private BigDecimal preco;
    private String descricao;
    private String imagem;
    private List<PedidoHttpModel> pedidos;

}
