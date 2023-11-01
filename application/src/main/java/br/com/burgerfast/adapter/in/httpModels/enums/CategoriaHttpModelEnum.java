package br.com.burgerfast.adapter.in.httpModels.enums;

import lombok.Getter;

@Getter
public enum CategoriaHttpModelEnum {
    LANCHE("LANCHE"),
    ACOMPANHAMENTO("ACOMPANHAMENTO"),
    BEBIDA("BEBIDA"),
    SOBREMESA("SOBREMESA");

    private String value;


    private CategoriaHttpModelEnum(String value) {
        this.value = value;
    }

    public static CategoriaHttpModelEnum toEnum(String value) {
        if(value == null) {
            return null;
        }

        for(CategoriaHttpModelEnum x : CategoriaHttpModelEnum.values()) {
            if(value.equals(x.getValue())) {
                return x;
            }
        }

        throw new IllegalArgumentException("Value inválido: " + value);
    }
}
