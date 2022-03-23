package javaGUI;

import java.awt.*;

/*
 * Layout - ��ġ������
 * - GUI ȯ�濡�� �����̳� ���� ���� ������Ʈ�� ��ġ�ϴ� ���
 * 
 * FlowLayout
 *  - ������Ʈ�� �����̳ʿ� ���ٷ� ��ġ�Ǵ� ����
 *  - ���ٿ� �����Ҽ� ������ �����ٷ� �Ѿ
 *  - �����̳��� ũ�⿡���� ������Ʈ�� ũ�⵵ �ڵ����� ����
 *  - �����ڿ� ��ġ�� ��ġ�ϸ� ���۵Ǵ� ��ġ ����
 * 
 * BorderLayout
 *  - �������� �߾��� �ټ� ���� ��ġ�� ����
 *  - default = �߾�
 *  - Frame Ŭ������ default layout
 * 
 * GridLayout
 *  - ������ ��� ���� �����Ͽ� ������Ʈ�� ��ġ
 *  - ���� �������� ���� ä��
 *  
 * CardLayout
 *  - �������� ������Ʈ�� ������ ���� ����
 *  - �ѹ��� �ϳ��� ������Ʈ�� ���̰� , �̸��� �ٿ� ȣ���ϴ� ���·� ������ ����
 *  
 * 
 * 
 */
public class LayoutEx1 {
	class flowLayouts extends Frame{
		Button bt = new Button("��ư1");
		FlowLayout fl = new FlowLayout();
		public flowLayouts(String title) {
			super(title);
			this.setLayout(fl);
			this.add(bt);
			super.setSize(400,300);
			Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
			//�ý���ȭ���� ũ�⸦ �����´�
			int xpos = (int)(screen.getWidth()/2 - super.getWidth()/2);
			int ypos = (int) (screen.getHeight()/2 - super.getHeight()/2);
			//�ý���ȭ���� �� �߾ӿ� �� �������� �ø��� ���� ���
			super.setLocation(xpos,ypos);
			super.setResizable(false);
			super.setVisible(true);
		}
	}
	
	class Borderlayouts extends Frame{
		Button bt1 = new Button("��ư1");
		Button bt2 = new Button("��ư2");
		Button bt3 = new Button("��ư3");
		Button bt4 = new Button("��ư4");
		Button bt5 = new Button("��ư5");
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
			//�ý���ȭ���� ũ�⸦ �����´�
			int xpos = (int)(screen.getWidth()/2 - super.getWidth()/2);
			int ypos = (int) (screen.getHeight()/2 - super.getHeight()/2);
			//�ý���ȭ���� �� �߾ӿ� �� �������� �ø��� ���� ���
			super.setLocation(xpos,ypos);
			super.setResizable(false);
			super.setVisible(true);
			
		}
	}
	class Gridlayouts extends Frame{
		Button bt1 = new Button("��ư1");
		Button bt2 = new Button("��ư2");
		Button bt3 = new Button("��ư3");
		Button bt4 = new Button("��ư4");
		Button bt5 = new Button("��ư5");
		GridLayout bl = new GridLayout(2,2);//( �� , �� , �¿찣�� , ���ϰ���)
		public Gridlayouts(String title) {
			super(title);
			this.setLayout(bl);
			this.add(bt1); this.add(bt2);
			this.add(bt3); this.add(bt4);
			super.setSize(300,200);
			Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
			//�ý���ȭ���� ũ�⸦ �����´�
			int xpos = (int)(screen.getWidth()/2 - super.getWidth()/2);
			int ypos = (int) (screen.getHeight()/2 - super.getHeight()/2);
			//�ý���ȭ���� �� �߾ӿ� �� �������� �ø��� ���� ���
			super.setLocation(xpos,ypos);
			super.setResizable(false);
			super.setVisible(true);
		}
	}
	
	class Cardlayouts extends Frame{
		Button bt1 = new Button("��ư1");
		Button bt2 = new Button("��ư2");
		Button bt3 = new Button("��ư3");
		Button bt4 = new Button("��ư4");
		CardLayout cl = new CardLayout();
		public Cardlayouts(String title) {
			super(title);
			this.setLayout(cl);
			this.add("num1",bt1); this.add("num2",bt2);
			this.add("num3",bt3); this.add("num4",bt4);
			super.setSize(300,200);
			Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
			//�ý���ȭ���� ũ�⸦ �����´�
			int xpos = (int)(screen.getWidth()/2 - super.getWidth()/2);
			int ypos = (int) (screen.getHeight()/2 - super.getHeight()/2);
			//�ý���ȭ���� �� �߾ӿ� �� �������� �ø��� ���� ���
			super.setLocation(xpos,ypos);
			super.setResizable(false);
			super.setVisible(true);
			cl.show(this, "num1");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}