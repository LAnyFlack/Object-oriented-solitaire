package base;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class CardBox extends JPanel{
	private int positionx=0;
	private int positiony=0;
	private int length=0;
	private int width=0;
	private boolean ifsetup=false;
	public CardBox(int px,int py){
		positionx=px;
		positiony=py; 
		this.setBackground(new Color(0, 128, 0));
		this.setBounds(px, py, 102, 135);
		this.setBorder(BorderFactory.createLineBorder(Color.black, 2, true));
	}
	public int getX(){
		return positionx;
	}
	public int getY(){
		return positiony;
	}
	public void setX(int px){
		positionx=px;
	}
	public void setY(int py){
		positiony=py;
	}
	public void setLocation(int x,int y) {
		this.setBounds(x, y, 102, 135);
	}
}