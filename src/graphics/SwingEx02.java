package graphics;

import java.awt.*;
import javax.swing.*;

class MyFrame_02 extends JFrame{
	Container con = this.getContentPane();
	
	
	public MyFrame_02() {
		super.setSize(600,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2 - this.getWidth()/2);
		int ypos = (int)(screen.getHeight()/2 - this.getHeight()/2);
		super.setLocation(xpos , ypos);
		super.setResizable(false);
		super.setVisible(true);
		try {
			Thread.sleep(1000);
			
		}catch ( InterruptedException e) {}
		
		
		JFileChooser jfc = new JFileChooser(".");
		//jfc.showOpenDialog(this);
		//����,���� ��ư�� ������ 0 ��ȯ, �� �ܹ�ư �ٸ����� ��ȯ
		int res = jfc.showSaveDialog(this);
		if (res == 0) { //���� �������α׷�
			
		}else {
			//�׳� ���� ���´�
		}
		
//		Color col = JColorChooser.showDialog(this,"����", Color.black);
//		con.setBackground(col);
		
		
//		String name = JOptionPane.showInputDialog(this,"�̸��� �Է��ϼ���" , "�Է�", JOptionPane.INFORMATION_MESSAGE);
//		System.out.println(name);
		
		
		/*int res = JOptionPane.showConfirmDialog(this, "������ �����Ͻðڽ��ϱ�?","����",
				JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
		System.out.println("res = " + res);			yes�� 0 �������� �ٸ���
		*/
		
		
		//�޼��� ���
		//JOptionPane.showMessageDialog(this, "�� ������ ������ �����Դϴ�.","���",JOptionPane.WARNING_MESSAGE);
		
		
		
		
	}
	
}
public class SwingEx02 {

	public static void main(String[] args) {
		MyFrame_02 mf = new MyFrame_02();
		
		
	}

}
