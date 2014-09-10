package bismark.it.patterns.abstractfactory.blogic.services;

import bismark.it.patterns.abstractfactory.blogic.interfaces.Color;

public class Red implements Color{

	@Override
	public void fill() {
		System.out.println("fill() from red");
	}

}
