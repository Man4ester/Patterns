package bismark.it.patterns.abstractfactory;

import bismark.it.patterns.abstractfactory.blogic.interfaces.Color;

public class Main {

	public static void main(String[] args) {
		AbstractFactory colorFactory = AbstractFactoryProducer
				.getFactory("COLOR");
		Color color1 = colorFactory.getColor("RED");
		color1.fill();
		
		Color color2 = colorFactory.getColor("BLUE");
		color2.fill();
		
		Color color3 = colorFactory.getColor("GREEN");
		color3.fill();
	}

}
