package geometry;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Drawing extends JPanel {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Drawing");
		frame.setSize(800, 600);
		Drawing drawing = new Drawing();
		frame.getContentPane().add(drawing);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	public void paint(Graphics g) {
		
		Point p = new Point(50, 50, false, Color.BLUE);
		p.draw(g);
		
		Line l = new Line(new Point(70, 70), new Point(70, 200), false, Color.RED);
		l.draw(g);
		
		Circle c = new Circle(new Point(200, 120), 40, false, Color.RED, Color.GREEN);
		c.draw(g);
		
		Rectangle r = new Rectangle(new Point(300, 60), 70, 120, false, Color.BLACK, Color.MAGENTA);
		r.draw(g);
		
		Donut d = new Donut(new Point(400, 300), 80, 20, false, Color.BLACK, Color.YELLOW);
		d.draw(g);
		
	}

}
