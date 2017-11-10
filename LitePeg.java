import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

/**
 *
 *@author stephenshay
 *
 *
 */
public class LitePeg {

	private final Color[] COLORS = {  Color.BLACK,    Color.GREEN,  Color.BLUE ,Color.RED, 
									Color.GRAY, Color.ORANGE};
	private int index;
	private JButton pegButton;
	
	/**
	 * Default Constructor for LitePeg
	 */
	public LitePeg() {
	index=0;
	pegButton=new JButton();
	pegButton.setMinimumSize(new Dimension(20,20));
	pegButton.setBackground(COLORS[index]);
	
	ActionListener a1=new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
		if(e.getSource()==pegButton) {
			if(index<COLORS.length-1) {
				changeColor();
				}
			else {
				resetColor();
				}
			}
		}
	};
	pegButton.addActionListener(a1);
	}
	
	
	/**
	 * @return current index Color
	 */
	public Color getColor() {
		return COLORS[index];
		}
	
	
	/**
	 * resets the color to black
	 */
	public void resetColor() {
	index=0;
	pegButton.setBackground(COLORS[index]);
	}
	
	/**
	 * @return returns LitePeg object
	 */
	public JButton getButton() {
		return pegButton;
	}
	
	private void changeColor() {
		index++;
		pegButton.setBackground(COLORS[index]);		
	}
}
