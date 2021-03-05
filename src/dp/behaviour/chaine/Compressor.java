package dp.behaviour.chaine;

public class Compressor extends Handler{

	public Compressor(Handler next) {
		super(next);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean doHandle(HttpRequest request) {
		System.out.println("Compress");
		return false;
	}

}
