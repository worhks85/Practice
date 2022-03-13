package Extend;

class Shape{
	double result;
	public double area() {
		return result;
	}
}

class Triangle extends Shape{
	double bottom;
	double height;
	public Triangle(double bottom ,double height) {
		this.bottom = bottom;
		this.height = height;
	
	}
	public double area() {
		result = bottom * height /2;
		return result;
	}
}

class Square extends Shape{
	double width;
	double length;
	public Square(double width , double length) {
		this.width = width;
		this.length = length;
	}
	public double area() {
		result = width * length;
		return result;
		
	}
}

class Circle extends Shape{
	double radius;
	double pi = 3.14;
	public Circle(double radius) {
		this.radius = radius;
	}
	public double area() {
		result = pi * radius*radius;
		return result;
		
	}
	
}


public class ExtendQuiz1 {

	public static void main(String[] args) {
		Shape sh1 = new Triangle(10.23, 45.55);
		System.out.println("�ﰢ���� ���� : " + sh1.area());
		
		Shape sh2 = new Square(3.5, 5.2);
		System.out.println("�簢���� ���� : " + sh2.area());
				
		Shape sh3 = new Circle(5);
		System.out.println("���� ���� " + sh3.area());
	}

}
