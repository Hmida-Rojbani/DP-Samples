package dp.creation.factory.abs;

public class ScrablePiecesCreator implements PiecesFactory {

	@Override
	public GamePieces createPieces() {
		// TODO Auto-generated method stub
		return new ScrablePieces();
	}

}
