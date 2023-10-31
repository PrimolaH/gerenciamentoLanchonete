package br.com.burgerfast.out.entities;

import br.com.burgerfast.out.entities.enuns.CategoriaEnum;
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
    @Column(name="id_produto")
    private Long id;
    @Column(name="nm_produto")
    private String nome;
    @Column(name="nm_produto")
    private CategoriaEnum categoria;
    @Column(name="vl_preco")
    private BigDecimal preco;
    @Column(name="ds_produto")
    private String descricao;
    @Column(name="ds_imagem")
    private String imagem;
    @ManyToMany
    @JoinTable(name="produto_pedido",
            joinColumns = @JoinColumn(name="id_produto"),
            inverseJoinColumns = @JoinColumn(name="id_pedido"))
    private List<PedidoEntity> pedidos;

}
