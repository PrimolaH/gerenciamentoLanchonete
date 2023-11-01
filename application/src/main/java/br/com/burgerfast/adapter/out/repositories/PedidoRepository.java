package br.com.burgerfast.adapter.out.repositories;

import br.com.burgerfast.adapter.out.entities.PedidoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<PedidoEntity, Long> {
}
