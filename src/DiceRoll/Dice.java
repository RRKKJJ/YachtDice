package DiceRoll;


public class Dice {

	public static void main(String[] args) {
		
		int dice1 = (int) (Math.random() * 6) + 1;
		int dice2 = (int) (Math.random() * 6) + 1;
		int dice3 = (int) (Math.random() * 6) + 1;
		int dice4 = (int) (Math.random() * 6) + 1;
		int dice5 = (int) (Math.random() * 6) + 1;
		
		saveRoll.roll(dice1, dice2, dice3, dice4, dice5);
		
		

	}

}
