package br.com.burgerfast.adapter.out.repositories;

import br.com.burgerfast.adapter.out.entities.ProdutoEntity;
import br.com.burgerfast.adapter.out.entities.enuns.CategoriaEnum;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<ProdutoEntity, Long> {
    List<ProdutoEntity> findByCategoria(Integer categoria);
}
