
public class Animation extends MyFrame {
public void run() {
	int y=100,x=30;
	
	for(int i=0;i<=2;i++){
	while (x<=170) {
		//(1画面を消す)
		clear();
		//(2)四角形を表示する
		setColor(0,128,0);
		fillRect(x,y,10,100);
		x+=5;
		sleep(0.1);
		
	}
	while(x>=30) {
		clear();
		setColor(0,128,0);
		fillRect(x,y,10,100);
		x-=5;
		sleep(0.1);
	}
	}
}
}
