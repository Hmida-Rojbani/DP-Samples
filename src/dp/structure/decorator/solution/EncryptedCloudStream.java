package dp.structure.decorator.solution;

public class EncryptedCloudStream implements Stream{
	
	private Stream stream;
	
	public EncryptedCloudStream(Stream stream) {
		super();
		this.stream = stream;
	}

	private String encrypt(String data) {
		return "@*+è2dwrwd";
	}

	@Override
	public void write(String data) {
		data = encrypt(data);
		stream.write(data);
	}
	
	

}
