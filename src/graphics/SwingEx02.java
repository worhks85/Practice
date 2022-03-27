package graphics;

import java.awt.*;
import javax.swing.*;

class MyFrame_02 extends JFrame{
	Container con = this.getContentPane();
	
	
	public MyFrame_02() {
		super.setSize(600,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2 - this.getWidth()/2);
		int ypos = (int)(screen.getHeight()/2 - this.getHeight()/2);
		super.setLocation(xpos , ypos);
		super.setResizable(false);
		super.setVisible(true);
		try {
			Thread.sleep(1000);
			
		}catch ( InterruptedException e) {}
		
		
		JFileChooser jfc = new JFileChooser(".");
		//jfc.showOpenDialog(this);
		//저장,열기 버튼을 누르면 0 반환, 그 외버튼 다른값을 반환
		int res = jfc.showSaveDialog(this);
		if (res == 0) { //파일 저장프로그램
			
		}else {
			//그냥 빠져 나온다
		}
		
//		Color col = JColorChooser.showDialog(this,"색상", Color.black);
//		con.setBackground(col);
		
		
//		String name = JOptionPane.showInputDialog(this,"이름을 입력하세요" , "입력", JOptionPane.INFORMATION_MESSAGE);
//		System.out.println(name);
		
		
		/*int res = JOptionPane.showConfirmDialog(this, "정말로 삭제하시겠습니까?","질문",
				JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
		System.out.println("res = " + res);			yes는 0 나머지는 다른값
		*/
		
		
		//메세지 출력
		//JOptionPane.showMessageDialog(this, "이 파일은 관리자 전용입니다.","경고",JOptionPane.WARNING_MESSAGE);
		
		
		
		
	}
	
}
public class SwingEx02 {

	public static void main(String[] args) {
		MyFrame_02 mf = new MyFrame_02();
		
		
	}

}
