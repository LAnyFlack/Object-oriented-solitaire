
package base;
/*
import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.event.MouseInputListener;

import base.Card;
import base.GameTimer;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class backupfortable {

	private JFrame frame;
	final JPanel maskJPanel = new JPanel();
	
	private Card1 Card01 = new Card1(2,4,60+6,180+17,true);
	
	private Card1 Card11 = new Card1(2,4,60+102+20+11,180+35+17,true);
	private Card1 Card12 = new Card1(2,4,60+102+20+11,180+17,false);
	
	private Card1 Card21 = new Card1(2,4,60+102*2+20*2+15,180+35+35+17,true);
	private Card1 Card22 = new Card1(2,4,60+102*2+20*2+15,180+35+17,false);
	private Card1 Card23 = new Card1(2,4,60+102*2+20*2+15,180+17,false);
	
	private Card1 Card31 = new Card1(2,4,60+102*3+20*3+20,180+35+35+35+17,true);
	private Card1 Card32 = new Card1(2,4,60+102*3+20*3+20,180+35+35+17,false);
	private Card1 Card33 = new Card1(2,4,60+102*3+20*3+20,180+35+17,false);
	private Card1 Card34 = new Card1(2,4,60+102*3+20*3+20,180+17,false);
	
	private Card1 Card41 = new Card1(2,4,552+24,180+35+35+35+35+17,true);
	private Card1 Card42 = new Card1(2,4,552+24,180+35+35+35+17,false);
	private Card1 Card43 = new Card1(2,4,552+24,180+35+35+17,false);
	private Card1 Card44 = new Card1(2,4,552+24,180+35+17,false);
	private Card1 Card45 = new Card1(2,4,552+24,180+17,false);
	
	private Card1 Card51 = new Card1(2,4,680+28,180+35+35+35+35+35+17,true);
	private Card1 Card52 = new Card1(2,4,680+28,180+35+35+35+35+17,false);
	private Card1 Card53 = new Card1(2,4,680+28,180+35+35+35+17,false);
	private Card1 Card54 = new Card1(2,4,680+28,180+35+35+17,false);
	private Card1 Card55 = new Card1(2,4,680+28,180+35+17,false);
	private Card1 Card56 = new Card1(2,4,680+28,180+17,false);

	private Card1 Card61 = new Card1(2,4,802+33,180+35+35+35+35+35+35+17,true);
	private Card1 Card62 = new Card1(2,4,802+33,180+35+35+35+35+35+17,false);
	private Card1 Card63 = new Card1(2,4,802+33,180+35+35+35+35+17,false);
	private Card1 Card64 = new Card1(2,4,802+33,180+35+35+35+17,false);
	private Card1 Card65 = new Card1(2,4,802+33,180+35+35+17,false);
	private Card1 Card66 = new Card1(2,4,802+33,180+35+17,false);
	private Card1 Card67 = new Card1(2,4,802+33,180+17,false);
	
	
	
	
	
	private Card3 Cardw01 = new Card3(2,4,680+28,33,false);
	private Card3 Cardw02 = new Card3(2,4,680+28,33,false);
	private Card3 Cardw03 = new Card3(2,4,680+28,33,false);
	private Card3 Cardw04 = new Card3(2,4,680+28,33,false);
	private Card3 Cardw05 = new Card3(2,4,680+28,33,false);
	private Card3 Cardw06 = new Card3(2,4,680+28,33,false);
	private Card3 Cardw07 = new Card3(2,4,680+28,33,false);
	private Card3 Cardw08 = new Card3(2,4,680+28,33,false);
	private Card3 Cardw09 = new Card3(2,4,680+28,33,false);
	private Card3 Cardw10 = new Card3(2,4,680+28,33,false);
	private Card3 Cardw11 = new Card3(2,4,680+28,33,false);
	private Card3 Cardw12 = new Card3(2,4,680+28,33,false);
	private Card3 Cardw13 = new Card3(2,4,680+28,33,false);
	private Card3 Cardw14 = new Card3(2,4,680+28,33,false);
	private Card3 Cardw15 = new Card3(2,4,680+28,33,false);
	private Card3 Cardw16 = new Card3(2,4,680+28,33,false);
	private Card3 Cardw17 = new Card3(2,4,680+28,33,false);
	private Card3 Cardw18 = new Card3(2,4,680+28,33,false);
	private Card3 Cardw19 = new Card3(2,4,680+28,33,false);
	private Card3 Cardw20 = new Card3(2,4,680+28,33,false);
	private Card3 Cardw21 = new Card3(2,4,680+28,33,false);
	private Card3 Cardw22 = new Card3(2,4,680+28,33,false);
	private Card3 Cardw23 = new Card3(2,4,680+28,33,false);
	private Card3 Cardw24 = new Card3(2,4,680+28,33,false);
	
	private int turncount = 0;
	
	private Card crry[]= new Card[28];
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					backupfortable window = new backupfortable();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	
	
	
	
	
	public backupfortable() {
		initialize();
	}
	
	
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setForeground(Color.GRAY);
		frame.setBounds(100, 100, 1000, 700);
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
		panel_2.setBounds(0, 66, 1000, 648);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		panel_2.add(maskJPanel);
		
		ImageIcon bgiIcon = new ImageIcon("");
		JLabel bg = new JLabel(bgiIcon);
		bg.setBackground(Color.BLACK);
		maskJPanel.add(bg);
		bg.setBounds(0, 0, 104, 135);
		
		
		
		
		
		
		
		class Drag implements MouseInputListener {
			int moving = 0;
			int xinit = 0;
			int yinit = 0;
			int x0 = 0;
			int y0 = 0;
			Timer timer;
			Card card0;
			public Drag(Card Cardx) {
				card0=Cardx;
			}
	 
			@Override
			public void mouseClicked(MouseEvent e) {
			}
	 
			@Override
			public void mouseEntered(MouseEvent e) {
			}
	 
			@Override
			public void mouseExited(MouseEvent e) {
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
					xinit = e.getX();
					yinit = e.getY();
					timer = new Timer(10, new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							maskJPanel.setBounds(x0 - xinit + card0.getX(), y0 - yinit
									+ card0.getY(), 102, 135);
						}
					});
			}
			
			@Override
			public void mouseReleased(MouseEvent e) {
					if (moving == 1) {
						int x1 = e.getX();
						int y1 = e.getY();
						int x0 = card0.getX();
						int y0 = card0.getY();
						card0.setBounds(x1 - xinit + card0.getX(),
								y1 - yinit + card0.getY(), 102, 135);
					}
						moving = 0;
						card0.setVisible(true);
						maskJPanel.setVisible(false);
						timer.stop();
			}
			
			@Override
			public void mouseDragged(MouseEvent arg0) {
					x0 = arg0.getX();
					y0 = arg0.getY();
					if (x0 > card0.getX() && x0 < (card0.getX() + card0.getWidth())
							&& y0 > card0.getY()
							&& y0 < (card0.getY() + card0.getHeight())) {
						moving = 1;
						card0.setVisible(false);
						maskJPanel.setVisible(true);
						timer.start();
					}
				}

			@Override
			public void mouseMoved(MouseEvent e) {
				
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
		
		Cardw01.setontop();
		
		class Click implements MouseInputListener {
			int x0,y0;
			int xm,ym;
			int clickX,clickY;
			Card3 card0;
			public Click(Card3 Cardx) {
				card0=Cardx;
				x0 = card0.getX();
				y0 = card0.getY();
				xm = x0+104;
				ym = y0+135;
			}
			@Override
			public void mouseClicked(MouseEvent e) {			
				//if(turncount == 0) {
					card0.toright(128);
				//	turncount++;
				//}
				/*else if(turncount == 1){
					card0.toright(148);
					turncount++;
				}
				else if(turncount == 2){
					card0.toright(148);
					turncount++;
				}
				else if(turncount > 2){
					card0.toright(148);
				}
				
			}
	 
			@Override
			public void mouseEntered(MouseEvent e) {
			}
	 
			@Override
			public void mouseExited(MouseEvent e) {
			}
			
			public void mousePressed(MouseEvent e) {
			}
			
			@Override
			public void mouseReleased(MouseEvent e) {
			}
			
			@Override
			public void mouseDragged(MouseEvent arg0) {
			}

			@Override
			public void mouseMoved(MouseEvent e) {
			}
		}
		
		Click clickw01 = new Click(Cardw01);
		
		panel_2.addMouseListener(clickw01);
		panel_2.addMouseMotionListener(clickw01);
		
		
		
		
		
		

		

		
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
		
		panel_2.add(Cardw01);
		panel_2.add(Cardw02);
		panel_2.add(Cardw03);
		panel_2.add(Cardw04);
		panel_2.add(Cardw05);
		panel_2.add(Cardw06);
		panel_2.add(Cardw07);
		panel_2.add(Cardw08);
		panel_2.add(Cardw09);
		panel_2.add(Cardw10);
		panel_2.add(Cardw11);
		panel_2.add(Cardw12);		
		panel_2.add(Cardw13);
		panel_2.add(Cardw14);
		panel_2.add(Cardw15);
		panel_2.add(Cardw16);
		panel_2.add(Cardw17);
		panel_2.add(Cardw18);
		panel_2.add(Cardw19);
		panel_2.add(Cardw20);
		panel_2.add(Cardw21);
		panel_2.add(Cardw22);
		panel_2.add(Cardw23);
		panel_2.add(Cardw24);
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("/Users/lanyflack/eclipse-workspace/Object-oriented-solitaire/cards/bg2.png"));
		lblNewLabel.setBounds(0, 0, 1000, 613);
		panel_2.add(lblNewLabel);
		
	}
}

*/