package dp.creation.prototype;

public class Product {

	private int value ;
	private String name;
	
	
	
	public Product(int value, String name) {
		super();
		this.value = value;
		this.name = name;
	}


	public Product clone() {
		return new Product(this.value, this.name);
	}


	@Override
	public String toString() {
		return "Product [value=" + value + ", name=" + name + "]";
	}


	public int getValue() {
		return value;
	}


	public void setValue(int value) {
		this.value = value;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	

}
