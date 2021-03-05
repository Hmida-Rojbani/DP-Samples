package dp.structure.facade;

public class NotificationFacade {
	
	public void send(String message, String ipAdd, String targetIP) {
		NotificationServer server = new NotificationServer();
		Connection conn = server.connect(ipAdd);
		AuthToken authToken = server.authenticate("appId", "key");
		server.send(authToken, new Message(message), targetIP);
		conn.disconnect();
	}

}
