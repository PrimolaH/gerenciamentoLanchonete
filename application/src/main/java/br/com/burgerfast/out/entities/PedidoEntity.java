package br.com.burgerfast.out.entities;

import br.com.burgerfast.out.entities.enuns.StatusEnum;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
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

    @Column(name="id_cliente")
    private ClienteEntity clienteEntity;
    @Column(name="vl_total")
    private BigDecimal total;
}
