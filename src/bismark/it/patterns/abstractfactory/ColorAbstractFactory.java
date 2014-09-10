package bismark.it.patterns.abstractfactory;

import bismark.it.patterns.abstractfactory.blogic.interfaces.Color;
import bismark.it.patterns.abstractfactory.blogic.services.Blue;
import bismark.it.patterns.abstractfactory.blogic.services.Green;
import bismark.it.patterns.abstractfactory.blogic.services.Red;

public class ColorAbstractFactory extends AbstractFactory {

	@Override
	Color getColor(String color) {
		if (color == null) {
			return null;
		}
		if (color.equalsIgnoreCase("RED")) {
			return new Red();
		} else if (color.equalsIgnoreCase("GREEN")) {
			return new Green();
		} else if (color.equalsIgnoreCase("BLUE")) {
			return new Blue();
		}
		return null;
	}

}
