package graphics;
import java.awt.*;
import javax.swing.*;

/*
 * AWT�� �ü���� ������Ʈ�� ������ ���
 * - �ڹٴ� �� �ü���� ���������� ����
 * ������ GUI�� �����ؾ� �� �ʿ䰡 �߻�
 * 
 * 1. ������ AWT�� ����ϱ� ���ؼ��� FrameŬ������ ��ӹ�����, Swing������ JFrame�� ��ӹ���
 * 2. JFrame ���� ContainerŬ������ �÷��� ���
 * 3. X�ڽ��� �����Ϸ��� �ϸ� this.setDefaultCloseOperation(JFrame.Exit_ON_CLOSE);
 * 
 *  JOptioinPane - �޼�������, ���߹ޱ�,�Է°��ޱ�
 *  JFileChooser - ���Ͽ��� , ����ȭ��
 *  JColorChooser - ������ȭ��
 *  
 * 
 * 
 * 
 */

class MyFrame_01 extends JFrame{
	// AWT���� ����� ��� ������Ʈ���� J�ڸ� ������ ����ϸ� �ȴ�.
	Container con = this.getContentPane();
	//JFrame�� ���� �����ϴ� ���� �ƴ϶�, Container ���� �� �۾��Ѵ� 
	
	
	
	
	public MyFrame_01() {
		super.setSize(600,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2 - this.getWidth()/2);
		int ypos = (int)(screen.getHeight()/2 - this.getHeight()/2);
		super.setLocation(xpos , ypos);
		super.setResizable(false);
		super.setVisible(true);
	}
}
public class SwingEx01 {

	public static void main(String[] args) {
		MyFrame_01 mf = new MyFrame_01();
		
		
	}

}
