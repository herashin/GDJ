package apiStudy;

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


public class Main {

	public static void main(String[] args) {
		
		String apiURL = "http://openapi.data.go.kr/openapi/service/rest/Covid19";
		
		
		try {
			String serviceKey = "B33lG0+L/a55DgCaRf5Dj9AC14JCZx8/m8jJKZwCQQbg2F7vdTjkLe0wj7rDusbAuTUOTmpmJtVPXVv0sbe+lw==";  
			apiURL += "?ServiceKey=" + URLEncoder.encode(serviceKey,"UTF-8");
			
			apiURL += "&pageNo" +URLEncoder.encode("0", "UTF-8");
			apiURL += "&numOfRows" +URLEncoder.encode("10", "UTF-8");
			apiURL += "&startCreateDt" +URLEncoder.encode("20200310", "UTF-8");
			apiURL += "&endCreateDt" +URLEncoder.encode("20200315", "UTF-8");
			
			
		}catch(UnsupportedEncodingException e) {
			e.printStackTrace();
			
		}
		
		URL url = null;
		HttpURLConnection con = null;
		
		try {
			
			url = new URL(apiURL);
			con = ( HttpURLConnection )url.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("content-Type", "application/xml; charset=UTF-8 ");
			
		}catch(MalformedURLException e) {
			System.out.println("API 주소 오류");
		}catch( IOException e ) {
			System.out.println("API 주소 접속 실패");	
		}
		
		
		BufferedReader reader = null;
		StringBuilder sb = new StringBuilder();
		
		try {
			if( con.getResponseCode() == HttpURLConnection.HTTP_OK ) {
				reader = new BufferedReader( new InputStreamReader( con.getInputStream())  );
				
				
			}else {
				reader = new BufferedReader( new InputStreamReader( con.getErrorStream())  );
				
			}
			
			String line = null;
			while( (line = reader.readLine()) != null ) {
				sb.append(line + "\n");
			
			
			}	
			
		}catch(IOException e) {
			System.out.println("API 응답 실패");
		}
		String response = sb.toString();
		
		File file = new File( "C:\\storage" , "apiStudy.xml" );
		
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			bw.write(response);
			bw.close();
			
			
		}catch( IOException e ) {
			e.printStackTrace();
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
