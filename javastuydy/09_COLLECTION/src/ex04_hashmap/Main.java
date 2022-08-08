package ex04_hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void m1() {
		
		
		
		// Map 생성
		// Map <key , Value>
		Map<String, String> dictionary = new HashMap<String, String>();
		
		
		// 추가
		dictionary.put("apple", "사과인줄_알았는데_바밤바"); // put (key , Value)
		dictionary.put("banana", "바나나맛우유_인줄알았는데_바밤바");
		dictionary.put("tomato", "멋쟁이토마토");
		dictionary.put("mango", "망_망고빙수_고_고?");
		dictionary.put("melon", "멜론");
		
		// 수정 
		// 기존의 key값을 사용하면 수정
		dictionary.put("melon", "메론인줄알았는데_바밤바");

		
		
		//삭제
		// 삭제할 요소의 key를 전달하면 삭제됨
		// 삭제된 value가 반환됨
		
		String removeItem = dictionary.remove("tomato");
		System.out.println(removeItem); //토마토
		
		
		//값(value) 확인
		System.out.println(dictionary.get("apple")); // 사과
		System.out.println(dictionary.get("peach"));
		
		
		
		// 확인 
		System.out.println(dictionary);
		
		
		
		
	}
	
	
	
	
	public static void m2() {

		
		
		// value를 String으로 관리하기
		
		Map<String, String> map1 = new HashMap<String, String>();
		map1.put("title", "어린왕자");
		
		map1.put("author", "생택쥐베리");
		map1.put("price", 10000 + "");
		System.out.println(map1);
		
		
		
		// value를 Object로 관리
		// 주로 String보다 Object로 관리함.
		Map<String, Object> map2 = new HashMap<String, Object>();
		map2.put("title","홍길동전");
		map2.put("author","허균");
		map2.put("price",20000);
		
		System.out.println(map2);
		
		
		
	}
	
	
	public static void m3() {
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("title", "소나기");
		map.put("author","황순원");
		map.put("price", 20000);
		
		// Entry 단위로 순회 (for)
		for ( Map.Entry<String, Object> entry: map.entrySet()   ) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
			
		}
		
		
		for( String key : map.keySet()  ) {
			System.out.println(key+ ":" + map.get(key));			
		}
		
		
		
		
	}
	
	public static void m4() {
		
		//연습.
		// title, author , price 정보를 가진 임의의 Map 3개를 만들고,
		// 생성된 Map 3개를  ArrayList에 저장한 뒤
		// ArrayList 에 저장된 Map 3개를 for문으로 순회하시오.
		
		Map<String,Object> map1 = new HashMap<String, Object>();
		map1.put("망고", "과일");
		map1.put("콜라", "음료");
		map1.put("아이셔", 2000);
		
		Map<String,Object> map2 = new HashMap<String, Object>();
		map2.put("수박", "과일");
		map2.put("코카", "음료");
		map2.put("젤리", 2000);
		
		Map<String,Object> map3 = new HashMap<String, Object>();
		map3.put("딸기", "과일");
		map3.put("펩시", "음료");
		map3.put("초콜릿", 2000);
		
		
		
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		list.add(map1);
		list.add(map2);
		list.add(map3);
		
		
		for(  Map<String,Object>map : list  ) {
			for( Map.Entry<String, Object> entry : map.entrySet() ) {
				System.out.println(entry.getKey() + ":" + entry.getValue());
				
			}
			System.out.println();
			// 창모는 덕소 출신 아니냐고
			
			
			
		}
		
		
		
		
		
	}
	
	
	public static void main(String[] args) {	
		
		
//		m1();
		//m2();
	//	m3();
		m4();
			
	}

}
