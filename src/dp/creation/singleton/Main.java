package dp.creation.singleton;

public class Main {
	public static void main(String[] args) {
		Singleton s = Singleton.getInstance();
		//s = Singleton.getInstance();
		System.out.println(Singleton.getCount());
	}
}
