package dp.behaviour.chaine;

public class Logger extends Handler{

	public Logger(Handler next) {
		super(next);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean doHandle(HttpRequest request) {
		System.out.println("Logging");
		return false;
	}

}
