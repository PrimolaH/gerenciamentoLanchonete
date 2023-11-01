package br.com.burgerfast.adapter.out.entities;

import br.com.burgerfast.adapter.out.entities.enuns.StatusEnum;
import br.com.burgerfast.core.domain.Cliente;
import br.com.burgerfast.core.domain.Pedido;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Data
@Builder
@Entity(name="pedido")
@NoArgsConstructor
@AllArgsConstructor
public class PedidoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pedido")
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
