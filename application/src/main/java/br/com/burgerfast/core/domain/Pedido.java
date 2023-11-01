package br.com.burgerfast.core.domain;

import br.com.burgerfast.adapter.out.entities.enuns.StatusEnum;
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
public class Pedido {

    private Long id;
    private StatusEnum status;
    private List<Produto> produtoList;
    private Cliente cliente;
    private BigDecimal total;
}
