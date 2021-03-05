package dp.structure.adapter;

import dp.structure.adapter.avaFilter.Caramel;
import lombok.AllArgsConstructor;
@AllArgsConstructor
public class CaramelFilter implements Filter {
	private Caramel caramel;

	@Override
	public void apply(Image image) {
		caramel.init();
		caramel.render(image);

	}

}
