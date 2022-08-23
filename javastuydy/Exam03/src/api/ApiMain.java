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

public static void Accident() {
		

			String apiURL = "http://apis.data.go.kr/B552061/AccidentDeath/getRestTrafficAccidentDeath";
			String serviceKey = "B33lG0+L/a55DgCaRf5Dj9AC14JCZx8/m8jJKZwCQQbg2F7vdTjkLe0wj7rDusbAuTUOTmpmJtVPXVv0sbe+lw==";
			
			try {				
				
			//	apiURL += "?type=" + URLEncoder.encode("json", "UTF-8");		
				apiURL += "?occrrnc_dt=" + URLEncoder.encode("2019011622", "UTF-8");
				apiURL += "&occrrnc_day_cd=" + URLEncoder.encode("4", "UTF-8");
				apiURL += "&occrrnc_day_cd=" + URLEncoder.encode("4", "UTF-8");
				apiURL += "&dth_dnv_cnt=" + URLEncoder.encode("0", "UTF-8");
				apiURL += "&injpsn_cnt=" + URLEncoder.encode("1", "UTF-8");

				apiURL += "&serviceKey=" + URLEncoder.encode(serviceKey, "UTF-8");
				
			} catch(UnsupportedEncodingException e) {
				System.out.println("인코딩 실패");
			}
			
			
			// API 주소 접속
			URL url = null;
			HttpURLConnection con = null;
			
			try {			
				url = new URL(apiURL);
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
		
	
	
	public static void main(String[] args) {
		/*
		JSONObject obj = new JSONObject(Accident());
	//	JSONObject header = obj.getJSONObject("header");
	//	JSONArray columns = header.getJSONArray("columns");
		
		JSONObject body = obj.getJSONObject("body");
		JSONArray items = body.getJSONArray("items");
		JSONObject item = items.getJSONObject(0);
		
		String[] p = {"trarNo", "mainTrarNm", "ctprvnCd", "ctprvnNm", "signguCd", "signguNm", "trarArea", "coordNum", "coords", "stdrDt"};
		
		Map<String, Object> map = new HashMap<String, Object>();
		for(int i = 0; i < columns.length(); i++) {
			map.put(columns.getString(i), item.get(p[i]));
		}
		
		System.out.println(map);
		*/
		Accident();
	//	Accident_load();
		
		
		
		
	}

}
