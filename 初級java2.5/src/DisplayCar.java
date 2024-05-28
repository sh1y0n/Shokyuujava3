
public class DisplayCar extends MyFrame {
	public void run() {
		car car1 =new car(0,0,50,0);
	   car car2 =new car(250,250,0,0);
		
	
		
		for(int i=0; i<=30; i++) {
			clear();
			car1.draw(this);
			car2.draw(this);
			car1.move();
			car2.move();
			sleep(0.1);
		}
		
}
	}
