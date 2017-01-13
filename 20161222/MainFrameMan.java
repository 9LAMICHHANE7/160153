import java.awt.*;
import javax.swing.*;
public class MainFrameMan {
	public static void main(String[] args) {
		FrameMan fm = new FrameMan();
		
	}
}
class FrameMan {
	JFrame frame;
	JPanel panel;
	JLabel label;
	ImageIcon icon;
	public FrameMan(){
		 System.out.println("ALOHA2!");
		 openwindow();
		}
		private void openwindow(){

		 frame = new JFrame();
	    frame.setLocation(200,200);
		frame.setSize(300,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		icon = new ImageIcon("icon_128.png");

		panel = new JPanel();
		label = new JLabelicon(icon);

		panel.add(label);
		frame.add(panel);
		frame.setVisible(true);

	}
}