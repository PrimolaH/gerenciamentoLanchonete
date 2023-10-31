package br.com.burgerfast.out.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@Entity(name="pagamento")
@NoArgsConstructor
@AllArgsConstructor
public class PagamentoEntity {

    @Id
    private Long id;

    @Column(name="id_cliente")
    private ClienteEntity clienteEntity;

    @Column(name="vl_total")
    private Integer total;
}
