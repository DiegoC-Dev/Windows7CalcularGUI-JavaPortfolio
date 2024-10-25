package view;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import utilities.Utilities;

public class RoundedJButton extends JButton{
	protected int strokeSize = 1;
    protected Dimension arcs = new Dimension(30, 30);
    public RoundedJButton() {
    	super();
//    	setOpaque(false);
		this.setBorder(new LineBorder(Utilities.mainColor(), Utilities.spacing()));
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();
        Graphics2D graphics = (Graphics2D) g;
        //Draws the rounded opaque panel with borders.
        graphics.setColor(getBackground());
        graphics.fillRoundRect(0, 0, width,
        height, arcs.width, arcs.height);
        graphics.setColor(getForeground());
        graphics.setStroke(new BasicStroke(strokeSize));
        graphics.drawRoundRect(0, 0, width,
        height, arcs.width, arcs.height);

        graphics.setStroke(new BasicStroke());
    }
}