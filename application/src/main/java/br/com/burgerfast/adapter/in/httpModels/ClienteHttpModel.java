package br.com.burgerfast.adapter.in.httpModels;

import br.com.burgerfast.core.domain.Cliente;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Optional;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClienteHttpModel {

    private Long id;
    private Integer cpf;
    private String name;
    private String email;

    public Cliente to(){
        return Optional.ofNullable(this)
                .map(httpModel -> Cliente.builder()
                        .id(httpModel.getId())
                        .cpf(httpModel.getCpf())
                        .email(httpModel.getEmail())
                        .build())
                .orElseThrow();
    }

    public ClienteHttpModel from(Cliente cliente){
        return Optional.ofNullable(cliente)
                .map(domain -> ClienteHttpModel.builder()
                        .id(domain.getId())
                        .cpf(domain.getCpf())
                        .email(domain.getEmail())
                        .build())
                .orElse(new ClienteHttpModel());
    }
}
