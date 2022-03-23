package javaGUI;

import java.awt.*;

/*
 * Panel
 * - Frame 과 같이 다른 컴포넌트를 자신의 영역내에 포함시킬수 있는 컨테이너
 * - Panel자신도 다른 컨테이너에 포함 될 수 있음
 * - 자신만의 Layout공간을 가짐
 * - Frame내에서 Component를 다양하게 배치할 수 있음
 * Button
 * 
 * Label
 * 글자띄우기
 * Choice - 하나만 선택창
 * List - 다보이게 선택
 * CheckBox
 * TextField - 한줄 입력
 * TextArea - 여러줄 입력
 */
class MyFrame extends Frame {
	private Label lb = new Label("제목 : ", Label.RIGHT);
	private TextField tf =new TextField();
	private TextArea ta = new TextArea();
	private Button bt = new Button("확인");
	
	private BorderLayout bl = new BorderLayout();
	private Panel p1 = new Panel();
	private BorderLayout p1_bl = new BorderLayout();
	private Panel p2 = new Panel();
	private FlowLayout p2_fl = new FlowLayout(FlowLayout.RIGHT);
	
	
/////////////////////////////Checkbox사용///////////////////////////////
//	private Label lb = new Label("좋아하는 연예인은?");
//	private CheckboxGroup cg = new CheckboxGroup();//여러개중 하나만 선택할때
//	private Checkbox cb1 = new Checkbox("유재석",cg,false);
//	private Checkbox cb2 = new Checkbox("강호동",cg,false);
//	private Checkbox cb3 = new Checkbox("박명수",cg,false);
//	private Checkbox cb4 = new Checkbox("정형돈",cg,false);
//	
//	private GridLayout gl = new GridLayout(2,1);
//	private Panel p = new Panel();
//	private GridLayout p_gl = new GridLayout(1,4);
	
/////////////////////////////List사용///////////////////////////////
//	private Label lb = new Label("아무거나 성택");
//	private List list = new List(5,true);
//	private BorderLayout bl = new BorderLayout();
	
	
	
/////////////////////////////Choice사용///////////////////////////////
//	private Label lb = new Label("당신의 혈액형은 무엇입니까?");
//	private Choice ch = new Choice();
//	private GridLayout gl = new GridLayout(2,1);
	
	
/////////////////////////////Label Button사용///////////////////////////////
//	private Button bt1 = new Button("YES");
//	private Button bt2 = new Button("NO");
//	
//	private Label lb = new Label("이것은 라벨 입니다",Label.CENTER);
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
		
/////////////////////////////Checkbox사용///////////////////////////////
//		super.setSize(300,200);
//		this.setLayout(gl);
//		this.add(lb);
//		this.add(p);
//		p.setLayout(p_gl);
//		p.add(cb1);
//		p.add(cb2);
//		p.add(cb3);
//		p.add(cb4);
/////////////////////////////List사용///////////////////////////////
//		super.setSize(300,200);
//		this.setLayout(bl);
//		this.add("North",lb);
//		for (char i = 'A'; i<='Z' ; ++i) {
//			list.add(""+i+i+i);
//		}
//		this.add("Center",list);
/////////////////////////////Choice사용///////////////////////////////
//		super.setSize(300,200);
//		this.setLayout(gl);
//		this.add(lb);
//		this.add(ch);
//		ch.add("A형");
//		ch.add("B형");
//		ch.add("O형");
//		ch.add("AB형");
		
		
/////////////////////////////Label사용///////////////////////////////
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
