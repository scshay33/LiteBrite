import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JPanel;

/**
 * 
 * @author stephenshay
 *
 *Builds a grid of LitePeg objects for use in the LiteBrite class 
 */
public class LiteBriteBoard {
	
	private LitePeg[][] pegs;
	
	private JPanel gridPanel;
	
	private int width,height;
	
	
	
	/**
	 * constructor for LiteBriteBoard
	 * @param width
	 * @param height
	 */
	LiteBriteBoard(int width, int height){
	this.width=width;
	this.height=height;
	
	gridPanel=new JPanel();
	
	pegs=new LitePeg[width][height];
	
	gridPanel.setLayout(new GridLayout(height,width));
	gridPanel.setPreferredSize(new Dimension(500,500));
	
	
	for(int i=0;i<(width);i++) {
		for(int j=0;j<(height);j++) {
			pegs[i][j]=new LitePeg();
			gridPanel.add(pegs[i][j].getButton());	
		}
		}
	
	}
	
	/**
	 * resets the color of all pegs
	 */
	public void reset() {
		for(int i=0;i<(width);i++) {
			for(int j=0;j<(height);j++) {
			pegs[i][j].resetColor();	
			}
		}
	}
	
	/**
	 * @return gridPanel
	 */
	JPanel getJPanel() {
		return gridPanel;
	}
	
	
}
