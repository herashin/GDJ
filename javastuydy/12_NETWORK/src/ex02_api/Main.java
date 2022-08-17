package ex02_api;

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

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;



public class Main {

	// 요청 : 
	// 1. Request
	// 2. 클라이언트  - > 서버
	
	
	// 파라미터
	// 1. Parameter
	// 2. 보내는 데이터 (변수개념)
	
	
	// 응답
	// 1. Response
	// 2. 서버 -> 클라이언트
	
	
	
	
	public static void m1() {
		
		// 전국종량제봉투가격표준데이터  
		
		
		// API 주소 ( 주소 + 요청 파라미터)
	
		
		String apiURL = "http://api.data.go.kr/openapi/tn_pubr_public_weighted_envlp_api";
		
		
		try {
		
			String serviceKey = "B33lG0+L/a55DgCaRf5Dj9AC14JCZx8/m8jJKZwCQQbg2F7vdTjkLe0wj7rDusbAuTUOTmpmJtVPXVv0sbe+lw==";
			apiURL += "?serviceKey=" + URLEncoder.encode(serviceKey, "UTF-8");
			
		apiURL += "&pageNo=" + URLEncoder.encode("0", "UTF-8");
		apiURL += "&numOfRows=" + URLEncoder.encode("100", "UTF-8");
		apiURL += "&type=" + URLEncoder.encode("xml", "UTF-8");        
        apiURL += "&CTPRVN_NM=" + URLEncoder.encode("인천광역시", "UTF-8");
        apiURL += "&SIGNGU_NM=" + URLEncoder.encode("계양구", "UTF-8");
        apiURL += "&WEIGHTED_ENVLP_TYPE=" + URLEncoder.encode("규격봉투", "UTF-8");
        apiURL += "&WEIGHTED_ENVLP_MTHD=" + URLEncoder.encode("소각용", "UTF-8");
        apiURL += "&WEIGHTED_ENVLP_PRPOS=" + URLEncoder.encode("생활쓰레기", "UTF-8");
        apiURL += "&WEIGHTED_ENVLP_TRGET=" + URLEncoder.encode("기타", "UTF-8");     
        
		}catch( UnsupportedEncodingException e ) {
			e.printStackTrace();
			
			
		}	
		
		URL url = null;
		HttpURLConnection con = null;
		
		try {
			
			url = new URL(apiURL);
			con = ( HttpURLConnection  )url.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("content-Type", "application/xml; charset=UTF-8"); // xml 데이터 주세요~ 이런뜻
			
			
			
		}catch( MalformedURLException e ) {
			System.out.println("API 주소 오류");
		}catch(  IOException e ) {
			System.out.println("API 주소 접속 실패");
			
		}
		
		
		// 입력 스트림 (응답) 생성
		// 1. 응답 성공시 정상 스트림, 실패 시 에러 스트림
		// 2. 응답 데이터는 StringBuilder에 저장
		BufferedReader reader = null;
		StringBuilder sb = new StringBuilder();
		
		try {
			if( con.getResponseCode() == HttpURLConnection.HTTP_OK ) {
				
				reader = new BufferedReader( new InputStreamReader(con.getInputStream())    );
			}else {
				reader = new BufferedReader( new InputStreamReader(con.getErrorStream())  );
			}
			
			
			String line = null;
			while( ( line = reader.readLine() ) != null  ) {
				sb.append(line + "\n");
			}
			
			
		}catch(IOException e) {
			System.out.println("API 응답 실패");
		}
		
		String response = sb.toString();
		
		File file = new File("C:\\storage", "api.xml");
		
		try {
			
			BufferedWriter bw = new BufferedWriter( new FileWriter(file) );
			bw.write(response);
			bw.close();
			
		}catch( IOException e ) {
			e.printStackTrace();
			
		}
		
		
		try {
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.parse(file);
		
		Element root = doc.getDocumentElement();
		NodeList nodeList =  root.getChildNodes();
		
		
		for ( int i = 0; i < nodeList.getLength();  i++  ) {
			Node node = nodeList.item(i);
			System.out.println( "  " +node.getNodeName()  );
			NodeList nodeList2 = node.getChildNodes();
			
			for( int j = 0; j < nodeList2.getLength(); j ++  ) {
				Node node2 = nodeList2.item(j);
				System.out.println("    "+node2.getNodeName());
				if( node2.getNodeName().equals("items")  ) {
					NodeList items = node2.getChildNodes();
					for( int k = 0; k < items.getLength(); k++ ) {
						Node item = items.item(k);
						System.out.println("       " + item.getNodeName());
						NodeList itemchildren = item.getChildNodes();
						for( int l = 0; l < itemchildren.getLength(); l++ ) {
							Node itemchild = itemchildren.item(l);
							System.out.println("                " + itemchild.getNodeName() + ":" + itemchild.getTextContent());
							
							
						}
						
					}
					
					
				} 
				
				
			}
			
			
		}
		
		
		
		
		}catch( Exception e) {
			
			e.printStackTrace();
			
		}
		
		System.out.println(response);
		
	}
	
	
	
	public static void main(String[] args) {
		
		
		m1();
		

	}

}