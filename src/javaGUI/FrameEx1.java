package javaGUI;

import java.awt.*;

/*
 * Frame Class
 * Frame() - �ʱ���·� �������� �ʴ� ������ Frame ��ü ����
 * 
 * Frame(String title) - ������ Ÿ��Ʋ�� ����� �ʱ���·� �������� �ʴ� ���ο� Frame��ü ����
 * 
 * setVisible()				- ȭ�鿡 �����������
 * setSize(width,height)	- ũ�⼳��
 * setLocation				- ��ġ����
 * add						- �ٸ� ������Ʈ ����
 * setLayout				- ���̾ƿ�����
 * setResizable				- ���������� �ϰ�����
 * setBounds				- ũ��� ��ġ����
 * setFont					- ���� ũ�⼳��
 * setForeground			- foreground �� ����
 * setBackground			-			 �� ����
 * setCursor				- ���콺 Ŀ�� ����
 * 
 * 
 */
public class FrameEx1 {
class MyFrame extends Frame{
	public MyFrame(String title) {
		super(title);
		
		super.setSize(400,300);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		//�ý���ȭ���� ũ�⸦ �����´�
		int xpos = (int)(screen.getWidth()/2 - super.getWidth()/2);
		int ypos = (int) (screen.getHeight()/2 - super.getHeight()/2);
		//�ý���ȭ���� �� �߾ӿ� �� �������� �ø��� ���� ���
		super.setLocation(xpos,ypos);
		super.setResizable(false);
		super.setVisible(true);
		//�� ���߿� ȭ�鿡 �����ִ°� ���� �Ϸ� �� ����ڿ��� �����ֱ� ����
	}
}
	public static void main(String[] args) {
		

		
		
		
		
		
	}

}
