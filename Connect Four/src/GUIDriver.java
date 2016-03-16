import javax.swing.JFrame;

public class GUIDriver {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame ("Connect 4");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new Panel());
		frame.setSize(800, 450);
		frame.setResizable(false);
	}

}
