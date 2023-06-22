// Java program to set the background color of panel
// using the color specified in the constants
// of the class.
import java.awt.*;
import javax.swing.*;

class color extends JFrame {

	// constructor
	color()
	{
		super("color");

		// create a new Color
		Color c = Color.yellow;

		// create a panel
		JPanel p = new JPanel();

		// set the background of the frame
		// to the specified Color
		p.setBackground(c);

		setSize(200, 200);
		add(p);
		show();
	}

	// Main Method
	public static void main(String args[])
	{
		color c = new color();
	}
}
