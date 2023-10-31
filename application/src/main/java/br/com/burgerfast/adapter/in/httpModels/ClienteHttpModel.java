package br.com.burgerfast.adapter.in.httpModels;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClienteHttpModel {

    private Long id;
    private Integer cpf;
    private String name;
    private String email;
    private List<PedidoHttpModel> pedidoEntityList;
    private List<PagamentoHttpModel> pagamentoEntityList;
}
