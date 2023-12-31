package br.com.burgerfast.adapter.out.repositories;

import br.com.burgerfast.adapter.out.entities.ClienteEntity;
import br.com.burgerfast.adapter.out.entities.ProdutoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<ClienteEntity, Long> {
    ClienteEntity findByCpf(String cpf);
}
