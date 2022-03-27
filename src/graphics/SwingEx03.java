package graphics;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
class MyFrame_03 extends JFrame {
	private JButton jbt1 = new JButton("��ư1");
	private JButton jbt2 = new JButton("��ư2");
	private JButton jbt3 = new JButton("��ư3");
	private JButton jbt4 = new JButton("��ư4");
	private JButton jbt5 = new JButton("��ư5");
	private JButton jbt6 = new JButton("��ư6");
	private JButton jbt7 = new JButton("��ư7");
	private JButton jbt8 = new JButton("��ư8");
	
	private GridLayout gl = new GridLayout(4,2);
	Container con = this.getContentPane();
	
	public MyFrame_03() {
		super.setSize(600,500);
		con.setLayout(gl);
		LineBorder bl = new LineBorder(Color.red,10);
		jbt1.setBorder(bl);			con.add(jbt1);
		MatteBorder b2 = new MatteBorder(2,4,6,8,Color.blue);//�� �� �� ��
		jbt2.setBorder(b2);			con.add(jbt2);
		EmptyBorder b3 = new EmptyBorder(2,2,2,2);
		jbt3.setBorder(b3);			con.add(jbt3);
		BevelBorder b4 = new BevelBorder(BevelBorder.LOWERED); //�������ִ°�ó�� �ö��ִ°�ó�� RAISED
		jbt4.setBorder(b4);			con.add(jbt4);
		SoftBevelBorder b5 = new SoftBevelBorder(SoftBevelBorder.RAISED);
		jbt5.setBorder(b5);			con.add(jbt5);
		TitledBorder b6 = new TitledBorder("title");
		jbt6.setBorder(b6);			con.add(jbt6);
		EtchedBorder b7 = new EtchedBorder(EtchedBorder.RAISED);
		jbt7.setBorder(b7);			con.add(jbt7);
		CompoundBorder b8 = new CompoundBorder(b6,b7);		//�ΰ� �̻��� ���� ��ġ��
		jbt8.setBorder(b8);			con.add(jbt8);
		
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2 - this.getWidth()/2);
		int ypos = (int)(screen.getHeight()/2 - this.getHeight()/2);
		super.setLocation(xpos , ypos);
		super.setResizable(false);
		super.setVisible(true);

	}
}
public class SwingEx03 {

	public static void main(String[] args) {
		MyFrame_03 mf = new MyFrame_03();
		
		
	}

}
