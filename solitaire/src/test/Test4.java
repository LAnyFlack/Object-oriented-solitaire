package test;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
 
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.event.MouseInputListener;

import base.Card;
 
public class Test4 extends JFrame {//�϶�4-�ɹ�
	final JPanel panel1 = new JPanel();
	final Card Card0 = new Card(200,200,true,2,2);
	//final JPanel panel2 = new JPanel();
	final JPanel maskJPanel = new JPanel();
 
	public Test4() {
		this.setSize(900, 600);
		this.setLayout(null);
		this.add(Card0);
		this.add(maskJPanel);
		//panel2.setBounds(200, 0, 103, 135);
		//panel2.setBackground(new Color(1));
		ImageIcon bgiIcon = new ImageIcon("mask.png");
		JLabel bg = new JLabel(bgiIcon);
		maskJPanel.add(bg);
		bg.setBounds(0, 0, 104, 140);
		this.setVisible(true);
 
		Drag drag = new Drag();
		addMouseListener(drag);
		addMouseMotionListener(drag);
 
	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test4 mainFrame = new Test4();
	}
 
	class Drag implements MouseInputListener {
		int moving = 0;  //��ʾPanel�Ƿ����ƶ������У�����ֻҪ����������press����ķ���
		int xinit = 0;	 //��갴��ʱ������X����
		int yinit = 0;   //��갴��ʱ������Y����
		int x0 = 0;		//��ק����������λ��
		int y0 = 0;
		Timer timer;
 
		@Override
		public void mouseClicked(MouseEvent e) {
		}
 
		@Override
		public void mouseEntered(MouseEvent e) {
		}
 
		@Override
		public void mouseExited(MouseEvent e) {
		}
		
		//��갴��ʱ��ʼ���߳�
		@Override
		public void mousePressed(MouseEvent e) {
			xinit = e.getX();
			yinit = e.getY();
			timer = new Timer(10, new ActionListener() {

				public void actionPerformed(ActionEvent e) {
					maskJPanel.setBounds(x0 - xinit + Card0.getX(), y0 - yinit
							+ Card0.getY(), 102, 135);
				}
			});
		}
		
		//����ɿ�ʱ�����߳�
		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			if (moving == 1) {
				int x1 = e.getX();
				int y1 = e.getY();
				Card0.setBounds(x1 - xinit + Card0.getX(),
						y1 - yinit + Card0.getY(), 102, 135);
				moving = 0;
				Card0.setVisible(true);
				maskJPanel.setVisible(false);
				timer.stop();
			}
		}
		
		//����϶������У����ϸ���maskPanel��λ��
		@Override
		public void mouseDragged(MouseEvent arg0) {
			// TODO Auto-generated method stub
			x0 = arg0.getX();
			y0 = arg0.getY();
			if (x0 > Card0.getX() && x0 < (Card0.getX() + Card0.getWidth())
					&& y0 > Card0.getY()
					&& y0 < (Card0.getY() + Card0.getHeight())) {
				moving = 1;
				Card0.setVisible(false);
				maskJPanel.setVisible(true);
				timer.start();
			}
 
		}
 
		@Override
		public void mouseMoved(MouseEvent arg0) {
			// TODO Auto-generated method stub
 
		}
 
	}
 
}
