package °úÁ¦10;

public class Shape {
	int width, height;

	public void Shape(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public double area() {
		return (double) width * (double) height;
	}

}

class Triangle extends Shape {

	public double area(){
		return (double) width * (double) height / 2;
	}
}

class Rectangle extends Shape {
}

class Circle extends Shape {

	public double area(){
		return (double) width * (double) width * 3.14;
	}
}
