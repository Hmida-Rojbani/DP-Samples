package dp.structure.proxy.solution;

public class EbookProxy implements Ebook{
	private String filename;
	private RealEbook realEbook;
	
	

	public EbookProxy(String filename) {
		super();
		this.filename = filename;
	}

	@Override
	public void show() {
		if(realEbook == null)
			realEbook = new RealEbook(filename);
		realEbook.show();
		
	}

	@Override
	public String getFilename() {
		return filename;
	}

}
