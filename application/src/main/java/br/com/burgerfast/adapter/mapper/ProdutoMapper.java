package br.com.burgerfast.adapter.mapper;

import br.com.burgerfast.adapter.in.httpModels.ProdutoHttpModel;
import br.com.burgerfast.adapter.in.httpModels.enums.CategoriaHttpModelEnum;
import br.com.burgerfast.adapter.out.entities.ProdutoEntity;
import br.com.burgerfast.core.domain.Produto;
import br.com.burgerfast.core.domain.enums.CategoriaEnum;
import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.springframework.stereotype.Component;

@Component
public class ProdutoMapper {

    private final ModelMapper modelMapper = new ModelMapper();

    private TypeMap<ProdutoEntity, Produto> propMapEntityTo = modelMapper.createTypeMap(ProdutoEntity.class, Produto.class);
    private TypeMap<Produto, ProdutoEntity> propMapEntityFrom = modelMapper.createTypeMap(Produto.class, ProdutoEntity.class);
    private TypeMap<Produto, ProdutoHttpModel> propMapHttpModelFrom = modelMapper.createTypeMap(Produto.class, ProdutoHttpModel.class);


    public Produto entityTo(ProdutoEntity entity){
        Converter<Integer, CategoriaEnum> converterCategoria =
                ctx -> ctx.getSource() == null ? null : CategoriaEnum.toEnum(ctx.getSource());
        propMapEntityTo.addMappings(
                mapper -> mapper.using(converterCategoria).map(ProdutoEntity::getCategoria, Produto::setCategoria)
        );
        return this.modelMapper.map(entity, Produto.class);
    }

    public ProdutoEntity entityFrom(Produto domain){
        Converter<CategoriaEnum, Integer> converterCategoria =
                ctx -> ctx.getSource() == null ? null : ctx.getSource().getCode();
        propMapEntityFrom.addMappings(
                mapper -> mapper.using(converterCategoria).map(Produto::getCategoria, ProdutoEntity::setCategoria)
        );
        return this.modelMapper.map(domain, ProdutoEntity.class);
    }

    public Produto httpModelTo(ProdutoHttpModel httpModel){
        return this.modelMapper.map(httpModel, Produto.class);
    }

    public ProdutoHttpModel httpModelFrom(Produto domain){
        Converter<CategoriaEnum, CategoriaHttpModelEnum> converterCategoria =
                ctx -> ctx.getSource() == null ? null : CategoriaHttpModelEnum.toEnum(ctx.getSource().getValue());
        propMapHttpModelFrom.addMappings(
                mapper -> mapper.using(converterCategoria).map(Produto::getCategoria, ProdutoHttpModel::setCategoria)
        );
        return this.modelMapper.map(domain, ProdutoHttpModel.class);
    }
}
