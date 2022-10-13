package 수업_리팩토링;

import java.util.Scanner;

import static 수업_리팩토링.강화매니저.*;

public class 칼업그레이드 {
    public void 칼강화() {
        if (칼가방.size() == 0) {
            System.out.println("강화할 검이 없습니다.");
            return;
        }

        if (소지금 < 500) {
            System.out.println("강화금액이 부족합니다.");
            return;
        }

        int sword;
        do {
            for (int i = 0; i < 칼가방.size(); i++) {
                System.out.println(i + 1 + "번째 칼");
                System.out.println(칼가방.get(i).get이름());
                System.out.println(칼가방.get(i).get강화());
                System.out.println(칼가방.get(i).get진화());
            }
            System.out.println("강화할 검을 골라주세요.");
            sword = scan.nextInt() - 1;
        } while (!(0 <= sword && sword < 칼가방.size()));
        소지금 -= 500;
        if (확률(sword)) {
            if (진화결정(sword)) {
                System.out.println("진화성공~!!");
                칼진화2(sword);
                칼가방.get(sword).get이름();
            } else {
                System.out.println("강화를 시작합니다.");
                칼가방.get(sword).set강화(칼가방.get(sword).get강화() + 1); // 확인
                System.out.println("강화성공~!!");
            }
        } else {
            if (진화결정(sword)) {
                System.out.println("진화실패~!!");
            } else {
                System.out.println("강화실패~!!");
            }
        }
        scan.nextLine();
    }
    public void 칼진화2(int i) {

        if (!칼가방.get(i).get이름().contains("다이아몬드")) {
            String 칼이름 =칼가방.get(i).get이름().substring(0,칼가방.get(i).get이름().indexOf("칼")+1);
            String 칼숫자=칼가방.get(i).get이름().substring(칼가방.get(i).get이름().indexOf("칼")+1,칼가방.get(i).get이름().length());
            switch(칼이름) {
                case "나무칼" : 칼이름="돌칼"; break;
                case "돌칼" :   칼이름="철칼"; break;
                case "철칼"   : 칼이름="다이아몬드 칼"; break;
            }
            칼가방.get(i).set강화(0);
            int 한단계진화 = 칼가방.get(i).get진화() + 1;
            칼가방.get(i).set진화(한단계진화);
            칼가방.get(i).set이름(칼이름+칼숫자);
        } else {
            System.out.println("이 무기는 최종진화단계에 도달했습니다.");
            소지금 += 500;
        }
    }
    public boolean 확률(int sword) {
        int prop = 100 - ((칼가방.get(sword).get강화() * 5) + (칼가방.get(sword).get진화() * 10));
        int random=(int)( Math.random() * 100)+1;
        return (random <= prop);
    }
    public boolean 진화결정(int sword) {
        return (칼가방.get(sword).get강화()>=6);
    }
}
