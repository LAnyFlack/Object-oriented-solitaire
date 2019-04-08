package base;

import javax.swing.JPanel;

public class Card2 extends Card1 {//附带移动条件和位置范围信息的Card类
	private boolean canmove=false;
	private int xm;
	private int ym;
	
	

	/**
	 * Create the panel.
	 */
	public Card2(int point,int patten,int x,int y,boolean issetup) {
		super(point,patten,x,y,issetup);
	}

}
