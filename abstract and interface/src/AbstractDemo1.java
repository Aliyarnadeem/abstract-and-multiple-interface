abstract class AbstractDemo {
	abstract void display();
	
	void display1() {
		System.out.println("Surprise I can be accessed by an child class!!");
	}
}

public class AbstractDemo1 extends AbstractDemo {
	void display() {
		System.out.println("Surprise im in another class via inheritance");
	}
	
	public static void main(String[] args)  {
		AbstractDemo1 r = new AbstractDemo1();
		r.display();
		r.display1();

	}
}