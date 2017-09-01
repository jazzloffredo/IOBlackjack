/**
 * Proj1.java
 * 
 * Jazz Loffredo
 * 
 * CIS 200 Scholar’s Section *
 * 
 * Project 1 is a simulated, abridged version of blackjack by randomly generating
 * two cards for a dealer and a player, and allowing the player to hit once. The basic
 * rules of blackjack apply.
 */

import java.util.*;
public class Proj1 {
	public static void main(String[] args0){
		//objects
		Scanner s = new Scanner(System.in);
		Random r = new Random();

		//play again? variable - extra credit
		char playAgain = 'r';

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
		boolean validInputMove = false;
		boolean validInputPlay = false;
		boolean validInputTestOrPlay = false;

		//player name input
		System.out.print("Enter player's name: ");
		String player = s.nextLine();

		System.out.print("(P)lay mode or (T)est mode: ");
		char testOrPlay = s.next().charAt(0);

		do {
			if(testOrPlay == 'p' || testOrPlay == 'P' || testOrPlay == 't' || testOrPlay == 'T') {
				validInputTestOrPlay = true;
			}
			else {
				System.out.print("\nPlease enter either 'P' to play or 'T' to test:");
				testOrPlay = s.next().charAt(0);
			}
		}while(!validInputTestOrPlay);

//-------------------------------BEGIN PLAY MODE--------------------------------\\
		if(testOrPlay == 'p' || testOrPlay == 'P') {
			
			System.out.print("========BEGGINNING PLAY MODE========");
			do {
				char move;

				//-RANDOM CARD GENERATION-\\
				dealer1 = r.nextInt(13) + 1;
				dealer2 = r.nextInt(13) + 1;
				dealer3 = r.nextInt(13) + 1;
				player1 = r.nextInt(13) + 1;
				player2 = r.nextInt(13) + 1;
				player3 = r.nextInt(13) + 1;

				dTotal = dealer1 + dealer2;
				pTotal = player1 + player2;

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
					//case in which player or dealer draws two aces
					if(dTotal > 21) {
						dealer2 = 1;
						dTotal = dealer1 + dealer2;
					}
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
					if(pTotal > 21) {
						player2 = 1;
						pTotal = player1 + player2;
					}
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
//-------------------------------END PRINT STATEMENTS--------------------------------\\





//************************VALID INPUT VERIFICATION DO-WHILE***************************\\
				System.out.print("\n\nEnter (h)it or (s)tay: ");
				do {
					move = s.next().charAt(0);
					if(move == 'h' || move == 'H') {

						System.out.print("\n" + player + " draws: ");

						switch(player3) {
						case 1:
							System.out.print("Ace of "); 
							player3 = 11;
							pTotal = player1 + player2 + player3;
							if(pTotal > 21) {
								player3 = 1;
								pTotal = player1 + player2 + player3;
							}
							break;
						case 11:
							System.out.print("Jack of "); 
							player3 = 10;
							pTotal = player1 + player2 + player3;
							break;
						case 12:
							System.out.print("Queen of "); 
							player3 = 10;
							pTotal = player1 + player2 + player3;
							break;
						case 13:
							System.out.print("King of "); 
							player3 = 10;
							pTotal = player1 + player2 + player3;
							break;
						default: 
							pTotal = player1 + player2 + player3;
							System.out.print(player3 + " of ");
						}

						switch(r.nextInt(4)) {
						case 0: System.out.print("Clubs"); break;
						case 1: System.out.print("Spades"); break;
						case 2: System.out.print("Hearts"); break;
						case 3: System.out.print("Diamonds"); break;
						}
						validInputMove = true;
					} //end if
					else if(move == 's' || move == 'S') {
						validInputMove = true;
						System.out.print("\n" + player + " stays.");
					}
					else {
						validInputMove = false;
						System.out.print("\nPlease enter a valid input (s) or (h): ");
					}
				}while(!validInputMove);
//**********************END VALID INPUT VERIFICATION DO-WHILE************************\\




//~~~~~~~~~~~~~~~~~~~~~~~~DETERMINE IF DEALER DRAWS AND WINNER~~~~~~~~~~~~~~~~~~~~~~~~\\
				if(dTotal < 17 && dealer3 == 1) {
					System.out.print("\nDealer draws: Ace of ");
					switch(r.nextInt(4)) {
					case 0: System.out.print("Clubs"); break;
					case 1: System.out.print("Spades"); break;
					case 2: System.out.print("Hearts"); break;
					case 3: System.out.print("Diamonds"); break;
					}

					dealer3 = 11;
					dTotal = dealer1 + dealer2 + dealer3;
					if(dTotal > 21) {
						dealer3 = 1;
						dTotal = dealer1 + dealer2 + dealer3;
					}
				}
				else if(dTotal < 17) {
					System.out.print("\nDealer draws: ");
					switch(dealer3) {
					case 11:
						System.out.print("Jack of ");
						dealer3 = 10;
						dTotal = dealer1 + dealer2 + dealer3;
						break;
					case 12:
						System.out.print("Queen of ");
						dealer3 = 10;
						dTotal = dealer1 + dealer2 + dealer3;
						break;
					case 13:
						System.out.print("King of ");
						dealer3 = 10;
						dTotal = dealer1 + dealer2 + dealer3;
						break;
					default:
						System.out.print(dealer3 + " of ");
						dTotal = dealer1 + dealer2 + dealer3;
					}

					switch(r.nextInt(4)) {
					case 0: System.out.print("Clubs"); break;
					case 1: System.out.print("Spades"); break;
					case 2: System.out.print("Hearts"); break;
					case 3: System.out.print("Diamonds"); break;
					}
				}
				else if(pTotal > dTotal && dTotal > 16) {
					System.out.print("\nDealer is forced to draw: ");
					switch(dealer3) {
					case 11:
						System.out.print("Jack of ");
						dealer3 = 10;
						dTotal = dealer1 + dealer2 + dealer3;
						break;
					case 12:
						System.out.print("Queen of ");
						dealer3 = 10;
						dTotal = dealer1 + dealer2 + dealer3;
						break;
					case 13:
						System.out.print("King of ");
						dealer3 = 10;
						dTotal = dealer1 + dealer2 + dealer3;
						break;
					default:
						System.out.print(dealer3 + " of ");
						dTotal = dealer1 + dealer2 + dealer3;
					}

					switch(r.nextInt(4)) {
					case 0: System.out.print("Clubs"); break;
					case 1: System.out.print("Spades"); break;
					case 2: System.out.print("Hearts"); break;
					case 3: System.out.print("Diamonds"); break;
					}
				}
				else {
					System.out.print("\nDealer stays.");
				}

				System.out.print("\n\n" + player + "'s Total: " + pTotal);
				System.out.print("\nDealer's Total: " + dTotal);


				if((dTotal > pTotal && dTotal <= 21) || (dTotal == pTotal && dTotal < 22 && pTotal < 22) || (dTotal < 22 && pTotal > 21)) {
					System.out.print("\nDealer wins.");
					dW++;
				}
				else if((pTotal > dTotal && pTotal < 22) ||(pTotal < dTotal && dTotal > 21)){
					System.out.print("\n" + player + " wins!");
					pW++;
				}
				else if(dTotal > 21 && pTotal > 21) {
					System.out.print("\nDouble bust! Nobody wins.");
				}

				System.out.print("\n\nWould you like to play again? "
						+ "\nType 'R' to play again."
						+ "\nType 'Q' to exit.\n");
				
				do {
					playAgain = s.next().charAt(0);
					if(playAgain == 'r' || playAgain == 'R' || playAgain == 'Q' || playAgain == 'q') {
						validInputPlay = true;
					}
					else {
						System.out.print("\nPlease enter either 'R' to retry or 'Q' to quit:");
						validInputPlay = false;
					}
				}while(!validInputPlay);
			}while(playAgain == 'r' || playAgain == 'R'); //end main do-while loop
		}
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~END OF PLAY MODE~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\\



		else if(testOrPlay == 't' || testOrPlay == 'T') {

//-------------------------------BEGIN TEST MODE--------------------------------\\
			System.out.print("========BEGGINNING TEST MODE========");
			do {
				char move;

				//---USER INPUT CARD GENERATION---\\
				
				System.out.print("\nEnter value for Dealer Card 1: ");
				dealer1 = Integer.parseInt(s.next());
				System.out.print("\nEnter value for Dealer Card 2: ");
				dealer2 = Integer.parseInt(s.next());
				System.out.print("\nEnter value for Player Card 1: ");
				player1 = Integer.parseInt(s.next());
				System.out.print("\nEnter value for Player Card 2: ");
				player2 = Integer.parseInt(s.next());
				pTotal = player1 + player2;
				dTotal = dealer1 + dealer2;
				
				if(dealer1 == 1) {
					dealer1 = 11;
					dTotal = dealer1 + dealer2;
					dealer1 = 1;
				}
				
				if(dealer2 == 1) {
					dealer2 = 11;
					dTotal = dealer1 + dealer2;
					dealer2 = 1;
				}

				
				if(dTotal < 17) {
					System.out.print("\nEnter a value for Dealer Card 3: ");
					dealer3 = Integer.parseInt(s.next());	
				}


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
					//case in which player or dealer draws two aces
					if(dTotal > 21) {
						dealer2 = 1;
						dTotal = dealer1 + dealer2;
					}
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
					if(pTotal > 21) {
						player2 = 1;
						pTotal = player1 + player2;
					}
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
//-------------------------------END PRINT STATEMENTS--------------------------------\\





//************************VALID INPUT VERIFICATION DO-WHILE***************************\\
				System.out.print("\n\nEnter (h)it or (s)tay: ");
				do {
					move = s.next().charAt(0);
					if(move == 'h' || move == 'H') {

						System.out.print("\nEnter value for Player Card 3: ");
						player3 = Integer.parseInt(s.next());
						System.out.print("\n" + player + " draws: ");
						switch(player3) {
						case 1:
							System.out.print("Ace of "); 
							player3 = 11;
							pTotal = player1 + player2 + player3;
							if(pTotal > 21) {
								player3 = 1;
								pTotal = player1 + player2 + player3;
							}
							break;
						case 11:
							System.out.print("Jack of "); 
							player3 = 10;
							pTotal = player1 + player2 + player3;
							break;
						case 12:
							System.out.print("Queen of "); 
							player3 = 10;
							pTotal = player1 + player2 + player3;
							break;
						case 13:
							System.out.print("King of "); 
							player3 = 10;
							pTotal = player1 + player2 + player3;
							break;
						default: 
							pTotal = player1 + player2 + player3;
							System.out.print(player3 + " of ");
						}

						switch(r.nextInt(4)) {
						case 0: System.out.print("Clubs"); break;
						case 1: System.out.print("Spades"); break;
						case 2: System.out.print("Hearts"); break;
						case 3: System.out.print("Diamonds"); break;
						}
						validInputMove = true;
					} //end if
					else if(move == 's' || move == 'S') {
						validInputMove = true;
						System.out.print("\n" + player + " stays.");
					}
					else {
						validInputMove = false;
						System.out.print("\nPlease enter a valid input (s) or (h): ");
					}
				}while(!validInputMove); //end do-while
//**********************END VALID INPUT VERIFICATION DO-WHILE************************\\




//~~~~~~~~~~~~~~~~~~~~~~~~DETERMINE IF DEALER DRAWS AND WINNER~~~~~~~~~~~~~~~~~~~~~~~~\\
				if(dTotal < 17 && dealer3 == 1) {
					System.out.print("\nDealer draws: Ace of ");
					switch(r.nextInt(4)) {
					case 0: System.out.print("Clubs"); break;
					case 1: System.out.print("Spades"); break;
					case 2: System.out.print("Hearts"); break;
					case 3: System.out.print("Diamonds"); break;
					}

					dealer3 = 11;
					dTotal = dealer1 + dealer2 + dealer3;
					if(dTotal > 21) {
						dealer3 = 1;
						dTotal = dealer1 + dealer2 + dealer3;
					}
				}
				else if(dTotal < 17) {
					System.out.print("\nDealer draws: ");
					switch(dealer3) {
					case 11:
						System.out.print("Jack of ");
						dealer3 = 10;
						dTotal = dealer1 + dealer2 + dealer3;
						break;
					case 12:
						System.out.print("Queen of ");
						dealer3 = 10;
						dTotal = dealer1 + dealer2 + dealer3;
						break;
					case 13:
						System.out.print("King of ");
						dealer3 = 10;
						dTotal = dealer1 + dealer2 + dealer3;
						break;
					default:
						System.out.print(dealer3 + " of ");
						dTotal = dealer1 + dealer2 + dealer3;
					}
					switch(r.nextInt(4)) {
					case 0: System.out.print("Clubs"); break;
					case 1: System.out.print("Spades"); break;
					case 2: System.out.print("Hearts"); break;
					case 3: System.out.print("Diamonds"); break;
					}
				}
				else if(pTotal > dTotal && dTotal > 16) {
					System.out.print("Dealer is forced to draw. Enter Value: ");
					dealer3 = Integer.parseInt(s.next());
					switch(dealer3) {
					case 11:
						System.out.print("Jack of ");
						dealer3 = 10;
						dTotal = dealer1 + dealer2 + dealer3;
						break;
					case 12:
						System.out.print("Queen of ");
						dealer3 = 10;
						dTotal = dealer1 + dealer2 + dealer3;
						break;
					case 13:
						System.out.print("King of ");
						dealer3 = 10;
						dTotal = dealer1 + dealer2 + dealer3;
						break;
					default:
						System.out.print(dealer3 + " of ");
						dTotal = dealer1 + dealer2 + dealer3;
					}

					switch(r.nextInt(4)) {
					case 0: System.out.print("Clubs"); break;
					case 1: System.out.print("Spades"); break;
					case 2: System.out.print("Hearts"); break;
					case 3: System.out.print("Diamonds"); break;
					}
				}
				else {
					System.out.print("\nDealer stays.");
				}

				System.out.print("\n\n" + player + "'s Total: " + pTotal);
				System.out.print("\nDealer's Total: " + dTotal);


				if((dTotal > pTotal && dTotal <= 21) || (dTotal == pTotal && dTotal < 22 && pTotal < 22) || (dTotal < 22 && pTotal > 21)) {
					System.out.print("\nDealer wins.");
					dW++;
				}
				else if((pTotal > dTotal && pTotal < 22) ||(pTotal < dTotal && dTotal > 21)){
					System.out.print("\n" + player + " wins!");
					pW++;
				}
				else if(dTotal > 21 && pTotal > 21) {
					System.out.print("\nDouble bust! Nobody wins.");
				}

				System.out.print("\n\nWould you like to play again? "
						+ "\nType 'R' to play again."
						+ "\nType 'Q' to exit.\n");
				do {
					playAgain = s.next().charAt(0);
					if(playAgain == 'r' || playAgain == 'R' || playAgain == 'Q' || playAgain == 'q') {
						validInputPlay = true;
					}
					else {
						System.out.print("\nPlease enter either 'R' to retry or 'Q' to quit:");
						validInputPlay = false;
					}
				}while(!validInputPlay);
			}while(playAgain == 'r' || playAgain == 'R'); //end main do-while loop
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~END OF TEST MODE~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\\
		}
		//print wins for each
		System.out.print("\n************THANKS FOR PLAYING************");
		System.out.print("\nDealer wins: " + dW + " - Player wins: " + pW);
	} //end main
} //end class