package entities;

public class Product {
	
	//atributos
	private String name;
	private Double price;
	
	//construtores
	public Product() {
		
	}

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}
	
	//getters setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
}
