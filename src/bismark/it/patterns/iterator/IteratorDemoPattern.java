package bismark.it.patterns.iterator;

public class IteratorDemoPattern {
	
	public static void main(String[] args){
		NameRepository repo = new NameRepository();
		for (Iterator it = repo.getIterator(); it.hasNext();) {
			String name = (String)it.next();
			System.out.println("name: "+name);
		}
	}
}
