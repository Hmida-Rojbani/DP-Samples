package dp.structure.composite.problem;

import java.util.ArrayList;
import java.util.List;

public class Group {
	
	private List<Shape> shapes = new ArrayList<>();
	
	public void add (Shape shape) {
		shapes.add(shape);
	}
	
	public void render() {
		for (Shape shape : shapes) {
			shape.render();
		}
	}
	
	public void move() {
		for (Shape shape : shapes) {
			shape.move();
		}
	}

}
