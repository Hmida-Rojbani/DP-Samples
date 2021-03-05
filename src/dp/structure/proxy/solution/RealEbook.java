package dp.structure.proxy.solution;

public class RealEbook implements Ebook{
	
	private String filename;
	
	public RealEbook(String filename) {
		this.filename = filename;
		load();
	}
	
	private void load() {
		System.out.println("Loading the ebook "+ filename);
	}
	
	public void show() {
		System.out.println("Showing the ebook "+filename);
	}
	
	public String getFilename() {
		return filename;
	}

}
