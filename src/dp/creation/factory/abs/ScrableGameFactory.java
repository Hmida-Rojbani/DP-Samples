package dp.creation.factory.abs;

import dp.creation.factory.method.BorderGame;
import dp.creation.factory.method.ScrableCreator;

public class ScrableGameFactory implements AbstractFactory{

	@Override
	public GamePieces createPieces() {
		// TODO Auto-generated method stub
		return new ScrablePiecesCreator().createPieces();
	}

	@Override
	public BorderGame createGame() {
		// TODO Auto-generated method stub
		return new ScrableCreator().createGame();
	}

}
