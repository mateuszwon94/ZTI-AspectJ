package ZTI;

import java.lang.Math;

public aspect ComparablePoint {

	declare parents: Point implements Comparable;

	public int Point.compareTo(Object o) {
		return (int) (Math.sqrt(x * x + y * y) - 
					  Math.sqrt(((Point)o).x * ((Point)o).x + ((Point)o).y * ((Point)o).y));
	}
}
