package br.com.burgerfast.adapter.out.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pagamento")
    private Long id;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name="id_cliente")
    private ClienteEntity cliente;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name="id_pedido")
    private PedidoEntity pedido;

    @Column(name="vl_total")
    private Integer total;

}
