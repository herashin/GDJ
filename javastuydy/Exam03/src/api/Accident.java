package api;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;


public class Accident {

	public static String api() {
		
		String serviceKey = "B33lG0+L/a55DgCaRf5Dj9AC14JCZx8/m8jJKZwCQQbg2F7vdTjkLe0wj7rDusbAuTUOTmpmJtVPXVv0sbe+lw==";
		
		StringBuilder urlBuilder = new StringBuilder();
		
		try {
			urlBuilder.append("http://apis.data.go.kr/B552061/AccidentDeath");
			urlBuilder.append("?serviceKey=").append( URLEncoder.encode(serviceKey, "UTF-8") );
			urlBuilder.append("&type=json");
			
		}catch( UnsupportedEncodingException e ) {
			e.printStackTrace();
			
		}
		
		String apiURL = urlBuilder.toString();
		URL url = null;
		
		HttpURLConnection con = null;
		
		try {
			url = new URL(apiURL);
			con = (HttpURLConnection)url.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
			
		}catch(MalformedURLException e) {
			System.out.println("API 주소 오류");
		} catch(IOException e) {
			System.out.println("API 접속 실패");
		}
		
		BufferedReader reader = null;
		StringBuilder sb = new StringBuilder();
		try {
			if( con.getResponseCode() == HttpURLConnection.HTTP_OK ) {
				reader = new BufferedReader( new InputStreamReader( con.getInputStream())  );    
			}else {
				reader = new BufferedReader( new InputStreamReader( con.getErrorStream() )  );
				
			}
			String line = null;
			while( (line = reader.readLine()) != null   ) {
				sb.append(line);
				
			}	
			reader.close();
		} catch(IOException e) {
			System.out.println("API 응답 실패");
		}
		
		
				String response = sb.toString();
				
				// JSON File 생성
				File file = new File("C:\\storage", "api3.json");
				try {
					BufferedWriter bw = new BufferedWriter(new FileWriter(file));
					bw.write(response);
					bw.close();
				} catch(IOException e) {
					e.printStackTrace();
				}
				
				return response;
		
		
		
	}//public static String api()
	
	
	
	
}
