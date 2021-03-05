package dp.structure.adapter;

import dp.structure.adapter.avaFilter.Caramel;

public class CaramelAdapter extends Caramel implements Filter {

	@Override
	public void apply(Image image) {
		super.init();
		super.render(image);

	}

}
