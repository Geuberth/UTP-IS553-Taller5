package ejercicio4Taller4;

import java.util.Random; 


public class PairOfDice implements Dice {
	
	private int dice1;
	private int dice2;
	
	
	public void roll() {
		Random aleatorio = new Random();
		
		dice1 = aleatorio.nextInt(6)+1;
		dice2 = aleatorio.nextInt(6)+1;
	}
	
	public int getDice1() {
	
		return dice1;
	}
	
	public int getDice2() {
		
		return dice2;
	}

}
