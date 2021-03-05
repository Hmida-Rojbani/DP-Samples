package dp.behaviour.state.solution;

public class Main {
	
	public static void main(String[] args) {
		Canvas canvas = new Canvas();
		
		canvas.setCurrentTool(new BrushTool());
		
		canvas.mouseDown();
		canvas.mouseUp();
		
		canvas.setCurrentTool(new EraserTool());
		
		canvas.mouseDown();
		canvas.mouseUp();
	}

}