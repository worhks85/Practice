package javaGUI;

import java.awt.*;

/*
 * Dialog
 * 
 * MenuBar �޴�����
 * Menu
 * Menuitem
 * CheckboxMenuItem
 */


class MyFrames extends Frame {
	//private Dialog dlg = new Dialog(this,"��â",true);//��� ������Ʈ,����,�Դٰ���
	
	private FileDialog fdlg = new FileDialog(this,"���Ͽ���", FileDialog.SAVE);
	public MyFrames() {
		super.setSize(300,200);
		
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2 - this.getWidth()/2);
		int ypos = (int)(screen.getHeight()/2 - this.getHeight()/2);

		super.setLocation(xpos , ypos);
		super.setResizable(false);
		super.setVisible(true);
		
		//dlg.setBounds(xpos,ypos,100,100);
		//dlg.setVisible(true);
		fdlg.setVisible(true);
	}
}
public class ComponentEx2 {

	public static void main(String[] args) {
		MyFrames mf = new MyFrames();
	}

}
