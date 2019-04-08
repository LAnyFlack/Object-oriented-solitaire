package base;

import java.awt.Font;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JLabel;

public class GameTimer extends JLabel {
	private int seconds=0;
	private int minutes=0;
	private Timer timer1 = new Timer(); 
	
	public GameTimer() {
		this.setText("时间"+minutes+":"+seconds); 
		this.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		this.setBounds(20, 0, 300, 56);
	}
	
	public void start() {
		//setText(00+":"+00); 
		timer1 = new Timer(); 
        timer1.scheduleAtFixedRate(new TimerTask() {
        	int i=1;
            public void run() {
            	seconds+=1;
            	i++;
            	if(i%60==0) {
            		minutes+=1;
            		seconds=0;
            	}
            	if(minutes<10 && seconds<10)
            		setText("时间"+"0"+minutes+":0"+seconds); 
            	else if(minutes<10 && seconds>=10)
                	setText("时间"+"0"+minutes+":"+seconds); 
            	else if(minutes>10 && seconds<10)
            		setText("时间"+minutes+":0"+seconds); 
            	else
            		setText("时间"+minutes+":"+seconds); 
            }
        },0, 1000);
	}
	
	public void stop() {
		timer1.cancel();
		seconds=0;
		minutes=0;
	}
}
