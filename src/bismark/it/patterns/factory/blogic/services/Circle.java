package bismark.it.patterns.factory.blogic.services;

import bismark.it.patterns.factory.blogic.interfaces.Shape;

public class Circle implements Shape{

	@Override
	public void draw() {
		System.out.println("Darw() from Circle");
	}

}
