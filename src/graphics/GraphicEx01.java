package graphics;
/*
 * Graphics��
 * - ������Ʈ�� �׸��� �׸��� ���� Ŭ���� 
 * - ū �۾��� �̹��� ���� �̿��� �� ����
 * 
 * ������
 * 1. FrameŬ������ ó�� ȣ��ɶ�
 * 2. Frame �� ũ�Ⱑ ����Ǿ�����
 * 3. repaint() �޼��尡 ȣ��ɶ�
 * 
 * 
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame4 extends Frame implements ActionListener{

	
	
	public void update(Graphics g) {
		g.clearRect(0,0,this.getWidth(),this.getHeight());
		paint(g);
	}
	
	public void paint (Graphics g) {
		//�׸��� �׸��� 
		g.drawLine(50,50,100,100);	//�տ� ���ڸ��� ������ �ڿ� ���ڸ��� ����
		g.drawRect(50,50,100,100);	//drawRect - �տ� ���ڸ��� ������, ����°�ڸ��� ���η� ��ŭ �̵��ϴ��� �׹�°�ڸ��� ���η� ��ŭ �̵��ϴ���
		g.fillRect(200,50,100,100);	
		g.setColor(Color.black);
		g.fillOval(50, 50,100,100);
		g.setColor(Color.blue);
		int x[] = new int[] {70,130,60};
		int y[] = new int[] {70,150,130};
		g.fillPolygon(x,y,3);
		g.setFont(new Font("", Font.BOLD,30));
		g.drawString("�޷�",300, 300);
		Image imp = Toolkit.getDefaultToolkit().getImage("gong.jpg");
		g.drawImage(imp, 0,0,600,500,this);
	}
	
	public MyFrame4() {
		super.setSize(600,500);

		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2 - this.getWidth()/2);
		int ypos = (int)(screen.getHeight()/2 - this.getHeight()/2);
		super.setLocation(xpos , ypos);
		super.setResizable(true);
		super.setVisible(true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
	}
}



public class GraphicEx01 {

	public static void main(String[] args) {
		MyFrame4 mf = new MyFrame4();
	}

}

