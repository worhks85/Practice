package program1;

import java.util.*;

public class MusicPlayerServiceImpl implements MusicPlayerService {
	Scanner sc = new Scanner(System.in);
	ArrayList<MusicPlayer> list = new ArrayList<MusicPlayer>();
	@Override
	public void play() {
		//뮤직 전체 재생
		for ( MusicPlayer st : list) {
			st.musicPlay();
		}

	}

	@Override
	public void insert() {
		// 가수 이름과 곡이름을 입력받아 뮤직넣기
		System.out.print("가수를 입력해 주세요 : ");
		String singer = sc.next();
		System.out.print("노래 제목을 입력해 주세요 : ");
		String music = sc.next();
		MusicPlayer ms = new MusicPlayer(singer, music);
		list.add(ms);
	}

	@Override
	public void choicePlay() {
		// 가수 이름 입력받아 해당뮤직 재생
		System.out.print("듣고싶은 가수 이름을 입력해 주세요 : ");
		String singer = sc.next();
		for ( MusicPlayer st : list) {
			if (st.getSinger().equals(singer)) {
				st.musicPlay();
				break;
			}else {
				System.out.println("노래가 없습니다.");
			}
		}
	}

	@Override
	public void choiceDel() {
		// 가수이름받아 해당뮤직 삭제
		System.out.print("삭제하고싶은 가수 이름을 입력해 주세요 : ");
		String singer = sc.next();
		for ( MusicPlayer st : list) {
			if (st.getSinger().equals(singer)) {
				System.out.println(singer  + "의 " + st.getMusic() + "가 삭제되었습니다");
				list.remove(st);
				break;
			}else {
				System.out.println("노래가 없습니다.");
			}
		}
	}


	@Override
	public void delete() {
		// 삭제
		list.clear();
		if(list.isEmpty()) {
			System.out.println("전체 재생 목록이 삭제되었습니다");
		}else {
			 System.out.println("다시 삭제 해야합니다.");
		}
	}

}
