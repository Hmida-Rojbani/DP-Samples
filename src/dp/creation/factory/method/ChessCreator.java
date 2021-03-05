package dp.creation.factory.method;

public class ChessCreator implements GameFactory {

	@Override
	public BorderGame createGame() {
		// Chess creation
		return new Chess();
	}

}
