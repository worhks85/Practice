package program1;

import java.util.*;

public class MusicPlayerServiceImpl implements MusicPlayerService {
	Scanner sc = new Scanner(System.in);
	ArrayList<MusicPlayer> list = new ArrayList<MusicPlayer>();
	@Override
	public void play() {
		//���� ��ü ���
		for ( MusicPlayer st : list) {
			st.musicPlay();
		}

	}

	@Override
	public void insert() {
		// ���� �̸��� ���̸��� �Է¹޾� �����ֱ�
		System.out.print("������ �Է��� �ּ��� : ");
		String singer = sc.next();
		System.out.print("�뷡 ������ �Է��� �ּ��� : ");
		String music = sc.next();
		MusicPlayer ms = new MusicPlayer(singer, music);
		list.add(ms);
	}

	@Override
	public void choicePlay() {
		// ���� �̸� �Է¹޾� �ش���� ���
		System.out.print("������ ���� �̸��� �Է��� �ּ��� : ");
		String singer = sc.next();
		for ( MusicPlayer st : list) {
			if (st.getSinger().equals(singer)) {
				st.musicPlay();
				break;
			}else {
				System.out.println("�뷡�� �����ϴ�.");
			}
		}
	}

	@Override
	public void choiceDel() {
		// �����̸��޾� �ش���� ����
		System.out.print("�����ϰ���� ���� �̸��� �Է��� �ּ��� : ");
		String singer = sc.next();
		for ( MusicPlayer st : list) {
			if (st.getSinger().equals(singer)) {
				System.out.println(singer  + "�� " + st.getMusic() + "�� �����Ǿ����ϴ�");
				list.remove(st);
				break;
			}else {
				System.out.println("�뷡�� �����ϴ�.");
			}
		}
	}


	@Override
	public void delete() {
		// ����
		list.clear();
		if(list.isEmpty()) {
			System.out.println("��ü ��� ����� �����Ǿ����ϴ�");
		}else {
			 System.out.println("�ٽ� ���� �ؾ��մϴ�.");
		}
	}

}
