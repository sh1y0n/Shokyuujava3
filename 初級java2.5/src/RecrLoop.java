
public class RecrLoop extends MyFrame {
public void run(){

int i,x=20,z=200,y=20;
for(i=0;i<9;i++)
{
	
		fillRect(x,0,10,z);	
		fillRect(200-x,300-y,10,z);
		x+=20;
		z-=10;
		y-=10;
	
	}
	}     																}	