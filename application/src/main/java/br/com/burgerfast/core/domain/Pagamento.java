package br.com.burgerfast.core.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Pagamento {

    private Long id;
    private Pedido pedido;
    private Cliente cliente;
    private Integer total;
}
