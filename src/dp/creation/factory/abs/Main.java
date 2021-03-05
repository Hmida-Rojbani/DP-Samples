package dp.creation.factory.abs;

import java.util.Scanner;

import dp.creation.factory.method.BorderGame;
import dp.creation.factory.method.ChessCreator;
import dp.creation.factory.method.ScrableCreator;

public class Main {
public static void main(String[] args) {
		
		BorderGame game = null;
		GamePieces pieces = null;
		Scanner in = new Scanner(System.in);
		System.out.println("Game Type :");
		String type = in.next();
		AbstractFactory factory = null;
		
		switch (type) {
		case "chess":
			factory = new ChessGameFactory();
			
			break;

		case "scrable":
			factory = new ScrableGameFactory();
			break;
		}
		game = factory.createGame();
		pieces = factory.createPieces();
		System.out.println("You choose : "+ game.printname());
		System.out.println("with number of pices : "+ pieces.numberofPieces());

	}

}
