package javaGUI;

import java.awt.*;

/*
 * Panel
 * - Frame �� ���� �ٸ� ������Ʈ�� �ڽ��� �������� ���Խ�ų�� �ִ� �����̳�
 * - Panel�ڽŵ� �ٸ� �����̳ʿ� ���� �� �� ����
 * - �ڽŸ��� Layout������ ����
 * - Frame������ Component�� �پ��ϰ� ��ġ�� �� ����
 * Button
 * 
 * Label
 * ���ڶ���
 * Choice - �ϳ��� ����â
 * List - �ٺ��̰� ����
 * CheckBox
 * TextField - ���� �Է�
 * TextArea - ������ �Է�
 */
class MyFrame extends Frame {
	private Label lb = new Label("���� : ", Label.RIGHT);
	private TextField tf =new TextField();
	private TextArea ta = new TextArea();
	private Button bt = new Button("Ȯ��");
	
	private BorderLayout bl = new BorderLayout();
	private Panel p1 = new Panel();
	private BorderLayout p1_bl = new BorderLayout();
	private Panel p2 = new Panel();
	private FlowLayout p2_fl = new FlowLayout(FlowLayout.RIGHT);
	
	
/////////////////////////////Checkbox���///////////////////////////////
//	private Label lb = new Label("�����ϴ� ��������?");
//	private CheckboxGroup cg = new CheckboxGroup();//�������� �ϳ��� �����Ҷ�
//	private Checkbox cb1 = new Checkbox("���缮",cg,false);
//	private Checkbox cb2 = new Checkbox("��ȣ��",cg,false);
//	private Checkbox cb3 = new Checkbox("�ڸ��",cg,false);
//	private Checkbox cb4 = new Checkbox("������",cg,false);
//	
//	private GridLayout gl = new GridLayout(2,1);
//	private Panel p = new Panel();
//	private GridLayout p_gl = new GridLayout(1,4);
	
/////////////////////////////List���///////////////////////////////
//	private Label lb = new Label("�ƹ��ų� ����");
//	private List list = new List(5,true);
//	private BorderLayout bl = new BorderLayout();
	
	
	
/////////////////////////////Choice���///////////////////////////////
//	private Label lb = new Label("����� �������� �����Դϱ�?");
//	private Choice ch = new Choice();
//	private GridLayout gl = new GridLayout(2,1);
	
	
/////////////////////////////Label Button���///////////////////////////////
//	private Button bt1 = new Button("YES");
//	private Button bt2 = new Button("NO");
//	
//	private Label lb = new Label("�̰��� �� �Դϴ�",Label.CENTER);
//	
//	
//	private BorderLayout bl = new BorderLayout();
//	private Panel p = new Panel();
//	private GridLayout gl = new GridLayout(1,2,200,50);
//	
	public MyFrame(){
		super.setSize(300,200);
		this.setLayout(bl);
		this.add("North",p1);
		p1.setLayout(p1_bl);
		p1.add("West",lb);
		p1.add("Center",tf);
		this.add("Center", ta);
		this.add("South", p2);
		p2.setLayout(p2_fl);
		p2.add(bt);
		
/////////////////////////////Checkbox���///////////////////////////////
//		super.setSize(300,200);
//		this.setLayout(gl);
//		this.add(lb);
//		this.add(p);
//		p.setLayout(p_gl);
//		p.add(cb1);
//		p.add(cb2);
//		p.add(cb3);
//		p.add(cb4);
/////////////////////////////List���///////////////////////////////
//		super.setSize(300,200);
//		this.setLayout(bl);
//		this.add("North",lb);
//		for (char i = 'A'; i<='Z' ; ++i) {
//			list.add(""+i+i+i);
//		}
//		this.add("Center",list);
/////////////////////////////Choice���///////////////////////////////
//		super.setSize(300,200);
//		this.setLayout(gl);
//		this.add(lb);
//		this.add(ch);
//		ch.add("A��");
//		ch.add("B��");
//		ch.add("O��");
//		ch.add("AB��");
		
		
/////////////////////////////Label���///////////////////////////////
//		super.setSize(300,200);
//		this.setLayout(bl);
//		this.add("North",lb);
//		this.add("South", p);
//		p.setLayout(gl);
//		p.add(bt1);
//		p.add(bt2);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2 - this.getWidth()/2);
		int ypos = (int)(screen.getHeight()/2 - this.getHeight()/2);
		
		super.setLocation(xpos , ypos);
		super.setResizable(false);
		super.setVisible(true);
		
		
	}
	
}
public class ComponentEx {
	public static void main(String[] args) {
		MyFrame mf = new MyFrame();
	}
	
	

}
