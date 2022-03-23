package javaGUI;

import java.awt.*;


class MyFrame3 extends Frame{
	private MenuBar mb = new MenuBar();
	private Menu file = new Menu("����");
	private Menu edit = new Menu("����");
	private MenuItem fnew = new MenuItem("������");
	private MenuItem fexit = new MenuItem("����");
	private Menu color = new Menu("����");
	private CheckboxMenuItem res = new CheckboxMenuItem("����");
	public MyFrame3(){
		super.setSize(300,200);
		this.setMenuBar(mb);
		file.add(fnew);
		file.add(fexit);
		file.addSeparator();
		
		mb.add(file);
		mb.add(edit);
		edit.add(color);
		color.add(res);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2 - this.getWidth()/2);
		int ypos = (int)(screen.getHeight()/2 - this.getHeight()/2);
		super.setLocation(xpos , ypos);
		super.setResizable(false);
		super.setVisible(true);
	}
}



public class MenuEx01 {

	
	public static void main(String[] args) {
	
			MyFrame3 mf = new MyFrame3();
		
		
		
	}

}
