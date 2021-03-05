package dp.behaviour.strategy.problem;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ImageStroage {
	
	private String compressor;
	private String filter;
	
	public void store(String filename) {
		//JPEG, PNG,.....
		// B&W, High Contrast
		
		if(compressor.equals("jpeg"))
			System.out.println("Compressing using JPEG");
		else if(compressor.equals("png"))
			System.out.println("Compressing using PNG");
		
		if(filter.equals("B&W"))
			System.out.println("Applying B&W Filter");
		else 
			if(filter.equals("high-contrast"))
				System.out.println("Applying High Contrast Filter");
	}

}
