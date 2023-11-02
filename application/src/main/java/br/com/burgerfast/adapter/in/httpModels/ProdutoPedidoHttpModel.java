package br.com.burgerfast.adapter.in.httpModels;

import br.com.burgerfast.adapter.in.httpModels.enums.CategoriaHttpModelEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoPedidoHttpModel {

    private Long id;

}
