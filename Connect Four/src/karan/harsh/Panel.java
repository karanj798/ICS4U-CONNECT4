package karan.harsh;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class Panel extends JPanel {

	JLabel lblTitle;
	JButton btnA, btnB, btnC, btnD, btnE, btnF, btnG;
	JLabel lblCircles; 
	int x = 0, y = 7;
	boolean switchPlayer = false;
	Board board = new Board(x, y);
	Chip chip = new Chip();
	public Panel() {

		btnA = new JButton("A");
		btnA.setPreferredSize(new Dimension(100, 100));
		add(btnA);
		btnB = new JButton("B");
		btnB.setPreferredSize(new Dimension(100, 100));
		add(btnB);
		btnC = new JButton("C");
		btnC.setPreferredSize(new Dimension(100, 100));
		add(btnC);
		btnD = new JButton("D");
		btnD.setPreferredSize(new Dimension(100, 100));
		add(btnD);
		btnE = new JButton("E");
		btnE.setPreferredSize(new Dimension(100, 100));
		add(btnE);
		btnF = new JButton("F");
		btnF.setPreferredSize(new Dimension(100, 100));
		add(btnF);
		btnG = new JButton("G");
		btnG.setPreferredSize(new Dimension(100, 100));
		add(btnG);

		
		btnA.addActionListener(new ClickListener ());
		btnB.addActionListener(new ClickListener ());
		btnC.addActionListener(new ClickListener ());
		btnD.addActionListener(new ClickListener ());
		btnE.addActionListener(new ClickListener ());
		btnF.addActionListener(new ClickListener ());
		btnG.addActionListener(new ClickListener ());
	}

	public void paint(Graphics g) {
		// creating object
		// col A
		for (int i = 0; i <= 6; i++) {
			g.setColor(chip.getColor());
			g.fillOval(55, 450 - 50 * i, 50, 50);
			g.setColor(Color.black);
			g.drawOval(55, 450 - 50 * i, 50, 50);
		} 
		// col B
		for (int i = 0; i <= 6; i++) {
			g.setColor(chip.getColor());
			g.fillOval(160, 450 - 50 * i, 50, 50);
			g.setColor(Color.black);
			g.drawOval(160, 450 - 50 * i, 50, 50);
		}
		// col C
		for (int i = 0; i <= 6; i++) {
			g.setColor(chip.getColor());
			g.fillOval(265, 450 - 50 * i, 50, 50);
			g.setColor(Color.black);
			g.drawOval(265, 450 - 50 * i, 50, 50);
		}
		// col D
		for (int i = 0; i <= 6; i++) {
			g.setColor(chip.getColor());
			g.fillOval(370, 450 - 50 * i, 50, 50);
			g.setColor(Color.black);
			g.drawOval(370, 450 - 50 * i, 50, 50);
		}
		// col E
		for (int i = 0; i <= 6; i++) {
			g.setColor(chip.getColor());
			g.fillOval(475, 450 - 50 * i, 50, 50);
			g.setColor(Color.black);
			g.drawOval(475, 450 - 50 * i, 50, 50);
		}
		// col F
		for (int i = 0; i <= 6; i++) {
			g.setColor(chip.getColor());
			g.fillOval(585, 450 - 50 * i, 50, 50);
			g.setColor(Color.black);
			g.drawOval(585, 450 - 50 * i, 50, 50);
		}
		// col G
		for (int i = 0; i <= 6; i++) {
			g.setColor(chip.getColor());
			g.fillOval(685, 450 - 50 * i, 50, 50);
			g.setColor(Color.black);
			g.drawOval(685, 450 - 50 * i, 50, 50);
		}
	}
	private class ClickListener implements ActionListener{
		int X = 7, Y;
		public void actionPerformed(ActionEvent e) {
			board.makeBoard();
			if (e.getSource().equals(btnA)){
				Y = 0;
				X--;
				board.updateBoard(X, Y);
				board.printBoard();
				if (X == 0){
					btnA.setEnabled(false);
				}
			}
			
			if (e.getSource().equals(btnB)){
				Y = 1;
				X--;
				board.updateBoard(X, Y);
				board.printBoard();
				if (X == 0){
					btnB.setEnabled(false);
				}
			}
			if (e.getSource().equals(btnC)){
				Y = 2;
				X--;
				board.updateBoard(X, Y);
				board.printBoard();
				if (X == 0){
					btnC.setEnabled(false);
				}
			}
			if (e.getSource().equals(btnD)){
				Y = 3;
				X--;
				board.updateBoard(X, Y);
				board.printBoard();
				if (X == 0){
					btnD.setEnabled(false);
				}
			}
			if (e.getSource().equals(btnE)){
				Y = 4;
				X--;
				board.updateBoard(X, Y);
				board.printBoard();
				if (X == 0){
					btnE.setEnabled(false);
				}
			}
			if (e.getSource().equals(btnF)){
				Y = 5;
				X--;
				board.updateBoard(X, Y);
				board.printBoard();
				if (X == 0){
					btnF.setEnabled(false);
				}
			}
			if (e.getSource().equals(btnG)){
				Y = 6;
				X--;
				board.updateBoard(X, Y);
				board.printBoard();
				if (X == 0){
					btnG.setEnabled(false);
				}
			}
		}
	}
}
