package br.com.burgerfast.adapter.in.httpModels;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CadastroClienteHttpModel {

    private String cpf;
    private String name;
    private String email;

}
