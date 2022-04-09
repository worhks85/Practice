package network;
/* TCP(Transfer Control Protocol)
 * 전화를 걸때 상대방이 받아야 전화통화가 가능하고, 상대방이 전화를 끊으면 전화가 불가능함
 * 따라서 TCP 통신에서는 연결샅애가 중요함
 * 
 * InetAddress - 도메인으로부터 매핑되어있는 IP주소를 관리하는 클래스
 * - 실제 인터넷을 사용할 때는 IP주소가 아닌 도메인이라는 것을 사용하여 관리를함
 * - 인터넷상의 모든 사이트는 모두 IP 주소와 도메인이 매핑되어 있음
 * 
 * Static InetAddress getByName(String addr)
 * static InetAddress[] getAllByName(String addr)
 * static InetAddress getLocalHost()
 * String getHostAddress()
 * String getHostName()
 * 
 * ServerSocket - 특정 컴퓨터에 TCP포트를 열어 그곳으로 요청받았을때 사용하는클래스
 * - 서버컴퓨ㅜ터에는 포트번호를 열어놔야 클라이언트 컴퓨터가 접속을 해서 통신을 할수 있음
 * - 서버컴퓨터의 포트번호를 열 때 사용하는 클래스
 * - 이미사용중인 포트번호일때는 IOException 발생
 * 
 * Socket - 특정 컴퓨터에 접속할때 사용하는 클래스
 * - IP주소와 포트번호를 알면, 해당하는 컴퓨터와 통신을 할 수 있는데 이때 사용되는 클래스
 * - 서버에서는 ServerSocket을 통해 들어온 컴퓨터로 객체발생
 * - 클라이언트에서는 ipAddress를 통해 관리하는 주소와 서버의 포트번호를 통해 객체 발생
 * 
 */
import java.net.*;
public class Ex01 {
	public static void main(String[] args) {
		InetAddress ia = null;
		InetAddress ias[] = null;
		try {
			ia = InetAddress.getByName("www.kgitbank.com");
			System.out.println("아이피 주소 : " + ia.getHostAddress());
			System.out.println("호스트 이름 : " + ia.getHostName());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		try {
			ias = InetAddress.getAllByName("www.naver.com");
			for (int i = 0 ; i < ias.length ;++i) {
				System.out.println("아이피 주소 : " + ias[i].getHostAddress());
				System.out.println("호스트 이름 : " + ias[i].getHostName());
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		
	}

}
