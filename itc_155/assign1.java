import java.awt.*;
import java.util.*;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DrawingPanel panel = new DrawingPanel(220, 150);
		panel.setBackground(Color.YELLOW);
		Graphics g = panel.getGraphics();
		
		for (int i = 0; i < 20; i++) {
			g.setColor(Color.BLUE);
			g.fillOval(50, 25, 40, 40);
			
		}
		
		for (int i = 0; i < 20; i++) {
			g.setColor(Color.BLUE);
			g.fillOval(50 + 80, 25, 40, 40);
		}
		
		
		g.setColor(Color.RED);
		g.fillRect(70,  45, 80, 80);
		
		g.setColor(Color.BLACK);
		g.drawLine(70, 85, 150, 85);
		
		
	}

}
