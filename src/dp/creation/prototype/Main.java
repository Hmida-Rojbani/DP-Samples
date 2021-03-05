package dp.creation.prototype;

public class Main {

	public static void main(String[] args) {
		Product prototype = new Product(25,"proto");
		
		Product p1 = prototype.clone();
		
		p1.setName("new");
		
		System.out.println(p1);
		
		p1 = prototype.clone();
		
		System.out.println(p1);
		
	}
}
