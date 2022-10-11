package 수업_리팩토링;

import static 수업_리팩토링.강화매니저.*;

public class 중앙정보 {
    public void printMenu() {
        System.out.println("칼 강화게임!");
        System.out.println("1.칼 생성");
        System.out.println("2.강화현황 보기");
        System.out.println("3.인벤토리 (해당 칼 정보보기/팔기)");
        System.out.println("4.칼 강화!");
        System.out.println("5.게임 종료");
    }
    public void 인벤토리(){
        if(칼가방.size()==0) {
            System.out.println("칼가방이 비었습니다."); return;
        }
        System.out.println("원하는 칼을 입력해주세요.");
        String 칼입력 = scan.next();
        for (int i = 0; i < 칼가방.size(); i++) {
            if(칼입력.equals(칼가방.get(i).get이름())) {
                System.out.println("원하는 인벤토리 메뉴를 선택해주세요. 1.정보보기 2.팔기 ");
                int 메뉴 = scan.nextInt();
                switch (메뉴) {
                    case 1: 칼정보보기(칼가방.get(i)); break;
                    case 2: 팔기(칼가방.get(i)); break;
                    default: System.out.println("잘못된 선택입니다."); break;
                }
                System.out.println("당신의 소지금은 :"+강화매니저.소지금);
                return;
            }
        }
        System.out.println("해당칼은 존재하지 않습니다.");
    }
    public void 칼정보보기(칼 칼){
        System.out.println(칼.toString());
    }

    public void 팔기(칼 칼){

        System.out.println(칼.get이름()+"을 팝니다");
        소지금 = 소지금 + 칼.get가격();
        칼가방.remove(칼);
    }
}
