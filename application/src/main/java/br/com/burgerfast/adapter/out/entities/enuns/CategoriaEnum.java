package br.com.burgerfast.adapter.out.entities.enuns;

import lombok.Getter;

@Getter
public enum CategoriaEnum {
    LANCHE(1,"Lanche"),
    ACOMPANHAMENTO(2,"Acompanhamento"),
    BEBIDA(3,"Bebida"),
    SOBREMESA(4,"Sobremesa");

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
