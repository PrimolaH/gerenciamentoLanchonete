package br.com.burgerfast.adapter.out.entities;

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
@Entity(name="pedido")
@NoArgsConstructor
@AllArgsConstructor
public class PedidoEntity {

    @Id
    private Long id;
    @Column(name="ds_status")
    private StatusEnum status;

    @JsonManagedReference
    @ManyToMany(mappedBy="pedidos")
    private List<ProdutoEntity> produtoEntityList;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name="id_cliente")
    private ClienteEntity clienteEntity;

    @Column(name="vl_total")
    private BigDecimal total;
}
