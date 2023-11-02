package br.com.burgerfast.adapter.in.httpModels;

import br.com.burgerfast.adapter.out.entities.enuns.StatusEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CadastroPedidoHttpModel {

    private StatusEnum status;
    private List<ProdutoPedidoHttpModel> produtos;
    private ClienteIdHttpModel cliente;
}
