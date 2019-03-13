package test;

import java.awt.EventQueue;

import javax.swing.JFrame;

import base.Card;
import java.awt.Toolkit;

public class Test5 {//����

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test5 window = new Test5();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Test5() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\\u53E6\\\u9762\u5411\u5BF9\u8C61\\image\\ba.png"));
		frame.setBounds(100, 100, 900, 412);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Card card0 = new Card(390,100,false,1,1);
		frame.getContentPane().add(card0);
		
		//Card card1 = new Card(200,50,true,1,1);
		//frame.getContentPane().add(card1);
	}
}