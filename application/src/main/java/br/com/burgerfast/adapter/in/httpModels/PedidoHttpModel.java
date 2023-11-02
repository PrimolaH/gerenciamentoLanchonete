package br.com.burgerfast.adapter.in.httpModels;

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
public class PedidoHttpModel {

    private Long id;
    private StatusEnum status;
    private List<ProdutoHttpModel> produtos;
    private ClienteHttpModel cliente;
    private BigDecimal total;

}
