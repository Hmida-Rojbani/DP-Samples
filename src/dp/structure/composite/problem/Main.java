package dp.structure.composite.problem;

public class Main {
	
	public static void main(String[] args) {
		Shape circle1 = new Shape();
		Shape circle2 = new Shape();
		
		Shape square1 = new Shape();
		Shape square2 = new Shape();
		
		Group group1 = new Group();
		group1.add(circle1);
		group1.add(circle2);
		
		Group group2 = new Group();
		group2.add(square1);
		group2.add(square2);
		
		group1.render();
		
		group2.move();
		
		Group group = new Group();
		
		//group.add(group1);
	}

}
