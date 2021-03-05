package dp.creation.factory.method;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		BorderGame game = null;
		Scanner in = new Scanner(System.in);
		System.out.println("Game Type :");
		String type = in.next();
		
		switch (type) {
		case "chess":
			game = new ChessCreator().createGame();
			break;

		case "scrable":
			game = new ScrableCreator().createGame();
			break;
		}
		
		System.out.println("You choose : "+ game.printname());

	}

}
