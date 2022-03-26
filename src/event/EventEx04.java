package event;
import java.awt.*;
import java.awt.event.*;


class MyFrame3 extends Frame implements ActionListener {
	private MenuBar mb = new MenuBar();
	private Menu file = new Menu("����");
	private Menu help = new Menu("����");
	private MenuItem fopen = new MenuItem("���Ͽ���");
	private MenuItem fsave = new MenuItem("��������");
	private MenuItem fexit = new MenuItem("����");
	private MenuItem hviewversion = new MenuItem("��������");
	private FileDialog fdlg1 = new FileDialog(this,"���Ͽ���",FileDialog.LOAD);
	private FileDialog fdlg2 = new FileDialog(this,"��������",FileDialog.SAVE);
	private Dialog dlg = new Dialog(this,"��������",true);
	private Label lb = new Label("���� 1.0�Դϴ�." , Label.CENTER);
	private Button dlg_bt = new Button("Ȯ��");
	
	
	
	public void init() {
		this.setMenuBar(mb);
		mb.add(file);
		mb.add(help);
		file.add(fopen); fopen.addActionListener(this);
		file.add(fsave); fsave.addActionListener(this);
		file.add(fexit); fexit.addActionListener(this);
		file.addSeparator();
		help.add(hviewversion); hviewversion.addActionListener(this);
		dlg.setLayout(new BorderLayout());
		dlg.add("Center",lb);
		dlg.add("South",dlg_bt); dlg_bt.addActionListener(this);
		
	}
	
	public MyFrame3() {
		super.setSize(300,200);
		init();
		
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2 - this.getWidth()/2);
		int ypos = (int)(screen.getHeight()/2 - this.getHeight()/2);
		super.setLocation(xpos , ypos);
		super.setResizable(false);
		super.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == fopen) {
			fdlg1.setVisible(true);
		}else if (e.getSource() == fsave) {
			fdlg2.setVisible(true);
		}else if (e.getSource() == fexit) {
			System.exit(0);
		}else if (e.getSource() == hviewversion) {
			dlg.setBounds(200,200, 200, 150);
			dlg.setResizable(false);
			dlg.setVisible(true);
			
		}else if (e.getSource() == dlg_bt) {
			dlg.setVisible(false);
		}
		
	}
}

public class EventEx04 {

	public static void main(String[] args) {
		MyFrame3 mf = new MyFrame3();
	}

}
