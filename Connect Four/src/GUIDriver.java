import javax.swing.*;
public class GUIDriver {
	public static void main(String[] args) {
		JFrame frame = new JFrame ("Connect 4");
		frame.setVisible(true);
		frame.getContentPane().add(new Panel ());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 550);
		frame.setResizable(false);
	}
}
