package ex02_api;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Main2_JSON {

	
public static void m1() {
		
		
		// 전국종량제봉투가격표준데이터

		
		// API 주소	(주소 + 요청 파라미터)
		String apiURL = "http://api.data.go.kr/openapi/tn_pubr_public_weighted_envlp_api";
		String serviceKey = "bEQBRPHjt0tZrc7EsL0T8usfsZ1+wT+5jqamBef/ErC/5ZO6N7nYdRmrwR91bh5d3I1AQeY5qdbJOF6Kv0U1CQ==";
		
		try {
			
			apiURL += "?pageNo=" + URLEncoder.encode("0", "UTF-8");
			apiURL += "&numOfRows=" + URLEncoder.encode("100", "UTF-8");
			apiURL += "&type=" + URLEncoder.encode("json", "UTF-8");
			apiURL += "&CTPRVN_NM=" + URLEncoder.encode("인천광역시", "UTF-8");
			apiURL += "&SIGNGU_NM=" + URLEncoder.encode("계양구", "UTF-8");
			apiURL += "&WEIGHTED_ENVLP_TYPE=" + URLEncoder.encode("규격봉투", "UTF-8");
			apiURL += "&WEIGHTED_ENVLP_MTHD=" + URLEncoder.encode("소각용", "UTF-8");
			apiURL += "&WEIGHTED_ENVLP_PRPOS=" + URLEncoder.encode("생활쓰레기", "UTF-8");
			apiURL += "&WEIGHTED_ENVLP_TRGET=" + URLEncoder.encode("기타", "UTF-8");
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
		
		
		// 입력 스트림(응답) 생성
		// 1. 응답 성공 시 정상 스트림, 실패 시 에러 스트림
		// 2. 응답 데이터는 StringBuilder에 저장
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
				sb.append(line );
			}
			
			// 스트림 종료
			reader.close();
			
		} catch(IOException e) {
			System.out.println("API 응답 실패");
		}
		
		// API로부터 전달받은 json 데이터
		String response = sb.toString();
		
		// JSON File 생성
		File file = new File("C:\\storage", "api1.json");
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			bw.write(response);
			bw.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	public static void m2() {
		
		// JSONObject 클래스 : {}, 객체를 의미
		// JSONArray  클래스 : {}, 배열을 의미
		
		File file = new File("C:\\storage", "api1.json");
		
		StringBuilder sb = new StringBuilder();
		try ( BufferedReader br = new BufferedReader( new FileReader(file)) ){
			
			String line = null;
			while( (line = br.readLine()) != null ) {
				sb.append(line);
				
			}
			
			
		}catch( IOException e ) {
			e.printStackTrace();
			
		}
		
		JSONObject obj = new JSONObject( (sb.toString() ) );
		JSONObject obj2 =  obj.getJSONObject("response");
		JSONObject obj3 =  obj2.getJSONObject("header");
		String resultCode = obj3.getString("resultCode" );
		String resultMsg = obj3.getString("resultMsg");
		
		
		System.out.println(resultCode + "," + resultMsg);
	}
	
	
	public static String m3() {
		
	

	      // 기상청41_단기예보 조회서비스
	      
	      // 인증키(Decoding)
	      String serviceKey = "bEQBRPHjt0tZrc7EsL0T8usfsZ1+wT+5jqamBef/ErC/5ZO6N7nYdRmrwR91bh5d3I1AQeY5qdbJOF6Kv0U1CQ==";

	      // API 주소   (주소 + 요청 파라미터)
	      StringBuilder urlBuilder = new StringBuilder();
	      try {
	         urlBuilder.append("http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getUltraSrtNcst");
	         urlBuilder.append("?serviceKey=").append(URLEncoder.encode(serviceKey, "UTF-8"));
	         urlBuilder.append("&numOfRows=10");
	         urlBuilder.append("&pageNo=1");
	         urlBuilder.append("&dataType=JSON");
	         urlBuilder.append("&base_date=20220819");
	         urlBuilder.append("&base_time=1100");
	         urlBuilder.append("&nx=58");   // 서울특별시 금천구 가산동 좌표X
	         urlBuilder.append("&ny=125");  // 서울특별시 금천구 가산동 좌표Y
	      } catch (UnsupportedEncodingException e) {
	         e.printStackTrace();
	      }
	      
	      String apiURL = urlBuilder.toString();
	      
	      // API 주소 접속
	      URL url = null;
	      HttpURLConnection con = null;
	      
	      try {         
	         url = new URL(apiURL);
	         con = (HttpURLConnection) url.openConnection();
	         con.setRequestMethod("GET");
	         con.setRequestProperty("Content-Type", "application/JSON; charset=UTF-8");
	      } catch(MalformedURLException e) {
	         System.out.println("API 주소 오류");
	      } catch(IOException e) {
	         System.out.println("API 접속 실패");
	      }
	      
	      // 입력 스트림 생성
	      // 1. 서버가 보낸 데이터를 읽어야 하므로 입력 스트림이 필요
	      // 2. 서버와 연결된 입력 스트림은 바이트 스트림이므로 문자 스트림으로 변환해야 함
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
	         
	         // 스트림 종료
	         reader.close();
	         
	      } catch(IOException e) {
	         System.out.println("API 응답 실패");
	      }
	      
	      // API로부터 전달받은 JSON 데이터
	      String response = sb.toString();
	      
	      // XML File 생성
	      File file = new File("C:\\storage", "api2.json");
	      try {
	         BufferedWriter bw = new BufferedWriter(new FileWriter(file));
	         bw.write(response);
	         bw.close();
	      } catch(IOException e) {
	         e.printStackTrace();
	      }
	      
		      return response;
		   

		
		
	}
	
	
	
	public static void m4() {
		
	//	String response = m3();
		
		JSONObject obj = new JSONObject(m3());
		JSONObject response = obj.getJSONObject("response");
		JSONObject body = response.getJSONObject("body");
		JSONObject items = body.getJSONObject("items");
		JSONArray item = items.getJSONArray("item");
		
		for( int i = 0; i < item.length(); i++ ) {
			JSONObject element = item.getJSONObject(i);
			System.out.println(element.getString("category") + ":" + element.getString( "obsrValue"));
			
		}
		
	}
	
	
