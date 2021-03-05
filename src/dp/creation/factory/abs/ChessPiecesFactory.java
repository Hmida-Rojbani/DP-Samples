package dp.creation.factory.abs;

public class ChessPiecesFactory implements PiecesFactory{

	@Override
	public GamePieces createPieces() {
		// TODO Auto-generated method stub
		return new ChessPieces();
	}

}
