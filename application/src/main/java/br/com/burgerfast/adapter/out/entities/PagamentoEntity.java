package br.com.burgerfast.adapter.out.entities;

import br.com.burgerfast.core.domain.Cliente;
import br.com.burgerfast.core.domain.Pagamento;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Optional;

@Data
@Builder
@Entity(name="pagamento")
@NoArgsConstructor
@AllArgsConstructor
public class PagamentoEntity {

    @Id
    private Long id;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name="id_cliente")
    private ClienteEntity clienteEntity;

    @Column(name="vl_total")
    private Integer total;

}
