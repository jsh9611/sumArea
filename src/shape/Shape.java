package shape;

abstract class Shape {

	protected double x;
	protected double y;

	protected Shape(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public abstract void draw();

	public abstract double getArea();
}
