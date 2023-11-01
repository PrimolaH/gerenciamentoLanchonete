package br.com.burgerfast.adapter.in.httpModels;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClienteHttpModel {

    private Long id;
    private Integer cpf;
    private String name;
    private String email;

}
