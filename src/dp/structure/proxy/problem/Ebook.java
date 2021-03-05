package dp.structure.proxy.problem;




public class Ebook {
	private String filename;
	
	public Ebook(String filename) {
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
