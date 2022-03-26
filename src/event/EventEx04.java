package event;
import java.awt.*;
import java.awt.event.*;


class MyFrame3 extends Frame implements ActionListener {
	private MenuBar mb = new MenuBar();
	private Menu file = new Menu("파일");
	private Menu help = new Menu("도움말");
	private MenuItem fopen = new MenuItem("파일열기");
	private MenuItem fsave = new MenuItem("파일저장");
	private MenuItem fexit = new MenuItem("종료");
	private MenuItem hviewversion = new MenuItem("버젼보기");
	private FileDialog fdlg1 = new FileDialog(this,"파일열기",FileDialog.LOAD);
	private FileDialog fdlg2 = new FileDialog(this,"파일저장",FileDialog.SAVE);
	private Dialog dlg = new Dialog(this,"버전보기",true);
	private Label lb = new Label("버전 1.0입니다." , Label.CENTER);
	private Button dlg_bt = new Button("확인");
	
	
	
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
