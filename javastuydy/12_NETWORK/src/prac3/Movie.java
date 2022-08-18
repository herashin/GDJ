package prac3;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString




public class Movie {

	private String movieCd; // 영화 코드
	private String movieNm; // 영화명
	private String openDt;	// 개봉일
	private String saleAcc; // 누적 매출액	
	private String audAcc;	// 누적관객 수
	
	
	
	
}
