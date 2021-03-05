package dp.behaviour.strategy.solution;

public class Main {
	
	public static void main(String[] args) {
		ImageStroage imageStroage = new ImageStroage();
		imageStroage.store("filename",new JpegCompressor(), new HighContrastFilter() );
	}

}
