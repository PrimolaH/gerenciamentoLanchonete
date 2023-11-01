package br.com.burgerfast.adapter.out.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@Entity(name="cliente")
@NoArgsConstructor
@AllArgsConstructor
public class ClienteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    private Long id;

    @Column(name="nr_cpf")
    private String cpf;

    @Column(name="nm_cliente")
    private String name;

    @Column(name="ds_email")
    private String email;

    @OneToMany(mappedBy="clienteEntity")
    private List<PedidoEntity> pedidoEntityList;

    @OneToMany(mappedBy="clienteEntity")
    private List<PagamentoEntity> pagamentoEntityList;


}
