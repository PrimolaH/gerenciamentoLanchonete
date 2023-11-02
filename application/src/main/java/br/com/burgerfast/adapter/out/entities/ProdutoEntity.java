package br.com.burgerfast.adapter.out.entities;

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
@Entity(name="produto")
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_produto")
    private Long id;
    @Column(name="nm_produto")
    private String nome;
    @Column(name = "id_categoria")
    private Integer categoria;
    @Column(name="vl_preco")
    private BigDecimal preco;
    @Column(name="ds_produto")
    private String descricao;
    @Column(name="ds_imagem")
    private String imagem;

    @JsonManagedReference
    @ManyToMany(mappedBy="produtos")
    private List<PedidoEntity> pedidos;
}
