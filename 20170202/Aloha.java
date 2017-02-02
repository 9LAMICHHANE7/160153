import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Aloha {
	public static void main(String[] args) {
		Aloha1 man =new Aloha1();
	}
}


class Aloha1 implements ActionListener {

	ImageIcon img;
	ImageIcon img2;
	JFrame frame;					
	JButton button;					
			
	
	JLabel label;
	JPanel panel;
				

	public Aloha1(){
		frame = new JFrame("GazouMan");
		frame.setLocation(400, 400);		
		frame.setSize(500, 500);			
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		img = new ImageIcon("Nepal1.jpg");
		img2 = new ImageIcon("DDDAAA.jpg");
		

			
			label = new JLabel(img);
			panel = new JPanel();
			button= new JButton("Click Me");
			button.addActionListener(this);
			button.setActionCommand("open");

			
				
			
		
		

		Container con = frame.getContentPane();
		
		panel.add(label);
		panel.add(button);
		con.add(panel);
		
		
		frame.setVisible(true);
			
	}

	public void actionPerformed(ActionEvent ae){
		String cmd = ae.getActionCommand();

		if(cmd.equals("open")){

			label.setIcon(img);
			label.setIcon(img2);

		}

			
	}
}