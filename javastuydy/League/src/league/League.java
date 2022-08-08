package league;

import java.util.Random;
import java.util.Scanner;

public class League {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		    Random rand = new Random();

		    int[] wl = new int[10];
		    int choice;

		    loofout:
		       while(true){
		           System.out.println("┌──────────────────────────┐");
		           System.out.println("│     <리그 오브 레전드>      │");
		           System.out.println("│  \"solanium\" 님의 초대    │");
		           System.out.println("└──────────────────────────┘");
		           System.out.println("[1 수락하기]  [2 거절하기]");
		           System.out.print(">");

		           choice = scan.nextInt();
		            if(choice == 1) {


		                for (int i = 0; i < 10; i++) {
		                    wl[i] = rand.nextInt(7) + 1;
		                    System.out.printf("\t[%d 게임]\n", i+1);

		                    if (wl[i] % 2 == 0) {
		                        System.out.print("\t\" 승 \"-------  ");
		                        if (wl[i] > 4)
		                            System.out.print("\t\"solanium\"이 캐리함\n");
		                        else
		                            System.out.print("\t\"남고생핫팬티\"가 캐리함\"\n");
		                    } else {
		                        System.out.print("\t\" 패 \"-------  ");
		                        if (wl[i] == 1)
		                            System.out.print("\t\"solanium\"이 똥쌈\n");
		                        else if (wl[i] == 3)
		                            System.out.print("\t\"남고생핫팬티\"가 똥쌈\n");
		                        else
		                            System.out.print("\t\"팀운 좆망겜\"\n");
		                    }
		                }

		                do {
		                    System.out.println("┌──────────────────────────┐");
		                    System.out.println("│ solanium: 더 할거임?    │");
		                    System.out.println("└──────────────────────────┘");
		                    System.out.println("[1 ㄹㅇ 찐찐찐막]     [2 정신병 게임 삭제]");
		                    System.out.print(">");
		                    choice = scan.nextInt();
		
		                    if (choice == 2) {
		                        System.out.println("[  \"리그오브 레전드\" 삭제 완료.  ].");
		                        break loofout;
		                    } else if (choice < 1 || 2 < choice)
		                        System.out.println("\tWrong input");
		                    else
		                        System.out.println("┌──────────────────────────┐");
		                        System.out.println("│solanium: 이거 지면 ㄹㅇ잔다  │");
		                        System.out.println("└──────────────────────────┘");
		                } while (choice < 1 || 2 < choice);
		            }
		            else break;
		       }
	}

}
