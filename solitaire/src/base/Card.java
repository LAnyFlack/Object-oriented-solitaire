package base;

import java.awt.Color;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import java.util.Timer;
import java.util.TimerTask;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Card  extends JPanel{
	private int positionx=0;
	private int positiony=0;
	private int height=135;
	private int width=102;
	private int point=0;
	private boolean ifsetup=false;
	private boolean isontop=false;
	public boolean canmove=false;
	private int color;
	private int patten;
	private int x0;
	private int xm;
	private int y0;
	private int ym;
	private Card upsideone;
	private JLabel Label1;
	private JLabel Label2;
	private JPanel panel1;
	public boolean isdown;
	

	public Card(int px,int py,boolean x,int huase,int poi){
		x0=positionx=px;
		y0=positiony=py; 
		
		xm=x0+width;
		ym=y0+height;
		
		patten=huase;
		ifsetup=x;
		point=poi;
		if(ifsetup) 
			isontop=true;
		else
			isontop=false;
		if(patten==0||patten==1) 
			color=0;//black
		else
			color=1;//red
		
		this.setLayout(null);
		Label1=new JLabel("");
		Label2=new JLabel("");
		panel1=new JPanel();
		Label1.setBounds(7, 25, 20, 20);
		Label2.setBounds(6, 5, 20, 20);
		panel1.setBounds(22, 22, 58, 91);
		if(ifsetup)
			setupCard();
		else
			setupdCard();
		this.add(panel1);
		this.add(Label1);
		this.add(Label2);

		this.setBounds(px, py, 102, 135);
		//this.addMouseListener(new MouseeListener());
		setOpaque(false);
	}
	

	public void setLocation(int x,int y) {
		this.setBounds(x, y, 102, 135);
	}

	public boolean getTop() {
		return isontop;
	}
	public int getx0() {
		return x0;
	}
	public int getxm() {
		return xm;
	}
	public int gety0() {
		return y0;
	}
	public int getym() {
		return ym;
	}
	public boolean getUp() {
		return ifsetup;
	}public int getPoi() {
		return point;
	}
	public void setTop(boolean xx) {
		isontop=xx;
	}
	
	
	//������Ŀ�Ƭ����
	public void upsidedown() {
		ifsetup=false;
 	    Timer timer1 = new Timer(); 
        timer1.scheduleAtFixedRate(new TimerTask() {
        	int i=1;
            public void run() {
                //System.out.println(i);
                setBounds(positionx, positiony, 100-5*i, 135);
                i++;
                if(i==20) {
                	setBackground(Color.gray);
                	setBorder(BorderFactory.createLineBorder(Color.gray, 22, true));
				    Label2.setIcon(new ImageIcon(""));
				    Label1.setIcon(new ImageIcon(""));
				    panel1.setBackground(Color.gray);
				    timer1.cancel();
                }
            }
        },0, 20);
        

        Timer timer2 = new Timer(); 
        timer2.scheduleAtFixedRate(new TimerTask() {
        	int i=1;
            public void run() {
                //System.out.println(i);
                setBounds(positionx, positiony, 2+5*i, 135);
                i++;
                if(i==21) {
                	setBackground(Color.gray);
				       	timer2.cancel();
                }
            }
        }, 400, 20);  	
	}
	
	//������ĵĿ�Ƭ����
	public void downsideup() {
		ifsetup=true;
		 Timer timer1 = new Timer(); 
	        timer1.scheduleAtFixedRate(new TimerTask() {
	        	int i=1;
	            public void run() {
	                //System.out.println(i);
	                setBounds(positionx, positiony, 100-5*i, 135);
	                i++;
	                if(i==20) {
	                	setupCard();
					    timer1.cancel();
	                }
	            }
	        },0, 20);
	        

	        Timer timer2 = new Timer(); 
	        timer2.scheduleAtFixedRate(new TimerTask() {
	        	int i=1;
	            public void run() {
	                //System.out.println(i);
	                setBounds(positionx, positiony, 2+5*i, 135);
	                i++;
	                if(i==21) {
	                	setBackground(Color.white);
					       	timer2.cancel();
	                }
	            }
	        }, 400, 20);  	
	}
	
	//���ó�ʼ�������ϵĿ�Ƭ
	public void setupCard() {
			this.setBackground(Color.white);
			this.setBorder(BorderFactory.createLineBorder(Color.white, 22, true));
			panel1.setBackground(Color.white);
			
			if(patten==0)//meihua
				Label1.setIcon(new ImageIcon("D:\\\u53E6\\\u9762\u5411\u5BF9\u8C61\\image\\mh.png"));
			else if(patten==1)//heitao
				Label1.setIcon(new ImageIcon("D:\\\u53E6\\\u9762\u5411\u5BF9\u8C61\\image\\bt.png"));
			else if(patten==2)//hongtai
				Label1.setIcon(new ImageIcon("D:\\\u53E6\\\u9762\u5411\u5BF9\u8C61\\image\\ht1.png"));
			else if(patten==3)//fangpian
				Label1.setIcon(new ImageIcon("D:\\\u53E6\\\u9762\u5411\u5BF9\u8C61\\image\\fp.png"));
			
			if(color==0) {
				if(point==1)
					Label2.setIcon(new ImageIcon("D:\\\u53E6\\\u9762\u5411\u5BF9\u8C61\\image\\ba.png"));
				else if(point==2)
					Label2.setIcon(new ImageIcon("D:\\\u53E6\\\u9762\u5411\u5BF9\u8C61\\image\\b2.png"));
				else if(point==3)
					Label2.setIcon(new ImageIcon("D:\\\u53E6\\\u9762\u5411\u5BF9\u8C61\\image\\b3.png"));
				else if(point==4)
					Label2.setIcon(new ImageIcon("D:\\\u53E6\\\u9762\u5411\u5BF9\u8C61\\image\\b4.png"));
				else if(point==5)
					Label2.setIcon(new ImageIcon("D:\\\u53E6\\\u9762\u5411\u5BF9\u8C61\\image\\b5.png"));
				else if(point==6)
					Label2.setIcon(new ImageIcon("D:\\\u53E6\\\u9762\u5411\u5BF9\u8C61\\image\\b6.png"));
				else if(point==7)
					Label2.setIcon(new ImageIcon("D:\\\u53E6\\\u9762\u5411\u5BF9\u8C61\\image\\b7.png"));
				else if(point==8)
					Label2.setIcon(new ImageIcon("D:\\\u53E6\\\u9762\u5411\u5BF9\u8C61\\image\\b8.png"));
				else if(point==9)
					Label2.setIcon(new ImageIcon("D:\\\u53E6\\\u9762\u5411\u5BF9\u8C61\\image\\b9.png"));
				else if(point==10)
					Label2.setIcon(new ImageIcon("D:\\\u53E6\\\u9762\u5411\u5BF9\u8C61\\image\\b10.png"));
				else if(point==11)
					Label2.setIcon(new ImageIcon("D:\\\u53E6\\\u9762\u5411\u5BF9\u8C61\\image\\bj.png"));
				else if(point==12)
					Label2.setIcon(new ImageIcon("D:\\\u53E6\\\u9762\u5411\u5BF9\u8C61\\image\\bq.png"));
				else if(point==13)
					Label2.setIcon(new ImageIcon("D:\\\u53E6\\\u9762\u5411\u5BF9\u8C61\\image\\bk.png"));
			}
			else if(color==1) {
				if(point==1)
					Label2.setIcon(new ImageIcon("D:\\\u53E6\\\u9762\u5411\u5BF9\u8C61\\image\\ra.png"));
				else if(point==2)
					Label2.setIcon(new ImageIcon("D:\\\u53E6\\\u9762\u5411\u5BF9\u8C61\\image\\r2.png"));
				else if(point==3)
					Label2.setIcon(new ImageIcon("D:\\\u53E6\\\u9762\u5411\u5BF9\u8C61\\image\\r3.png"));
				else if(point==4)
					Label2.setIcon(new ImageIcon("D:\\\u53E6\\\u9762\u5411\u5BF9\u8C61\\image\\r4.png"));
				else if(point==5)
					Label2.setIcon(new ImageIcon("D:\\\u53E6\\\u9762\u5411\u5BF9\u8C61\\image\\r5.png"));
				else if(point==6)
					Label2.setIcon(new ImageIcon("D:\\\u53E6\\\u9762\u5411\u5BF9\u8C61\\image\\r6.png"));
				else if(point==7)
					Label2.setIcon(new ImageIcon("D:\\\u53E6\\\u9762\u5411\u5BF9\u8C61\\image\\r7.png"));
				else if(point==8)
					Label2.setIcon(new ImageIcon("D:\\\u53E6\\\u9762\u5411\u5BF9\u8C61\\image\\r8.png"));
				else if(point==9)
					Label2.setIcon(new ImageIcon("D:\\\u53E6\\\u9762\u5411\u5BF9\u8C61\\image\\r9.png"));
				else if(point==10)
					Label2.setIcon(new ImageIcon("D:\\\u53E6\\\u9762\u5411\u5BF9\u8C61\\image\\r10.png"));
				else if(point==11)
					Label2.setIcon(new ImageIcon("D:\\\u53E6\\\u9762\u5411\u5BF9\u8C61\\image\\rj.png"));
				else if(point==12)
					Label2.setIcon(new ImageIcon("D:\\\u53E6\\\u9762\u5411\u5BF9\u8C61\\image\\rq.png"));
				else if(point==13)
					Label2.setIcon(new ImageIcon("D:\\\u53E6\\\u9762\u5411\u5BF9\u8C61\\image\\rk.png"));
			}
	}
	
	//���ó�ʼ�������ϵĿ�Ƭ
	public void setupdCard(){
		this.setBackground(Color.gray);
		this.setBorder(BorderFactory.createLineBorder(Color.gray, 22, true));
		panel1.setBackground(Color.gray);
	}
	
	//����Ƭ����
	public void swap() {
		if(ifsetup) {
    		upsidedown();
    	}
    	else{
    		downsideup();
    	}
	}
	
	//����������ҷ�
	public void toright() {
		ifsetup=true;
 	    Timer timer1 = new Timer(); 
        timer1.scheduleAtFixedRate(new TimerTask() {
        	int i=1;
            public void run() {
                //System.out.println(i);
                setBounds(positionx+5*i, positiony, 100-5*i, 135);
                i++;
                if(i==20) {
                	setupCard();
				    timer1.cancel();
                }
            }
        },0, 20);
       

        Timer timer2 = new Timer(); 
        timer2.scheduleAtFixedRate(new TimerTask() {
        	int i=1;
            public void run() {
                //System.out.println(i);
                setBounds(positionx+102, positiony, 2+5*i, 135);
               
                i++;
                if(i==21) {
                	setBackground(Color.gray);
				       	timer2.cancel();
                }
            }
        }, 400, 20);  	 

     
	}
	
	//�����������
	public void toleft() {
		ifsetup=false;
 	    Timer timer1 = new Timer(); 
        timer1.scheduleAtFixedRate(new TimerTask() {
        	int i=1;
            public void run() {
                //System.out.println(i);
                setBounds(positionx+102, positiony, 100-5*i, 135);
                i++;
                if(i==20) {
                	setBackground(Color.gray);
                	setBorder(BorderFactory.createLineBorder(Color.gray, 22, true));
				    Label2.setIcon(new ImageIcon(""));
				    Label1.setIcon(new ImageIcon(""));
				    panel1.setBackground(Color.gray);
				    timer1.cancel();
                }
            }
        },0, 20);
        

        Timer timer2 = new Timer(); 
        timer2.scheduleAtFixedRate(new TimerTask() {
        	int i=1;
            public void run() {
                //System.out.println(i);
                setBounds(positionx-5*i+102, positiony, 2+5*i, 135);
                i++;
                
                if(i==21) {
                	setBackground(Color.gray);
				       	timer2.cancel();
                }
            }
        }, 400, 20);  	

	}
	
	//������һ������
	public void tootherside() {
		if(ifsetup) {
			toleft();
    	}
    	else{
    		toright();
    	}
	}
	
	/*public class MouseeListener  implements MouseMotionListener,MouseListener{
		Frame frame = new Frame("�������Ķ��ؼ�����");
		TextField tField = new TextField(30);
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			//System.out.print("�����----" + "\t");
			if (e.getClickCount()==1) {
				//tootherside();
				//toleft();
				//toright();
				swap();
			} 
			else if (e.getClickCount()==2) {
				
			} 
			else if (e.getClickCount()==3) {
				System.out.println("����������");
			}
			
		}
	 
		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			isdown=true;
			//System.out.println("��갴��");
			//setBounds(e.getX(), e.getY(), 102, 135);
			//System.out.println("����϶���λ�ã���" + e.getX() + "��" + e.getY() +"��");
		}
	 
		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			//System.out.println("����ɿ�");
			isdown=false;
		}
	 
		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			//tField.setText("����Ѿ����봰��");
		}
	 
		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			//tField.setText("����Ѿ��Ƴ�����");
		}
	 
		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			//String string = "����϶���λ�ã���" + e.getX() + "��" + e.getY() +"��";
			//tField.setText(string);
		}
	 
		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
		}
	
	}*/
}