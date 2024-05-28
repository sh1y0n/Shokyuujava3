
public class car {
int x,y,vx,vy;

public car(int x,int y,int vx,int vy) {
	this.x=x;
	this.y=y;
	this.vx=vx;
	this.vy=vy;
}
public void draw (MyFrame frame) {
	frame.fillRect(x+75,y+30,50, 50);
	frame.fillRect(x+50,y+50, 100, 50);
   frame.fillOval(x+60, y+95, 30, 30);
   frame.fillOval(x+105, y+95, 30, 30);
   
}
public void move() {
	x+=vx;

}
}