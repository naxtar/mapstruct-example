package com.example.MapStruct.model;




public class Product {
	
	private int id;
	
	private String name;
	
	private String desc;
	
	private int quantity;
	
	private Long price;
	
	
	

	public Product(int id, String name, String desc, int quantity, Long price) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
		this.quantity = quantity;
		this.price = price;
	}
	
	

	public Product() {
		super();
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}
	
	
	
}
