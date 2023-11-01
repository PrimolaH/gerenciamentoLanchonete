package br.com.burgerfast.adapter.out.repositories;

import br.com.burgerfast.adapter.out.entities.ClienteEntity;
import br.com.burgerfast.adapter.out.entities.PagamentoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoRepository extends JpaRepository<PagamentoEntity, Long> {
}
