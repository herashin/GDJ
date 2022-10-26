package test;

import static org.junit.Assert.*;

import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.Test;

public class MemberTest {

	@Test
	public void 회원목록테스트() {
		
		// 회원목록을 반환하는 MemberListService() 동작전반을 살펴보는 테스트
		
		URL url=URL;
		HttpURLConnection con =null;
		
		try {
			String apiURL = "http://locarhist:9090/07_Ajax/member/list.do";
			url = new URL(apiURL);
			con = (HttpURLConnection)url.openConnection();
			
			
		}
		
	}

	
	
	
	
	
}
