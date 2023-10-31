package br.com.burgerfast.out.entities;

import br.com.burgerfast.out.entities.enuns.CategoriaEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@Entity(name="produto")
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoEntity {

    @Id
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

}
