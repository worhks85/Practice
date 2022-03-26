package event;

/*
 * Event
 * �̺�Ʈ�ҽ� (�̺�Ʈ �߻���) - �̺�Ʈ�� �߻��� ��ǻ��Ʈ ex) ��ư
 * �� ������Ʈ�� �޼ҵ� �� add�� ���� Listener�� ������ �޼ҵ�
 * -> �޼ҵ� ȣ��� �̺�Ʈ �ڵ鷯�� ������ �ν��Ͻ��� ���
 * 
 * - �̺�Ʈ �ڵ鷯 (�̺�Ʈó����)- �̺�Ʈ�� �߻����� �� ����� �ڵ带 ������ ���� Ŭ����
 *  
 * 
 * - �̺�Ʈ ������ (�̺�Ʈ ������)
 * 1. �̺�Ʈ�� �����ϰ� ó��
 * 2. �̺�Ʈ �����ʷ� �̺�Ʈ �ҽ��� �����ؾ� �̺�Ʈ�� ó��
 * 
 * 
 *  
 *
 */
import java.awt.*;
import java.awt.event.*;

class MyFrame4 extends Frame implements ActionListener{

	private Button bt = new Button("����");
	private BorderLayout bl = new BorderLayout();
	public MyFrame4() {
		super.setSize(400,300);
		this.setLayout(bl);
		this.add("South",bt);
		bt.addActionListener(this); //- > ActionLister�� �߻�
		//bt.addMouseListener(ap); //- > MouseListener���߻�

		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			});
		
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2 - this.getWidth()/2);
		int ypos = (int)(screen.getHeight()/2 - this.getHeight()/2);
		super.setLocation(xpos , ypos);
		super.setResizable(false);
		super.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
}

public class EventEx {
	public static void main(String[] args) {
		MyFrame4 mf = new MyFrame4();
	}
}

class A01 extends MouseAdapter{
	public void mouseReleased(MouseEvent e) {
	// ���� ���콺�� ������
	System.exit(0);
}
}
//class A01 implements ActionListener{
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		// TODO Auto-generated method stub
//		System.exit(0);
//	}	
//}
//class A01 implements MouseListener{
//	@Override
//	public void mouseClicked(MouseEvent e) {
//		// ���콺�� Ŭ��������
//	}
//
//	@Override
//	public void mousePressed(MouseEvent e) {
//		// ���콺�� ��������
//	}
//
//	@Override
//	public void mouseReleased(MouseEvent e) {
//		// ���� ���콺�� ������
//		System.exit(0);
//	}
//
//	@Override
//	public void mouseEntered(MouseEvent e) {
//		// ���콺�� �������� �ش� ������Ʈ �ȿ� ������ 
//	}
//
//	@Override
//	public void mouseExited(MouseEvent e) {
//		// ���콺�� �������� �ش� ������Ʈ �ۿ� ������
//	}
//}






























