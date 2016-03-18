
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class Panel extends JPanel {

	JLabel lblTitle;
	JButton btnA, btnB, btnC, btnD, btnE, btnF, btnG;
	int counterA, counterB, counterC, counterD, counterE, counterF, counterG;
	Board board = new Board (counterA, counterB, counterC, counterD, counterE, counterF, counterG);

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
		board.makeBoard();
		// col A
		for (int i = 0; i <= 6; i++) {
			g.setColor(Color.white);
			g.fillOval(55, 450 - 50 * i, 50, 50);
			g.setColor(Color.black);
			g.drawOval(55, 450 - 50 * i, 50, 50);
		} 
		// col B
		for (int i = 0; i <= 6; i++) {
			g.setColor(Color.white);
			g.fillOval(160, 450 - 50 * i, 50, 50);
			g.setColor(Color.black);
			g.drawOval(160, 450 - 50 * i, 50, 50);
		}
		// col C
		for (int i = 0; i <= 6; i++) {
			g.setColor(Color.white);
			g.fillOval(265, 450 - 50 * i, 50, 50);
			g.setColor(Color.black);
			g.drawOval(265, 450 - 50 * i, 50, 50);
		}
		// col D
		for (int i = 0; i <= 6; i++) {
			g.setColor(Color.white);
			g.fillOval(370, 450 - 50 * i, 50, 50);
			g.setColor(Color.black);
			g.drawOval(370, 450 - 50 * i, 50, 50);
		}
		// col E
		for (int i = 0; i <= 6; i++) {
			g.setColor(Color.white);
			g.fillOval(475, 450 - 50 * i, 50, 50);
			g.setColor(Color.black);
			g.drawOval(475, 450 - 50 * i, 50, 50);
		}
		// col F
		for (int i = 0; i <= 6; i++) {
			g.setColor(Color.white);
			g.fillOval(585, 450 - 50 * i, 50, 50);
			g.setColor(Color.black);
			g.drawOval(585, 450 - 50 * i, 50, 50);
		}
		// col G
		for (int i = 0; i <= 6; i++) {
			g.setColor(Color.white);
			g.fillOval(685, 450 - 50 * i, 50, 50);
			g.setColor(Color.black);
			g.drawOval(685, 450 - 50 * i, 50, 50);
		}
	}
	private class ClickListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if (e.getSource().equals(btnA)){
				counterA++;
				board.updateBoardA(counterA);
			}
			if (e.getSource().equals(btnB)){
				counterB++;
				//board.updateBoardB(counterB);
			}
			if (e.getSource().equals(btnC)){
				counterC++;
				//board.updateBoardC(counterC); 
			}
			if (e.getSource().equals(btnD)){
				counterD++;
				//board.updateBoardD(counterD);
			}
			if (e.getSource().equals(btnE)){
				counterE++;
				//board.updateBoardE(counterE);
			}
			if (e.getSource().equals(btnF)){
				counterF++;
				//board.updateBoardF(counterF);
			}
			if (e.getSource().equals(btnG)){
				counterG++;
				//board.updateBoardG(counterG);
			}		
			if (counterA == 7){
				btnA.setEnabled(false);
			}
			if (counterB == 7){
				btnB.setEnabled(false);
			}
			if (counterC == 7){
				btnC.setEnabled(false);
			}
			if (counterD == 7){
				btnD.setEnabled(false);
			}
			if (counterE == 7){
				btnE.setEnabled(false);
			}
			if (counterF == 7){
				btnF.setEnabled(false);
			}
			if (counterG == 7){
				btnG.setEnabled(false);
			}
		}
	}
}
