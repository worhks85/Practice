package event;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ActionListener{
	private Button bt1 = new Button("왼쪽 버튼");
	private Button bt2 = new Button("오른쪽 버튼");
	private Label lb = new Label("버튼을 누르세요!");
	
	private GridLayout gl = new GridLayout(2,1);
	private Panel p = new Panel();
	private GridLayout p_gl = new GridLayout(1,2);
	
			
	public MyFrame() {
		super.setSize(300,200);
		this.setLayout(gl);
		this.add(p);
		this.add(lb);
		p.setLayout(p_gl);
		p.add(bt1);		bt1.addActionListener(this);
		p.add(bt2);		bt2.addActionListener(this);
		
		
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2 - this.getWidth()/2);
		int ypos = (int)(screen.getHeight()/2 - this.getHeight()/2);
		super.setLocation(xpos , ypos);
		super.setResizable(false);
		super.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == bt1) lb.setText("왼쪽버튼을 누르셧습니다");
		else if (e.getSource() == bt2) lb.setText("오른쪽버튼을 누르셨습니다.");
	}
	
}



public class EventEx02 {

	public static void main(String[] args) {
		MyFrame mf = new MyFrame();
		
		
	}

}
