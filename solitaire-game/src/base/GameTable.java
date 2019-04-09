package base;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.event.MouseInputListener;
import base.GameTimer;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.ImageIcon;

public class GameTable {

	private JFrame frame;
	final JPanel maskJPanel = new JPanel();
	
	private Card1 Card00 = new Card1(0,0,0,0,false);
	
	private Card1 Card01 = new Card1(5,3,60+6,180+17,true);
	
	private Card1 Card11 = new Card1(4,2,60+102+20+11,180+35+17,true);
	private Card1 Card12 = new Card1(11,4,60+102+20+11,180+17,false);
	
	private Card1 Card21 = new Card1(11,1,60+102*2+20*2+15,180+35+35+17,true);
	private Card1 Card22 = new Card1(10,4,60+102*2+20*2+15,180+35+17,false);
	private Card1 Card23 = new Card1(12,2,60+102*2+20*2+15,180+17,false);
	
	private Card1 Card31 = new Card1(4,3,60+102*3+20*3+20,180+35+35+35+17,true);
	private Card1 Card32 = new Card1(9,4,60+102*3+20*3+20,180+35+35+17,false);
	private Card1 Card33 = new Card1(10,2,60+102*3+20*3+20,180+35+17,false);
	private Card1 Card34 = new Card1(5,4,60+102*3+20*3+20,180+17,false);

	private Card1 Card41 = new Card1(7,4,552+24,180+35+35+35+35+17,true);
	private Card1 Card42 = new Card1(8,2,552+24,180+35+35+35+17,false);
	private Card1 Card43 = new Card1(1,4,552+24,180+35+35+17,false);
	private Card1 Card44 = new Card1(3,3,552+24,180+35+17,false);
	private Card1 Card45 = new Card1(6,2,552+24,180+17,false);
	
	private Card1 Card51 = new Card1(13,1,680+28,180+35+35+35+35+35+17,true);
	private Card1 Card52 = new Card1(3,4,680+28,180+35+35+35+35+17,false);
	private Card1 Card53 = new Card1(2,3,680+28,180+35+35+35+17,false);
	private Card1 Card54 = new Card1(1,3,680+28,180+35+35+17,false);
	private Card1 Card55 = new Card1(1,1,680+28,180+35+17,false);
	private Card1 Card56 = new Card1(2,2,680+28,180+17,false);

	private Card1 Card61 = new Card1(12,4,802+33,180+35+35+35+35+35+35+17,true);
	private Card1 Card62 = new Card1(5,1,802+33,180+35+35+35+35+35+17,false);
	private Card1 Card63 = new Card1(13,2,802+33,180+35+35+35+35+17,false);
	private Card1 Card64 = new Card1(13,4,802+33,180+35+35+35+17,false);
	private Card1 Card65 = new Card1(3,1,802+33,180+35+35+17,false);
	private Card1 Card66 = new Card1(6,3,802+33,180+35+17,false);
	private Card1 Card67 = new Card1(9,2,802+33,180+17,false);

	
	 
	
	
	private Card1 Cardw01 = new Card1(7,1,680+28,33,false);
	private Card1 Cardw02 = new Card1(11,2,680+28,33,false);
	private Card1 Cardw03 = new Card1(8,3,680+28,33,false);
	private Card1 Cardw04 = new Card1(8,4,680+28,33,false);
	private Card1 Cardw05 = new Card1(5,2,680+28,33,false);
	private Card1 Cardw06 = new Card1(7,3,680+28,33,false);
	private Card1 Cardw07 = new Card1(10,3,680+28,33,false);
	private Card1 Cardw08 = new Card1(10,1,680+28,33,false);
	private Card1 Cardw09 = new Card1(7,2,680+28,33,false);
	private Card1 Cardw10 = new Card1(9,1,680+28,33,false);
	private Card1 Cardw11 = new Card1(6,4,680+28,33,false);
	private Card1 Cardw12 = new Card1(9,3,680+28,33,false);
	private Card1 Cardw13 = new Card1(8,1,680+28,33,false);
	private Card1 Cardw14 = new Card1(3,2,680+28,33,false);
	private Card1 Cardw15 = new Card1(12,3,680+28,33,false);
	private Card1 Cardw16 = new Card1(4,4,680+28,33,false);
	private Card1 Cardw17 = new Card1(13,3,680+28,33,false);
	private Card1 Cardw18 = new Card1(12,1,680+28,33,false);
	private Card1 Cardw19 = new Card1(11,3,680+28,33,false);
	private Card1 Cardw20 = new Card1(4,1,680+28,33,false);
	private Card1 Cardw21 = new Card1(2,4,680+28,33,false);
	private Card1 Cardw22 = new Card1(6,1,680+28,33,false);
	private Card1 Cardw23 = new Card1(2,1,680+28,33,false);
	private Card1 Cardw24 = new Card1(1,2,680+28,33,false);
	
