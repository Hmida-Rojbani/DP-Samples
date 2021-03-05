package dp.structure.decorator.solution;

public class Main {
	
	public static void main(String[] args) {
		Stream stream = new EncryptedCloudStream(new CompressCloudStream(new CloudStream()));
		
		stream.write("test data");
	}

}
