package com.pradhan.client;

import com.pradhan.dao.ProductDao;
import com.pradhan.dao.impl.ProductDaoImpl;
import com.pradhan.entity.ProductEntity;

public class Tester {

	public static void main(String[] args) {
		
		ProductDao dao = new ProductDaoImpl();
		
		 /*
		  * create a new product entity
		  */
//		ProductEntity pEntity = new ProductEntity();
//		pEntity.setProductId(4444);
//		pEntity.setProductName("mobile");
//		pEntity.setQuantity(10);
//		pEntity.setUnitPrice(44500.00);
		
		/*
		 * call saveProduct() method of dao class
		 */
//		dao.saveProduct(pEntity);
		
		/*
		 * call updateById method of dao class
		 */
//		ProductEntity updateProductById = dao.updateProductById(4444, 12334.0);
//		System.out.println(updateProductById);
		
		
		/*
		 * call loadProductById method of dao class
		 */
		
//		ProductEntity productById = dao.loadProductById(4444);
//		System.out.println(productById);
		
		
		/*
		 * call deleteProductById method of dao class
		 */
		dao.deleteProductById(4444);

	}

}
