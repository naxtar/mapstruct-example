package com.example.MapStruct;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.MapStruct.dto.ProductDto;
import com.example.MapStruct.mapper.ProductMapper;
import com.example.MapStruct.model.Product;

@SpringBootTest
class CofacilMapStructApplicationTests {
	
	private ProductMapper mapper=Mappers.getMapper(ProductMapper.class);

	@Test
	void mappeoTest() {
		Product producto1=new Product(1,"computer","electro",10,20L);

		ProductDto productDto= mapper.modelToDto(producto1);
		
		Assertions.assertEquals(productDto.getId(), producto1.getId());
		
	}

}
