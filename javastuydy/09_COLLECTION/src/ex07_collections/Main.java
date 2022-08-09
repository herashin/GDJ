package ex07_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Main {
	
	public static void printMovies(List<String> list) {
		
	

		for(int i = 0,size = list.size(); i < size;i++ )
		{
			System.out.print(list.get(i));
			if(i < size - 1) { // size - 1 : 마지막 요소의 인덱스
				
				System.out.print("->  ");
			}
			
		}
		System.out.println();

		
		
		
		
	}
	
	

	public static void main(String[] args) {
	
		
		List<String> movies = new ArrayList<String>();
		
		movies.add("아바타");
		movies.add("쇼생크탈출");
		movies.add("한산");
		movies.add("탑건");
		movies.add("캐리비안의해적");
		
		
		
		printMovies(movies);
		
		
		// movies 리스트를 오름차순 정렬
		Collections.sort(movies);
		printMovies(movies);
		
		
		
		// movies 리스트를 내림차순 정렬시킴
		Collections.reverse(movies);
		printMovies(movies);
		
		
		
		// 특정 요소의 인덱스
		// 이진 검색(binary search)을 이용하므로 검색 속도가 매우빠름
		// 단 크기수능로 정렬이 되어 있어야 함
		int idx = Collections.binarySearch(movies, "아바타");
				
		System.out.println(idx);

		
		
	}
}

