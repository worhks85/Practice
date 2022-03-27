package graphics;
/*
 * Graphics란
 * - 컴포넌트에 그림을 그리기 위한 클래스 
 * - 큰 글씨나 이미지 등을 이용할 때 사용됨
 * 
 * 실행방법
 * 1. Frame클래스가 처흠 호출될때
 * 2. Frame 의 크기가 변경되었을때
 * 3. repaint() 메서드가 호출될때
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
		//그림을 그리기 
		g.drawLine(50,50,100,100);	//앞에 두자리는 시작점 뒤에 두자리는 끝점
		g.drawRect(50,50,100,100);	//drawRect - 앞에 두자리는 시작점, 세번째자리는 가로로 얼만큼 이동하는지 네번째자리는 세로로 얼만큼 이동하는지
		g.fillRect(200,50,100,100);	
		g.setColor(Color.black);
		g.fillOval(50, 50,100,100);
		g.setColor(Color.blue);
		int x[] = new int[] {70,130,60};
		int y[] = new int[] {70,150,130};
		g.fillPolygon(x,y,3);
		g.setFont(new Font("", Font.BOLD,30));
		g.drawString("메롱",300, 300);
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

