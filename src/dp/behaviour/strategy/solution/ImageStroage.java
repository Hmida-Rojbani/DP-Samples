package dp.behaviour.strategy.solution;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ImageStroage {
	

	
	public void store(String filename,Compressor compressor , Filter filter) {
		//JPEG, PNG,.....
		// B&W, High Contrast
		
		compressor.compress(filename);
		filter.apply(filename);
	}

}
