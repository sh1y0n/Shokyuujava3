
public class Animation extends MyFrame {
public void run() {
	int x=30;
	while (x<=170) {
		//(1画面を消す)
		clear();
		//(2)四角形を表示する
		setColor(0,128,0);
		fillRect(x,80,10,100);
		x+=20;
		sleep(1);
	}
}
}
