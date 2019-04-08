package base;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Card extends JPanel {//基本的card类
	protected int point;
	protected int patten;//红桃1，黑桃2，方片3，梅花4
	protected int x;
	protected int y;
	protected int color;//红色0，黑色1
	protected boolean issetup=false;
	protected JLabel lblNewLabel;
	
	
	public Card(int point,int patten,int x,int y,boolean issetup) {
		setLayout(null);
		this.setBounds(x,y,104,135);
		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 104, 135);
		
		this.point = point;
		this.patten = patten;
		this.x = x;
		this.y = y;
		this.issetup = issetup;
		
		setCard();
		
		add(lblNewLabel);
		
		this.setBackground(null);
		this.setOpaque(false);
	}
	protected void setCard() {
		if(issetup) {
			if(patten==1) {//红桃
				color = 0;//红色
				if(point==1) {
					lblNewLabel.setIcon(new ImageIcon("/Users/lanyflack/eclipse-workspace/Object-oriented-solitaire/cards/rpa.png"));
				}
				else if(point==2) {
					lblNewLabel.setIcon(new ImageIcon("/Users/lanyflack/eclipse-workspace/Object-oriented-solitaire/cards/rp2.png"));
				}
				else if(point==3) {
					lblNewLabel.setIcon(new ImageIcon("/Users/lanyflack/eclipse-workspace/Object-oriented-solitaire/cards/rp3.png"));
				}
				else if(point==4) {
					lblNewLabel.setIcon(new ImageIcon("/Users/lanyflack/eclipse-workspace/Object-oriented-solitaire/cards/rp4.png"));
				}
				else if(point==5) {
					lblNewLabel.setIcon(new ImageIcon("/Users/lanyflack/eclipse-workspace/Object-oriented-solitaire/cards/rp5.png"));
				}
				else if(point==6) {
					lblNewLabel.setIcon(new ImageIcon("/Users/lanyflack/eclipse-workspace/Object-oriented-solitaire/cards/rp6.png"));
				}
				else if(point==7) {
					lblNewLabel.setIcon(new ImageIcon("/Users/lanyflack/eclipse-workspace/Object-oriented-solitaire/cards/rp7.png"));
				}
				else if(point==8) {
					lblNewLabel.setIcon(new ImageIcon("/Users/lanyflack/eclipse-workspace/Object-oriented-solitaire/cards/rp8.png"));
				}
				else if(point==9) {
					lblNewLabel.setIcon(new ImageIcon("/Users/lanyflack/eclipse-workspace/Object-oriented-solitaire/cards/rp9.png"));
				}
				else if(point==10) {
					lblNewLabel.setIcon(new ImageIcon("/Users/lanyflack/eclipse-workspace/Object-oriented-solitaire/cards/rp10.png"));
				}
				else if(point==11) {
					lblNewLabel.setIcon(new ImageIcon("/Users/lanyflack/eclipse-workspace/Object-oriented-solitaire/cards/rpj.png"));
				}
				else if(point==12) {
					lblNewLabel.setIcon(new ImageIcon("/Users/lanyflack/eclipse-workspace/Object-oriented-solitaire/cards/rpq.png"));
				}
				else if(point==13) {
					lblNewLabel.setIcon(new ImageIcon("/Users/lanyflack/eclipse-workspace/Object-oriented-solitaire/cards/rpk.png"));
				}
			}
			else if(patten==2) {//黑桃
				color = 1;//黑色
				if(point==1) {
					lblNewLabel.setIcon(new ImageIcon("/Users/lanyflack/eclipse-workspace/Object-oriented-solitaire/cards/bpa.png"));
				}
				else if(point==2) {
					lblNewLabel.setIcon(new ImageIcon("/Users/lanyflack/eclipse-workspace/Object-oriented-solitaire/cards/bp2.png"));
				}
				else if(point==3) {
					lblNewLabel.setIcon(new ImageIcon("/Users/lanyflack/eclipse-workspace/Object-oriented-solitaire/cards/bp3.png"));
				}
				else if(point==4) {
					lblNewLabel.setIcon(new ImageIcon("/Users/lanyflack/eclipse-workspace/Object-oriented-solitaire/cards/bp4.png"));
				}
				else if(point==5) {
					lblNewLabel.setIcon(new ImageIcon("/Users/lanyflack/eclipse-workspace/Object-oriented-solitaire/cards/bp5.png"));
				}
				else if(point==6) {
					lblNewLabel.setIcon(new ImageIcon("/Users/lanyflack/eclipse-workspace/Object-oriented-solitaire/cards/bp6.png"));
				}
				else if(point==7) {
					lblNewLabel.setIcon(new ImageIcon("/Users/lanyflack/eclipse-workspace/Object-oriented-solitaire/cards/bp7.png"));
				}
				else if(point==8) {
					lblNewLabel.setIcon(new ImageIcon("/Users/lanyflack/eclipse-workspace/Object-oriented-solitaire/cards/bp8.png"));
				}
				else if(point==9) {
					lblNewLabel.setIcon(new ImageIcon("/Users/lanyflack/eclipse-workspace/Object-oriented-solitaire/cards/bp9.png"));
				}
				else if(point==10) {
					lblNewLabel.setIcon(new ImageIcon("/Users/lanyflack/eclipse-workspace/Object-oriented-solitaire/cards/bp10.png"));
				}
				else if(point==11) {
					lblNewLabel.setIcon(new ImageIcon("/Users/lanyflack/eclipse-workspace/Object-oriented-solitaire/cards/bpj.png"));
				}
				else if(point==12) {
					lblNewLabel.setIcon(new ImageIcon("/Users/lanyflack/eclipse-workspace/Object-oriented-solitaire/cards/bpq.png"));
				}
				else if(point==13) {
					lblNewLabel.setIcon(new ImageIcon("/Users/lanyflack/eclipse-workspace/Object-oriented-solitaire/cards/bpk.png"));
				}
			}
			else if(patten==3) {//方片
				color = 0;//红色
				if(point==1) {
					lblNewLabel.setIcon(new ImageIcon("/Users/lanyflack/eclipse-workspace/Object-oriented-solitaire/cards/da.png"));
				}
				else if(point==2) {
					lblNewLabel.setIcon(new ImageIcon("/Users/lanyflack/eclipse-workspace/Object-oriented-solitaire/cards/d2.png"));
				}
				else if(point==3) {
					lblNewLabel.setIcon(new ImageIcon("/Users/lanyflack/eclipse-workspace/Object-oriented-solitaire/cards/d3.png"));
				}
				else if(point==4) {
					lblNewLabel.setIcon(new ImageIcon("/Users/lanyflack/eclipse-workspace/Object-oriented-solitaire/cards/d4.png"));
				}
				else if(point==5) {
					lblNewLabel.setIcon(new ImageIcon("/Users/lanyflack/eclipse-workspace/Object-oriented-solitaire/cards/d5.png"));
				}
				else if(point==6) {
					lblNewLabel.setIcon(new ImageIcon("/Users/lanyflack/eclipse-workspace/Object-oriented-solitaire/cards/d6.png"));
				}
				else if(point==7) {
					lblNewLabel.setIcon(new ImageIcon("/Users/lanyflack/eclipse-workspace/Object-oriented-solitaire/cards/d7.png"));
				}
				else if(point==8) {
					lblNewLabel.setIcon(new ImageIcon("/Users/lanyflack/eclipse-workspace/Object-oriented-solitaire/cards/d8.png"));
				}
				else if(point==9) {
					lblNewLabel.setIcon(new ImageIcon("/Users/lanyflack/eclipse-workspace/Object-oriented-solitaire/cards/d9.png"));
				}
				else if(point==10) {
					lblNewLabel.setIcon(new ImageIcon("/Users/lanyflack/eclipse-workspace/Object-oriented-solitaire/cards/d10.png"));
				}
				else if(point==11) {
					lblNewLabel.setIcon(new ImageIcon("/Users/lanyflack/eclipse-workspace/Object-oriented-solitaire/cards/dj.png"));
				}
				else if(point==12) {
					lblNewLabel.setIcon(new ImageIcon("/Users/lanyflack/eclipse-workspace/Object-oriented-solitaire/cards/dq.png"));
				}
				else if(point==13) {
					lblNewLabel.setIcon(new ImageIcon("/Users/lanyflack/eclipse-workspace/Object-oriented-solitaire/cards/dk.png"));
				}
			}
			else{//梅花
				color = 1;//黑色
				if(point==1) {
					lblNewLabel.setIcon(new ImageIcon("/Users/lanyflack/eclipse-workspace/Object-oriented-solitaire/cards/fa.png"));
				}
				else if(point==2) {
					lblNewLabel.setIcon(new ImageIcon("/Users/lanyflack/eclipse-workspace/Object-oriented-solitaire/cards/f2.png"));
				}
				else if(point==3) {
					lblNewLabel.setIcon(new ImageIcon("/Users/lanyflack/eclipse-workspace/Object-oriented-solitaire/cards/f3.png"));
				}
				else if(point==4) {
					lblNewLabel.setIcon(new ImageIcon("/Users/lanyflack/eclipse-workspace/Object-oriented-solitaire/cards/f4.png"));
				}
				else if(point==5) {
					lblNewLabel.setIcon(new ImageIcon("/Users/lanyflack/eclipse-workspace/Object-oriented-solitaire/cards/f5.png"));
				}
				else if(point==6) {
					lblNewLabel.setIcon(new ImageIcon("/Users/lanyflack/eclipse-workspace/Object-oriented-solitaire/cards/f6.png"));
				}
				else if(point==7) {
					lblNewLabel.setIcon(new ImageIcon("/Users/lanyflack/eclipse-workspace/Object-oriented-solitaire/cards/f7.png"));
				}
				else if(point==8) {
					lblNewLabel.setIcon(new ImageIcon("/Users/lanyflack/eclipse-workspace/Object-oriented-solitaire/cards/f8.png"));
				}
				else if(point==9) {
					lblNewLabel.setIcon(new ImageIcon("/Users/lanyflack/eclipse-workspace/Object-oriented-solitaire/cards/f9.png"));
				}
				else if(point==10) {
					lblNewLabel.setIcon(new ImageIcon("/Users/lanyflack/eclipse-workspace/Object-oriented-solitaire/cards/f10.png"));
				}
				else if(point==11) {
					lblNewLabel.setIcon(new ImageIcon("/Users/lanyflack/eclipse-workspace/Object-oriented-solitaire/cards/fj.png"));
				}
				else if(point==12) {
					lblNewLabel.setIcon(new ImageIcon("/Users/lanyflack/eclipse-workspace/Object-oriented-solitaire/cards/fq.png"));
				}
				else if(point==13) {
					lblNewLabel.setIcon(new ImageIcon("/Users/lanyflack/eclipse-workspace/Object-oriented-solitaire/cards/fk.png"));
				}
			}
		}
		else {
			lblNewLabel.setIcon(new ImageIcon("/Users/lanyflack/eclipse-workspace/Object-oriented-solitaire/cards/bc.png"));
		}
	}
}
