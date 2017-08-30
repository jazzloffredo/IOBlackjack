import java.util.*;


public class Proj1 {
	public static void main(String[] args0){
		//objects
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		
		//play again? variable - extra credit
		char play = 'y';
		
		//dealer and player card values
		int dealer1;
		int dealer2;
		int player1;
		int player2;
		int dTotal;
		int pTotal;
		
		//dealer wins and player wins
		int dW = 0;
		int pW = 0;
		

		do {
			//player name input
			System.out.print("Enter player's name: ");
			String player = s.nextLine();
			
			char move;
			
			dealer1 = r.nextInt(13) + 1;
			dealer2 = r.nextInt(13) + 1;
			player1 = r.nextInt(13) + 1;
			player2 = r.nextInt(13) + 1;
			
			dTotal = dealer1 + dealer2;
			pTotal = player1 + player2;

			System.out.print("\nDealer has: ");
			System.out.print("\n\t" + dealer1 + " of ");
			
			switch(r.nextInt(4)) {
			case 0: System.out.print("Clubs"); break;
			case 1: System.out.print("Spades"); break;
			case 2: System.out.print("Hearts"); break;
			case 3: System.out.print("Diamonds"); break;
			}
			
			
			System.out.print("\n\t" + dealer2 + " of ");
			
			switch(r.nextInt(4)) {
			case 0: System.out.print("Clubs"); break;
			case 1: System.out.print("Spades"); break;
			case 2: System.out.print("Hearts"); break;
			case 3: System.out.print("Diamonds"); break;
			}
			
			System.out.print("\nDealer total: " + dTotal);
			
			System.out.print("\n\n" + player + " has: ");
			System.out.print("\n\t" + player1 + " of ");
			
			switch(r.nextInt(4)) {
			case 0: System.out.print("Clubs"); break;
			case 1: System.out.print("Spades"); break;
			case 2: System.out.print("Hearts"); break;
			case 3: System.out.print("Diamonds"); break;
			}
			System.out.print("\n\t" + player2 + " of ");
			
			switch(r.nextInt(4)) {
			case 0: System.out.print("Clubs"); break;
			case 1: System.out.print("Spades"); break;
			case 2: System.out.print("Hearts"); break;
			case 3: System.out.print("Diamonds"); break;
			}
			System.out.print("\n" + player + "'s total: " + pTotal);
			
			System.out.print("\n\nEnter (h)it or (s)tay: ");
			move = s.next().charAt(0);
			
			
			
		}while(play == 'y');
	} //end main
} //end class