package view;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.event.MouseInputListener;

import base.Card;
import base.CardBox;
import base.GameTimer;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class GameTable {

	private JFrame frame;
	final JPanel maskJPanel = new JPanel();
	
	private Card Card01 = new Card(60,180,true,2,4);
	
	private Card Card11 = new Card(60+102+20,180+45,true,2,11);
	private Card Card12 = new Card(60+102+20,180,false,2,11);
	
	private Card Card21 = new Card(60+102*2+20*2,180+45+45,true,2,11);
	private Card Card22 = new Card(60+102*2+20*2,180+45,false,2,11);
	private Card Card23 = new Card(60+102*2+20*2,180,false,2,11);
	
	private Card Card31 = new Card(60+102*3+20*3,180+45+45+45,true,2,11);
	private Card Card32 = new Card(60+102*3+20*3,180+45+45,false,2,11);
	private Card Card33 = new Card(60+102*3+20*3,180+45,false,2,11);
	private Card Card34 = new Card(60+102*3+20*3,180,false,2,11);
	
	private Card Card41 = new Card(552,180+45+45+45+45,true,2,11);
	private Card Card42 = new Card(552,180+45+45+45,false,2,11);
	private Card Card43 = new Card(552,180+45+45,false,2,11);
	private Card Card44 = new Card(552,180+45,false,2,11);
	private Card Card45 = new Card(552,180,false,2,11);
	
	private Card Card51 = new Card(680,180+45+45+45+45+45,true,2,11);
	private Card Card52 = new Card(680,180+45+45+45+45,false,2,11);
	private Card Card53 = new Card(680,180+45+45+45,false,2,11);
	private Card Card54 = new Card(680,180+45+45,false,2,11);
	private Card Card55 = new Card(680,180+45,false,2,11);
	private Card Card56 = new Card(680,180,false,2,11);
	
	private Card Card61 = new Card(802,180+45+45+45+45+45+45,true,2,11);
	private Card Card62 = new Card(802,180+45+45+45+45+45,false,2,11);
	private Card Card63 = new Card(802,180+45+45+45+45,false,2,11);
	private Card Card64 = new Card(802,180+45+45+45,false,2,11);
	private Card Card65 = new Card(802,180+45+45,false,2,11);
	private Card Card66 = new Card(802,180+45,false,2,11);
	private Card Card67 = new Card(802,180,false,2,11);
	
	private Card Card0 = new Card(630,32,false,2,11);
	
	private Card crry[]= new Card[28];
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameTable window = new GameTable();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	
	
	
	
	
	public GameTable() {
		initialize();
	}
	
	public void setCanMove() {
		Card01.canmove=true; 
		Card11.canmove=true; 
		Card12.canmove=true; 
		Card21.canmove=true; 
		Card22.canmove=true; 
		Card23.canmove=true; 
		Card31.canmove=true; 
		Card32.canmove=true; 
		Card33.canmove=true; 
		Card34.canmove=true; 
		Card41.canmove=true; 
		Card42.canmove=true; 
		Card43.canmove=true; 
		Card44.canmove=true; 
		Card45.canmove=true; 
		Card51.canmove=true; 
		Card52.canmove=true; 
		Card53.canmove=true; 
		Card54.canmove=true; 
		Card55.canmove=true; 
		Card56.canmove=true; 
		Card61.canmove=true; 
		Card62.canmove=true;
		Card63.canmove=true; 
		Card64.canmove=true; 
		Card65.canmove=true; 
		Card66.canmove=true; 
		Card67.canmove=true; 
	}
	
	public void setCannotMove(Card card) {
		Card01.canmove=false; 
		Card11.canmove=false; 
		Card12.canmove=false; 
		Card21.canmove=false; 
		Card22.canmove=false; 
		Card23.canmove=false; 
		Card31.canmove=false; 
		Card32.canmove=false; 
		Card33.canmove=false; 
		Card34.canmove=false; 
		Card41.canmove=false; 
		Card42.canmove=false; 
		Card43.canmove=false; 
		Card44.canmove=false; 
		Card45.canmove=false; 
		Card51.canmove=false; 
		Card52.canmove=false; 
		Card53.canmove=false; 
		Card54.canmove=false; 
		Card55.canmove=false; 
		Card56.canmove=false; 
		Card61.canmove=false; 
		Card62.canmove=false;
		Card63.canmove=false; 
		Card64.canmove=false; 
		Card65.canmove=false; 
		Card66.canmove=false; 
		Card67.canmove=false; 
		
		card.canmove=true;
	}
	
	
	
	public Card getCardbyPosition(int x,int y) {
		crry[0]=Card01; crry[1]=Card11; crry[2]=Card12; crry[3]=Card21; crry[4]=Card22; crry[5]=Card23; crry[6]=Card31; crry[7]=Card32;
		crry[8]=Card33; crry[9]=Card34; crry[10]=Card41;crry[11]=Card42;crry[12]=Card43;crry[13]=Card44;crry[14]=Card45;crry[15]=Card51;
		crry[16]=Card52;crry[17]=Card53;crry[18]=Card54;crry[19]=Card55;crry[20]=Card56;crry[21]=Card61;crry[22]=Card62;crry[23]=Card63;
		crry[24]=Card64;crry[25]=Card65;crry[26]=Card66;crry[27]=Card67;
		
		for(int i=0;i<27;i++) {
			if(crry[i].getx0()<=x && x<=crry[i].getxm()) {
				return crry[i];
			}
			i++;
		
		}
		return Card0;
	}
	
	
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setForeground(Color.GRAY);
		frame.setBounds(100, 100, 1030, 770);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 5, 1014, 56);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		GameTimer gt = new GameTimer();
		panel.add(gt);gt.start();
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 128, 0));
		panel_2.setBounds(0, 66, 1014, 665);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		panel_2.add(maskJPanel);
		
		ImageIcon bgiIcon = new ImageIcon("mask.png");
		JLabel bg = new JLabel(bgiIcon);
		maskJPanel.add(bg);
		bg.setBounds(0, 0, 104, 140);
		
		
		Card01.canmove=true;
		
		class Drag implements MouseInputListener {
			int moving = 0;  //��ʾPanel�Ƿ����ƶ������У�����ֻҪ����������press����ķ���
			int xinit = 0;	 //��갴��ʱ������X����
			int yinit = 0;   //��갴��ʱ������Y����
			int x0 = 0;		//��ק����������λ��
			int y0 = 0;
			Timer timer;
			//Timer timer1;
			Card card0,card1;
			public Drag(Card Cardx) {
				card0=Cardx;
			}
	 
			@Override
			public void mouseClicked(MouseEvent e) {
				//card0.canmove=true;
			}
	 
			@Override
			public void mouseEntered(MouseEvent e) {
			}
	 
			@Override
			public void mouseExited(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {
				if(card0.getTop()&&card0.canmove) {
					xinit = e.getX();
					yinit = e.getY();
					timer = new Timer(10, new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							maskJPanel.setBounds(x0 - xinit + card0.getX(), y0 - yinit
									+ card0.getY(), 102, 135);
						}
					});
				}
			}
			
			@Override
			public void mouseReleased(MouseEvent e) {
				//if(false)
				if(card0.getTop()&&card0.canmove) {
					//setCannotMove(card0);
					if (moving == 1) {
						int x1 = e.getX();
						int y1 = e.getY();
						int x0 = card0.getX();
						int y0 = card0.getY();
						if(card0.getPoi()!=4) {
						card0.setBounds(x1 - xinit + card0.getX(),
								y1 - yinit + card0.getY(), 102, 135);
						}
						moving = 0;
						card0.setVisible(true);
						maskJPanel.setVisible(false);
						timer.stop();
						//card1.canmove=false;
					}
				}
			}
			
			@Override
			public void mouseDragged(MouseEvent arg0) {
				if(card0.getTop()&&card0.canmove) {
					//setCannotMove(card0);
					// TODO Auto-generated method stub
					x0 = arg0.getX();
					y0 = arg0.getY();
					if (x0 > card0.getX() && x0 < (card0.getX() + card0.getWidth())
							&& y0 > card0.getY()
							&& y0 < (card0.getY() + card0.getHeight())) {
						moving = 1;
						card0.setVisible(false);
						maskJPanel.setVisible(true);
						timer.start();
						//setCanMove();
					}
				}
	 
			}
	 
			@Override
			public void mouseMoved(MouseEvent arg0) {
				// TODO Auto-generated method stub
	 
			}
	 
		}
	 

		
		
		
		
		Drag drag01 = new Drag(Card01);
		
		Drag drag11 = new Drag(Card11);
		Drag drag12 = new Drag(Card12);
		
		Drag drag21 = new Drag(Card21);
		Drag drag22 = new Drag(Card22);
		Drag drag23 = new Drag(Card23);
		
		Drag drag31 = new Drag(Card31);
		Drag drag32 = new Drag(Card32);
		Drag drag33 = new Drag(Card33);
		Drag drag34 = new Drag(Card34);
		
		Drag drag41 = new Drag(Card41);
		Drag drag42 = new Drag(Card42);
		Drag drag43 = new Drag(Card43);
		Drag drag44 = new Drag(Card44);
		Drag drag45 = new Drag(Card45);
		
		Drag drag51 = new Drag(Card51);
		Drag drag52 = new Drag(Card52);
		Drag drag53 = new Drag(Card53);
		Drag drag54 = new Drag(Card54);
		Drag drag55 = new Drag(Card55);
		Drag drag56 = new Drag(Card56);
		
		Drag drag61 = new Drag(Card61);
		Drag drag62 = new Drag(Card62);
		Drag drag63 = new Drag(Card63);
		Drag drag64 = new Drag(Card64);
		Drag drag65 = new Drag(Card65);
		Drag drag66 = new Drag(Card66);
		Drag drag67 = new Drag(Card67);
		
		panel_2.addMouseListener(drag01);
		panel_2.addMouseMotionListener(drag01);
		
		panel_2.addMouseListener(drag11);
		panel_2.addMouseMotionListener(drag11);
		panel_2.addMouseListener(drag12);
		panel_2.addMouseMotionListener(drag12);
		
		panel_2.addMouseListener(drag21);
		panel_2.addMouseMotionListener(drag21);
		panel_2.addMouseListener(drag22);
		panel_2.addMouseMotionListener(drag22);
		panel_2.addMouseListener(drag23);
		panel_2.addMouseMotionListener(drag23);
		
		panel_2.addMouseListener(drag31);
		panel_2.addMouseMotionListener(drag31);
		panel_2.addMouseListener(drag32);
		panel_2.addMouseMotionListener(drag32);
		panel_2.addMouseListener(drag33);
		panel_2.addMouseMotionListener(drag33);
		panel_2.addMouseListener(drag34);
		panel_2.addMouseMotionListener(drag34);
		
		panel_2.addMouseListener(drag41);
		panel_2.addMouseMotionListener(drag41);
		panel_2.addMouseListener(drag42);
		panel_2.addMouseMotionListener(drag42);
		panel_2.addMouseListener(drag43);
		panel_2.addMouseMotionListener(drag43);
		panel_2.addMouseListener(drag44);
		panel_2.addMouseMotionListener(drag44);
		panel_2.addMouseListener(drag45);
		panel_2.addMouseMotionListener(drag45);
		
		panel_2.addMouseListener(drag51);
		panel_2.addMouseMotionListener(drag51);
		panel_2.addMouseListener(drag52);
		panel_2.addMouseMotionListener(drag52);
		panel_2.addMouseListener(drag53);
		panel_2.addMouseMotionListener(drag53);
		panel_2.addMouseListener(drag54);
		panel_2.addMouseMotionListener(drag54);
		panel_2.addMouseListener(drag55);
		panel_2.addMouseMotionListener(drag55);
		panel_2.addMouseListener(drag56);
		panel_2.addMouseMotionListener(drag56);
		
		panel_2.addMouseListener(drag61);
		panel_2.addMouseMotionListener(drag61);
		panel_2.addMouseListener(drag62);
		panel_2.addMouseMotionListener(drag62);
		panel_2.addMouseListener(drag63);
		panel_2.addMouseMotionListener(drag63);
		panel_2.addMouseListener(drag64);
		panel_2.addMouseMotionListener(drag64);
		panel_2.addMouseListener(drag65);
		panel_2.addMouseMotionListener(drag65);
		panel_2.addMouseListener(drag66);
		panel_2.addMouseMotionListener(drag66);
		panel_2.addMouseListener(drag67);
		panel_2.addMouseMotionListener(drag67);
		
		
		
		
		
		
		
		
		
		CardBox CardBox00 = new CardBox(60,32);						
		CardBox CardBox01 = new CardBox(60+102+20,32);				
		CardBox CardBox02 = new CardBox(60+102*2+20*2,32);						
		CardBox CardBox03 = new CardBox(60+102*3+20*3,32);
		CardBox CardBox04 = new CardBox(680,32);									
		CardBox CardBox05 = new CardBox(680+102+60,32);							
		CardBox CardBox06 = new CardBox(680+102+40,32);			
		CardBox CardBox07 = new CardBox(680+102+20,32);		
		
		
		
		

		

		
		panel_2.add(Card01);
		
		panel_2.add(Card11);
		panel_2.add(Card12);
	
		panel_2.add(Card21);
		panel_2.add(Card22);
		panel_2.add(Card23);
		
		panel_2.add(Card31);
		panel_2.add(Card32);
		panel_2.add(Card33);
		panel_2.add(Card34);
		
		panel_2.add(Card41);
		panel_2.add(Card42);
		panel_2.add(Card43);
		panel_2.add(Card12);
		panel_2.add(Card44);
		panel_2.add(Card45);
		
		panel_2.add(Card51);
		panel_2.add(Card52);
		panel_2.add(Card53);
		panel_2.add(Card54);
		panel_2.add(Card55);
		panel_2.add(Card56);
		

		panel_2.add(Card61);
		panel_2.add(Card62);
		panel_2.add(Card63);
		panel_2.add(Card64);
		panel_2.add(Card65);
		panel_2.add(Card66);
		panel_2.add(Card67);
		
		panel_2.add(Card0);
		
		panel_2.add(CardBox00);
		panel_2.add(CardBox01);
		panel_2.add(CardBox02);
		panel_2.add(CardBox03);
		//panel_2.add(CardBox04);
		panel_2.add(CardBox05);
		panel_2.add(CardBox06);
		panel_2.add(CardBox07);
	}
}
