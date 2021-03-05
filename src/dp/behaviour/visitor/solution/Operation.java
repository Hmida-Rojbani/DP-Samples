package dp.behaviour.visitor.solution;



public interface Operation {
	
	void apply(HeadingNode headingNode);
	void apply(AnchorNode anchorNode);

}
