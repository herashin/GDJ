package 수업_리팩토링;

import java.util.Scanner;

public class 칼강화게임 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        칼생성현황 칼_현 = new 칼생성현황();
        중앙정보 중_정 = new 중앙정보();
        칼업그레이드 칼_업 = new 칼업그레이드();
        int menu;
        do {
            중_정.printMenu();
            System.out.println("메뉴를 선택하세요. 5번 입력시 종료");
            menu = scan.nextInt();
            switch (menu) {
                case 1:
                    칼_현.칼생성();
                    break;
                case 2:
                    칼_현.강화현황();
                    break;
                case 3:
                    중_정.인벤토리();
                    break;
                case 4:
                    칼_업.칼강화();
                    break;
                case 5:
                    System.out.println("프로그램 종료");
                    break;
                default:
                    System.out.println("메뉴를 잘못 입력 하셨습니다.");
            }
        } while (menu != 5);
    }
}