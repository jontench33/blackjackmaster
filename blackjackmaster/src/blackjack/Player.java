package blackjack;
import java.util.Scanner;

public class Player extends Player{

	public Player(String name) {
		super(name);
	}


	public boolean isHitting(Scanner s) {
		do {
			System.out.printf("%s: Do you want to hit (1 for yes/2 for no)?", name);
			String ans = s.next();
			if(ans.length()==0) {
				continue;
			} else if (ans.charAt(0)== '1'){
				return true;
			} else if(ans.charAt(0)== '2'){
				return false;
			} else {
				System.out.printf("Please enter 1 or 2.%n");
			}
			
		} while (true);
	}

	public void win() {
		System.out.printf("%s: Wins!%n", name);
	}
	
	public void lose() {
		System.out.printf("%s: Lost!%n", name);
	
	}