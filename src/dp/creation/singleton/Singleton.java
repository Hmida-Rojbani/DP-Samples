package dp.creation.singleton;

public class Singleton {

	private static int count = 0;
	//Eager
	//private volatile static  Singleton instance = new Singleton();
	/*public static Singleton getInstance() {
		return instance;
	}*/
	// lazy
	private static  Singleton instance;
	
	private Singleton() {
		count ++;
	}
	
	public  static Singleton getInstance() {
		if(instance == null) {
			synchronized (Singleton.class) {
				if(instance==null)
					instance = new Singleton();
			}
		}
			
		return instance;
	}
	
	public static int getCount() {
		return count;
	}

}
