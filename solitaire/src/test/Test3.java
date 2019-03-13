package test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Test3 extends JPanel{//�϶�3-ʧ��
   static int frame_width = 600;
   static int frame_height = 300;
       
   PicPanel pic = null;
   private int pic_x;
   private int pic_y;
   
   //ǰһ��λ��
   int begin_x = 0;
   int begin_y = 0;
   
   boolean inThePic = false;
   

   public Test3()
   {
       pic = new PicPanel("mask.jpg");
       setLayout(null);
       add(pic);
       
       pic_x = (int)((frame_width - pic.getWidth())/2);
       pic_y = (int)((frame_height - pic.getHeight())/2);
       
       pic.setLocation(pic_x, pic_y);  //��λ
       
       //��궯�� ������ ע��
       addMouseListener(
           new MouseAdapter()
           {
               public void mousePressed(MouseEvent e)
               {
                   //��� ��� �Ƿ���ͼƬ��,ֻ�������ͼƬ��ʱ ��������
                   if(inPicBounds(e.getX(), e.getY()))
                   {
                       begin_x = e.getX();
                       begin_y = e.getY();
                       inThePic = true;
                   }
                   //��¼��ǰ����
               }
               //�ͷ�
               public void mouseReleased(MouseEvent e)
               {
                   inThePic = false;
               }
           }
       );
       
       //����ƶ� ������ ע��
       addMouseMotionListener(
           new MouseMotionAdapter()
           {
               public void mouseDragged(MouseEvent e)
               {
                   if(inThePic && checkPoint(e.getX(),e.getY()))
                   {
                       //�߽� ���
                       pic_x =pic_x - (begin_x - e.getX());
                       pic_y =pic_y - (begin_y - e.getY());
                       //System.out.println("pic_x=" + pic_x);
                       begin_x = e.getX();
                       begin_y = e.getY();
                       pic.setLocation(pic_x, pic_y);
                   }
               }
           }
       );
   }
   
   
   
   
   //-------------��������-----------------//
   
   
   //��� ��(px,py) �Ƿ���ͼƬ��
   private boolean inPicBounds(int px,int py)
   {
       if(px >= pic_x && px <= pic_x + pic.getWidth() &&
                           py >= pic_y && py <= pic_y + pic.getHeight())
           return true;
       else
           return false;
   }
   
   //Խ�� ���
   private boolean checkPoint(int px, int py)
   {
       if(px <0 || py <0)
           return false;
       if(px >getWidth() || py > getHeight())
           return false;
       return true;
   }
       
   
   public static void main(String[] args)
   {
       JPanel jpanel = new Test3();
       JFrame jframe = new JFrame("ͼƬ�϶�");
       jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       jframe.getContentPane().add(jpanel);
       jframe.setSize(frame_width, frame_height);
       jframe.setVisible(true);
   }
}

//ͼƬ���,ֻ����������ͼƬ
class PicPanel extends JPanel
{
   int p_width = 0;
   int p_height = 0;
   Image im = null;
   
   int i = 0; //temp var
   
   
   public PicPanel(String picName)
   {
       ImageIcon imageIcon = new ImageIcon(picName);
       im = imageIcon.getImage();
       
       p_width = imageIcon.getIconWidth();
       p_height = imageIcon.getIconHeight();
       setBounds(0,0,p_width, p_height);
   }
   
   
   public void paint(Graphics g)
   {
       g.drawImage(im,0,0,p_width,p_height,null);
   }
   
} 












