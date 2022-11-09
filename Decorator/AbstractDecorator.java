package Decorator;

public abstract class AbstractDecorator extends Component{

	protected Component component;
	
	public void setComponent(Component c) {
		
		component = c;
	}
	
	public void makeStructure() {
		
		if(component!=null) {
			
			component.makeStructure();
		}
		
	}
	
}
