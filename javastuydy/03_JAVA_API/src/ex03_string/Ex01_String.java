package ex03_string;

public class Ex01_String {

	public static void main(String[] args) {
	
		
		String str1 = "hello";
		String str2 = "hello";
		
		/*
		 * 
		 * str1 0x123
		 * str2 0x123
		 * 
		 * 
		 * 
		 * 
		 * */
		
		
		System.out.println(str1 == str2);
		
		String str3 = new String("hi");
		String str4 = new String("hi");
		
		System.out.println(str3 == str4);
		
		// 1. 문자열 동등 비교
		boolean result1 = str1.equals(str2);
		boolean result2 = str3.equals(str4);
		System.out.println(result1);
		System.out.println(result2);
		
		
		
		
		if ( str1.equals(str2) ) // 이거 복습 필요
		{
			System.out.println("str1, str2 같아요");
			
		}
		else {
			System.out.println("str1, str2 달라요");
		}
		
		
		if ( !str3.equals(str4)  )
		{
			System.out.println("str3, str4는 달라요");
			
		}
		else {
			
			System.out.println("str3, str4는 같아요");
		}
		
		
		
		
		// 개발 스텐다드.   >> 부정 연산자는 가급적 사용하지 않는다.  !!!!!! 이거 ! 
		
		
		
		// 2. 대소문자를 무시한 문자열 동등 비교
		String str5 = "Hello World";
		String str6 = "hEllo WORLD";
		
		
		//System.out.println(str5.equals(str6));
		
		boolean result3 = str5.equalsIgnoreCase(str6);
		// 여기서 case가 쓰인 이유는
		// upper case ,  lower case.
		// 즉 대소문자를 무시하고 비교하라는 식이 됨.
		System.out.println(result3);
		
		
		
		// 3. 문자열 길이 반환
		String name = "우영우";
		int length = name.length();
		
		System.out.println("글자수"+ length);
		
		
		
		// 4. 특정 위치의 문자만 반환
		// 특정 위치
		// 인덱스 (index) 라고 함
		// 글자마다 부여된 정수값
		// 0 으로 시작
		System.out.println();
		System.out.println(name.charAt(0));
		System.out.println(name.charAt(1));
		System.out.println(name.charAt(2));
		
		
		// 5. 문자열의 일부 문자열(String) 을 반환
		// 1) substring(begin) :  인덱스 begin(포함)부터 끝까지 반환
		// 2) substring(begin , end) : 인덱스 begin(포함)부터 인덱스 end(불포함) 까지 반환
		// substring(0,1)  >>  0번에서 1번 불러오기인데 end는 불포함이기 때문에 0번만 불러오는것.
		System.out.println();
		System.out.println(name.substring(0,1));
		System.out.println(name.substring(1)); // 1번부터 끝까지
		
		
		
		
		
		// 6. 특정 문자열을 찾아서 해당 인덱스(int)를 반환
		// 1) indexOf
		//	  (1) 발견된 첫 번째 문자열의 인덱스를 반환	
		//	  (2) 발견된문자열이 없는 경우 -1을 반환 
		// 2) lastIndexOf
		// 	  (1) 발견된 마지막 문자열의 인덱스를 반환
		// 	  (2) 발견된 문자열이 없는 경우 -1을 반환
		
		
		
		int idx1 = name.indexOf("우");
		int idx2 = name.indexOf("준호");
		
		int idx3 = name.lastIndexOf("우");
		int idx4 = name.lastIndexOf("준호");
		
		System.out.println(idx1);
		System.out.println(idx2);
		System.out.println(idx3);
		System.out.println(idx4);
		
		
		// 7. 문자열이 특정 패턴으로 시작하는지 여부를 boolean(true, false) 반환
		//		startwith (문자열)
		
		
		if ( name.startsWith("민") ) {
			System.out.println("민씨입니다.");	
		}
		else {
			System.out.println("민씨가 아닙니다.");
		}
		
		// 8. 문자열이 특정 패턴으로 끝나는지 여부를 boolean(true,false) 반환
		//	  endWith(문자열)
		
		String filename = "image.jpg"; // jpg , png로 끝나면 이미지로 가정
		if (filename.endsWith("jpg") || filename.endsWith("png")    )
		{
			System.out.println("이미지 입니다.");
			
		}
		else {
			System.out.println("이미지가 아닙니다.");
		}
		
		// 9. 문자열이 특정 패턴을 포함하는지 여부를 boolean(true, false) 반환
		System.out.println();
		String email = "gt_min@naver.com";
		
		if( email.contains("@") && email.contains(".")    )
		{
			System.out.println("이메일 입니다.");
			
		}
		else {
			
			System.out.println("이메일이 아닙니다.");
			
		}
		
		
		
		
		System.out.println();
		// 10. 불필요한 공백 제거(좌우 공백)
		String message = "      안녕  하세요   ";
		System.out.println(message.trim());
		System.out.println(message.trim().length()  );
		
		
		// 11. 대소문자 변환하기
		// toUpperCase() : 대문자로 변환하기
		// toLowerCase() : 소문자로 변환하기
		String source = "best of best";
		System.out.println(source.toUpperCase());
		//System.out.println(source.toLowerCase());
		System.out.println(source);
		
		
		// 12. 찾아 바꾸기
		// replace(old,new) : old를 new로 변환하기
		
		
		String replaced = source.replace("best","worst");
		System.out.println(source);
		System.out.println(replaced);
		
		
		//주의. replaceAll() 메소드는 특정 문자열을 찾아서 변환하는 것이 아님.
		String ip = "192.168.101.91";
		
		String replacedIp = ip.replaceAll(".", "_");
		
		System.out.println(replacedIp);
		
		
		// 13. 빈 문자열인지 여부를 검사한 뒤 boolean(true,false)반환
		System.out.println();
		String id = " ";
		/*
		if ( id.isEmpty()  )
		{
			System.out.println("빈 문자열");
			
		}		
		else {
			System.out.println("빈 문자열 아님");
			
		}
		*/
		
		if( id.trim().isEmpty() )
		{
			System.out.println("빈 문자열");
		}
		{
			System.out.println("빈 문자열 아님");
		}
		// 이런식으로 trim 함수를 넣어서 빈 공백까지 제거해주는게 제일 안전함.
		
		
		
		
		
		
		
		// 너무 신기술이라 사용에 부담이 있음. isBlank
		if( id.isBlank() )
		{
			System.out.println("빈 문자열");
		}
		else {
			System.out.println("빈 문자열 아님");
			
		}
		
		
		
		
		
		// 연습. 파일이름을 파일명과 확장자로 분리
		// 단, jpg, git, png 이미지인 경우에만 작업을 진행한다.
		
		
				
		 /*
		if ( fullname.endsWith("jpg") )
		{
				
				extName = "jpg";
		}
		else if ( fullname.endsWith("git")  ){
			extName = "git";
		}
		else if( fullname.endsWith("png") ) {
			
			extName = "png";
			
		}
		
		if (  fullname.startsWith("apple")  )
		{
			fullName = "apple";
			
		}
		System.out.println();
		System.out.println("fullName : " + fullName);
		System.out.println("extName : " + extName);
		
		System.out.println();
		
		*/
		
		String fullname = "apple.jpg";
		String fullName = ""; // apple
		String extName = "";  // jpg
		int idxOfDot = fullname.lastIndexOf(".");
		fullName = fullname.substring(0, idxOfDot);
		extName = fullname.substring(idxOfDot + 1);
		System.out.println(fullName);
		System.out.println(extName);
		
		
		
		
		
		
		
		
		// 연습 . 문자열 "abc12345dfr67890ghijk"에서 
		// 아라비아 숫자 1234567890을 제외하고 한글자씩 화면에 출력하시오.
		
		String strrr = "abc12345def67890ghijk";
		
		
		/*
		
		for (int ii = 0; ii < 10; ii++ )
		{
			strrr = strrr.replace(""+ii+"","");
			
			
		}
		
		
		for ( int jj = 0; jj < strrr.length(); jj++ )
		{
			
			System.out.print(strrr.charAt(jj)+ "\t");
		}
		
		*/
		
		
		
		for ( int i = 0; i < strrr.length(); i++ )
		{
			char ch = strrr.charAt(i);
			// 메소드를 계속해서 사용하게 되면 성능이 저하되기 때문에 이렇게 초반에 한번만 호출해서 변수에 담아버리면 좋다.
			if ( ch >= '0' && ch <=9   ) {
				continue;
				
			}			
			System.out.print(ch+ "\t");
		}
	
		
		
		
		
	}

}
