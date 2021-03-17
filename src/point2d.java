public class point2d {
	private double xCoord;
	private double yCoord;

	public point2d (double x, double y) {
		xCoord = x;
		yCoord = y;
	}
	
	public point2d () {
		this(0, 0);
	}

	public double getX () {
		return xCoord;
	}
	
	public double getY () {
		return yCoord;
	}

	public void setX ( double val) {
		xCoord = val;
	}

	public void setY ( double val) {
		yCoord = val;
	}
	
	public boolean checkValue(point2d point) {
			return xCoord == point.xCoord && yCoord == point.yCoord;
	}
}
