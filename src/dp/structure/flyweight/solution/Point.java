package dp.structure.flyweight.solution;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Point {
	
	private int x;  // 4o
	private int y;// 4o
	private PointIcon icon;
	
	public void draw() {
		System.out.printf("%s at (%d,%d)", icon.getType(), x,y);
	}

}
