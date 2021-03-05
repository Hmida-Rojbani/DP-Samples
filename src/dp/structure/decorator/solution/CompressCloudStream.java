package dp.structure.decorator.solution;

public class CompressCloudStream implements Stream{
	
	private Stream stream;
	
	public CompressCloudStream(Stream stream) {
		super();
		this.stream = stream;
	}

	private String compress(String data) {
		return data.substring(0,4);
	}

	@Override
	public void write(String data) {
		data = compress(data);
		stream.write(data);
	}
	
	

}
