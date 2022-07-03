package com.example.MapStruct.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.example.MapStruct.dto.ProductDto;
import com.example.MapStruct.model.Product;

@Mapper
public interface ProductMapper {

	ProductMapper INSTANCE=Mappers.getMapper(ProductMapper.class);
	
	@Mapping(source="product.desc", target="description", defaultValue = "description")
	ProductDto modelToDto(Product product);

	@Mapping(source="productDto.description",target="desc",defaultValue = "description")
	Product dtoToModel(ProductDto productDto);
}
