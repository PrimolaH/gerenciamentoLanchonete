package br.com.burgerfast.adapter.out.repositories;

import br.com.burgerfast.adapter.out.entities.ProdutoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<ProdutoEntity, Long> {
}