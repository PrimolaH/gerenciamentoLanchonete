package br.com.burgerfast.adapter.out.repositories;

import br.com.burgerfast.adapter.out.entities.FilaPedidoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilaPedidoRepository extends JpaRepository<FilaPedidoEntity, Long> {
}
