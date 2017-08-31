import java.util.*;


public class Proj1 {
	public static void main(String[] args0){
		//objects
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		
		//play again? variable - extra credit
		char play;
		
		//dealer and player card values
		int dealer1 = 0;
		int dealer2= 0;
		int dealer3 = 0;
		int player1 = 0;
		int player2 = 0;
		int player3 = 0;
		int dTotal = 0;
		int pTotal = 0;
		
		//dealer wins and player wins
		int dW = 0;
		int pW = 0;
		
		//user input valid
		boolean validInput;
		
		//player name input
		/*
		System.out.print("Enter player's name: ");
		String player = s.nextLine();
		*/
		String player = "jazz";

		do {
			char move;
			
			//RANDOM CARD GENERATION
			dealer1 = r.nextInt(13) + 1;
			dealer2 = r.nextInt(13) + 1;
			player1 = r.nextInt(13) + 1;
			player2 = r.nextInt(13) + 1;
			
			dTotal = dealer1 + dealer2;
			pTotal = player1 + player2;

			//-------------PRINT STATEMENTS--------------\\
			System.out.print("\nDealer has: ");
			//switch statement determines if card is jack, queen, king or ace
			switch(dealer1) {
				case 1:
					System.out.print("\n\tAce of "); 
					dealer1 = 11;
					dTotal = dealer1 + dealer2;
					break;
				case 11:
					System.out.print("\n\tJack of "); 
					dealer1 = 10;
					dTotal = dealer1 + dealer2;
					break;
				case 12:
					System.out.print("\n\tQueen of "); 
					dealer1 = 10;
					dTotal = dealer1 + dealer2;
					break;
				case 13:
					System.out.print("\n\tKing of "); 
					dealer1 = 10;
					dTotal = dealer1 + dealer2;
					break;
				default: 
					System.out.print("\n\t" + dealer1 + " of ");
			}
			
			switch(r.nextInt(4)) {
			case 0: System.out.print("Clubs"); break;
			case 1: System.out.print("Spades"); break;
			case 2: System.out.print("Hearts"); break;
			case 3: System.out.print("Diamonds"); break;
			}
			
			switch(dealer2) {
			case 1:
				System.out.print("\n\tAce of "); 
				dealer2 = 11;
				dTotal = dealer1 + dealer2;
				break;
			case 11:
				System.out.print("\n\tJack of "); 
				dealer2 = 10;
				dTotal = dealer1 + dealer2;
				break;
			case 12:
				System.out.print("\n\tQueen of "); 
				dealer2 = 10;
				dTotal = dealer1 + dealer2;
				break;
			case 13:
				System.out.print("\n\tKing of "); 
				dealer2 = 10;
				dTotal = dealer1 + dealer2;
				break;
			default: 
				System.out.print("\n\t" + dealer2 + " of ");
		}
			
			switch(r.nextInt(4)) {
			case 0: System.out.print("Clubs"); break;
			case 1: System.out.print("Spades"); break;
			case 2: System.out.print("Hearts"); break;
			case 3: System.out.print("Diamonds"); break;
			}
			
			System.out.print("\nDealer total: " + dTotal);
			
			System.out.print("\n\n" + player + " has: ");
			//switch statement determines if card is jack, queen, king or ace
			switch(player1) {
			case 1:
				System.out.print("\n\tAce of "); 
				player1 = 11;
				pTotal = player1 + player2;
				break;
			case 11:
				System.out.print("\n\tJack of "); 
				player1 = 10;
				pTotal = player1 + player2;
				break;
			case 12:
				System.out.print("\n\tQueen of "); 
				player1 = 10;
				pTotal = player1 + player2;
				break;
			case 13:
				System.out.print("\n\tKing of "); 
				player1 = 10;
				pTotal = player1 + player2;
				break;
			default: 
				System.out.print("\n\t" + player1 + " of ");
		}
			
			switch(r.nextInt(4)) {
			case 0: System.out.print("Clubs"); break;
			case 1: System.out.print("Spades"); break;
			case 2: System.out.print("Hearts"); break;
			case 3: System.out.print("Diamonds"); break;
			}
			
			switch(player2) {
			case 1:
				System.out.print("\n\tAce of "); 
				player2 = 11;
				pTotal = player1 + player2;
				break;
			case 11:
				System.out.print("\n\tJack of "); 
				player2 = 10;
				pTotal = player1 + player2;
				break;
			case 12:
				System.out.print("\n\tQueen of "); 
				player2 = 10;
				pTotal = player1 + player2;
				break;
			case 13:
				System.out.print("\n\tKing of "); 
				player2 = 10;
				pTotal = player1 + player2;
				break;
			default: 
				System.out.print("\n\t" + player2 + " of ");
			}
			switch(r.nextInt(4)) {
			case 0: System.out.print("Clubs"); break;
			case 1: System.out.print("Spades"); break;
			case 2: System.out.print("Hearts"); break;
			case 3: System.out.print("Diamonds"); break;
			}
			System.out.print("\n" + player + "'s total: " + pTotal);
			
			//
			System.out.print("\n\nEnter (h)it or (s)tay: ");
			move = s.next().charAt(0);
			
			switch(move) {
				case 'h':
				case 'H':			
					
			}
			
		}while(play == 'y'); //end do-while
	} //end main
} //end class