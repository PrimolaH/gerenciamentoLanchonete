package br.com.burgerfast.out.repositories;

import br.com.burgerfast.out.entities.ProdutoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<ProdutoEntity, Long> {
}
