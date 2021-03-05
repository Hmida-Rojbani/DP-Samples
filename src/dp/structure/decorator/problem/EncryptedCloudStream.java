package dp.structure.decorator.problem;

public class EncryptedCloudStream extends CloudStream{
	
	private String encrypt(String data) {
		return "@*+è2dwrwd";
	}

	@Override
	public void write(String data) {
		data = encrypt(data);
		super.write(data);
	}
	
	

}
