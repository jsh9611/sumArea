package shape;

class Circle extends Shape {
	private double radius;
	public static final double PI = 3.14;

	public Circle(double x, double y, double radius) {
		super(x, y);
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("Circle: " + x + ", " + y + ", " + radius);
	}

	@Override
	public double getArea() {
		return radius * radius * PI;
	}

}
