package br.com.burgerfast.adapter.out.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@Entity(name="fila_pedido")
@NoArgsConstructor
@AllArgsConstructor
public class FilaPedidoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_fila")
    private Long ida;
    @Column(name = "ds_mensagem")
    private String mensagem;
}
