package br.com.burgerfast.adapter.out.entities;

import br.com.burgerfast.adapter.in.httpModels.ClienteHttpModel;
import br.com.burgerfast.core.domain.Cliente;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Optional;

@Data
@Builder
@Entity(name="cliente")
@NoArgsConstructor
@AllArgsConstructor
public class ClienteEntity {

    @Id
    private Long id;

    @Column(name="nr_cpf")
    private Integer cpf;

    @Column(name="nm_cliente")
    private String name;

    @Column(name="ds_email")
    private String email;

    @OneToMany(mappedBy="clienteEntity")
    private List<PedidoEntity> pedidoEntityList;

    @OneToMany(mappedBy="clienteEntity")
    private List<PagamentoEntity> pagamentoEntityList;


}
