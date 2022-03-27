package graphics;
import java.awt.*;
import java.awt.event.*;
class MyFrame2 extends Frame implements ActionListener{
	private Image img = Toolkit.getDefaultToolkit().getImage("gong.jpg");
	private Button bt1 = new Button("확대");
	private Button bt2 = new Button("축소");
	private Button bt3 = new Button("원본");
	private Button bt4 = new Button("종료");
	
	private Panel p = new Panel();
	private GridLayout gl = new GridLayout(4,1);
	private BorderLayout bl = new BorderLayout();
	private int width = 200;
	private int height = 200;
	
	public void init() {
		this.setLayout(bl);
		this.add("East",p);
		p.setLayout(gl);
		p.add(bt1);	 bt1.addActionListener(this);
		p.add(bt2);	 bt2.addActionListener(this);
		p.add(bt3);	 bt3.addActionListener(this);
		p.add(bt4);	 bt4.addActionListener(this);
	}
	public void paint(Graphics g) {
		g.drawImage(img, 50,50,width,height,this);
	}

	MyFrame2() {
		this.init();
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
		if (e.getSource() == bt1 ) {
			width += 50;
			if (width > 400) width = 400;
		} else if (e.getSource() == bt2) {
			width -=50;
			if (width < 50) width = 50;
		}else if (e.getSource()== bt3) {
			width = 200;
		}else if (e.getSource() == bt4) System.exit(0);
		height = width;
		repaint();
		
	}
	
	
}

public class GraphicEx02 {

	public static void main(String[] args) {
		MyFrame2 mf = new MyFrame2();
	}

}
