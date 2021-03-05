package dp.behaviour.visitor.solution;

public class PlainTextOperation implements Operation{

	@Override
	public void apply(HeadingNode headingNode) {
		System.out.println("plaintext-Heading");
		
	}

	@Override
	public void apply(AnchorNode anchorNode) {
		System.out.println("plaintext-AnchorNode");
		
	}
}
