package dp.structure.proxy.solution;

import java.util.HashMap;
import java.util.Map;

public class Library {
	private Map<String, Ebook> ebooks = new HashMap<>();
	
	public void add (Ebook ebook) {
		ebooks.put(ebook.getFilename(), ebook);
	}
	
	public void openBook(String filename) {
		ebooks.get(filename).show();
	}

}
