package library;

import java.util.Scanner;

public class Library {
	
	private Scanner sc;
	private Book[] books;
	private int idx;
	
	public Library() {
		sc = new Scanner(System.in);
		books = new Book[100];
		
	}
	
	private void addBook() {
		if (books.length == idx ) {
			System.out.println("더이상 등록할 수 없습니다.");
			return;
		}
		System.out.println("===책등록===");		
		System.out.print("제목입력 >>> ");
		String title = sc.next();
		System.out.print("저자 입력 >>> ");
		String author = sc.next();
		Book book = new Book(idx+ 1, title, author);
		books[idx++] = book;
	}
	
	
	private void removeBook() {
		if (idx == 0) {
			System.out.println("등록된,,,.책이,,... 한권도,,,,,,없읍,,,니다...,,,,,");
			return;
		}
		System.out.println("===책삭제===");
		System.out.print("삭제할 책의 번호(1~" + idx + ") >>>> ");
		int bookNo = sc.nextInt() -1;
		if(bookNo < 0 || bookNo >= idx) {
			System.out.println(" 책 번호가 " + ( bookNo + 1 ) + "인 책은 없습니다." );
			return;
		}
		System.arraycopy(books, bookNo+1, books, bookNo, idx - bookNo - 1);
		books[--idx] = null;
		System.out.println("책 번호가 "+ (bookNo + 1) + "인 책을 삭제했읍니다.");
	}
	
	private void findBook() {
		if (idx == 0) {
			System.out.println("등록된,,,.책이,,... 한권도,,,,,,없읍,,,니다...,,,,,");
			return;
		}
		System.out.println("===책조회===");
		System.out.print("조회할 책 제목 입력 >>> ");
		String title = sc.next();
		for( int i = 0; i <idx; i++ )
		{
			// 저장된 책 제목
			// 조회할 책 제목 : title
			
			if( title.equals(books[i].getTitle() ) )
			{
				System.out.println(books[i]);
				return; // findBook() 메소드 종료
			}
			
		}
		System.out.println("아~~ "+ title + "?   그런건 없눈데? ㅋㅋㅋㅋ");
		
		
	}
	
	private void printAllBooks() {
		if (idx == 0) {
			System.out.println("등록된,,,.책이,,... 한권도,,,,,,없읍,,,니다...,,,,, 즈으으으은하,,,,,,,통촉..,,,,,,하여주시옵.....sou sa..,,,");
			return;
		}
		System.out.println("===전체조회===");
		for( int i = 0; i < idx; i++ )
		{
			System.out.println(books[i]);
			
		}
		
	}
	
	
	public void manage() {
		
		while( true ) {
			System.out.print("1. 추가 2.삭제 3.조회 4.전체목록 0.프로그램종료 >>>");
			int choice = sc.nextInt();
			sc.nextInt();
			
			switch (choice) {
			case 1:addBook();break;
			case 2:removeBook();break;
			case 3:findBook();break;
			case 4:printAllBooks();break;
			case 0:System.out.println("Library 프로그램을 종료합니다. 감사합니다.");
				return; // manage() 메소드 종료

			default: System.out.println("알 수 없는명령입니다. 다시 시도하세요.");break;
			}
			
		}
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
