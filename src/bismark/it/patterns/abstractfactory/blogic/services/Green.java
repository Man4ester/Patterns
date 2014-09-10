package bismark.it.patterns.abstractfactory.blogic.services;

import bismark.it.patterns.abstractfactory.blogic.interfaces.Color;

public class Green implements Color{

	@Override
	public void fill() {
		System.out.println("Fill() from Green");
	}

}
