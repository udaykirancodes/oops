// Java program to draw a line in Applet

import java.awt.*; 
import javax.swing.*; 
import java.awt.geom.Line2D; 

class MyCanvas extends JComponent { 

	public void paint(Graphics g) 
	{ 

		// draw and display the line 
		g.drawLine(10, 180, 380, 180);
		g.drawLine(10, 220, 380, 220);
		g.drawLine(200, 10, 200, 380);
	} 
} 

class DrawLines { 
	public static void main(String[] a) 
	{ 

		// creating object of JFrame(Window popup) 
		JFrame window = new JFrame(); 

		// setting closing operation 
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

		// setting size of the pop window 
		window.setBounds(400, 400, 400, 400); 

		// setting canvas for draw 
		window.getContentPane().add(new MyCanvas()); 

		// set visibility 
		window.setVisible(true); 
	} 
} 
