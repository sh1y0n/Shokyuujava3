
public class Truck extends Vehicle {
	
	public Truck (int x,int y,int vx,int vy) {
		super(x,y,vx,vy);
				
	}	
	public void draw (MyFrame frame) {
		frame.fillRect(x+70, y, 30, 30);
		frame.fillRect(x,y+30,100,10);
		frame.fillOval(x+15, y+40,10,10);
		frame.fillOval(x+30, y+40,10,10);
		frame.fillOval(x+85,y+40,10,10);
	}

}

