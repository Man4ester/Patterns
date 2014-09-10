package bismark.it.patterns.abstractfactory;

import bismark.it.patterns.abstractfactory.blogic.interfaces.Color;

public abstract class AbstractFactory {
	abstract Color getColor(String color);

}
