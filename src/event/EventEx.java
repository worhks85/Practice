package event;

/*
 * Event
 * 이벤트소스 (이벤트 발생지) - 이벤트가 발생한 컴퓨넌트 ex) 버튼
 * 각 컴포넌트의 메소드 중 add로 시작 Listener로 끝나는 메소드
 * -> 메소드 호출시 이벤트 핸들러를 구현한 인스턴스를 등록
 * 
 * - 이벤트 핸들러 (이벤트처리기)- 이벤트가 발생했을 때 실행될 코드를 구현해 놓은 클래스
 *  
 * 
 * - 이벤트 리스너 (이벤트 감지기)
 * 1. 이벤트를 감지하고 처리
 * 2. 이벤트 리스너로 이벤트 소스에 연결해야 이벤트가 처리
 * 
 * 
 *  
 *
 */
import java.awt.*;
import java.awt.event.*;

class MyFrame4 extends Frame implements ActionListener{

	private Button bt = new Button("종료");
	private BorderLayout bl = new BorderLayout();
	public MyFrame4() {
		super.setSize(400,300);
		this.setLayout(bl);
		this.add("South",bt);
		bt.addActionListener(this); //- > ActionLister를 발생
		//bt.addMouseListener(ap); //- > MouseListener를발생

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
	// 누른 마우스를 땟을때
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
//		// 마우스를 클릭했을때
//	}
//
//	@Override
//	public void mousePressed(MouseEvent e) {
//		// 마우스를 눌렀을때
//	}
//
//	@Override
//	public void mouseReleased(MouseEvent e) {
//		// 누른 마우스를 땟을때
//		System.exit(0);
//	}
//
//	@Override
//	public void mouseEntered(MouseEvent e) {
//		// 마우스의 포지션이 해당 컴포넌트 안에 있을때 
//	}
//
//	@Override
//	public void mouseExited(MouseEvent e) {
//		// 마우스의 포지션이 해당 컴포넌트 밖에 있을때
//	}
//}






























