package DiceRoll;

import java.util.Scanner;

public class saveRoll {
	
	public static void roll(int dice1, int dice2, int dice3, int dice4, int dice5) {
		
		int save1 = 0;
		int save2 = 0;
		int save3 = 0;
		int save4 = 0;
		int save5 = 0;
		int choose = 1;
		
		System.out.println(dice1 + " " + dice2 + " " + dice3 + " " + dice4 + " " + dice5);
		
		Scanner sc = new Scanner(System.in);
		
		
		
		
		for (; choose != 0;) {
			
			System.out.print("n 번째 주사위를 저장합니다. (저장이 완료되면 0) : ");
			
			choose = sc.nextInt();

			
		
		
		switch(choose) {
			case 0 : 
				System.out.println("저장이 완료되었습니다.");
				return;
			case 1 :
				save1 = dice1;
				System.out.println("첫번째 주사위를 저장하였습니다" + "(" + dice1 + ")");
				break;
			case 2 :
				save2 = dice2;
				System.out.println("두번째 주사위를 저장하였습니다" + "(" + dice2 + ")");
				break;
			case 3 :
				save3 = dice3;
				System.out.println("세번째 주사위를 저장하였습니다" + "(" + dice3 + ")");
				break;
			case 4 :
				save4 = dice4;
				System.out.println("네번째 주사위를 저장하였습니다" + "(" + dice4 + ")");
				break;
			
		
		}
	}
		
		
		System.out.println("주사위를 다시 굴립니다.");
		
		if (save1 != dice1) {
			
			dice1 = (int) (Math.random() * 6) + 1;
			
		}
		
		if (save2 != dice2) {
			
			dice2 = (int) (Math.random() * 6) + 1;
			
		}
		
		if (save3 != dice3) {
			
			dice3 = (int) (Math.random() * 6) + 1;
			
		}
		
		if (save4 != dice4) {
			
			dice4 = (int) (Math.random() * 6) + 1;
			
		}
		
		if (save5 != dice5) {
			
			dice5 = (int) (Math.random() * 6) + 1;
			
		}
		
		System.out.println(dice1 + " " + dice2 + " " + dice3 + " " + dice4 + " " + dice5);

	}

}
