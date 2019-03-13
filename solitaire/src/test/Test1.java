package test;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

import base.Card;
import java.awt.SystemColor;
import java.awt.TextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Timer;
import java.util.TimerTask;

public class Test1 {//拖动1-失败

	private JFrame frame;
	private Card card0;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test1 window = new Test1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Test1() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.desktop);
		frame.setBounds(100, 100, 639, 610);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		card0=new Card(50,50,true,4,9);
		frame.getContentPane().add(card0);
		frame.addMouseListener(new MouseeListener());
		
		/*while(true) {
			if(card0.isdown) {
				MouseEvent e;
				Timer timer1 = new Timer(); 
				timer1.scheduleAtFixedRate(new TimerTask() {
					public void run() {
						card0.setBounds(e.getX(), e.getY(), 102, 135);
					}
				},0, 20);
				if(!card0.isdown) {
					timer1.cancel();
				
				}
			}
		}*/
	}

	
	
	public class MouseeListener  implements MouseMotionListener,MouseListener{
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			//System.out.print("鼠标点击----" + "\t");
			if (e.getClickCount()==1) {
				//swap();
			} 
			else if (e.getClickCount()==2) {
				System.out.println("双击！");
			} 
			else if (e.getClickCount()==3) {
				System.out.println("三连击！！");
			}
			
		}
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			//System.out.println("鼠标按下");
			//System.out.println(card0.isdown);
			
			
		}
	 
		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			//System.out.println("鼠标松开");
		}
	 
		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			//tField.setText("鼠标已经进入窗体");
			
		}
	 
		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			//tField.setText("鼠标已经移出窗体");
		}
	 
		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			String string = "鼠标拖动到位置：（" + e.getX() + "，" + e.getY() +"）";
			//tField.setText(string);
		}
	 
		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
		}
	 
	}
}
