package 수업_리팩토링;

import static 수업_리팩토링.강화매니저.*;

public class 칼생성현황 {
    칼 칼;
    public void 칼생성() {
        칼가방.add( 칼 = new 칼(names[0],가격s[0]));
        System.out.println("새 칼을 얻었다. (공짜)");
    }
    public void 강화현황() {
        // 생성된 칼이 없으면 출력X
        if (칼가방.size()==0) {
            System.out.println("등록된 칼이 없습니다. 메뉴로 돌아갑니다");
        }else {
            for (칼 tmp : 칼가방) {
                System.out.println(tmp);
            }
        }
    }
}
