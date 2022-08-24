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

public class ApiMain {


	public static void main(String[] args) {
	
		

		//	String apiURL = "http://apis.data.go.kr/B552061/AccidentDeath/getRestTrafficAccidentDeath";
			
			
			StringBuilder urlbuilder = new StringBuilder();
			
			
			try {				
				String serviceKey = "B33lG0+L/a55DgCaRf5Dj9AC14JCZx8/m8jJKZwCQQbg2F7vdTjkLe0wj7rDusbAuTUOTmpmJtVPXVv0sbe+lw==";
				urlbuilder.append("http://apis.data.go.kr/B552061/AccidentDeath/getRestTrafficAccidentDeath");
				urlbuilder.append( "?serviceKey=" ).append(URLEncoder.encode(serviceKey,"UTF-8"));
				urlbuilder.append("&searchYear=2021");
				urlbuilder.append("&siDo=1100");
				urlbuilder.append("&guGun=1125");
				urlbuilder.append("&type=json");
				urlbuilder.append("&numOfRows=10");
				urlbuilder.append("&pageNo=10");
				
				
		
				
			} catch(UnsupportedEncodingException e) {
				e.printStackTrace();
			}
			
			HttpURLConnection con = null;
			
		
			
			try {			
				URL url = new URL(urlbuilder.toString());
				con = (HttpURLConnection)url.openConnection();
				con.setRequestMethod(null);
				
				
				
				con = (HttpURLConnection) url.openConnection();
				con.setRequestMethod("GET");
				con.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
			} catch(MalformedURLException e) {
				System.out.println("API 주소 오류");
			} catch(IOException e) {
				System.out.println("API 접속 실패");
			}
	
			BufferedReader reader = null;
			StringBuilder sb = new StringBuilder();
			try {
				
				if(con.getResponseCode() == HttpURLConnection.HTTP_OK) {
					reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
				} else {
					reader = new BufferedReader(new InputStreamReader(con.getErrorStream()));
				}
				
				String line = null;
				while((line = reader.readLine()) != null) {
					sb.append(line);
				}
				
				reader.close();
				
			} catch(IOException e) {
				System.out.println("API 응답 실패");
			}
			
		
			String response = sb.toString();
			
	
			File file = new File("C:\\storage", "accident.txt");
			try {
				BufferedWriter bw = new BufferedWriter(new FileWriter(file));
				bw.write(response);
				bw.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
			
	
			con.disconnect();
	
	
	}//public static String Accident()
		
	
	
		
		
		
	

}
