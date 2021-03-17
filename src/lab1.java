public class lab1 {

	public static void main(String[] args) {

		point3d[] myPoint = new point3d[3];
		
		for (int i = 0; i < 3; i++) {
			myPoint[i] = new point3d();
			myPoint[i].setX(Double.valueOf(args[0 + 3 * i]));
			myPoint[i].setY(Double.valueOf(args[1 + 3 * i]));
			myPoint[i].setZ(Double.valueOf(args[2 + 3 * i]));
			
			System.out.println("Point " + i + " (" + myPoint[i].getX() + ", " + myPoint[i].getY() + ", " + myPoint[i].getZ() + ")");
		}
		
		if (myPoint[0].checkValue(myPoint[1]) || myPoint[1].checkValue(myPoint[2]) || myPoint[2].checkValue(myPoint[0])) {
			System.out.println("Some points are equals. Please try again!");
		} else {
			System.out.println("Area of triangle: " + computeArea(myPoint[0], myPoint[1], myPoint[2]));
		}
	}
	
	public static double computeArea(point3d p1, point3d p2, point3d p3) { 
		
			double a = p1.distanceTo(p2);
			double b = p2.distanceTo(p3);
			double c = p3.distanceTo(p1);
			
			double perimeter = (a + b + c) / 2;
			
			double square = Math.sqrt(perimeter * (perimeter - a) * (perimeter - b) * (perimeter - c));
			
			return square;
	}
}