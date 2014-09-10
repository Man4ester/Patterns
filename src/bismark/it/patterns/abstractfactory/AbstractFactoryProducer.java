package bismark.it.patterns.abstractfactory;

public class AbstractFactoryProducer {
	
	public static AbstractFactory getFactory(String choice){
		if("COLOR".equalsIgnoreCase(choice)){
			return new ColorAbstractFactory();
		}
		return null;
	}

}
