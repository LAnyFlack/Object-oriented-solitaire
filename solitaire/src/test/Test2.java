package test;


import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
 
public class Test2  implements MouseMotionListener,MouseListener{//�϶�2-ʧ��
	Frame frame = new Frame("�������Ķ��ؼ�����");
	TextField tField = new TextField(30);
	public Test2(){
		Label label = new Label("�밴�����������϶�");
		frame.add(label, "North");
		frame.add(tField, "South");
		frame.setBackground(new Color(180, 255, 255));
		frame.addMouseListener(this);
		frame.addMouseMotionListener(this);
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		frame.setSize(300, 200);
		frame.setLocation(400, 250);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new Test2();
	}
 
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.print("�����----" + "\t");
		if (e.getClickCount()==1) {
			System.out.println("������");
		} else if (e.getClickCount()==2) {
			System.out.println("˫����");
		} else if (e.getClickCount()==3) {
			System.out.println("����������");
		}
		
	}
 
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("��갴��");
	}
 
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("����ɿ�");
	}
 
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		tField.setText("����Ѿ����봰��");
	}
 
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		tField.setText("����Ѿ��Ƴ�����");
	}
 
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		String string = "����϶���λ�ã���" + e.getX() + "��" + e.getY() +"��";
		tField.setText(string);
	}
 
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
	}
 
}