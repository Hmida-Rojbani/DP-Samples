package dp.behaviour.state.problem;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Canvas {

private ToolType currentTool;
	
	
	public void mouseDown() {
		
		if(currentTool == ToolType.SELECTION)
			System.out.println("Selection Icon");
		else if(currentTool == ToolType.BRUSH)
			System.out.println("Brush Icon");
		else if(currentTool == ToolType.ERASER)
			System.out.println("Eraser Icon");
		
	}
	
	public void mouseUp() {
		if(currentTool == ToolType.SELECTION)
			System.out.println("Draw dashed Rectangle");
		else if(currentTool == ToolType.BRUSH)
			System.out.println("BDraw a line");
		else if(currentTool == ToolType.ERASER)
			System.out.println("Erase something");
	}
}
