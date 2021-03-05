package dp.behaviour.observer;

public class Main {
	
	
	public static void main(String[] args) {
		DataSource ds = new DataSource();
		
		SpreadSheet ss = new SpreadSheet(ds);
		Chart chart = new Chart(ds);
		
		ds.addObserver(ss);
		ds.addObserver(chart);
		
		ds.setValue(5);
		System.out.println("other traitment");
		
		ds.setValue(10);
	}

}
