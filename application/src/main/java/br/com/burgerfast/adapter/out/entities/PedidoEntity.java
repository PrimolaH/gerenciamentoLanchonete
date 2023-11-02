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

    @ManyToMany
    @JoinTable(name="produto_pedido",
            joinColumns = @JoinColumn(name="id_pedido"),
            inverseJoinColumns = @JoinColumn(name="id_produto"))
    private List<ProdutoEntity> produtos;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name="id_cliente")
    private ClienteEntity cliente;

    @JsonManagedReference
    @OneToMany(mappedBy="pedido")
    private List<PagamentoEntity> pagamentoEntityList;

    @Column(name="vl_total")
    private BigDecimal total;

}
