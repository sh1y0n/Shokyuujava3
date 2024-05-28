
public class car {
int x,y,vx,vy;

public car(int x,int y,int vx,int vy) {
	this.x=x;
	this.y=y;
	this.vx=vx;
	this.vy=vy;
}
public void draw (MyFrame frame) {
	frame.fillRect(75, 30,50, 50);
	frame.fillRect(50, 50, 100, 50);
   frame.fillOval(60, 95, 30, 30);
   frame.fillOval(105, 95, 30, 30);
}
}