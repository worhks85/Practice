package graphics;
import java.awt.*;
import javax.swing.*;

/*
 * AWT는 운영체제의 컴포넌트를 가져다 사용
 * - 자바는 각 운영체제에 독립적으로 사용됨
 * 새로은 GUI를 구현해야 할 필요가 발생
 * 
 * 1. 기존의 AWT를 사용하기 위해서는 Frame클래스를 상속받지만, Swing에서는 JFrame을 상속받음
 * 2. JFrame 위에 Container클래스를 올려서 사용
 * 3. X박스로 종료하려고 하면 this.setDefaultCloseOperation(JFrame.Exit_ON_CLOSE);
 * 
 *  JOptioinPane - 메세지전달, 컨펌받기,입력값받기
 *  JFileChooser - 파일열기 , 저장화면
 *  JColorChooser - 색상선택화면
 *  
 * 
 * 
 * 
 */

class MyFrame_01 extends JFrame{
	// AWT에서 사용한 모든 컴포넌트들은 J자만 붙혀서 사용하면 된다.
	Container con = this.getContentPane();
	//JFrame은 직접 구현하는 것이 아니라, Container 위에 얹어서 작업한다 
	
	
	
	
	public MyFrame_01() {
		super.setSize(600,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2 - this.getWidth()/2);
		int ypos = (int)(screen.getHeight()/2 - this.getHeight()/2);
		super.setLocation(xpos , ypos);
		super.setResizable(false);
		super.setVisible(true);
	}
}
public class SwingEx01 {

	public static void main(String[] args) {
		MyFrame_01 mf = new MyFrame_01();
		
		
	}

}
