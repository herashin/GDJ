package controller;

import java.util.Scanner;

import domain.ContactDTO;
import service.ContactService;
import service.ContactServiceImpl;

public class ContactController {

	
	private Scanner sc;
	private ContactService contactService;
	
	
	public ContactController() {
		sc = new Scanner(System.in);
		contactService = new ContactServiceImpl();
		
	}
	
	
	
	public void menu() {
		System.out.println("1.연락처등록");
		System.out.println("2.연락처수정");
		System.out.println("3.연락처삭제");
		System.out.println("4.연락처조회");
		System.out.println("5.전체연락처");
		System.out.println("0.종료");
		
	}
	
	
	public void play() {
		
		while(true) {
			menu();	
			System.out.println("선택 >>>");
			int choice = sc.nextInt(); // 숫자는 choice에 저장
			sc.nextInt();				// 숫자 입력하고 누른 엔터 처리
			switch( choice ) {
			case 1: 
				System.out.println("신규 연락처 이름 >>> ");
				String name = sc.next();
				System.out.println("신규 연락처 전화번호 >>>");
				String tel = sc.next();
				System.out.println("신규 연락처 이메일 >>>");
				String email = sc.next();
				ContactDTO contact = new ContactDTO();
				contact.setName(name);
				contact.setTel(tel);
				contact.setEmail(email);
				contactService.addContact(contact);
				
				
				break;
			case 2: break;
			case 3: break;
			case 4: break;
			case 5: break;
			case 0: break;
			default: System.out.println("다시 선택하세요");
			}
			
		}
		
		
	}
	
	
	
	
	
	
	
}