public static String m5() {
		
		// 소상공인시장진흥공단_상가(상권)정보
		
		// 인증키(Decoding)
		String serviceKey = "bEQBRPHjt0tZrc7EsL0T8usfsZ1+wT+5jqamBef/ErC/5ZO6N7nYdRmrwR91bh5d3I1AQeY5qdbJOF6Kv0U1CQ==";

		// API 주소	(주소 + 요청 파라미터)
		StringBuilder urlBuilder = new StringBuilder();
		try {
			urlBuilder.append("http://apis.data.go.kr/B553077/api/open/sdsc2/storeZoneOne");
			urlBuilder.append("?serviceKey=").append(URLEncoder.encode(serviceKey, "UTF-8"));
			urlBuilder.append("&key=9940");
			urlBuilder.append("&type=json");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		String apiURL = urlBuilder.toString();
		
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
		
		// 입력 스트림 생성
		// 1. 서버가 보낸 데이터를 읽어야 하므로 입력 스트림이 필요
		// 2. 서버와 연결된 입력 스트림은 바이트 스트림이므로 문자 스트림으로 변환해야 함
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
			
			// 스트림 종료
			reader.close();
			
		} catch(IOException e) {
			System.out.println("API 응답 실패");
		}
		
		// API로부터 전달받은 json 데이터
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
		
	}
	
	
	
	
		
		
	public static void m6() {
		
		JSONObject obj = new JSONObject(m5());
		JSONObject header = obj.getJSONObject("header");
		JSONArray columns = header.getJSONArray("columns");
		for(int i = 0; i < columns.length(); i++) {
			System.out.println(columns.getString(i));
		}
		
		JSONObject body = obj.getJSONObject("body");
		JSONArray items = body.getJSONArray("items");
		JSONObject item = items.getJSONObject(0);
	//	System.out.println(item.toString());
		
		String[] p = {"trarNo", "mainTrarNm", "ctprvnCd", "ctprvnNm", "signguCd", "signguNm", "trarArea", "coordNum", "coords", "stdrDt"};
	
		Map<String, Object> map = new HashMap<String, Object>();
		
		for( int i = 0; i < columns.length(); i++ ) {
			map.put(columns.getString(i), item.get(p[i]));
			
		}
		System.out.println(map);
	}
	
	
	