	private int turncount = 0;
	private int layer = 200;
	
	private Card1 crry[]= new Card1[28];
	
	
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

	
	public Card1 getCardbyPoisition(int x,int y,Card1[] c) {
		int i=0;
		while(c[i]!=null){
			
			if(c[i].getX()<=x && x<= (c[i].getX()+104) && c[i].getY()<=y && y<= (c[i].getY()+135) && c[i].getTop())
			{
				return c[i];
			}
			i++;
			
		}
		return Card00;
	}
	
	/*public Card1[] getCardsonTop(Card1[] c) {
		Card1[] x = new Card1[20];
		int i = 0,j = 0;
		while(c[i]!=null){
			if(c[i].getTop())
			{
				x[j]=c[i];
				j++;
			}
			i++;
		}
		return x;
	}*/
	
	
	@SuppressWarnings("deprecation")
	private void initialize() {
		Card1 crry[] = {Card01,Card11,Card12,Card21,Card22,Card23,Card31,
						Card32,Card33,Card34,Card41,Card42,Card43,Card44,
						Card45,Card51,Card52,Card53,Card54,Card55,Card56,
						Card61,Card62,Card63,Card64,Card65,Card66,Card67};
		
		Card01.CardAbove=Card00;Card01.CardBlow=Card00;
		
		Card11.CardAbove=Card00;Card11.CardBlow=Card12;
		Card12.CardAbove=Card11;Card12.CardBlow=Card00;
		
		Card21.CardAbove=Card00;Card21.CardBlow=Card22;
		Card22.CardAbove=Card21;Card22.CardBlow=Card23;
		Card23.CardAbove=Card22;Card23.CardBlow=Card00;
		
		Card31.CardAbove=Card00;Card31.CardBlow=Card32;
		Card32.CardAbove=Card31;Card32.CardBlow=Card33;
		Card33.CardAbove=Card32;Card33.CardBlow=Card34;
		Card34.CardAbove=Card33;Card34.CardBlow=Card00;
		
		Card41.CardAbove=Card00;Card41.CardBlow=Card42;
		Card42.CardAbove=Card41;Card42.CardBlow=Card43;
		Card43.CardAbove=Card42;Card43.CardBlow=Card44;
		Card44.CardAbove=Card43;Card44.CardBlow=Card45;
		Card45.CardAbove=Card44;Card45.CardBlow=Card00;
		
		Card51.CardAbove=Card00;Card51.CardBlow=Card52;
		Card52.CardAbove=Card51;Card52.CardBlow=Card53;
		Card53.CardAbove=Card52;Card53.CardBlow=Card54;
		Card54.CardAbove=Card53;Card54.CardBlow=Card55;
		Card55.CardAbove=Card54;Card55.CardBlow=Card56;
		Card56.CardAbove=Card55;Card56.CardBlow=Card00;
		
		Card61.CardAbove=Card00;Card61.CardBlow=Card62;
		Card62.CardAbove=Card61;Card62.CardBlow=Card63;
		Card63.CardAbove=Card62;Card63.CardBlow=Card64;
		Card64.CardAbove=Card63;Card64.CardBlow=Card65;
		Card65.CardAbove=Card63;Card65.CardBlow=Card66;
		Card66.CardAbove=Card64;Card66.CardBlow=Card67;
		Card67.CardAbove=Card66;Card67.CardBlow=Card00;
		
		
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
		
		JLayeredPane panel_2 = new JLayeredPane();
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
		
		//Card01.setCan();
		
		
		
		
		class Drag implements MouseInputListener {
			int moving = 0;
			int xinit = 0;
			int yinit = 0;
			int x0 = 0;
			int y0 = 0;
			int xx,xx1 = 0;
			int yy,yy1 = 0;

			Timer timer;
			Card1 card0;
			public Drag(Card1 Cardx) {
				card0=Cardx;
				xx = xx1 = card0.getX();
				yy = yy1 = card0.getY();
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
				card0 = getCardbyPoisition(xinit, yinit, crry);
				xx = card0.getX();
				yy = card0.getY();
				card0.canmove=true;
				layer+=100;
				if(card0.canmove && card0.getTop2() && card0.CardAbove == Card00) {
					panel_2.setLayer(card0, new Integer(layer));
					timer = new Timer(10, new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							card0.setBounds(x0 - xinit + xx, y0 - yinit+ yy, 102, 135);
						}
					});
				}
				else if(card0.canmove && !card0.getTop2() && card0.CardAbove != Card00) {
					timer = new Timer(10, new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							card0.setBounds(x0 - xinit + xx, y0 - yinit+ yy, 102, 135);
							card0.CardAbove.setPoisitionByCard(card0);
							if(card0.CardAbove.CardAbove!=null) {
								card0.CardAbove.CardAbove.setPoisitionByCard(card0.CardAbove);//3张
								
								if(card0.CardAbove.CardAbove.CardAbove!=null) {
									card0.CardAbove.CardAbove.CardAbove.setPoisitionByCard(card0.CardAbove.CardAbove);//3张
								
								if(card0.CardAbove.CardAbove.CardAbove.CardAbove!=null) {
									card0.CardAbove.CardAbove.CardAbove.CardAbove.setPoisitionByCard(card0.CardAbove.CardAbove.CardAbove);//4张卡
									
									if(card0.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove!=null) {
										card0.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.setPoisitionByCard(card0.CardAbove.CardAbove.CardAbove.CardAbove);//5张卡
										
										if(card0.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove!=null) {
											card0.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.setPoisitionByCard(card0.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove);//6张卡
											
											if(card0.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove!=null) {
												card0.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.setPoisitionByCard(card0.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove);//7张卡
												
												if(card0.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove!=null) {
													card0.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.setPoisitionByCard(card0.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove);//8张卡
													
													if(card0.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove!=null) {
														card0.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.setPoisitionByCard(card0.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove);//9张卡
														
														if(card0.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove!=null) {
															card0.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.setPoisitionByCard(card0.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove);//10张卡
															
															if(card0.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove!=null) {
																card0.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.setPoisitionByCard(card0.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove);//11张卡
																
																if(card0.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove!=null) {
																	card0.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.setPoisitionByCard(card0.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove);//12张卡
																	
																	if(card0.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove!=null) {
																		card0.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.setPoisitionByCard(card0.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove);//13张卡
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
						}
					});
				}
			}
			
			@Override
			public void mouseReleased(MouseEvent e) {
				//System.out.println("11111");
				timer.stop();
					if (moving == 1) {
						int x1 = e.getX();
						int y1 = e.getY();
						int count = 0,count1 = 0;
						
						while(count<=27) {
							if(crry[count].getTop()) {
								if(crry[count].getX()-30 < x1 && 
								   x1<crry[count].getX()+130 && 
								   crry[count].getY()-30 < y1 && 
								   y1<crry[count].getY()+100 && 
								   crry[count].getPoint() == card0.getPoint()+1 && 
								   crry[count].getColor() != card0.getColor()
								   )
								{
									card0.setPoisitionByCard(crry[count]);//附到crry[count]上
										
									Card1 cardxx=new Card1(0,0,0,0,false);
									cardxx = card0.CardBlow;
									cardxx.downsideup();
									cardxx.CardAbove = Card00;
										
									card0.CardBlow.CardAbove = Card00;
									card0.CardBlow = crry[count];
									crry[count].CardAbove=card0;
										
									count1 =-1;
									card0.CardBlow.setnotontop2();
									break;
								}	
							}
							count++;
						}
						if(count1 != -1) {
							if(card0.CardAbove != Card00) {//2张牌
								card0.setBounds(xx,yy,102, 135);
								card0.CardAbove.setPoisitionByCard(card0);//1张卡
								
								if(card0.CardAbove.CardAbove!=null) {
									card0.CardAbove.CardAbove.setPoisitionByCard(card0.CardAbove);//2张卡
									
									if(card0.CardAbove.CardAbove.CardAbove!=null) {
										card0.CardAbove.CardAbove.CardAbove.setPoisitionByCard(card0.CardAbove.CardAbove);//3张卡
										
										if(card0.CardAbove.CardAbove.CardAbove.CardAbove!=null) {
											card0.CardAbove.CardAbove.CardAbove.CardAbove.setPoisitionByCard(card0.CardAbove.CardAbove.CardAbove);//4张卡
											
											if(card0.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove!=null) {
												card0.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.setPoisitionByCard(card0.CardAbove.CardAbove.CardAbove.CardAbove);//5张卡
												
												if(card0.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove!=null) {
													card0.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.setPoisitionByCard(card0.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove);//6张卡
													
													if(card0.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove!=null) {
														card0.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.setPoisitionByCard(card0.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove);//7张卡
														
														if(card0.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove!=null) {
															card0.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.setPoisitionByCard(card0.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove);//8张卡
															
															if(card0.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove!=null) {
																card0.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.setPoisitionByCard(card0.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove);//9张卡
																
																if(card0.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove!=null) {
																	card0.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.setPoisitionByCard(card0.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove);//10张卡
																	
																	if(card0.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove!=null) {
																		card0.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.setPoisitionByCard(card0.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove);//11张卡
																		
																		if(card0.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove!=null) {
																			card0.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.setPoisitionByCard(card0.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove);//12张卡
																			
																			if(card0.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove!=null) {
																				card0.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.setPoisitionByCard(card0.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove.CardAbove);//13张卡
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
							else {
								card0.setBounds(xx,yy,102, 135);//回到原位
							}
						}
						
						
						//card0.setBounds(x1 - xinit + xx,y1 - yinit + yy, 102, 135);//留在移动后的位置
						//card0.setBounds(xx,yy, 102, 135);//回到原位
						//card0.setPoisitionByCard(Card11);//附到Card11上
					}
						moving = 0;
						maskJPanel.setVisible(false);
						card0.canmove=false;
				
			}
			
			@Override
			public void mouseDragged(MouseEvent arg0) {
				if(card0.canmove) {
					x0 = arg0.getX();
					y0 = arg0.getY();
					if (x0 > xx && x0 < (xx + card0.getWidth())&& y0 > yy && y0 < (yy + card0.getHeight())) {
						moving = 1;
						timer.start();
					}
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
			Card1 card0;
			public Click(Card1 cardw01) {
				card0=cardw01;
				x0 = card0.getX();
				y0 = card0.getY();
				xm = x0+104;
				ym = y0+135;
			}
			@Override
			public void mouseClicked(MouseEvent e) {			
					card0.toright(128);
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
		
		
		
		
		
		

		

		
		panel_2.add(Card01,new Integer(200));
		
		panel_2.add(Card11,new Integer(200));
		panel_2.add(Card12,new Integer(200));
	
		panel_2.add(Card21,new Integer(200));
		panel_2.add(Card22,new Integer(200));
		panel_2.add(Card23,new Integer(200));
		
		panel_2.add(Card31,new Integer(200));
		panel_2.add(Card32,new Integer(200));
		panel_2.add(Card33,new Integer(200));
		panel_2.add(Card34,new Integer(200));
		
		panel_2.add(Card41,new Integer(200));
		panel_2.add(Card42,new Integer(200));
		panel_2.add(Card43,new Integer(200));
		panel_2.add(Card44,new Integer(200));
		panel_2.add(Card45,new Integer(200));
		
		panel_2.add(Card51,new Integer(200));
		panel_2.add(Card52,new Integer(200));
		panel_2.add(Card53,new Integer(200));
		panel_2.add(Card54,new Integer(200));
		panel_2.add(Card55,new Integer(200));
		panel_2.add(Card56,new Integer(200));
		

		panel_2.add(Card61,new Integer(200));
		panel_2.add(Card62,new Integer(200));
		panel_2.add(Card63,new Integer(200));
		panel_2.add(Card64,new Integer(200));
		panel_2.add(Card65,new Integer(200));
		panel_2.add(Card66,new Integer(200));
		panel_2.add(Card67,new Integer(200));
		
		panel_2.add(Cardw01,new Integer(200));
		panel_2.add(Cardw02,new Integer(200));
		panel_2.add(Cardw03,new Integer(200));
		panel_2.add(Cardw04,new Integer(200));
		panel_2.add(Cardw05,new Integer(200));
		panel_2.add(Cardw06,new Integer(200));
		panel_2.add(Cardw07,new Integer(200));
		panel_2.add(Cardw08,new Integer(200));
		panel_2.add(Cardw09,new Integer(200));
		panel_2.add(Cardw10,new Integer(200));
		panel_2.add(Cardw11,new Integer(200));
		panel_2.add(Cardw12,new Integer(200));		
		panel_2.add(Cardw13,new Integer(200));
		panel_2.add(Cardw14,new Integer(200));
		panel_2.add(Cardw15,new Integer(200));
		panel_2.add(Cardw16,new Integer(200));
		panel_2.add(Cardw17,new Integer(200));
		panel_2.add(Cardw18,new Integer(200));
		panel_2.add(Cardw19,new Integer(200));
		panel_2.add(Cardw20,new Integer(200));
		panel_2.add(Cardw21,new Integer(200));
		panel_2.add(Cardw22,new Integer(200));
		panel_2.add(Cardw23,new Integer(200));
		panel_2.add(Cardw24,new Integer(200));
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("/Users/lanyflack/eclipse-workspace/Object-oriented-solitaire/cards/bg2.png"));
		lblNewLabel.setBounds(0, 0, 1000, 613);
		panel_2.add(lblNewLabel);
		
	}
}

