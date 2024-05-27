
public class Animation extends MyFrame {
public void run() {
	int x=30;
	while (true) {
		//(1画面を消す)
		clear();
		//(2)四角形を表示する
		setColor(0,128,0);
		fillRect(x,80,10,100);
		
		if(x >200) { //xが200より大きくなったらwhileの繰り返しをやめる
			break;
		}
		x+=5;
		sleep(0.1);
	}
}
}
