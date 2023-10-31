package br.com.burgerfast.adapter.in.httpModels;

import br.com.burgerfast.adapter.out.entities.enuns.StatusEnum;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
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
    private List<ProdutoHttpModel> produtoEntityList;
    private ClienteHttpModel clienteEntity;
    private BigDecimal total;
}
