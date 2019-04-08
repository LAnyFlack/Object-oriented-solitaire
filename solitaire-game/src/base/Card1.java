package base;

import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;

public class Card1 extends Card {//附带翻转方法的card类
	private boolean isontop = false;
	public boolean canmove=false;
	protected Card1 CardAbove;
	protected Card1 CardBlow;
	public Card1(int point,int patten,int x,int y,boolean issetup) {
		super(point,patten,x,y,issetup);
		isontop = issetup;
	}
	public int getPoint() {
		return point;
	}
	public void setCan() {
		canmove=true;
	}
	public boolean getTop() {
		return isontop;
	}
	public void setontop() {
		isontop = true;
	}
	public void setnotontop() {
		isontop = false;
	}
	
	public void setPoisitionByCard(Card1 card) {
		setBounds(card.getX(),card.getY()+35,104,135);
	}
	
	public void upsidedown() {
		this.issetup=false;
 	    Timer timer1 = new Timer(); 
        timer1.scheduleAtFixedRate(new TimerTask() {
        	int i=1;
            public void run() {
                //System.out.println(i);
                setBounds(x, y, 100-5*i, 135);
                i++;
                if(i==20) {
                	lblNewLabel.setIcon(new ImageIcon("/Users/lanyflack/eclipse-workspace/Object-oriented-solitaire/cards/bc.png"));
				    timer1.cancel();
                }
            }
        }, 0, 20);
        

        Timer timer2 = new Timer(); 
        timer2.scheduleAtFixedRate(new TimerTask() {
        	int i=1;
            public void run() {
                //System.out.println(i);
                setBounds(x, y, 2+5*i, 135);
                i++;
                if(i==21) {
				   	timer2.cancel();
                }
            }
        }, 400, 20);  	
	}
	
	public void downsideup() {
		this.issetup=true;
 	    Timer timer1 = new Timer(); 
        timer1.scheduleAtFixedRate(new TimerTask() {
        	int i=1;
            public void run() {
                //System.out.println(i);
                setBounds(x, y, 100-5*i, 135);
                i++;
                if(i==20) {
                	setCard();
				    timer1.cancel();
                }
            }
        }, 0, 20);
        

        Timer timer2 = new Timer(); 
        timer2.scheduleAtFixedRate(new TimerTask() {
        	int i=1;
            public void run() {
                //System.out.println(i);
                setBounds(x, y, 2+5*i, 135);
                i++;
                if(i==21) {
				   	timer2.cancel();
                }
            }
        }, 400, 20);  	
	}

	public void toleft() {
		issetup=false;
 	    Timer timer1 = new Timer(); 
        timer1.scheduleAtFixedRate(new TimerTask() {
        	int i=1;
            public void run() {
                //System.out.println(i);
                setBounds(x, y, 100-5*i, 135);
                i++;
                if(i==20) {
                	lblNewLabel.setIcon(new ImageIcon("/Users/lanyflack/eclipse-workspace/Object-oriented-solitaire/cards/bc.png"));
				    timer1.cancel();
                }
            }
        },0, 20);

        Timer timer2 = new Timer(); 
        timer2.scheduleAtFixedRate(new TimerTask() {
        	int i=1;
            public void run() {
                //System.out.println(i);
                setBounds(x-5*i, y, 2+5*i, 135);
                i++;
                if(i==21) {
                	timer2.cancel();
                }
            }
        }, 400, 20);  	
	}

	public void toright(int q) {//i取128，148，168
		issetup=true;
 	    Timer timer1 = new Timer(); 
        timer1.scheduleAtFixedRate(new TimerTask() {
        	int i=1;
            public void run() {
                //System.out.println(i);
                setBounds(x+5*i, y, 100-5*i, 135);
                i++;
                if(i==20) {
                	setCard();
                	timer1.cancel();
                }
            }
        },0, 20);
        

        Timer timer2 = new Timer(); 
        timer2.scheduleAtFixedRate(new TimerTask() {
        	int i=1;
            public void run() {
                //System.out.println(i);
                setBounds(x+q, y, 2+5*i, 135);
                i++;
                if(i==21) {
                	timer2.cancel();
                }
            }
        }, 400, 20);  	

	}
}
