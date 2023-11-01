package br.com.burgerfast.core.domain;

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
public class Produto {

    private Long id;
    private String nome;
    private CategoriaEnum categoria;
    private BigDecimal preco;
    private String descricao;
    private String imagem;

}
