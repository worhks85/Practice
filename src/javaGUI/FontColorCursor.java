package javaGUI;
import java.awt.*;

class MyFrame4 extends Frame{
	private Label lb = new Label("AWT ���� ��������.");
	private Font font = new Font("", Font.PLAIN,30);
	private Cursor cur = new Cursor(Cursor.HAND_CURSOR);
	//Font.BOLD - �����۾�
	//Font,ITALIC - ��︲ü
	//Font.PLAIN - �Ϲݱ۾�ü
	
	private BorderLayout bl = new BorderLayout();
	
			
	public MyFrame4() {
		super.setSize(600,500);
		this.setLayout(bl);
		this.add("North",lb);
		this.setBackground(Color.RED);
		this.setForeground(Color.BLUE);
		this.setCursor(cur);
		lb.setFont(font);


		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2 - this.getWidth()/2);
		int ypos = (int)(screen.getHeight()/2 - this.getHeight()/2);
		super.setLocation(xpos , ypos);
		super.setResizable(false);
		super.setVisible(true);
	}
}














public class FontColorCursor {

	public static void main(String[] args) {
		MyFrame4 mf = new MyFrame4();
	}

}
