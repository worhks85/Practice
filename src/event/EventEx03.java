package event;
import java.awt.*;
import java.awt.event.*;

class MyFrame2 extends Frame implements ActionListener{
	int cnt = 0;
	private Button bt1 = new Button("증가");
	private Button bt2 = new Button("감소");
	private Label lb = new Label("현재 수 =" + cnt ,Label.CENTER);
	private Cursor cur = new Cursor(Cursor.HAND_CURSOR);
	private GridLayout gl = new GridLayout(2,1);
	private Panel p = new Panel();
	private GridLayout p_gl = new GridLayout(1,2);

	public MyFrame2() {
		super.setSize(300,200);
		this.setLayout(gl);
		this.add(lb);
		this.add(p);
		p.setLayout(p_gl);
		p.add(bt1);		bt1.addActionListener(this); bt1.setCursor(cur);
		p.add(bt2);		bt2.addActionListener(this); bt2.setCursor(cur);
		

		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2 - this.getWidth()/2);
		int ypos = (int)(screen.getHeight()/2 - this.getHeight()/2);
		super.setLocation(xpos , ypos);
		super.setResizable(false);
		super.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == bt1) cnt++;
		else if (e.getSource() == bt2) cnt--;
		lb.setText("현재 수 =" + cnt);
	}

}

public class EventEx03 {

	public static void main(String[] args) {
		MyFrame2 mf = new MyFrame2();
	}

}
