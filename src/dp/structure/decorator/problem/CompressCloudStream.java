package dp.structure.decorator.problem;

public class CompressCloudStream extends CloudStream{
	
	private String compress(String data) {
		return data.substring(0,4);
	}

	@Override
	public void write(String data) {
		data = compress(data);
		super.write(data);
	}
	
	

}
