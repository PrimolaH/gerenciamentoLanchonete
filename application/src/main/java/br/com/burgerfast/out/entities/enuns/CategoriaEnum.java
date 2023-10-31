package br.com.burgerfast.out.entities.enuns;

import lombok.Data;
import lombok.Getter;

@Getter
public enum CategoriaEnum {
    LANCHE(1,"lanche"),
    ACOMPANHAMENTO(2,"acompanhamento"),
    BEBIDA(3,"bebida"),
    SOBREMESA(4,"sobremesa");

    private Integer code;
    private String value;


    private CategoriaEnum(Integer code, String value) {
        this.code = code;
        this.value = value;
    }

    public static CategoriaEnum toEnum(String value) {
        if(value == null) {
            return null;
        }

        for(CategoriaEnum x : CategoriaEnum.values()) {
            if(value.equals(x.getValue())) {
                return x;
            }
        }

        throw new IllegalArgumentException("Value inválido: " + value);
    }
}
