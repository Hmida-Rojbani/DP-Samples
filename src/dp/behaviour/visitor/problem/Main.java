package dp.behaviour.visitor.problem;

public class Main {
	
	public static void main(String[] args) {
		HtmlDocument document = new HtmlDocument();
		document.add(new HeadingNode());
		document.add(new AnchorNode());
		document.highLight();
	}

}
