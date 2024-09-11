package com.pradhan.dao;

import com.pradhan.entity.ProductEntity;

public interface ProductDao {
	
	ProductEntity saveProduct(ProductEntity productEntity);
	
	ProductEntity loadProductById(Integer productId);
	
	ProductEntity updateProductById(Integer productId, Double new_unit_unitPrice);
	
	void deleteProductById(Integer productId);
	
	

}
