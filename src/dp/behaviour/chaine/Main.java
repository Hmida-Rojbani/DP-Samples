package dp.behaviour.chaine;

public class Main {
	
	public static void main(String[] args) {
		WebServer server = new WebServer(new Authenticator(new Logger(new Compressor(null))));
		server.handle(new HttpRequest("admin","1234"));
	}

}
