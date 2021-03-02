package pac1;

interface Amazon{
	public void dispProductImage();
	public void dispProductPrice();
	
}

class Book implements Amazon{

	public void dispProductImage() {
		System.out.println("display Book image");	
	}

	public void dispProductPrice() {
		System.out.println("display Book price");	
	}
	
}

class Watch implements Amazon{

	public void dispProductImage() {
		System.out.println("display watch image");	
	}

	public void dispProductPrice() {
		System.out.println("display watch price");
	}
	
}

public class Run {

	public static void main(String[] args) {
	    Watch w1 = new Watch();
	    w1.dispProductImage();
	}

}
