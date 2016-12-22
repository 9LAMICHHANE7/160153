import java.awt.*;
import javax.swing.*;

public class AlohaWindow {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(300,200);
		frame.setTitle("アオキ");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel label = new JLabel("HELLO");
		Container ctnr = frame.getContentPane();
		JButton button = new JButton("Click Me!");
		ctnr.add(button,BorderLayout.SOUTH);
		frame.setVisible(true);
	}
}