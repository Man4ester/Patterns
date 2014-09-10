package bismark.it.patterns.factory;

import bismark.it.patterns.factory.blogic.interfaces.Shape;

public class Main {
	public static void main(String[] args){
		ShapeFactory factory = new ShapeFactory();
		
		Shape shape =  factory.getSahpe("CIRCLE");
		shape.draw();
		
		shape= factory.getSahpe("RECTANGLE");
		shape.draw();
		
		shape=factory.getSahpe("SQUARE");
		shape.draw();
	}
}
