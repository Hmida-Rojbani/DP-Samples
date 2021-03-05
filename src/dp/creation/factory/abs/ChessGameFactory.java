package dp.creation.factory.abs;

import dp.creation.factory.method.BorderGame;
import dp.creation.factory.method.ChessCreator;

public class ChessGameFactory implements AbstractFactory  {

	@Override
	public GamePieces createPieces() {
		// TODO Auto-generated method stub
		return new ChessPiecesFactory().createPieces();
	}

	@Override
	public BorderGame createGame() {
		// TODO Auto-generated method stub
		return new ChessCreator().createGame();
	}

}
