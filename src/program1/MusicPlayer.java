package program1;

public class MusicPlayer {
	private String singer;
	private String music;
	public MusicPlayer(String singer , String music) {
		this.music = music;
		this.singer = singer;
		
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public String getMusic() {
		return music;
	}
	public void setMusic(String music) {
		this.music = music;
	}


	public void musicPlay() {
		System.out.println(singer + "�� " + music + "�� ����մϴ�.");
	}
}
