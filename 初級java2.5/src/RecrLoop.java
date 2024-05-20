
public class RecrLoop extends MyFrame {
public void run(){
setColor(0,128,0);
int i,x=30;
for(i=0;i<9;i++)
{
	if(i==0) {
		fillRect(x,50,10,100);
		x+=30;
	}
	else if(i==8) {
	
		fillRect(x,110,10,100);
	}
	else {
		fillRect(x,80,10,100);
		x+=30;
	}
	}

               }
                 }
                                       