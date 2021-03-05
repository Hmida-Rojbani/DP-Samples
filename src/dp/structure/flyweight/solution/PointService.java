package dp.structure.flyweight.solution;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PointService {
	
	private PointIconFactory iconFactory;
	
	public List<Point> getPoints(){
		List<Point> points = new ArrayList<>();
		Point point1 = new Point(1, 0, iconFactory.getPointIcon(PointType.CAFE));
		Point point2 = new Point(1, 10, iconFactory.getPointIcon(PointType.CAFE));
		Point point3 = new Point(10, 10, iconFactory.getPointIcon(PointType.RESTAURANT));
		points.add(point1);
		points.add(point2);
		points.add(point3);
		return points;
	}

}
