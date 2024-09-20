package com.pradhan.otm.client;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import com.pradhan.otm.dao.CategoryDao;
import com.pradhan.otm.dao.impl.CategoryDAOImpl;
import com.pradhan.otm.entity.CategoryEntity;
import com.pradhan.otm.entity.ProductEntity;

public class Tester {

	public static void main(String[] args) throws Exception{
		
		CategoryDao dao = new CategoryDAOImpl();
		 
		/*
		call saveCategory method()
		*/
		
		/*
		CategoryEntity categoryEntity = new CategoryEntity();
		categoryEntity.setCategoryId(1122);
		categoryEntity.setCategoryName("Electronic");
		
		//create ProductEntity instance 
		
		ProductEntity productEntity1 = new ProductEntity();
		productEntity1.setProductId(5555);
		productEntity1.setProductName("mobile");
		
		File file = new File("/Users/prakashpradhan/Downloads/image/mobile.jpeg");
		byte[] imageBytes = new byte[(int) file.length()];
		
		FileInputStream fis = new FileInputStream(file);
		fis.read(imageBytes);
		productEntity1.setProductImage(imageBytes);
		
		//create ProductEntity instance-2
		
		ProductEntity productEntity2 = new ProductEntity();
		productEntity2.setProductId(67098);
		productEntity2.setProductName("tv");
		
		File file2 = new File("/Users/prakashpradhan/Downloads/image/tv.webp");
		byte[] imageBytes_tv = new byte[(int) file2.length()];
		
		FileInputStream fis2 = new FileInputStream(file2);
		fis2.read(imageBytes_tv);
		productEntity2.setProductImage(imageBytes_tv);
		
		
		//create ProductEntity instance -3
		
		ProductEntity productEntity3 = new ProductEntity();
		productEntity3.setProductId(67574);
		productEntity3.setProductName("MicroOven");
		
		File file3 = new File("/Users/prakashpradhan/Downloads/image/oven.jpeg");
		byte[] imageBytes_oven = new byte[(int) file3.length()];
		
		FileInputStream fis3 = new FileInputStream(file3);
		fis3.read(imageBytes_oven);
		productEntity3.setProductImage(imageBytes_oven);
		
		//add productentity  instances to collection
		
		List<ProductEntity> lstOfProducts = Arrays.asList(productEntity1,productEntity2,productEntity3);
		
		//set the collection to categoryEntity instance
		
		categoryEntity.setLstOfProducts(lstOfProducts);
		
		dao.saveCategory(categoryEntity);
		
		*/
		
		CategoryEntity fetchCategory = dao.fetchCategory(1122);
		System.out.println("category name : " + fetchCategory.getCategoryName());
		List<ProductEntity> lst = fetchCategory.getLstOfProducts();
		
		//read the first element of the list
		
		ProductEntity pEntity = lst.get(0);
		System.out.println("product Id : "+ pEntity.getProductId());
		System.out.println("product Name : "+ pEntity.getProductName());
		byte[] bytesOfImage= pEntity.getProductImage();
		File f1 = new File("/Users/prakashpradhan/Downloads/restoredImage/image_db.jpg");
		FileOutputStream fos = new FileOutputStream(f1);
		fos.write(bytesOfImage);
		System.out.println("please check the image at : "+ f1.getAbsolutePath());
		
		

	}

}
