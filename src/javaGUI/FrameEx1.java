package javaGUI;

import java.awt.*;

/*
 * Frame Class
 * Frame() - 초기상태로 보여지지 않는 새로은 Frame 객체 생성
 * 
 * Frame(String title) - 지정된 타이틀을 사용해 초기상태로 보여지지 않는 새로움 Frame객체 생성
 * 
 * setVisible()				- 화면에 출력할지말자
 * setSize(width,height)	- 크기설정
 * setLocation				- 위치설정
 * add						- 다른 컴포넌트 설정
 * setLayout				- 레이아웃설정
 * setResizable				- 사이즈조절 하게할지
 * setBounds				- 크기와 위치설정
 * setFont					- 글의 크기설정
 * setForeground			- foreground 색 설정
 * setBackground			-			 색 설정
 * setCursor				- 마우스 커서 설정
 * 
 * 
 */
public class FrameEx1 {
class MyFrame extends Frame{
	public MyFrame(String title) {
		super(title);
		
		super.setSize(400,300);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		//시스템화면의 크기를 가져온다
		int xpos = (int)(screen.getWidth()/2 - super.getWidth()/2);
		int ypos = (int) (screen.getHeight()/2 - super.getHeight()/2);
		//시스템화면의 정 중앙에 현 프레임을 올리기 위한 계산
		super.setLocation(xpos,ypos);
		super.setResizable(false);
		super.setVisible(true);
		//맨 나중에 화면에 보여주는건 셋팅 완료 후 사용자에게 보여주기 위해
	}
}
	public static void main(String[] args) {
		

		
		
		
		
		
	}

}
