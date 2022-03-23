package javaGUI;

import java.awt.*;

/*
 * Layout - 배치관리자
 * - GUI 환경에서 컨테이너 위에 각종 컴포넌트를 배치하는 기법
 * 
 * FlowLayout
 *  - 컴포넌트가 컨테이너에 한줄로 배치되는 형태
 *  - 한줄에 포함할수 없으면 다음줄로 넘어감
 *  - 컨테이너의 크기에따라 컴포넌트의 크기도 자동으로 조절
 *  - 생성자에 위치를 배치하면 시작되는 위치 변경
 * 
 * BorderLayout
 *  - 동서남북 중앙의 다섯 가지 위치를 지정
 *  - default = 중앙
 *  - Frame 클래스의 default layout
 * 
 * GridLayout
 *  - 가상의 행과 열로 분할하여 컴포넌트를 배치
 *  - 행을 기준으로 열을 채움
 *  
 * CardLayout
 *  - 여러개의 컴포넌트를 포개어 놓은 구조
 *  - 한번에 하나의 컴포넌트가 보이고 , 이름을 붙여 호출하는 형태로 나오는 구조
 *  
 * 
 * 
 */
public class LayoutEx1 {
	class flowLayouts extends Frame{
		Button bt = new Button("버튼1");
		FlowLayout fl = new FlowLayout();
		public flowLayouts(String title) {
			super(title);
			this.setLayout(fl);
			this.add(bt);
			super.setSize(400,300);
			Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
			//시스템화면의 크기를 가져온다
			int xpos = (int)(screen.getWidth()/2 - super.getWidth()/2);
			int ypos = (int) (screen.getHeight()/2 - super.getHeight()/2);
			//시스템화면의 정 중앙에 현 프레임을 올리기 위한 계산
			super.setLocation(xpos,ypos);
			super.setResizable(false);
			super.setVisible(true);
		}
	}
	
	class Borderlayouts extends Frame{
		Button bt1 = new Button("버튼1");
		Button bt2 = new Button("버튼2");
		Button bt3 = new Button("버튼3");
		Button bt4 = new Button("버튼4");
		Button bt5 = new Button("버튼5");
		BorderLayout bl = new BorderLayout();
		public Borderlayouts(String title) {
			super(title);
			this.setLayout(bl);
			this.add("North",bt1);
			this.add("South",bt2);
			this.add("East",bt3);
			this.add("West",bt4);
			this.add("Center",bt5);
			super.setSize(400,300);
			Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
			//시스템화면의 크기를 가져온다
			int xpos = (int)(screen.getWidth()/2 - super.getWidth()/2);
			int ypos = (int) (screen.getHeight()/2 - super.getHeight()/2);
			//시스템화면의 정 중앙에 현 프레임을 올리기 위한 계산
			super.setLocation(xpos,ypos);
			super.setResizable(false);
			super.setVisible(true);
			
		}
	}
	class Gridlayouts extends Frame{
		Button bt1 = new Button("버튼1");
		Button bt2 = new Button("버튼2");
		Button bt3 = new Button("버튼3");
		Button bt4 = new Button("버튼4");
		Button bt5 = new Button("버튼5");
		GridLayout bl = new GridLayout(2,2);//( 행 , 열 , 좌우간격 , 상하간격)
		public Gridlayouts(String title) {
			super(title);
			this.setLayout(bl);
			this.add(bt1); this.add(bt2);
			this.add(bt3); this.add(bt4);
			super.setSize(300,200);
			Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
			//시스템화면의 크기를 가져온다
			int xpos = (int)(screen.getWidth()/2 - super.getWidth()/2);
			int ypos = (int) (screen.getHeight()/2 - super.getHeight()/2);
			//시스템화면의 정 중앙에 현 프레임을 올리기 위한 계산
			super.setLocation(xpos,ypos);
			super.setResizable(false);
			super.setVisible(true);
		}
	}
	
	class Cardlayouts extends Frame{
		Button bt1 = new Button("버튼1");
		Button bt2 = new Button("버튼2");
		Button bt3 = new Button("버튼3");
		Button bt4 = new Button("버튼4");
		CardLayout cl = new CardLayout();
		public Cardlayouts(String title) {
			super(title);
			this.setLayout(cl);
			this.add("num1",bt1); this.add("num2",bt2);
			this.add("num3",bt3); this.add("num4",bt4);
			super.setSize(300,200);
			Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
			//시스템화면의 크기를 가져온다
			int xpos = (int)(screen.getWidth()/2 - super.getWidth()/2);
			int ypos = (int) (screen.getHeight()/2 - super.getHeight()/2);
			//시스템화면의 정 중앙에 현 프레임을 올리기 위한 계산
			super.setLocation(xpos,ypos);
			super.setResizable(false);
			super.setVisible(true);
			cl.show(this, "num1");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}