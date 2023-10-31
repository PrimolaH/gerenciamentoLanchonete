package br.com.burgerfast.adapter.out.entities.enuns;

import lombok.Getter;

@Getter
public enum StatusEnum {
    RECEBIDO(1, "Recebido"),
    EM_PREPARACAO(2, "Em Preparação"),
    PRONTO(3, "Pronto"),
    FINALIZADO(4,"Finalizado");

    private Integer code;
    private String value;

    private StatusEnum(Integer code, String value) {
        this.code = code;
        this.value = value;
    }

    public static StatusEnum toEnum(String value) {
        if(value == null) {
            return null;
        }

        for(StatusEnum x : StatusEnum.values()) {
            if(value.equals(x.getValue())) {
                return x;
            }
        }

        throw new IllegalArgumentException("Value inválido: " + value);
    }
}