public static String m7() {
		
		// 기상청 RSS
		String apiURL = "http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=5013061000";
		
		URL url = null;
		HttpURLConnection con = null;  
		
		try {
			url = new URL(apiURL);
			con = (HttpURLConnection)url.openConnection();			
		}catch( IOException e ) {
			System.out.println("접속실패");
		}
		
		
		
		// 응답데이터 받아오기 
		BufferedReader reader = null;
		StringBuilder sb = new StringBuilder();
		
		
		
		
		
		  try {
		         
		         if(con.getResponseCode() == HttpURLConnection.HTTP_OK) {
		            reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
		         } else {
		            reader = new BufferedReader(new InputStreamReader(con.getErrorStream()));
		         }
		         
		         String line = null;
		         while ((line = reader.readLine()) != null) {
		            sb.append(line);
		         }
		         reader.close();
		      } catch (IOException e) {
		         System.out.println("API 응답 실패");
		      }
		
		
		
		
		
		
		
		
		// xml 파일생성
		  File file = new File("C:\\storage", "api4.xml");
		try {
		
		
		BufferedWriter writer = new BufferedWriter( new FileWriter(file) );
		writer.write(sb.toString());
		writer.close();
		
		}catch(  IOException e ) {
			System.out.println("파일생성 실패");
			
		}
		
		try{
		
	    StringBuilder urlBuilder = new StringBuilder();	    
	    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	    DocumentBuilder builder = factory.newDocumentBuilder();
	    Document doc = builder.parse(file);
	    
	    Element root = doc.getDocumentElement();
	    Node title = root.getElementsByTagName("title").item(0);
		urlBuilder.append(title.getTextContent() );
		
		Node pubDt = root.getElementsByTagName("pubDate").item(0);
		urlBuilder.append(pubDt.getTextContent() );
		
		System.out.println(title.getTextContent());
		System.out.println(pubDt.getTextContent());
		
		NodeList data = root.getElementsByTagName("data");
		
		for(int i = 0; i < data.getLength(); i++) {
			
			Element items = (Element)data.item(i);
			Node hour = items.getElementsByTagName("hour").item(0);
			Node temp = items.getElementsByTagName("temp").item(0);
			Node wfKor = items.getElementsByTagName("wfKor").item(0);
			
			
			System.out.print(hour.getTextContent() + " 시	");
			System.out.print(temp.getTextContent() + " 도	");
			System.out.print(wfKor.getTextContent());
			System.out.println();
			
		}
		
		}catch( Exception e) {
			e.printStackTrace();
			
		}
		
		return sb.toString();
	}
	


	public static void m8() {
		
	//	System.out.println(m7());
		
		// XML 문서를 jsonobjct로 변환
		JSONObject obj = XML.toJSONObject(m7());
		
	//	System.out.println(obj.toString());

		JSONArray dataList = obj.getJSONObject("rss")
							.getJSONObject("channel")
							.getJSONObject("item")
							.getJSONObject("description")
							.getJSONObject("body")
							.getJSONArray("data");
//		System.out.println(dataList.getJSONObject(0));
				
		
		for( int i = 0; i < dataList.length(); i++  ) {
			
			JSONObject weather = dataList.getJSONObject(i);
			
			System.out.println( weather.getInt("hour") + "시 : " + weather.getInt("temp" )  + "도, " + weather.getString("wfKor"));
			
			
		}
		
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		
	//	m2();
	//	m3();
	//	m4();
		
	//	m6();
		
		
	//	m7();
		
		m8();
	}

}
