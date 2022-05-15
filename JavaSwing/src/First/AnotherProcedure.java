package First;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.ImageIcon;
public class AnotherProcedure extends JFrame {
	public AnotherProcedure()
	{
		this.setSize(420,420); // sets the x- dimension and y-dimension of this
		this.setVisible(true); // make this visible
		this.setTitle("AFnaN's window"); // sets title of this
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// exit on close ---> exit out of application
		// Hide on close ----> running in background
		// DO_NOTHING_ON_CLOSE-->cann't close window
		
		this.setResizable(false); //prevent this from begin resized
		ImageIcon image = new ImageIcon("pic.jpg");
		this.setIconImage(image.getImage());//change icon image this
		// change color of background
		this.getContentPane().setBackground(new Color(91,61,69));

	}
}
