package dp.behaviour.visitor.problem;

import java.util.ArrayList;
import java.util.List;

public class HtmlDocument {
	
	private List<HtmlNode> nodes = new ArrayList<>();
	
	public void add(HtmlNode node) {
		nodes.add(node);
	}
	
	public void highLight() {
		for (HtmlNode htmlNode : nodes) {
			htmlNode.highLight();
		}
	}

}
