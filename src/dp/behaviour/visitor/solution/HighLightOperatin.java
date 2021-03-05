package dp.behaviour.visitor.solution;

public class HighLightOperatin implements Operation{

	@Override
	public void apply(HeadingNode headingNode) {
		System.out.println("highLight-Heading");
		
	}

	@Override
	public void apply(AnchorNode anchorNode) {
		System.out.println("highlight-AnchorNode");
		
	}

}
