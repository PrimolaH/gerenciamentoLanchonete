package br.com.burgerfast.out.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@Entity(name="produto")
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoEntity {

    @Id
    private Long id;
    private
}
