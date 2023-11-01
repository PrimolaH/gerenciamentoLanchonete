package br.com.burgerfast.adapter.in.httpModels;

import br.com.burgerfast.adapter.in.httpModels.enums.CategoriaHttpModelEnum;
import br.com.burgerfast.core.domain.enums.CategoriaEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoHttpModel {

    private Long id;
    private String nome;
    private CategoriaHttpModelEnum categoria;
    private BigDecimal preco;
    private String descricao;
    private String imagem;

}
