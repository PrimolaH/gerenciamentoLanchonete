package br.com.burgerfast.core.domain.enums;

import lombok.Getter;

import java.util.Arrays;
import java.util.Optional;

@Getter
public enum CategoriaEnum {
    LANCHE(1,"LANCHE"),
    ACOMPANHAMENTO(2,"ACOMPANHAMENTO"),
    BEBIDA(3,"BEBIDA"),
    SOBREMESA(4,"SOBREMESA");

    private Integer code;
    private String value;


    private CategoriaEnum(Integer code, String value) {
        this.code = code;
        this.value = value;
    }

    public static Integer getByValue(String value){
        Optional<CategoriaEnum> categoriaEnum = Arrays.asList(CategoriaEnum.values()).stream()
                .filter(item -> item.getValue().equalsIgnoreCase(value))
                .findFirst();
        return categoriaEnum.map(CategoriaEnum::getCode).orElse(null);
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


    public static CategoriaEnum toEnum(Integer code) {
        if(code == null) {
            return null;
        }

        for(CategoriaEnum x : CategoriaEnum.values()) {
            if(code.equals(x.getCode())) {
                return x;
            }
        }

        throw new IllegalArgumentException("Value inválido: " + code);
    }
}
