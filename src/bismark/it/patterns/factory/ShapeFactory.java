package bismark.it.patterns.factory;

import bismark.it.patterns.factory.blogic.interfaces.Shape;
import bismark.it.patterns.factory.blogic.services.Circle;
import bismark.it.patterns.factory.blogic.services.Rectangle;
import bismark.it.patterns.factory.blogic.services.Square;

public class ShapeFactory {
	
	public Shape getSahpe(String shapeType){
		if(shapeType==null){
			return null;
		}
		
		if("CIRCLE".equalsIgnoreCase(shapeType)){
			return new Circle();
		}else if("RECTANGLE".equalsIgnoreCase(shapeType)){
			return new Rectangle();
		}else if("SQUARE".equalsIgnoreCase(shapeType)){
			return new Square();
		}
		return null;
	}
}
