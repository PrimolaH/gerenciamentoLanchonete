package br.com.burgerfast.adapter.in.httpModels;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PagamentoHttpModel {

    private Long id;
    private ClienteHttpModel clienteEntity;
    private Integer total;
}
