package dp.creation.factory.method;

public class ScrableCreator implements GameFactory {

	@Override
	public BorderGame createGame() {
		// TODO Auto-generated method stub
		return new Scrable();
	}

}
