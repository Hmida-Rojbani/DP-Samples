package dp.structure.adapter;

import dp.structure.adapter.avaFilter.Caramel;

public class Main {
	
	public static void main(String[] args) {
		ImageView imageView = new ImageView(new Image());
		//imageView.apply(new CaramelFilter(new Caramel()));
		imageView.apply(new CaramelAdapter());
	}

}
