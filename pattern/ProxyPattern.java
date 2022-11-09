package pattern;


interface Image{
	
	void display();
}


class RealImage implements Image{
	
	String filename;
	
	public RealImage(String filename) {
		
		this.filename = filename;
		loading(filename);
	}
	
	public void display() {
		
		System.out.println("displaying" + filename);
	
	}
	
	public void loading(String filename) {
		
		System.out.println("load" + filename);
	}
}

class ProxyImage implements Image{
	
	private String filename;
	private RealImage image;
	
	public ProxyImage(String filename) {
		
		this.filename = filename;
	}
	
	public void display() {
		
		if(image==null) {
			
			image = new RealImage("file");
		}
		image.display();
	}
	
}







public class ProxyPattern {
	
	public static void main(String args[]) {
		
		Image obj = new ProxyImage("file");
		
		obj.display();
		
		System.out.println("");
		
		obj.display();
		
	}

}
